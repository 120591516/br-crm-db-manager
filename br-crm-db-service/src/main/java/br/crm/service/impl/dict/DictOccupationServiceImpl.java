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
import br.crm.mapper.dict.DictoccupationMapper;
import br.crm.pojo.dict.Dictoccupation;
import br.crm.pojo.dict.DictoccupationExample;
import br.crm.service.dict.DictOccupationService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictoccupationRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictOccupationServiceImpl
 * @Description: 职业字典表相关接口实现
 * @author zxy
 * @date 2016年9月12日 下午3:47:02
 *
 */
@Service
public class DictOccupationServiceImpl implements DictOccupationService {

    @Autowired
    private DictoccupationMapper dictoccupationMapper;

    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private DictoccupationRedis dictoccupationRedis;

    /**
     * (非 Javadoc)
     * <p>
     * Title: getOccupationList
     * </p>
     * <p>
     * Description:获取对象列表
     * </p>
     * 
     * @param page
     * @param rows
     * @return
     * @see br.crm.service.dict.DictOccupationService#getOccupationList(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<Dictoccupation> getOccupationList(Integer page, Integer rows) {

        PageHelper.startPage(page, rows);
        DictoccupationExample example = new DictoccupationExample();
        List<Dictoccupation> list = dictoccupationMapper.selectByExample(example);
        PageInfo<Dictoccupation> pageInfo = new PageInfo<Dictoccupation>(list);
        return pageInfo;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: addOccupation
     * </p>
     * <p>
     * Description:添加对象
     * </p>
     * 
     * @param dictoccupation
     * @return
     * @see br.crm.service.dict.DictOccupationService#addOccupation(br.crm.pojo.dict.Dictoccupation)
     */
    @Override
    public int addOccupation(Dictoccupation dictoccupation) {
        int result = dictoccupationMapper.insertSelective(dictoccupation);
        if(systemConfigService.getRedis()){
            dictoccupationRedis.setDictoccupation(dictoccupation);
        }
        return result;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getOccupationById
     * </p>
     * <p>
     * Description:根据id获取对象信息
     * </p>
     * 
     * @param idOccupation
     * @return
     * @see br.crm.service.dict.DictOccupationService#getOccupationById(java.lang.Long)
     */
    @Override
    public Dictoccupation getOccupationById(Long idOccupation) {
        Dictoccupation dictoccupation = null;
        if(systemConfigService.getRedis()){
            dictoccupation = dictoccupationRedis.getDictoccupation(idOccupation.intValue());
        }else{
            dictoccupation = dictoccupationMapper.selectByPrimaryKey(idOccupation.intValue());
        }
        return dictoccupation;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: updateOccupation
     * </p>
     * <p>
     * Description:修改对象信息
     * </p>
     * 
     * @param dictoccupation
     * @return
     * @see br.crm.service.dict.DictOccupationService#updateOccupation(br.crm.pojo.dict.Dictoccupation)
     */
    @Override
    public int updateOccupation(Dictoccupation dictoccupation) {

        dictoccupation.setOccupationUpdatetime(new Date());
        int result = dictoccupationMapper.updateByPrimaryKey(dictoccupation);
        if(systemConfigService.getRedis()){
            dictoccupationRedis.setDictoccupation(dictoccupation);
        }
        return result;
    }

    @Override
    public List<Dictoccupation> getAll() {
        List<Dictoccupation> list = dictoccupationMapper.selectByExample(null);
        return list;
    }

}
