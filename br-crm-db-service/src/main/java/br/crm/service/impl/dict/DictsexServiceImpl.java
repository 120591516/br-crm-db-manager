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
import br.crm.mapper.dict.DictsexMapper;
import br.crm.pojo.dict.Dictsex;
import br.crm.pojo.dict.DictsexExample;
import br.crm.service.dict.DictsexService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictsexRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictsexServiceImpl
 * @Description: 性别字典表相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午12:00:19
 *
 */
@Service
public class DictsexServiceImpl implements DictsexService {

    @Autowired
    private DictsexMapper dictsexMapper;

    @Autowired
    private DictsexRedis dictsexRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * (非 Javadoc)
     * <p>
     * Title: getDictsexByID
     * </p>
     * <p>
     * Description:根据id获取对象
     * </p>
     * 
     * @param pid
     * @return
     * @see br.crm.service.dict.DictsexService#getDictsexByID(int)
     */
    @Override
    public Dictsex getDictsexByID(int pid) {
        Dictsex dictsex = null;
        if (systemConfigService.getRedis()) {
            dictsex = dictsexRedis.getDictsex(pid);
        }
        else {
            dictsex = dictsexMapper.selectByPrimaryKey(pid);
        }
        return dictsex;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getDictSexList
     * </p>
     * <p>
     * Description:获取对象列表
     * </p>
     * 
     * @param page
     * @param rows
     * @return
     * @see br.crm.service.dict.DictsexService#getDictSexList(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<Dictsex> getDictSexList(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        DictsexExample dictsexExample = new DictsexExample();
        dictsexExample.setOrderByClause(" Sex_createtime desc");
        List<Dictsex> list = dictsexMapper.selectByExample(dictsexExample);
        PageInfo<Dictsex> pageInfo = new PageInfo<Dictsex>(list);
        return pageInfo;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: addDictSex
     * </p>
     * <p>
     * Description:添加对象
     * </p>
     * 
     * @param dictsex
     * @return
     * @see br.crm.service.dict.DictsexService#addDictSex(br.crm.pojo.dict.Dictsex)
     */
    @Override
    public int addDictSex(Dictsex dictsex) {
        int result = dictsexMapper.insertSelective(dictsex);
        if (systemConfigService.getRedis()) {
            dictsexRedis.setDictsex(dictsex);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: updateDictSex
     * </p>
     * <p>
     * Description: 修改对象
     * </p>
     * 
     * @param dictsex
     * @return
     * @see br.crm.service.dict.DictsexService#updateDictSex(br.crm.pojo.dict.Dictsex)
     */
    @Override
    public int updateDictSex(Dictsex dictsex) {
        dictsex.setSexUpdatetime(new Date());
        int result = dictsexMapper.updateByPrimaryKeySelective(dictsex);
        if (systemConfigService.getRedis()) {
            dictsexRedis.setDictsex(dictsex);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: deleteDictSex
     * </p>
     * <p>
     * Description:删除对象
     * </p>
     * 
     * @param dictsex
     * @return
     * @see br.crm.service.dict.DictsexService#deleteDictSex(br.crm.pojo.dict.Dictsex)
     */
    @Override
    public int deleteDictSex(Dictsex dictsex) {
        if (systemConfigService.getRedis()) {
            dictsexRedis.deleteDictsex(dictsex.getIdSex());
        }
        return dictsexMapper.updateByPrimaryKey(dictsex);
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: dictSexListByStatus
     * </p>
     * <p>
     * Description:根据status获取对象列表
     * </p>
     * 
     * @return
     * @see br.crm.service.dict.DictsexService#dictSexListByStatus()
     */
    @Override
    public List<Dictsex> dictSexListByStatus() {
        DictsexExample example = new DictsexExample();
        example.createCriteria().andSexStatusEqualTo(0);
        return dictsexMapper.selectByExample(example);
    }

}
