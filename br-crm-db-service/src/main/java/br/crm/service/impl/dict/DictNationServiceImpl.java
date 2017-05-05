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
import br.crm.mapper.dict.DictNationMapper;
import br.crm.pojo.dict.DictNation;
import br.crm.pojo.dict.DictNationExample;
import br.crm.service.dict.DictNationService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictNationRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictNationServiceImpl
 * @Description: 民族字典表相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午3:43:32
 *
 */
@Service
public class DictNationServiceImpl implements DictNationService {

    @Autowired
    private DictNationMapper dictNationMapper;

    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private DictNationRedis dictNationRedis;

    /**
     * (非 Javadoc)
     * <p>
     * Title: getAllNation
     * </p>
     * <p>
     * Description:获取对象列表
     * </p>
     * 
     * @param page
     * @param rows
     * @return
     * @see br.crm.service.dict.DictNationService#getAllNation(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<DictNation> getAllNation(Integer page, Integer rows) {

        PageHelper.startPage(page, rows);
        DictNationExample example = new DictNationExample();
        example.setOrderByClause(" createtime ASC");
        List<DictNation> list = dictNationMapper.selectByExample(example);
        PageInfo<DictNation> pageInfo = new PageInfo<DictNation>(list);
        return pageInfo;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: addNation
     * </p>
     * <p>
     * Description:添加对象
     * </p>
     * 
     * @param dictNation
     * @return
     * @see br.crm.service.dict.DictNationService#addNation(br.crm.pojo.dict.DictNation)
     */
    @Override
    public int addNation(DictNation dictNation) {
        int result = dictNationMapper.insertSelective(dictNation);
        if(systemConfigService.getRedis()){
            dictNationRedis.setDictNation(dictNation);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getNationById
     * </p>
     * <p>
     * Description:根据id获取对象
     * </p>
     * 
     * @param id
     * @return
     * @see br.crm.service.dict.DictNationService#getNationById(java.lang.Long)
     */
    @Override
    public DictNation getNationById(Long id) {
        DictNation dictNation =null;
        if(systemConfigService.getRedis()){
            dictNation = dictNationRedis.getDictNation(id.intValue());
        }else{
            dictNation = dictNationMapper.selectByPrimaryKey(id.intValue());
        }
        return dictNation;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: updateNation
     * </p>
     * <p>
     * Description:修改对象
     * </p>
     * 
     * @param dictNation
     * @return
     * @see br.crm.service.dict.DictNationService#updateNation(br.crm.pojo.dict.DictNation)
     */
    @Override
    public int updateNation(DictNation dictNation) {
        dictNation.setEditTime(new Date());
        int result = dictNationMapper.updateByPrimaryKeySelective(dictNation);
        if(systemConfigService.getRedis()){
            dictNationRedis.setDictNation(dictNation);
        }
        return result;
    }

    @Override
    public List<DictNation> getAll() {
        List<DictNation> list = dictNationMapper.selectByExample(null);
        return list;
    }

}
