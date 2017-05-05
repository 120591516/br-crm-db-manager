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
import br.crm.mapper.dict.DictmarriageMapper;
import br.crm.pojo.dict.Dictmarriage;
import br.crm.pojo.dict.DictmarriageExample;
import br.crm.service.dict.DictMarriageService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictmarriageRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictMarriageServiceImpl
 * @Description: 婚姻字典表相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午3:40:54
 *
 */
@Service
public class DictMarriageServiceImpl implements DictMarriageService {

    @Autowired
    private DictmarriageMapper dictmarriageMapper;

    @Autowired
    private SystemConfigService systemConfigService;
    
    @Autowired
    private DictmarriageRedis dictmarriageRedis;
    /**
     * (非 Javadoc)
     * <p>
     * Title: getMarriageList
     * </p>
     * <p>
     * Description:分页获取对象列表
     * </p>
     * 
     * @param page
     * @param rows
     * @return
     * @see br.crm.service.dict.DictMarriageService#getMarriageList(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<Dictmarriage> getMarriageList(Integer page, Integer rows) {

        PageHelper.startPage(page, rows);
        DictmarriageExample example = new DictmarriageExample();
        example.setOrderByClause(" Marriage_createtime desc");
        List<Dictmarriage> list = dictmarriageMapper.selectByExample(example);
        PageInfo<Dictmarriage> pageInfo = new PageInfo<Dictmarriage>(list);
        return pageInfo;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: addMarriage
     * </p>
     * <p>
     * Description:添加对象
     * </p>
     * 
     * @param dictmarriage
     * @return
     * @see br.crm.service.dict.DictMarriageService#addMarriage(br.crm.pojo.dict.Dictmarriage)
     */
    @Override
    public int addMarriage(Dictmarriage dictmarriage) {

        int result = dictmarriageMapper.insertSelective(dictmarriage);
        if(systemConfigService.getRedis()){
            dictmarriageRedis.setDictmarriage(dictmarriage);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getMarriageById
     * </p>
     * <p>
     * Description:根据id获取对象信息
     * </p>
     * 
     * @param idMarriage
     * @return
     * @see br.crm.service.dict.DictMarriageService#getMarriageById(java.lang.Long)
     */
    @Override
    public Dictmarriage getMarriageById(Integer idMarriage) {
        Dictmarriage dictmarriage =null;
        if(systemConfigService.getRedis()){
            dictmarriage = dictmarriageRedis.getDictmarriage(idMarriage);
        }else{
            dictmarriage = dictmarriageMapper.selectByPrimaryKey(idMarriage);
        }
        return dictmarriage;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: updateMarriage
     * </p>
     * <p>
     * Description:修改对象信息
     * </p>
     * 
     * @param dictmarriage
     * @return
     * @see br.crm.service.dict.DictMarriageService#updateMarriage(br.crm.pojo.dict.Dictmarriage)
     */
    @Override
    public int updateMarriage(Dictmarriage dictmarriage) {
        dictmarriage.setMarriageUpdatetime(new Date());
        int result = dictmarriageMapper.updateByPrimaryKeySelective(dictmarriage);
        if(systemConfigService.getRedis()){
            dictmarriageRedis.setDictmarriage(dictmarriage);
        }
        return result;
    }

    @Override
    public List<Dictmarriage> getAll() {
        List<Dictmarriage> list = dictmarriageMapper.selectByExample(null);
        return list;
    }

}
