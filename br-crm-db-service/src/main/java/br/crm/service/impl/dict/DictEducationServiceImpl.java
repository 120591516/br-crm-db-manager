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
import br.crm.mapper.dict.DicteducationMapper;
import br.crm.pojo.dict.Dicteducation;
import br.crm.pojo.dict.DicteducationExample;
import br.crm.service.dict.DictEducationService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DicteducationRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictEducationServiceImpl
 * @Description:教育字典表的相关接口实现
 * @author zxy
 * @date 2016年9月12日 上午11:54:52
 *
 */
@Service
public class DictEducationServiceImpl implements DictEducationService {

	@Autowired
	private DicteducationMapper dicteducationMapper;

	@Autowired
	private SystemConfigService systemConfigService;
	
	@Autowired
	private DicteducationRedis dicteducationRedis;
	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getEducationList
	 * </p>
	 * <p>
	 * Description:获取列表
	 * </p>
	 * 
	 * @param page
	 * @param rows
	 * @return
	 * @see br.crm.service.dict.DictEducationService#getEducationList(java.lang.Integer,
	 *      java.lang.Integer)
	 */
	@Override
	public PageInfo<Dicteducation> getEducationList(Integer page, Integer rows) {

		PageHelper.startPage(page, rows);

		DicteducationExample example = new DicteducationExample();

		example.setOrderByClause(" Education_createtime desc");
		
		List<Dicteducation> list = dicteducationMapper.selectByExample(example);

		PageInfo<Dicteducation> pageInfo = new PageInfo<Dicteducation>(list);

		return pageInfo;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: addEducation
	 * </p>
	 * <p>
	 * Description: 添加对象
	 * </p>
	 * 
	 * @param dicteducation
	 * @return
	 * @see br.crm.service.dict.DictEducationService#addEducation(br.crm.pojo.dict.Dicteducation)
	 */
	@Override
	public int addEducation(Dicteducation dicteducation) {
	
		int result = dicteducationMapper.insertSelective(dicteducation);
		if(systemConfigService.getRedis()){
		    dicteducationRedis.setDicteducation(dicteducation);
		}
		return result;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getEducationById
	 * </p>
	 * <p>
	 * Description:根据id获取对象信息
	 * </p>
	 * 
	 * @param idEducation
	 * @return
	 * @see br.crm.service.dict.DictEducationService#getEducationById(java.lang.Long)
	 */
	@Override
	public Dicteducation getEducationById(Integer idEducation) {		
	    Dicteducation dicteducation = null;
	    if(systemConfigService.getRedis()){
	        dicteducation = dicteducationRedis.getDicteducation(idEducation);
	    }else{
	        dicteducation = dicteducationMapper.selectByPrimaryKey(idEducation);
	    }
		return dicteducation;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updateEducation
	 * </p>
	 * <p>
	 * Description:修改对象信息
	 * </p>
	 * 
	 * @param dicteducation
	 * @return
	 * @see br.crm.service.dict.DictEducationService#updateEducation(br.crm.pojo.dict.Dicteducation)
	 */
	@Override
	public int updateEducation(Dicteducation dicteducation) {
		
		dicteducation.setEducationUpdatetime(new Date());
		int result = dicteducationMapper.updateByPrimaryKeySelective(dicteducation);
		if(systemConfigService.getRedis()){
		    dicteducationRedis.setDicteducation(dicteducation);
		}
		return result;
	}
	
	@Override
    public List<Dicteducation> getAll() {
	    List<Dicteducation> list = dicteducationMapper.selectByExample(null);
	    return list;
    }

}
