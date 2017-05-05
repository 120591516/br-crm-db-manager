package br.crm.service.impl.dict;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.org.DictHighIncidenceDiseaseMapper;
import br.crm.pojo.org.DictHighIncidenceDiseaseExample;
import br.crm.pojo.org.DictHighIncidenceDisease;
import br.crm.service.dict.DictHighIncidenceDiseaseService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictHighIncidenceDiseaseRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictHighIncidenceDiseaseServiceImpl
 * @Description: 高发疾病字典表相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午3:26:47
 *
 */
@Service
public class DictHighIncidenceDiseaseServiceImpl implements DictHighIncidenceDiseaseService {

	@Autowired
	private DictHighIncidenceDiseaseMapper dictHighIncidenceDiseaseMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private DictHighIncidenceDiseaseRedis dictHighIncidenceDiseaseRedis;

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: addHighIncidenceDisease
	 * </p>
	 * <p>
	 * Description:添加对象
	 * </p>
	 * 
	 * @param highIncidenceDisease
	 * @return
	 * @see br.crm.service.dict.DictHighIncidenceDiseaseService#addHighIncidenceDisease(br.crm.pojo.org.DictHighIncidenceDisease)
	 */
	@Override
	public int addHighIncidenceDisease(DictHighIncidenceDisease highIncidenceDisease) {
		
		int i= dictHighIncidenceDiseaseMapper.insertSelective(highIncidenceDisease);
		if(systemConfigService.getRedis()){
		    dictHighIncidenceDiseaseRedis.setDictHighIncidenceDisease(highIncidenceDisease);
		}
		return i;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getHighIncidenceDiseaseById
	 * </p>
	 * <p>
	 * Description:根据id获取对象信息
	 * </p>
	 * 
	 * @param idHighIncidenceDisease
	 * @return
	 * @see br.crm.service.dict.DictHighIncidenceDiseaseService#getHighIncidenceDiseaseById(java.lang.String)
	 */
	@Override
	public DictHighIncidenceDisease getHighIncidenceDiseaseById(String idHighIncidenceDisease) {
	    DictHighIncidenceDisease dictHighIncidenceDisease =null;
	    if(systemConfigService.getRedis()){
	        dictHighIncidenceDisease = dictHighIncidenceDiseaseRedis.getDictHighIncidenceDisease(idHighIncidenceDisease);  
	    }else{
	        dictHighIncidenceDisease = dictHighIncidenceDiseaseMapper.selectByPrimaryKey(idHighIncidenceDisease);
	    }
		return dictHighIncidenceDisease;		
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getHighIncidenceDiseaseList
	 * </p>
	 * <p>
	 * Description:分页获取列表
	 * </p>
	 * 
	 * @param page
	 * @param rows
	 * @return
	 * @see br.crm.service.dict.DictHighIncidenceDiseaseService#getHighIncidenceDiseaseList(java.lang.Integer,
	 *      java.lang.Integer)
	 */
	@Override
	public PageInfo<DictHighIncidenceDisease> getHighIncidenceDiseaseList(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		DictHighIncidenceDiseaseExample example = new DictHighIncidenceDiseaseExample();
		example.setOrderByClause(" high_incidence_disease_create_time desc");
		example.createCriteria().andHighIncidenceDiseaseStatusEqualTo(0);
		List<DictHighIncidenceDisease>list  = dictHighIncidenceDiseaseMapper.selectByExample(example);;
		PageInfo<DictHighIncidenceDisease> pageInfo = new PageInfo<DictHighIncidenceDisease>(list);
		return pageInfo;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updateHighIncidenceDisease
	 * </p>
	 * <p>
	 * Description:修改对象信息
	 * </p>
	 * 
	 * @param highIncidenceDisease
	 * @return
	 * @see br.crm.service.dict.DictHighIncidenceDiseaseService#updateHighIncidenceDisease(br.crm.pojo.org.DictHighIncidenceDisease)
	 */
	@Override
	public int updateHighIncidenceDisease(DictHighIncidenceDisease highIncidenceDisease) {
		int result = dictHighIncidenceDiseaseMapper.updateByPrimaryKeySelective(highIncidenceDisease);
		if(systemConfigService.getRedis()){
		    
		}
		return result;
	}

	/**
	 * (非 Javadoc
	 * <p>
	 * Title: getHighIncidenceDiseases
	 * </p>
	 * <p>
	 * Description:获取对象列表
	 * </p>
	 * 
	 * @return
	 * @see br.crm.service.dict.DictHighIncidenceDiseaseService#getHighIncidenceDiseases()
	 */
	@Override
	public List<DictHighIncidenceDisease> getHighIncidenceDiseases() {
		DictHighIncidenceDiseaseExample example = new DictHighIncidenceDiseaseExample();
		example.createCriteria().andHighIncidenceDiseaseStatusEqualTo(0);
		return dictHighIncidenceDiseaseMapper.selectByExample(example);
		
	}

}
