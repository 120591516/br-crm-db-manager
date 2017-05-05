package br.crm.service.impl.examitemvalue;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.examitem.OrganizationExamItemMapper;
import br.crm.mapper.examitemvalue.OrganizationExamItemValueMapper;
import br.crm.pojo.examitem.OrganizationExamItem;
import br.crm.pojo.examitem.OrganizationExamItemExample;
import br.crm.pojo.examitemvalue.OrganizationExamItemValue;
import br.crm.pojo.examitemvalue.OrganizationExamItemValueExample;
import br.crm.pojo.examitemvalue.OrganizationExamItemValueExample.Criteria;
import br.crm.service.examitemvalue.OrgExamItemValueService;
import br.crm.service.system.SystemConfigService;
import br.crm.vo.examitemvalue.OrgExamItemValueVo;
import br.order.redis.examitemvalue.OrgExamItemValueRedis;

/**
 * (体检项特征词service)
 * 
 * @ClassName: OrgExamItemValueServiceImpl
 * @Description: TODO(体检项特征词service)
 * @author 王文腾
 * @date 2016年9月13日 上午11:38:35
 */
@Service
public class OrgExamItemValueServiceImpl implements OrgExamItemValueService {

	/**
	 * {体检项特征词DAO}
	 */
	@Autowired
	private OrganizationExamItemValueMapper organizationExamItemValueMapper;

	@Autowired
	private OrganizationExamItemMapper organizationExamItemMapper;
	@Autowired
	private OrgExamItemValueRedis orgExamItemValueRedis;
	@Autowired
	private SystemConfigService systemConfigService;
	
	/**
	 * 条件查询分页显示体检项特征词列表
	 * <p>
	 * Title: getOrgExamItemValueByPage
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param orgExamItemValue
	 *            条件查询对象
	 * @param page
	 *            页数
	 * @param rows
	 *            行数
	 * @return
	 * @see br.crm.service.examitemvalue.OrgExamItemValueService#getOrgExamItemValueByPage(br.crm.vo.examitemvalue.OrgExamItemValueVo,
	 *      java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public PageInfo<OrgExamItemValueVo> getOrgExamItemValueByPage(OrgExamItemValueVo orgExamItemValue, Integer page, Integer rows) {
		List<OrgExamItemValueVo> result = new ArrayList<OrgExamItemValueVo>();
		PageHelper.startPage(page, rows);
		OrganizationExamItemValueExample organizationExamItemValueExample = new OrganizationExamItemValueExample();
		organizationExamItemValueExample.setOrderByClause(" exam_item_value_create_time desc");
		Criteria criteria = organizationExamItemValueExample.createCriteria();
		try {
			if (null != orgExamItemValue) {
				// 根据项目id搜索
				if (StringUtils.isNotEmpty(orgExamItemValue.getExamItemId())) {
					criteria.andExamItemIdEqualTo(orgExamItemValue.getExamItemId());
				}
				// 体征词名称
				if (StringUtils.isNotEmpty(orgExamItemValue.getExamItemValueName())) {
					criteria.andExamItemValueNameLike("%" + orgExamItemValue.getExamItemValueName() + "%");
				}
				// 重症级别
				if (null != orgExamItemValue.getExamItemValueServerDegree()) {
					criteria.andExamItemValueServerDegreeEqualTo(orgExamItemValue.getExamItemValueServerDegree());
				}
				// 男操作数
				if (null != orgExamItemValue.getExamItemValueOperandMale()) {
					criteria.andExamItemValueOperandMaleEqualTo(orgExamItemValue.getExamItemValueOperandMale());
				}
				// 女操作数
				if (null != orgExamItemValue.getExamItemValueOperandFemale()) {
					criteria.andExamItemValueOperandFemaleEqualTo(orgExamItemValue.getExamItemValueOperandFemale());
				}
			}

			List<OrganizationExamItemValue> oeivList = organizationExamItemValueMapper.selectByExample(organizationExamItemValueExample);
			if (CollectionUtils.isNotEmpty(oeivList)) {
				for (OrganizationExamItemValue organizationExamItemValue : oeivList) {
					OrgExamItemValueVo orgExamItemValueVo = new OrgExamItemValueVo();
					BeanUtils.copyProperties(orgExamItemValueVo, organizationExamItemValue);
					orgExamItemValueVo.setExamItemName(organizationExamItemMapper.selectByPrimaryKey(orgExamItemValueVo.getExamItemId()).getExamItemName());
					result.add(orgExamItemValueVo);
				}
			}
			PageInfo<OrganizationExamItemValue> pageInfo = new PageInfo<OrganizationExamItemValue>(oeivList);

			PageInfo<OrgExamItemValueVo> resultPageInfo = new PageInfo<OrgExamItemValueVo>(result);
			resultPageInfo.setTotal(pageInfo.getTotal());
			resultPageInfo.setPages(pageInfo.getPages());
			resultPageInfo.setPageSize(pageInfo.getPageSize());
			return resultPageInfo;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 添加体征词
	 * <p>
	 * Title: insertOrgExamItemValue
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param orgExamItemValue
	 *            体征词对象
	 * @return
	 * @see br.crm.service.examitemvalue.OrgExamItemValueService#insertOrgExamItemValue(br.crm.pojo.org.OrganizationExamItemValue)
	 */
	@Override
	public int insertOrgExamItemValue(OrganizationExamItemValue orgExamItemValue) {
		orgExamItemValue.setExamItemValueId(UUIDUtils.getId());
		orgExamItemValue.setExamItemValueCreateTime(new Date());
		orgExamItemValue.setExamItemValueEditTime(orgExamItemValue.getExamItemValueCreateTime());
		orgExamItemValue.setExamItemValueStatus(0);
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			orgExamItemValueRedis.insertOrgExamItemValue(orgExamItemValue);
		}
		return organizationExamItemValueMapper.insertSelective(orgExamItemValue);
	}

	/**
	 * 获取体征词对象
	 * <p>
	 * Title: getOrgExamItemValueById
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param orgExamItemValueId
	 *            体征词对象id
	 * @return
	 * @see br.crm.service.examitemvalue.OrgExamItemValueService#getOrgExamItemValueById(java.lang.String)
	 */
	@Override
	public OrgExamItemValueVo getOrgExamItemValueById(String orgExamItemValueId) {
		OrgExamItemValueVo orgExamItemValueVo = new OrgExamItemValueVo();
		try {
			Boolean redis = systemConfigService.getRedis();
			if(redis){
				OrganizationExamItemValue orgExamItemValueById = orgExamItemValueRedis.getOrgExamItemValueById(orgExamItemValueId);
				BeanUtils.copyProperties(orgExamItemValueVo, orgExamItemValueById);
			}
			else{
				OrganizationExamItemValue itemValue = organizationExamItemValueMapper.selectByPrimaryKey(orgExamItemValueId);
				BeanUtils.copyProperties(orgExamItemValueVo, itemValue);
			}
			orgExamItemValueVo.setExamItemName(organizationExamItemMapper.selectByPrimaryKey(orgExamItemValueVo.getExamItemId()).getExamItemName());
			return orgExamItemValueVo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 修改体征词对象
	 * <p>
	 * Title: updateOrgExamItemValue
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param orgExamItemValue
	 *            体征词对象
	 * @return
	 * @see br.crm.service.examitemvalue.OrgExamItemValueService#updateOrgExamItemValue(br.crm.pojo.org.OrganizationExamItemValue)
	 */
	@Override
	public int updateOrgExamItemValue(OrganizationExamItemValue orgExamItemValue) {
		orgExamItemValue.setExamItemValueEditTime(new Date());
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			orgExamItemValueRedis.updateOrgExamItemValue(orgExamItemValue);
		}
		return organizationExamItemValueMapper.updateByPrimaryKeySelective(orgExamItemValue);
	}
	
	/**
	 * 根据检查项id查询关联的体征词
	 * <p>
	 * Title: getAllOrgExamItemValue
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param examItemId
	 *            检查项id
	 * @return
	 * @see br.crm.service.examitemvalue.OrgExamItemValueService#getAllOrgExamItemValue(java.lang.String)
	 */
	@Override
	public List<OrganizationExamItemValue> getAllOrgExamItemValue(String examItemId) {
		OrganizationExamItemValueExample example = new OrganizationExamItemValueExample();
		Criteria criteria = example.createCriteria();
		criteria.andExamItemIdEqualTo(examItemId);
		List<OrganizationExamItemValue> list = organizationExamItemValueMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<Map<String, String>> getExamItemName() {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();
		OrganizationExamItemExample example = new OrganizationExamItemExample();
		example.createCriteria().andExamItemStatusEqualTo(0);
		List<OrganizationExamItem> list = organizationExamItemMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			for (OrganizationExamItem organizationExamItem : list) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("id", organizationExamItem.getExamItemId());
				map.put("name", organizationExamItem.getExamItemName());
				result.add(map);
			}
		}
		return result;
	}

	@Override
	public List<OrganizationExamItemValue> getAllOrganizationExamItemValue() {
		return organizationExamItemValueMapper.selectByExample(null);
		
	}

}
