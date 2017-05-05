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
import br.crm.mapper.dict.DictinformwayMapper;
import br.crm.pojo.dict.Dictinformway;
import br.crm.pojo.dict.DictinformwayExample;
import br.crm.service.dict.DictinFormWayService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictinformwayRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictinFormWayServiceImpl
 * @Description: 通知方式字典表相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午3:33:16
 *
 */
@Service
public class DictinFormWayServiceImpl implements DictinFormWayService {

    @Autowired
    private DictinformwayMapper dictinformwayMapper;

    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private DictinformwayRedis dictinformwayRedis;

    /**
     * (非 Javadoc)
     * <p>
     * Title: getInformwayList
     * </p>
     * <p>
     * Description:获取对象列表
     * </p>
     * 
     * @param page
     * @param rows
     * @return
     * @see br.crm.service.dict.DictinFormWayService#getInformwayList(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<Dictinformway> getInformwayList(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        DictinformwayExample example = new DictinformwayExample();
        List<Dictinformway> list = dictinformwayMapper.selectByExample(example);
        PageInfo<Dictinformway> pageInfo = new PageInfo<Dictinformway>(list);
        return pageInfo;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: addInformway
     * </p>
     * <p>
     * Description:添加对象
     * </p>
     * @param dictinformway
     * @return
     * @see br.crm.service.dict.DictinFormWayService#addInformway(br.crm.pojo.dict.Dictinformway)
     */
    @Override
    public int addInformway(Dictinformway dictinformway) {
        int result = dictinformwayMapper.insertSelective(dictinformway);
        if (systemConfigService.getRedis()) {
            dictinformwayRedis.setDictinformway(dictinformway);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getInformwayById
     * </p>
     * <p>
     * Description:根据id获取对象信息
     * </p>
     * 
     * @param idInformway
     * @return
     * @see br.crm.service.dict.DictinFormWayService#getInformwayById(java.lang.Long)
     */
    @Override
    public Dictinformway getInformwayById(Long idInformway) {
        Dictinformway dictinformway = null;
        if (systemConfigService.getRedis()) {
            dictinformway = dictinformwayRedis.getDictinformway(idInformway.intValue());
        }
        else {
            dictinformway = dictinformwayMapper.selectByPrimaryKey(idInformway.intValue());
        }
        return dictinformway;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: updateInformway
     * </p>
     * <p>
     * Description: 修改对象
     * </p>
     * 
     * @param dictinformway
     * @return
     * @see br.crm.service.dict.DictinFormWayService#updateInformway(br.crm.pojo.dict.Dictinformway)
     */
    @Override
    public int updateInformway(Dictinformway dictinformway) {
        dictinformway.setInformwayUpdatetime(new Date());
        int result = dictinformwayMapper.updateByPrimaryKey(dictinformway);
        if(systemConfigService.getRedis()){
            dictinformwayRedis.setDictinformway(dictinformway);
        }
        return result;
    }

    @Override
    public List<Dictinformway> getAll() {
        List<Dictinformway> list = dictinformwayMapper.selectByExample(null);
        return list;
    }

}
