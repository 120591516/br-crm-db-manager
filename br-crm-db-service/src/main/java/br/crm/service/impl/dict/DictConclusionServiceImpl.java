package br.crm.service.impl.dict;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.dict.DictconclusionMapper;
import br.crm.mapper.dict.DictconclusiondepttypeMapper;
import br.crm.mapper.dict.DictconclusiongroupMapper;
import br.crm.mapper.dict.DictconclusionresultclassMapper;
import br.crm.mapper.dict.DictconclusiontypeMapper;
import br.crm.pojo.dict.Dictconclusion;
import br.crm.pojo.dict.DictconclusionExample;
import br.crm.pojo.dict.DictconclusionExample.Criteria;
import br.crm.pojo.dict.DictconclusionWithBLOBs;
import br.crm.service.dict.DictConclusionService;
import br.crm.service.system.SystemConfigService;
import br.crm.vo.conclusion.DictconclusionVo;
import br.order.redis.dict.DictConclusionRedis;

@Service
public class DictConclusionServiceImpl implements DictConclusionService {

	@Autowired
	private DictconclusionMapper dictconclusionMapper;// 结论词

	@Autowired
	private DictconclusiondepttypeMapper dictconclusiondepttypeMapper;// 科室

	@Autowired
	private DictconclusiongroupMapper dictconclusiongroupMapper;// 分组

	@Autowired
	private DictconclusionresultclassMapper dictconclusionresultclassMapper;// 返回结果

	@Autowired
	private DictconclusiontypeMapper dictconclusiontypeMapper;// 结论词类型
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private DictConclusionRedis dictConclusionRedis;
	@Override
	public PageInfo<DictconclusionVo> getConclusionList(Integer page, Integer rows, DictconclusionVo dictconclusionVo) {
		List<DictconclusionVo> result = new ArrayList<DictconclusionVo>();
		PageHelper.startPage(page, rows);
		DictconclusionExample dictconclusionExample = new DictconclusionExample();
		dictconclusionExample.setOrderByClause(" createtime desc");
		Criteria createCriteria = dictconclusionExample.createCriteria();
		if (null != dictconclusionVo) {
			// 结论词类型
			if (StringUtils.isNotEmpty(dictconclusionVo.getIdConclusionType())) {
				createCriteria.andIdConclusionTypeEqualTo(dictconclusionVo.getIdConclusionType());
			}
			// 结论词部门类型
			if (StringUtils.isNotEmpty(dictconclusionVo.getIdConclusionDeptType())) {
				createCriteria.andIdConclusionDeptTypeEqualTo(dictconclusionVo.getIdConclusionDeptType());
			}
			// 结论词分组
			if (StringUtils.isNotEmpty(dictconclusionVo.getKeyconclusiongroupid())) {
				createCriteria.andKeyconclusiongroupidEqualTo(dictconclusionVo.getKeyconclusiongroupid());
			}
			// 结果分类
			if (StringUtils.isNotEmpty(dictconclusionVo.getIdConclusionresultclass())) {
				createCriteria.andIdConclusionresultclassEqualTo(dictconclusionVo.getIdConclusionresultclass());
			}
			// 结论词名称
			if (StringUtils.isNotEmpty(dictconclusionVo.getConclusionName())) {
				createCriteria.andConclusionNameLike("%" + dictconclusionVo.getConclusionName() + "%");
			}
			
			if(StringUtils.isNotEmpty(dictconclusionVo.getSexId())){
				int flag=new Integer(dictconclusionVo.getSexId());
				if(flag==0){//0通用
					createCriteria.andFMalediseaseEqualTo(0).andFMalediseaseEqualTo(0);
				}else if(flag==1){//1男性
					createCriteria.andFMalediseaseEqualTo(0).andFMalediseaseEqualTo(1);
				}else{//2女性
					createCriteria.andFMalediseaseEqualTo(1).andFMalediseaseEqualTo(0);
				}
			}
		}
		try {
			List<Dictconclusion> list = dictconclusionMapper.selectByExample(dictconclusionExample);
			if (CollectionUtils.isNotEmpty(list)) {
				for (Dictconclusion dictconclusion : list) {
					DictconclusionVo conclusionVo = new DictconclusionVo();
					BeanUtils.copyProperties(conclusionVo, dictconclusion);
					if (null != conclusionVo.getIdConclusionType()) { // 结论词类型名称
						conclusionVo.setConclusionTypeName(dictconclusiontypeMapper.selectByPrimaryKey(conclusionVo.getIdConclusionType()).getConclusionTypeName());
					}
					if (null != conclusionVo.getIdConclusionDeptType()) {

						conclusionVo.setConclusionDeptTypeName(dictconclusiondepttypeMapper.selectByPrimaryKey(conclusionVo.getIdConclusionDeptType()).getConclusionTypeDeptName());
					}
					if (null != conclusionVo.getKeyconclusiongroupid()) {
						conclusionVo.setConclusionGroupName(dictconclusiongroupMapper.selectByPrimaryKey(conclusionVo.getKeyconclusiongroupid()).getConclusiongroupName());
					}
					if (null != conclusionVo.getIdConclusionresultclass()) {
						conclusionVo.setConclusionResultName(dictconclusionresultclassMapper.selectByPrimaryKey(conclusionVo.getIdConclusionresultclass()).getConclusionresultclassName());
					}
					if (conclusionVo.getfMaledisease().intValue() == 0 && conclusionVo.getfFemaledisease().intValue() == 0) {
						conclusionVo.setSexName("通用");
					} else if (conclusionVo.getfMaledisease().intValue() == 0 && conclusionVo.getfFemaledisease().intValue() != 0) {
						conclusionVo.setSexName("男性");
					} else {
						conclusionVo.setSexName("女性");
					}
					result.add(conclusionVo);
				}
			}
			PageInfo<Dictconclusion> pageInfo = new PageInfo<Dictconclusion>(list);
			PageInfo<DictconclusionVo> resultPageInfo = new PageInfo<DictconclusionVo>(result);
			resultPageInfo.setTotal(pageInfo.getTotal());
			resultPageInfo.setPages(pageInfo.getPages());
			resultPageInfo.setPageSize(pageInfo.getPageSize());
			return resultPageInfo;
		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int addConclusion(DictconclusionWithBLOBs dictconclusionWithBLOBs) {
		Boolean redis = systemConfigService.getRedis();   
		if(redis){
			dictConclusionRedis.addConclusion(dictconclusionWithBLOBs);
		}
		return dictconclusionMapper.insertSelective(dictconclusionWithBLOBs);
	}

	@Override
	public DictconclusionVo getConclusionById(String id) {
		DictconclusionVo result = new DictconclusionVo();
		DictconclusionWithBLOBs dictconclusionWithBLOBs = null;
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			dictconclusionWithBLOBs = dictConclusionRedis.getConclusionById(id);
		}
		else{
		dictconclusionWithBLOBs = dictconclusionMapper.selectByPrimaryKey(id);
		}
		try {

			if (null != dictconclusionWithBLOBs) {
				BeanUtils.copyProperties(result, dictconclusionWithBLOBs);
				result.setConclusionTypeName(dictconclusiontypeMapper.selectByPrimaryKey(result.getIdConclusionType()).getConclusionTypeName());
				result.setConclusionDeptTypeName(dictconclusiondepttypeMapper.selectByPrimaryKey(result.getIdConclusionDeptType()).getConclusionTypeDeptName());
				result.setConclusionGroupName(dictconclusiongroupMapper.selectByPrimaryKey(result.getKeyconclusiongroupid()).getConclusiongroupName());
				result.setConclusionResultName(dictconclusionresultclassMapper.selectByPrimaryKey(result.getIdConclusionresultclass()).getConclusionresultclassName());
				if (result.getfMaledisease().intValue() == 0 && result.getfFemaledisease().intValue() == 0) {
					result.setSexName("通用");
					result.setSexId("0");
				} else if (result.getfMaledisease().intValue() == 0 && result.getfFemaledisease().intValue() != 0) {
					result.setSexName("男性");
					result.setSexId("1");
				} else {
					result.setSexName("女性");
					result.setSexId("2");
				}
				return result;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public int updateConclusion(DictconclusionWithBLOBs dictconclusionWithBLOBs) {
		Boolean redis = systemConfigService.getRedis();   
		if(redis){
		dictConclusionRedis.updateConclusion(dictconclusionWithBLOBs);
		}
		return dictconclusionMapper.updateByPrimaryKeyWithBLOBs(dictconclusionWithBLOBs);
	}

	@Override
	public List<DictconclusionWithBLOBs> getAllDictconclusionWithBLOBs() {
		return dictconclusionMapper.selectByExampleWithBLOBs(null);
	}

}
