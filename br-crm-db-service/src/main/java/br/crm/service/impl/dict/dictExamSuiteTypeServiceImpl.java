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
import br.crm.mapper.org.DictExamSuiteTypeMapper;
import br.crm.pojo.org.DictExamSuiteType;
import br.crm.pojo.org.DictExamSuiteTypeExample;
import br.crm.service.dict.DictExamSuiteTypeService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictExamSuiteTypeRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: dictExamSuiteTypeServiceImpl
 * @Description: 套餐类型字典表相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午3:23:33
 *
 */
@Service
public class dictExamSuiteTypeServiceImpl implements DictExamSuiteTypeService {

    @Autowired
    private DictExamSuiteTypeMapper dictExamSuiteTypeMapper;

    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private DictExamSuiteTypeRedis dictExamSuiteTypeRedis;

    /**
     * (非 Javadoc)
     * <p>
     * Title: getExamSuiteTypeByPage
     * </p>
     * <p>
     * Description:分页获取列表
     * </p>
     * 
     * @param page
     * @param rows
     * @return
     * @see br.crm.service.dict.DictExamSuiteTypeService#getExamSuiteTypeByPage(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<DictExamSuiteType> getExamSuiteTypeByPage(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        DictExamSuiteTypeExample example = new DictExamSuiteTypeExample();
        example.setOrderByClause(" exam_type_create_time desc");
        example.createCriteria().andExamTypeStatusEqualTo(0);
        List<DictExamSuiteType> list = dictExamSuiteTypeMapper.selectByExample(example);
        PageInfo<DictExamSuiteType> pageInfo = new PageInfo<DictExamSuiteType>(list);
        return pageInfo;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: insertExamSuiteType
     * </p>
     * <p>
     * Description:添加对象信息
     * </p>
     * 
     * @param dictExamSuiteType
     * @return
     * @see br.crm.service.dict.DictExamSuiteTypeService#insertExamSuiteType(br.crm.pojo.org.DictExamSuiteType)
     */
    @Override
    public int insertExamSuiteType(DictExamSuiteType dictExamSuiteType) {
        int result = dictExamSuiteTypeMapper.insertSelective(dictExamSuiteType);
        if (systemConfigService.getRedis()) {
            dictExamSuiteTypeRedis.setDictExamSuiteType(dictExamSuiteType);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: updateExamSuiteType
     * </p>
     * <p>
     * Description:修改对象信息
     * </p>
     * 
     * @param dictExamSuiteType
     * @return
     * @see br.crm.service.dict.DictExamSuiteTypeService#updateExamSuiteType(br.crm.pojo.org.DictExamSuiteType)
     */
    @Override
    public int updateExamSuiteType(DictExamSuiteType dictExamSuiteType) {

        dictExamSuiteType.setExamTypeEditTime(new Date());
        int result = dictExamSuiteTypeMapper.updateByPrimaryKeySelective(dictExamSuiteType);
        if (systemConfigService.getRedis()) {
            dictExamSuiteTypeRedis.setDictExamSuiteType(dictExamSuiteType);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getDictExamSuiteTypeById
     * </p>
     * <p>
     * Description: 根据id获取对象信息
     * </p>
     * 
     * @param idExamSuiteType
     * @return
     * @see br.crm.service.dict.DictExamSuiteTypeService#getDictExamSuiteTypeById(java.lang.Long)
     */
    @Override
    public DictExamSuiteType getDictExamSuiteTypeById(String idExamSuiteType) {
        DictExamSuiteType dictExamSuiteType = null;
        if(systemConfigService.getRedis()){
            dictExamSuiteType = dictExamSuiteTypeRedis.getDictExamSuiteType(idExamSuiteType);
        }else{
            dictExamSuiteType = dictExamSuiteTypeMapper.selectByPrimaryKey(idExamSuiteType);
        }
        return dictExamSuiteType;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getExamSuiteTypes
     * </p>
     * <p>
     * Description:获取列表
     * </p>
     * 
     * @return
     * @see br.crm.service.dict.DictExamSuiteTypeService#getExamSuiteTypes()
     */
    @Override
    public List<DictExamSuiteType> getExamSuiteTypes() {

        DictExamSuiteTypeExample example = new DictExamSuiteTypeExample();
        example.createCriteria().andExamTypeStatusEqualTo(0);
        return dictExamSuiteTypeMapper.selectByExample(example);

    }
}
