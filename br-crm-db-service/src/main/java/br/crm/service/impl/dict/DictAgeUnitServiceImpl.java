package br.crm.service.impl.dict;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.mapper.dict.DictageunitMapper;
import br.crm.pojo.dict.Dictageunit;
import br.crm.pojo.dict.DictageunitExample;
import br.crm.service.dict.DictAgeUnitService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictageunitRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictAgeUnitServiceImpl
 * @Description: 年龄单位字典表的相关接口实现
 * @author zxy
 * @date 2016年9月12日 上午11:32:00
 *
 */
@Service
public class DictAgeUnitServiceImpl implements DictAgeUnitService {

	@Autowired
	private DictageunitMapper dictageunitMapper;
	
	@Autowired
	private DictageunitRedis dictageunitRedis;
	
	@Autowired
	private SystemConfigService systemConfigService;
	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getAllDictageunit
	 * </p>
	 * <p>
	 * Description: 获取列表
	 * </p>
	 * 
	 * @return
	 * @see br.crm.service.dict.DictAgeUnitService#getAllDictageunit()
	 */
	@Override
	public List<Dictageunit> getAllDictageunit() {
		DictageunitExample dictageunitExample = new DictageunitExample();
		dictageunitExample.setOrderByClause("AgeUnit_createtime desc");
		return dictageunitMapper.selectByExample(dictageunitExample);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: addDictAgeUnit
	 * </p>
	 * <p>
	 * Description:添加对象
	 * </p>
	 * 
	 * @param dictageunit
	 * @return
	 * @see br.crm.service.dict.DictAgeUnitService#addDictAgeUnit(br.crm.pojo.dict.Dictageunit)
	 */
	@Override
	public int addDictAgeUnit(Dictageunit dictageunit) {
		int result = dictageunitMapper.insertSelective(dictageunit);
		if(systemConfigService.getRedis()){
		    dictageunitRedis.setDictageunit(dictageunit);
		}
		return result;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getDictAgeUnitById
	 * </p>
	 * <p>
	 * Description: 根据id获取对象信息
	 * </p>
	 * 
	 * @param ageunitId
	 * @return
	 * @see br.crm.service.dict.DictAgeUnitService#getDictAgeUnitById(java.lang.Long)
	 */
	@Override
	public Dictageunit getDictAgeUnitById(Integer ageunitId) {
	    Dictageunit dictageunit= null;
	    if(systemConfigService.getRedis()){
	        dictageunit = dictageunitRedis.getDictageunit(ageunitId);
	    }else{
	        dictageunit = dictageunitMapper.selectByPrimaryKey(ageunitId);
	    }
		return dictageunit;

	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updateDictageunit
	 * </p>
	 * <p>
	 * Description: 修改对象信息
	 * </p>
	 * 
	 * @param dictageunit
	 * @return
	 * @see br.crm.service.dict.DictAgeUnitService#updateDictageunit(br.crm.pojo.dict.Dictageunit)
	 */
	@Override
	public int updateDictageunit(Dictageunit dictageunit) {
		dictageunit.setAgeunitUpdatetime(new Date());
		if(systemConfigService.getRedis()){
		    dictageunitRedis.setDictageunit(dictageunit);
		}
		return dictageunitMapper.updateByPrimaryKeySelective(dictageunit);
	}

}
