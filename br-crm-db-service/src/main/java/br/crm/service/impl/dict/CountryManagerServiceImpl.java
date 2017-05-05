package br.crm.service.impl.dict;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.mapper.dict.DictCountryMapper;
import br.crm.pojo.dict.DictCountry;
import br.crm.pojo.dict.DictCountryExample;
import br.crm.pojo.system.SysConfig;
import br.crm.service.dict.CountryManagerService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictCountryRedis;

/**
 * 
 * @ClassName: CountryManagerServiceImpl
 * @Description: 国家字典表相关接口实现
 * @author zxy
 * @date 2016年9月13日 下午3:31:44
 *
 */
@Service
public class CountryManagerServiceImpl implements CountryManagerService {

	@Autowired
	private DictCountryMapper dictCountryMapper;
	
	/**
	 * 国家字典表缓存
	 */
	@Autowired
	private DictCountryRedis dictCountryRedis;
	
	@Autowired
	private SystemConfigService systemConfigService;
	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getList
	 * </p>
	 * <p>
	 * Description:获取列表
	 * </p>
	 * 
	 * @param page
	 * @param rows
	 * @param condition
	 * @return
	 * @see br.crm.service.dict.CountryManagerService#getList(java.lang.Integer,
	 *      java.lang.Integer, java.lang.String)
	 */
	@Override
	public PageInfo<DictCountry> getList(Integer page, Integer rows, String condition) {

		PageHelper.startPage(page, rows);

		List<DictCountry> list = new ArrayList<DictCountry>();
		if (StringUtil.isNotEmpty(condition)) {
			// 名称
			try {
				String name = new String(condition.getBytes("iso-8859-1"), "utf-8");
				DictCountryExample example = new DictCountryExample();
				example.setOrderByClause(" country_create_time desc");
				example.createCriteria().andCountryNameLike("%" + name + "%");
				list = dictCountryMapper.selectByExample(example);
				if (list.size() == 0) {
					// 键值
					DictCountryExample example1 = new DictCountryExample();
					example1.createCriteria().andCountryKeysLike(condition);
					list = dictCountryMapper.selectByExample(example1);
					if (list.size() == 0) {
						// 代码
						DictCountryExample example2 = new DictCountryExample();
						example2.createCriteria().andCountryCodeLike(condition);
						list = dictCountryMapper.selectByExample(example2);
					}
				}
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

		} else {
			list = dictCountryMapper.selectByExample(null);
		}

		PageInfo<DictCountry> pageInfo = new PageInfo<DictCountry>(list);

		return pageInfo;

	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: addCountry
	 * </p>
	 * <p>
	 * Description:添加对象
	 * </p>
	 * 
	 * @param dictCountry
	 * @return
	 * @see br.crm.service.dict.CountryManagerService#addCountry(br.crm.pojo.dict.DictCountry)
	 */
	@Override
	public int addCountry(DictCountry dictCountry) {
		int insertSelective = dictCountryMapper.insertSelective(dictCountry);
		boolean redis = systemConfigService.getRedis();
		if(redis){
		    dictCountryRedis.setDictCountry(dictCountry);
		}
		return insertSelective;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getCountryById
	 * </p>
	 * <p>
	 * Description:根据id获取对象信息
	 * </p>
	 * 
	 * @param country_id
	 * @return
	 * @see br.crm.service.dict.CountryManagerService#getCountryById(java.lang.Long)
	 */
	@Override
	public DictCountry getCountryById(Long country_id) {
	    DictCountry dictCountry =null;
	    if(systemConfigService.getRedis()){
	        dictCountry = dictCountryRedis.getDictCountry(country_id);
	    }else{
	        dictCountry = dictCountryMapper.selectByPrimaryKey(country_id);
	    }
		return dictCountry;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updateCountry
	 * </p>
	 * <p>
	 * Description:修改对象
	 * </p>
	 * 
	 * @param dictCountry
	 * @return
	 * @see br.crm.service.dict.CountryManagerService#updateCountry(br.crm.pojo.dict.DictCountry)
	 */
	@Override
	public int updateCountry(DictCountry dictCountry) {
		int updateByPrimaryKeySelective = dictCountryMapper.updateByPrimaryKeySelective(dictCountry);
		if(systemConfigService.getRedis()){
		    dictCountryRedis.setDictCountry(dictCountry);
		}
		return updateByPrimaryKeySelective;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getCountryByName
	 * </p>
	 * <p>
	 * Description:根据name获取对象信息
	 * </p>
	 * 
	 * @param countryName
	 * @return
	 * @see br.crm.service.dict.CountryManagerService#getCountryByName(java.lang.String)
	 */
	@Override
	public DictCountry getCountryByName(String countryName) {
		DictCountry dictCountry = null;
		DictCountryExample example = new DictCountryExample();
		example.createCriteria().andCountryNameLike("%" + countryName + "%");
		List<DictCountry> list = dictCountryMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			dictCountry = list.get(0);
		}

		return dictCountry;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getCountryByCode
	 * </p>
	 * <p>
	 * Description:根据code获取对象信息
	 * </p>
	 * 
	 * @param countryCode
	 * @return
	 * @see br.crm.service.dict.CountryManagerService#getCountryByCode(java.lang.String)
	 */
	@Override
	public DictCountry checkCountryCode(String countryCode) {
		DictCountryExample example = new DictCountryExample();
		example.createCriteria().andCountryCodeEqualTo(countryCode);
		List<DictCountry> list = dictCountryMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getCountryByInputCode
	 * </p>
	 * <p>
	 * Description:根据inputcode获取对象信息
	 * </p>
	 * 
	 * @param countryInputCode
	 * @return
	 * @see br.crm.service.dict.CountryManagerService#getCountryByInputCode(java.lang.String)
	 */
	@Override
	public DictCountry checkCountryInputCode(String countryInputCode) {
		DictCountryExample example = new DictCountryExample();
		example.createCriteria().andCountryInputCodeEqualTo(countryInputCode);
		List<DictCountry> list = dictCountryMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getCountryByLineOrder
	 * </p>
	 * <p>
	 * Description:根据lineorder获取对象信息
	 * </p>
	 * 
	 * @param countryLineOrder
	 * @return
	 * @see br.crm.service.dict.CountryManagerService#getCountryByLineOrder(java.lang.String)
	 */
	@Override
	public DictCountry checkCountryLineOrder(String countryLineOrder) {
		DictCountryExample example = new DictCountryExample();
		example.createCriteria().andCountryLineOrderEqualTo(countryLineOrder);
		List<DictCountry> list = dictCountryMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: checkCountryName
	 * </p>
	 * <p>
	 * Description:检查国家姓名是否重复
	 * </p>
	 * 
	 * @param countryName
	 * @return
	 * @see br.crm.service.dict.CountryManagerService#checkCountryName(java.lang.String)
	 */
	@Override
	public DictCountry checkCountryName(String countryName) {

		DictCountryExample example = new DictCountryExample();
		example.createCriteria().andCountryNameEqualTo(countryName);
		List<DictCountry> list = dictCountryMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * <p>Title:getAll</p> 
	 * <p>Description:获取所有国家信息 </p> 
	 * @return
	 * @see br.crm.service.dict.CountryManagerService#getAll()
	 */
	@Override
    public List<DictCountry> getAll() {
	    List<DictCountry> list = dictCountryMapper.selectByExample(null);
        return list;
    }

}
