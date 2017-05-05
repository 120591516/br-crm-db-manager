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
import br.crm.mapper.dict.DictjobclassMapper;
import br.crm.pojo.dict.Dictjobclass;
import br.crm.pojo.dict.DictjobclassExample;
import br.crm.service.dict.DictJobClassService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictjobclassRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictJobClassServiceImpl
 * @Description: 工作类型字典表相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午3:38:00
 *
 */
@Service
public class DictJobClassServiceImpl implements DictJobClassService {

    @Autowired
    private DictjobclassMapper dictjobclassMapper;

    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private DictjobclassRedis dictjobclassRedis;

    /**
     * (非 Javadoc)
     * <p>
     * Title: getJobClassList
     * </p>
     * <p>
     * Description:分页获取对象列表
     * </p>
     * 
     * @param page
     * @param rows
     * @return
     * @see br.crm.service.dict.DictJobClassService#getJobClassList(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<Dictjobclass> getJobClassList(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        DictjobclassExample example = new DictjobclassExample();
        example.setOrderByClause(" JobClass_createtime desc");
        List<Dictjobclass> list = dictjobclassMapper.selectByExample(example);
        PageInfo<Dictjobclass> pageInfo = new PageInfo<Dictjobclass>(list);
        return pageInfo;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: addJobClass
     * </p>
     * <p>
     * Description:添加对象
     * </p>
     * 
     * @param dictjobclass
     * @return
     * @see br.crm.service.dict.DictJobClassService#addJobClass(br.crm.pojo.dict.Dictjobclass)
     */
    @Override
    public int addJobClass(Dictjobclass dictjobclass) {
        int result = dictjobclassMapper.insertSelective(dictjobclass);
        if (systemConfigService.getRedis()) {
            dictjobclassRedis.setDictjobclass(dictjobclass);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getJobClassById
     * </p>
     * <p>
     * Description:根据id获取对象信息
     * </p>
     * 
     * @param idJobclass
     * @return
     * @see br.crm.service.dict.DictJobClassService#getJobClassById(java.lang.Long)
     */
    @Override
    public Dictjobclass getJobClassById(Long idJobclass) {
        Dictjobclass dictjobclass = null;
        if (systemConfigService.getRedis()) {
            dictjobclass = dictjobclassRedis.getDictjobclass(idJobclass);
        }
        else {
            dictjobclass = dictjobclassMapper.selectByPrimaryKey(idJobclass);
        }
        return dictjobclass;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: updateJobClass
     * </p>
     * <p>
     * Description:修改对象信息
     * </p>
     * 
     * @param dictjobclass
     * @return
     * @see br.crm.service.dict.DictJobClassService#updateJobClass(br.crm.pojo.dict.Dictjobclass)
     */
    @Override
    public int updateJobClass(Dictjobclass dictjobclass) {
        dictjobclass.setJobclassUpdatetime(new Date());
        int result = dictjobclassMapper.updateByPrimaryKeySelective(dictjobclass);
        if (systemConfigService.getRedis()) {
            dictjobclassRedis.setDictjobclass(dictjobclass);
        }
        return result;
    }

    @Override
    public List<Dictjobclass> getAll() {
        List<Dictjobclass> list = dictjobclassMapper.selectByExample(null);
        return list;
    }

}
