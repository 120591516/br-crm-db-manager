package br.crm.service.impl.dict;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.RedisConstant;
import br.crm.mapper.dict.DictAreaMapper;
import br.crm.mapper.dict.self.DictAreaSelfMapper;
import br.crm.pojo.dict.DictArea;
import br.crm.pojo.dict.DictAreaExample;
import br.crm.pojo.dict.DictAreaExample.Criteria;
import br.crm.service.dict.DictAreaService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictAreaRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictAreaServiceImpl
 * @Description: 区域字典表的相关接口实现
 * @author zxy
 * @date 2016年9月12日 上午11:38:38
 *
 */
@Service
public class DictAreaServiceImpl implements DictAreaService {

    @Autowired
    private DictAreaMapper dictAreaMapper;

    @Autowired
    private DictAreaSelfMapper dictAreaSelfMapper;

    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private DictAreaRedis dictAreaRedis;

    @Autowired
    private RedisService redisService;

    /**
     * (非 Javadoc)
     * <p>
     * Title: getAllProvince
     * </p>
     * <p>
     * Description:获得所有省信息
     * </p>
     * 
     * @return
     * @see br.crm.service.dict.DictAreaService#getAllProvince()
     */
    @Override
    public List<DictArea> getAllProvince() {
        DictAreaExample example = new DictAreaExample();
        Criteria criteria = example.createCriteria();
        criteria.andProvinceIdEqualTo(0);
        return dictAreaMapper.selectByExample(example);
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getCityByProvinceId
     * </p>
     * <p>
     * Description:根据省id获取市信息
     * </p>
     * 
     * @param provinceId
     * @return
     * @see br.crm.service.dict.DictAreaService#getCityByProvinceId(java.lang.Integer)
     */
    @Override
    public List<DictArea> getCityByProvinceId(Integer provinceId) {
        List<DictArea> list = null;
        if (systemConfigService.getRedis()) {
            list = dictAreaRedis.getCityByProvinceId(provinceId);
        }
        else {
            DictAreaExample example = new DictAreaExample();
            example.createCriteria().andStatusEqualTo(0).andProvinceIdEqualTo(provinceId).andCityIdEqualTo(0);
            list = dictAreaMapper.selectByExample(example);
        }
        return list;

    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getDistrictByCityId
     * </p>
     * <p>
     * Description:根据cityid获取县
     * </p>
     * 
     * @param cityId
     * @return
     * @see br.crm.service.dict.DictAreaService#getDistrictByCityId(java.lang.Integer)
     */
    @Override
    public List<DictArea> getDistrictByCityId(Integer cityId) {
        List<DictArea> list = null;
        if (systemConfigService.getRedis()) {
            list = dictAreaRedis.getDistrictByCityId(cityId);
        }
        else {
            DictAreaExample example = new DictAreaExample();
            example.createCriteria().andStatusEqualTo(0).andCityIdEqualTo(cityId);
            list = dictAreaMapper.selectByExample(example);
        }
        return list;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getAreaByPage
     * </p>
     * <p>
     * Description:分页获取区域信息
     * </p>
     * 
     * @param areaName
     * @param page
     * @param rows
     * @return
     * @see br.crm.service.dict.DictAreaService#getAreaByPage(java.lang.String,
     *      java.lang.Integer, java.lang.Integer)
     */
    @Override
    public PageInfo<DictArea> getAreaByPage(String areaName, Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        List<DictArea> list = dictAreaSelfMapper.getAreaByPage(areaName);
        PageInfo<DictArea> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: insertProvince
     * </p>
     * <p>
     * Description:添加省
     * </p>
     * 
     * @param dictArea
     * @return
     * @see br.crm.service.dict.DictAreaService#insertProvince(br.crm.pojo.dict.DictArea)
     */
    @Override
    public int insertProvince(DictArea dictArea) {
        int result = dictAreaMapper.insertSelective(dictArea);
        if (systemConfigService.getRedis()) {
            result = dictAreaRedis.setProvince(dictArea);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: insertCity
     * </p>
     * <p>
     * Description: 添加市
     * </p>
     * 
     * @param dictArea
     * @return
     * @see br.crm.service.dict.DictAreaService#insertCity(br.crm.pojo.dict.DictArea)
     */
    @Override
    public int insertCity(DictArea dictArea) {
        int result = dictAreaMapper.insertSelective(dictArea);
        if (systemConfigService.getRedis()) {
            result = dictAreaRedis.setCity(dictArea);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: insertDistrict
     * </p>
     * <p>
     * Description:添加县
     * </p>
     * 
     * @param dictArea
     * @return
     * @see br.crm.service.dict.DictAreaService#insertDistrict(br.crm.pojo.dict.DictArea)
     */
    @Override
    public int insertDistrict(DictArea dictArea) {
        int result = dictAreaMapper.insertSelective(dictArea);
        if (systemConfigService.getRedis()) {
            result = dictAreaRedis.setDistrict(dictArea);
        }
        return result;
    }

    @Override
    public DictArea getPositionCity(String city) {
        DictAreaExample dictAreaExample = new DictAreaExample();
        dictAreaExample.createCriteria().andCityNameEqualTo(city).andAreaLevelEqualTo(2);
        List<DictArea> list = dictAreaMapper.selectByExample(dictAreaExample);
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public LinkedList<String> getPositionCity() {
        LinkedList<String> result = new LinkedList<String>();
        String str = redisService.get(RedisConstant.br_order_user_city_list);
        if (StringUtils.isNotEmpty(str)) {
            List<String> list = JSONObject.parseArray(str, String.class);
            if (CollectionUtils.isNotEmpty(list)) {
                for (String id : list) {
                    result.add(id);
                }
            }
        }
        return result;
    }

    @Override
    public List<DictArea> getCitys(LinkedList<String> list) {
        List<DictArea> result = new ArrayList<DictArea>();
        for (String cityID : list) {
            DictAreaExample dictAreaExample = new DictAreaExample();
            dictAreaExample.createCriteria().andCityIdEqualTo(new Integer(cityID));
            List<DictArea> cityList = dictAreaMapper.selectByExample(dictAreaExample);
            result.add(cityList.get(0));

        }
        return result;
    }

    @Override
    public List<DictArea> getAllCity() {
        DictAreaExample example = new DictAreaExample();
        example.createCriteria().andStatusEqualTo(0);
        List<DictArea> list = dictAreaMapper.selectByExample(example);
        return list;
    }

}
