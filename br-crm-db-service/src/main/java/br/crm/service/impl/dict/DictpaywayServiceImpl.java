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
import br.crm.mapper.dict.DictpaywayMapper;
import br.crm.pojo.dict.Dictpayway;
import br.crm.pojo.dict.DictpaywayExample;
import br.crm.service.dict.DictpaywayService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictpaywayRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictpaywayServiceImpl
 * @Description: 支付方式字典表相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午1:59:16
 *
 */
@Service
public class DictpaywayServiceImpl implements DictpaywayService {
    @Autowired
    private DictpaywayMapper dictPaywayMapper;

    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private DictpaywayRedis dictpaywayRedis;

    /**
     * (非 Javadoc)
     * <p>
     * Title: selectByPrimaryKey
     * </p>
     * <p>
     * Description:查询
     * </p>
     * 
     * @param idPayway
     * @return
     * @see br.crm.service.dict.DictpaywayService#selectByPrimaryKey(java.lang.Long)
     */
    @Override
    public Dictpayway selectByPrimaryKey(Long idPayway) {
        Dictpayway dictpayway = null;
        if (systemConfigService.getRedis()) {
            dictpayway = dictpaywayRedis.getDictpayway(idPayway);
        }
        else {
            dictpayway = dictPaywayMapper.selectByPrimaryKey(idPayway);
        }
        return dictpayway;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getDictpaywayByPage
     * </p>
     * <p>
     * Description:分页获取对象列表
     * </p>
     * 
     * @param page
     * @param rows
     * @return
     * @see br.crm.service.dict.DictpaywayService#getDictpaywayByPage(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<Dictpayway> getDictpaywayByPage(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        DictpaywayExample dictpaywayExample = new DictpaywayExample();
        dictpaywayExample.setOrderByClause(" create_time desc");
        List<Dictpayway> list = dictPaywayMapper.selectByExample(null);
        PageInfo<Dictpayway> pageInfo = new PageInfo<Dictpayway>(list);
        return pageInfo;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: addDictpayway
     * </p>
     * <p>
     * Description:添加对象
     * </p>
     * 
     * @param dictpayway
     * @return
     * @see br.crm.service.dict.DictpaywayService#addDictpayway(br.crm.pojo.dict.Dictpayway)
     */
    @Override
    public int addDictpayway(Dictpayway dictpayway) {

        int result = dictPaywayMapper.insertSelective(dictpayway);
        if(systemConfigService.getRedis()){
            dictpaywayRedis.setDictpayway(dictpayway);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: updateDictpayway
     * </p>
     * <p>
     * Description:修改对象
     * </p>
     * 
     * @param dictpayway
     * @return
     * @see br.crm.service.dict.DictpaywayService#updateDictpayway(br.crm.pojo.dict.Dictpayway)
     */
    @Override
    public int updateDictpayway(Dictpayway dictpayway) {
        dictpayway.setEditTime(new Date());
        int result = dictPaywayMapper.updateByPrimaryKeySelective(dictpayway);
        if(systemConfigService.getRedis()){
            dictpaywayRedis.setDictpayway(dictpayway);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: deleteDictpayway
     * </p>
     * <p>
     * Description: 删除对象
     * </p>
     * 
     * @param dictpayway
     * @return
     * @see br.crm.service.dict.DictpaywayService#deleteDictpayway(br.crm.pojo.dict.Dictpayway)
     */
    @Override
    public int deleteDictpayway(Dictpayway dictpayway) {
        if(systemConfigService.getRedis()){
            dictpaywayRedis.deleteDictpayway(dictpayway.getIdPayway());
        }
        return dictPaywayMapper.updateByPrimaryKey(dictpayway);
    }

    @Override
    public List<Dictpayway> getAll() {
        List<Dictpayway> list = dictPaywayMapper.selectByExample(null);
        return list;
    }

}
