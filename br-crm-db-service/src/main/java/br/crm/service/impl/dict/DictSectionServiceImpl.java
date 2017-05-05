package br.crm.service.impl.dict;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.mapper.dict.DictsectionMapper;
import br.crm.pojo.dict.Dictsection;
import br.crm.pojo.dict.DictsectionExample;
import br.crm.pojo.dict.DictsectionExample.Criteria;
import br.crm.service.dict.DictSectionService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictsectionRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictSectionServiceImpl
 * @Description: 总检科室相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午12:42:45
 *
 */
@Service
public class DictSectionServiceImpl implements DictSectionService {

    @Autowired
    private DictsectionMapper dictsectionMapper;

    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private DictsectionRedis dictsectionRedis;

    /**
     * (非 Javadoc)
     * <p>
     * Title: getDictSection
     * </p>
     * <p>
     * Description:获取对象列表
     * </p>
     * 
     * @return
     * @see br.crm.service.dict.DictSectionService#getDictSectionList()
     */
    @Override
    public List<Dictsection> getDictSectionList() {
        DictsectionExample example = new DictsectionExample();
        Criteria criteria = example.createCriteria();
        criteria.andSectionStatusEqualTo(0);
        return dictsectionMapper.selectByExample(example);
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getDictSectionById
     * </p>
     * <p>
     * Description:根据id获取对象信息
     * </p>
     * 
     * @param idDictsection
     * @return
     * @see br.crm.service.dict.DictSectionService#getDictSectionById(java.lang.Long)
     */
    @Override
    public Dictsection getDictSectionById(Long idDictsection) {
        Dictsection dictsection = null;
        if(systemConfigService.getRedis()){
            dictsection = dictsectionRedis.getDictsection(idDictsection.intValue());
        }else{
            dictsection = dictsectionMapper.selectByPrimaryKey(idDictsection);
        }
        return dictsection;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: updateDictSection
     * </p>
     * <p>
     * Description:修改对象
     * </p>
     * 
     * @param dictsection
     * @return
     * @see br.crm.service.dict.DictSectionService#updateDictSection(br.crm.pojo.dict.Dictsection)
     */
    @Override
    public int updateDictSection(Dictsection dictsection) {
        dictsection.setSectionUpdatetime(new Date());
        int result = dictsectionMapper.updateByPrimaryKeySelective(dictsection);
        if(systemConfigService.getRedis()){
            dictsectionRedis.setDictsection(dictsection);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: addDictSection
     * </p>
     * <p>
     * Description:添加对象
     * </p>
     * 
     * @param dictsection
     * @return
     * @see br.crm.service.dict.DictSectionService#addDictSection(br.crm.pojo.dict.Dictsection)
     */
    @Override
    public int addDictSection(Dictsection dictsection) {
        int result = dictsectionMapper.insert(dictsection);
        if(systemConfigService.getRedis()){
            dictsectionRedis.setDictsection(dictsection);
        }
        return result;
    }

}
