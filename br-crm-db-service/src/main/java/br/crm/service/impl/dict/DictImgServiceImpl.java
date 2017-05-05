package br.crm.service.impl.dict;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.mapper.dict.DictImgMapper;
import br.crm.pojo.dict.DictImg;
import br.crm.pojo.dict.DictImgExample;
import br.crm.service.dict.DictImgService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictImgRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: DictImgServiceImpl
 * @Description: 添加图片接口实现
 * @author zxy
 * @date 2016年9月13日 下午3:33:13
 *
 */
@Service
public class DictImgServiceImpl implements DictImgService {

    @Autowired
    private DictImgMapper dictImgMapper;

    @Autowired
    private DictImgRedis dictImgRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * (非 Javadoc)
     * <p>
     * Title: insertImg
     * </p>
     * <p>
     * Description:添加图片信息
     * </p>
     * 
     * @param dictImg
     * @return
     * @see br.crm.service.dict.DictImgService#insertImg(br.crm.pojo.dict.DictImg)
     */
    @Override
    public Long insertImg(DictImg dictImg) {
        long i = dictImgMapper.insertSelective(dictImg);
        if (i > 0) {
            Long imgId = dictImg.getImgId();
            if (null != imgId && imgId != 0) {
                if (systemConfigService.getRedis())
                    dictImgRedis.setDictImg(dictImg);
                return imgId;
            }
        }
        return 0L;
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getEntityById
     * </p>
     * <p>
     * Description:获取图片信息
     * </p>
     * 
     * @param imgId
     * @return
     * @see br.crm.service.dict.DictImgService#getEntityById(java.lang.Long)
     */
    @Override
    public DictImg getEntityById(Long imgId) {
        DictImg dictImg = null;
        if(systemConfigService.getRedis()){
            dictImg = dictImgRedis.getDictImg(imgId);
        }else{
            dictImg = dictImgMapper.selectByPrimaryKey(imgId);
        }
        return dictImg;

    }

    @Override
    public List<DictImg> getAll() {
        DictImgExample example = new DictImgExample();
        example.createCriteria().andImgStatusEqualTo(0);
        List<DictImg> list = dictImgMapper.selectByExample(example);
        return list;
    }
}
