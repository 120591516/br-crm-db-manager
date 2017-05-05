package br.crm.service.impl.firstdata;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.branch.OrganizationBranchImgMapper;
import br.crm.mapper.firstshow.FirstdatashowMapper;
import br.crm.mapper.org.DictExamSuiteTypeMapper;
import br.crm.mapper.suite.OrganizationBranchSuiteMapper;
import br.crm.mapper.suite.OrganizationExamSuiteImgMapper;
import br.crm.mapper.suite.OrganizationExamSuiteMapper;
import br.crm.mapper.suite.OrganizationExamSuiteTypeMapper;
import br.crm.pojo.branch.OrganizationBranchImg;
import br.crm.pojo.branch.OrganizationBranchImgExample;
import br.crm.pojo.firstshow.Firstdatashow;
import br.crm.pojo.firstshow.FirstdatashowExample;
import br.crm.pojo.org.DictExamSuiteType;
import br.crm.pojo.suite.OrganizationBranchSuiteExample;
import br.crm.pojo.suite.OrganizationExamSuite;
import br.crm.pojo.suite.OrganizationExamSuiteImg;
import br.crm.pojo.suite.OrganizationExamSuiteImgExample;
import br.crm.pojo.suite.OrganizationExamSuiteType;
import br.crm.pojo.suite.OrganizationExamSuiteTypeExample;
import br.crm.service.firstdata.OrgFirstDataService;
import br.crm.vo.firstdata.FirstdatashowVo;

@Service
public class OrgFirstDataServiceImpl implements OrgFirstDataService {

	@Autowired
	private FirstdatashowMapper firstdatashowMapper;

	@Autowired
	private OrganizationBranchImgMapper organizationBranchImgMapper;

	@Autowired
	private OrganizationExamSuiteImgMapper organizationExamSuiteImgMapper;

	@Autowired
	private OrganizationExamSuiteMapper organizationExamSuiteMapper;

	@Autowired
	private OrganizationExamSuiteTypeMapper organizationExamSuiteTypeMapper;

	@Autowired
	private DictExamSuiteTypeMapper dictExamSuiteTypeMapper;
	
	@Autowired
	private OrganizationBranchSuiteMapper organizationBranchSuiteMapper;

	@Override
	public PageInfo<Firstdatashow> showFirstData(Integer page, Integer rows, FirstdatashowVo firstdatashowVo) {

		PageHelper.startPage(page, rows);
		FirstdatashowExample example = new FirstdatashowExample();
		example.createCriteria().andFirstdatashowDataStatusEqualTo(0);
		if (null != firstdatashowVo) {
			if (StringUtils.isNotEmpty(firstdatashowVo.getFirstdatashowOrgId())) {
				example.createCriteria().andFirstdatashowOrgIdEqualTo(firstdatashowVo.getFirstdatashowOrgId());
				if (StringUtils.isNotEmpty(firstdatashowVo.getFirstdatashowDataName())) {
					example.createCriteria().andFirstdatashowDataNameLike("%" + firstdatashowVo.getFirstdatashowDataName() + "%");
				}
				if (firstdatashowVo.getFirstdatashowDataStatus() != 0) {
					example.createCriteria().andFirstdatashowDataStatusEqualTo(firstdatashowVo.getFirstdatashowDataStatus());
				}
			}
		}
		List<Firstdatashow> list = firstdatashowMapper.selectByExample(example);

		PageInfo<Firstdatashow> result = new PageInfo<Firstdatashow>(list);

		return result;
	}

	@Override
	public int saveShowFirstData(FirstdatashowVo firstdatashowVo) {

		return firstdatashowMapper.insertSelective(firstdatashowVo);
	}

	@Override
	public int deleteShowFirstData(String firstdatashowId) {

		Firstdatashow firstdatashow = firstdatashowMapper.selectByPrimaryKey(firstdatashowId);
		firstdatashow.setFirstdatashowDataStatus(1);
		firstdatashowMapper.updateByPrimaryKeySelective(firstdatashow);
		return 0;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: selectSuite
	 * </p>
	 * <p>
	 * Description: 查询套餐
	 * </p>
	 * 
	 * @return
	 * @see br.crm.service.firstdata.OrgFirstDataService#selectSuite()
	 */
	@Override
	public List<FirstdatashowVo> selectSuite() {
		List<FirstdatashowVo> result = new ArrayList<FirstdatashowVo>();
		FirstdatashowExample example = new FirstdatashowExample();
		example.createCriteria().andFirstdatashowDataTypeEqualTo(1).andFirstdatashowDataStatusEqualTo(0);
		List<Firstdatashow> list = firstdatashowMapper.selectByExample(example);
		try {
			if (CollectionUtils.isNotEmpty(list)) {
				for (Firstdatashow firstdatashow : list) {
					FirstdatashowVo vo = new FirstdatashowVo();
					BeanUtils.copyProperties(vo, firstdatashow);
					OrganizationExamSuite suite = organizationExamSuiteMapper.selectByPrimaryKey(firstdatashow.getFirstdatashowDataId());
					if (null != suite) {
						// 设置价格
						vo.setPrice(suite.getExamSuitePrice().toString());
						vo.setDiscountPrice(suite.getExamSuiteDiscountPrice().toString());
						// 设置套餐类型
						OrganizationExamSuiteTypeExample typeExample = new OrganizationExamSuiteTypeExample();
						typeExample.createCriteria().andExamSuiteIdEqualTo(suite.getExamSuiteId());
						List<OrganizationExamSuiteType> typeList = organizationExamSuiteTypeMapper.selectByExample(typeExample);
						if (CollectionUtils.isNotEmpty(typeList)) {
							for (OrganizationExamSuiteType organizationExamSuiteType : typeList) {
								DictExamSuiteType suiteType = dictExamSuiteTypeMapper.selectByPrimaryKey(organizationExamSuiteType.getExamTypeId());
								if (null != suiteType) {
									vo.setApplies(suiteType.getExamTypeName());
								}
							}
						}
					}
					result.add(vo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: selectBranch
	 * </p>
	 * <p>
	 * Description:查询门店
	 * </p>
	 * 
	 * @return
	 * @see br.crm.service.firstdata.OrgFirstDataService#selectBranch()
	 */
	@Override
	public List<FirstdatashowVo> selectBranch() {

		List<FirstdatashowVo> result = new ArrayList<FirstdatashowVo>();
		FirstdatashowExample example = new FirstdatashowExample();
		example.createCriteria().andFirstdatashowDataTypeEqualTo(0).andFirstdatashowDataStatusEqualTo(0);
		List<Firstdatashow> list = firstdatashowMapper.selectByExample(example);
		try {
			if (CollectionUtils.isNotEmpty(list)) {
				for (Firstdatashow firstdatashow : list) {
					FirstdatashowVo vo = new FirstdatashowVo();
					BeanUtils.copyProperties(vo, firstdatashow);
					result.add(vo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<OrganizationBranchImg> getImgByBranchId(String branchId) {

		OrganizationBranchImgExample example = new OrganizationBranchImgExample();
		example.createCriteria().andOrgBranchIdEqualTo(branchId);
		List<OrganizationBranchImg> list = organizationBranchImgMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<OrganizationExamSuiteImg> getImgByOrgExamSuiteId(String examSuiteId) {

		OrganizationExamSuiteImgExample example = new OrganizationExamSuiteImgExample();
		example.createCriteria().andOrgExamSuiteIdEqualTo(examSuiteId).andOrgExamSuiteStatusEqualTo(0);
		List<OrganizationExamSuiteImg> list = organizationExamSuiteImgMapper.selectByExample(example);
		return list;
	}

	@Override
	public int selectSuiteCountByBranch(String firstdatashowDataId) {
		
		OrganizationBranchSuiteExample example =new OrganizationBranchSuiteExample();
		
		example.createCriteria().andStatusEqualTo(0).andBranchIdEqualTo(firstdatashowDataId);
		
		return organizationBranchSuiteMapper.countByExample(example);
	}

}
