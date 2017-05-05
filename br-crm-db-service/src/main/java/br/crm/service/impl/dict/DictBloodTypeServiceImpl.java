package br.crm.service.impl.dict;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.mapper.dict.DictbloodtypeMapper;
import br.crm.pojo.dict.Dictbloodtype;
import br.crm.pojo.dict.DictbloodtypeExample;
import br.crm.service.dict.DictBloodTypeService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictbloodtypeRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictBloodTypeServiceImpl
 * @Description: 血型字典表的相关接口实现
 * @author zxy
 * @date 2016年9月12日 上午11:45:57
 *
 */
@Service
public class DictBloodTypeServiceImpl implements DictBloodTypeService {

	@Autowired
	private DictbloodtypeMapper dictbloodtypeMapper;

	@Autowired
	private SystemConfigService systemConfigService;
	
	@Autowired
	private DictbloodtypeRedis dictbloodtypeRedis;
	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getAllBloodType
	 * </p>
	 * <p>
	 * Description:获取所有对象列表
	 * </p>
	 * 
	 * @return
	 * @see br.crm.service.dict.DictBloodTypeService#getAllBloodType()
	 */
	@Override
	public List<Dictbloodtype> getAllBloodType() {
		
		DictbloodtypeExample dictbloodtypeExample = new DictbloodtypeExample();
		dictbloodtypeExample.setOrderByClause(" BloodType_createtime desc");
		return dictbloodtypeMapper.selectByExample(dictbloodtypeExample);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: addBloodType
	 * </p>
	 * <p>
	 * Description:添加对象
	 * </p>
	 * 
	 * @param dictbloodtype
	 * @return
	 * @see br.crm.service.dict.DictBloodTypeService#addBloodType(br.crm.pojo.dict.Dictbloodtype)
	 */
	@Override
	public int addBloodType(Dictbloodtype dictbloodtype) {
		int result = dictbloodtypeMapper.insertSelective(dictbloodtype);
		if(systemConfigService.getRedis()){
		    dictbloodtypeRedis.setDictbloodtype(dictbloodtype);
		}
		return result;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getBloodTypeById
	 * </p>
	 * <p>
	 * Description: 根据id获取对象信息
	 * </p>
	 * 
	 * @param idBloodtype
	 * @return
	 * @see br.crm.service.dict.DictBloodTypeService#getBloodTypeById(java.lang.Long)
	 */
	@Override
	public Dictbloodtype getBloodTypeById(Long idBloodtype) {
	    Dictbloodtype dictbloodtype =null;
	    if(systemConfigService.getRedis()){
	        dictbloodtype = dictbloodtypeRedis.getDictbloodtype(idBloodtype.intValue());
	    }else{
	        dictbloodtype =dictbloodtypeMapper.selectByPrimaryKey(idBloodtype.intValue());
	    }
		return dictbloodtype;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updateBloodType
	 * </p>
	 * <p>
	 * Description:修改对象信息
	 * </p>
	 * 
	 * @param dictbloodtype
	 * @return
	 * @see br.crm.service.dict.DictBloodTypeService#updateBloodType(br.crm.pojo.dict.Dictbloodtype)
	 */
	@Override
	public int updateBloodType(Dictbloodtype dictbloodtype) {
		dictbloodtype.setBloodtypeUpdatetime(new Date());
		
		return dictbloodtypeMapper.updateByPrimaryKey(dictbloodtype);
	}

}
