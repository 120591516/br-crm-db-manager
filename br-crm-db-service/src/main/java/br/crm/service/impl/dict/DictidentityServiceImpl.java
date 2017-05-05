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
import br.crm.mapper.dict.DictidentityMapper;
import br.crm.pojo.dict.Dictidentity;
import br.crm.pojo.dict.DictidentityExample;
import br.crm.service.dict.DictidentityService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictidentityRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictidentityServiceImpl
 * @Description: 身份字典表相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午3:29:33
 *
 */
@Service
public class DictidentityServiceImpl implements DictidentityService {

    @Autowired
    private DictidentityMapper dictidentityMapper;

    @Autowired
    private DictidentityRedis dictidentityRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * (非 Javadoc)
     * <p>
     * Title: getIdentityList
     * </p>
     * <p>
     * Description:分页获取对象列表
     * </p>
     * 
     * @param page
     * @param rows
     * @return
     * @see br.crm.service.dict.DictidentityService#getIdentityList(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<Dictidentity> getIdentityList(Integer page, Integer rows) {

        PageHelper.startPage(page, rows);

        DictidentityExample example = new DictidentityExample();

        List<Dictidentity> list = dictidentityMapper.selectByExample(example);

        PageInfo<Dictidentity> pageInfo = new PageInfo<Dictidentity>(list);

        return pageInfo;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: addIdentity
     * </p>
     * <p>
     * Description:添加对象
     * </p>
     * 
     * @param dictidentity
     * @return
     * @see br.crm.service.dict.DictidentityService#addIdentity(br.crm.pojo.dict.Dictidentity)
     */
    @Override
    public int addIdentity(Dictidentity dictidentity) {
        int result = dictidentityMapper.insertSelective(dictidentity);
        if(systemConfigService.getRedis()){
            dictidentityRedis.setDictidentity(dictidentity);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getIdentityById
     * </p>
     * <p>
     * Description: 根据id获取对象信息
     * </p>
     * 
     * @param idIdentity
     * @return
     * @see br.crm.service.dict.DictidentityService#getIdentityById(java.lang.Long)
     */
    @Override
    public Dictidentity getIdentityById(Long idIdentity) {
        Dictidentity dictidentity =null;
        if(systemConfigService.getRedis()){
            dictidentity = dictidentityRedis.getDictidentity(idIdentity.intValue());
        }else{
            dictidentity = dictidentityMapper.selectByPrimaryKey(idIdentity.intValue());
        }
        return dictidentity;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: updateIdentity
     * </p>
     * <p>
     * Description:修改对象
     * </p>
     * 
     * @param dictidentity
     * @return
     * @see br.crm.service.dict.DictidentityService#updateIdentity(br.crm.pojo.dict.Dictidentity)
     */
    @Override
    public int updateIdentity(Dictidentity dictidentity) {

        dictidentity.setIdIdentityUpdatetime(new Date());
        int result = dictidentityMapper.updateByPrimaryKey(dictidentity);
        if(systemConfigService.getRedis()){
            dictidentityRedis.setDictidentity(dictidentity);
        }
        return result;
    }

    @Override
    public List<Dictidentity> getAll() {
        List<Dictidentity> list = dictidentityMapper.selectByExample(null);
        return list;
    }

}
