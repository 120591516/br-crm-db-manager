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
import br.crm.mapper.dict.DictreceipttypeMapper;
import br.crm.pojo.dict.Dictreceipttype;
import br.crm.pojo.dict.DictreceipttypeExample;
import br.crm.pojo.dict.Dictsection;
import br.crm.pojo.dict.DictsectionExample;
import br.crm.service.dict.DictreceipttypeService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictreceipttypeRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictreceipttypeServiceImpl
 * @Description: 发票类型字典表相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午1:55:29
 *
 */
@Service
public class DictreceipttypeServiceImpl implements DictreceipttypeService {
    @Autowired
    private DictreceipttypeMapper dictreceipttypeMapper;

    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private DictreceipttypeRedis dictreceipttypeRedis;

    /**
     * (非 Javadoc)
     * <p>
     * Title: selectByPrimaryKey
     * </p>
     * <p>
     * Description:查询
     * </p>
     * 
     * @param idReceipttype
     * @return
     * @see br.crm.service.dict.DictreceipttypeService#selectByPrimaryKey(java.lang.Long)
     */
    @Override
    public Dictreceipttype selectByPrimaryKey(Long idReceipttype) {
        Dictreceipttype dictreceipttype = null;
        if (systemConfigService.getRedis()) {
            dictreceipttype = dictreceipttypeRedis.getDictreceipttype(idReceipttype);
        }
        else {
            dictreceipttype = dictreceipttypeMapper.selectByPrimaryKey(idReceipttype);
        }
        return dictreceipttype;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getDictreceipttypeByPage
     * </p>
     * <p>
     * Description:分页获取对象列表
     * </p>
     * 
     * @param page
     * @param rows
     * @return
     * @see br.crm.service.dict.DictreceipttypeService#getDictreceipttypeByPage(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<Dictreceipttype> getDictreceipttypeByPage(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        DictreceipttypeExample dictreceipttypeExample = new DictreceipttypeExample();
        dictreceipttypeExample.setOrderByClause(" ReceiptType_createtime desc");
        List<Dictreceipttype> list = dictreceipttypeMapper.selectByExample(dictreceipttypeExample);
        PageInfo<Dictreceipttype> pageInfo = new PageInfo<Dictreceipttype>(list);
        return pageInfo;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: addDictreceipttype
     * </p>
     * <p>
     * Description:添加对象
     * </p>
     * 
     * @param dictreceipttype
     * @return
     * @see br.crm.service.dict.DictreceipttypeService#addDictreceipttype(br.crm.pojo.dict.Dictreceipttype)
     */
    @Override
    public int addDictreceipttype(Dictreceipttype dictreceipttype) {

        int result = dictreceipttypeMapper.insertSelective(dictreceipttype);
        if (systemConfigService.getRedis()) {
            dictreceipttypeRedis.setDictreceipttype(dictreceipttype);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: updateDictreceipttype
     * </p>
     * <p>
     * Description:修改对象
     * </p>
     * 
     * @param dictreceipttype
     * @return
     * @see br.crm.service.dict.DictreceipttypeService#updateDictreceipttype(br.crm.pojo.dict.Dictreceipttype)
     */
    @Override
    public int updateDictreceipttype(Dictreceipttype dictreceipttype) {
        dictreceipttype.setReceipttypeUpdatetime(new Date());
        int result = dictreceipttypeMapper.updateByPrimaryKeySelective(dictreceipttype);
        if (systemConfigService.getRedis()) {
            dictreceipttypeRedis.setDictreceipttype(dictreceipttype);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: deleteDictreceipttype
     * </p>
     * <p>
     * Description:删除对象
     * </p>
     * 
     * @param dictreceipttype
     * @return
     * @see br.crm.service.dict.DictreceipttypeService#deleteDictreceipttype(br.crm.pojo.dict.Dictreceipttype)
     */
    @Override
    public int deleteDictreceipttype(Dictreceipttype dictreceipttype) {
        if (systemConfigService.getRedis()) {
            dictreceipttypeRedis.deleteDictreceipttype(dictreceipttype.getIdReceipttype());
        }
        return dictreceipttypeMapper.updateByPrimaryKey(dictreceipttype);
    }

    /** 
    *  获取发票类型列表
    * <p>Title: getDictreceipttypeList</p> 
    * <p>Description: </p> 
    * @return
    * @see br.crm.service.dict.DictreceipttypeService#getDictreceipttypeList() 
    */
    @Override
    public List<Dictreceipttype> getDictreceipttypeList() {
        DictreceipttypeExample example = new DictreceipttypeExample();
        example.createCriteria().andReceipttypeStatusEqualTo(0);
        List<Dictreceipttype> list = dictreceipttypeMapper.selectByExample(example);
        return list;
    }

}
