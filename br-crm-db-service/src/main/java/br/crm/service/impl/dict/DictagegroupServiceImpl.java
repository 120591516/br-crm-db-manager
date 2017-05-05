package br.crm.service.impl.dict;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.dict.DictagegroupMapper;
import br.crm.pojo.dict.Dictagegroup;
import br.crm.pojo.dict.DictagegroupExample;
import br.crm.service.dict.DictagegroupService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictagegroupRedis;

/**
 * 
 * @ClassName: DictagegroupServiceImpl
 * @Description: 年龄分组字典表的相关维护
 * @author zxy
 * @date 2016年9月12日 上午11:27:56
 *
 */
@Service
public class DictagegroupServiceImpl implements DictagegroupService {
	@Autowired
	private DictagegroupMapper dictAgeGroupMapper;

	@Autowired
	private SystemConfigService systemConfigService;
	
	@Autowired 
	private DictagegroupRedis dictagegroupRedis;
	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getDictagegroupList
	 * </p>
	 * <p>
	 * Description:获取列表
	 * </p>
	 * 
	 * @param page
	 * @param rows
	 * @return
	 * @see br.crm.service.dict.DictagegroupService#getDictagegroupList(int,
	 *      int)
	 */
	@Override
	public PageInfo<Dictagegroup> getDictagegroupList(int page, int rows) {
		PageHelper.startPage(page, rows);
		DictagegroupExample dictagegroupExample = new DictagegroupExample();
		dictagegroupExample.setOrderByClause(" AgeGroup_CreateTime desc");
		List<Dictagegroup> list = dictAgeGroupMapper.selectByExample(null);
		PageInfo<Dictagegroup> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getDictagegroup
	 * </p>
	 * <p>
	 * Description:根据pid获取对象信息
	 * </p>
	 * 
	 * @param pid
	 * @return
	 * @see br.crm.service.dict.DictagegroupService#getDictagegroup(int)
	 */
	@Override
	public Dictagegroup getDictagegroup(Integer pid) {
	    Dictagegroup dictagegroup = null;
	    if(systemConfigService.getRedis()){
	        dictagegroup =dictagegroupRedis.getDictagegroup(pid);
	    }else{
	        dictagegroup = dictAgeGroupMapper.selectByPrimaryKey(pid);
	    }
		return dictagegroup;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: addDictagegroup
	 * </p>
	 * <p>
	 * Description: 添加对象
	 * </p>
	 * 
	 * @param dictagegroup
	 * @return
	 * @see br.crm.service.dict.DictagegroupService#addDictagegroup(br.crm.pojo.dict.Dictagegroup)
	 */
	@Override
	public int addDictagegroup(Dictagegroup dictagegroup) {
		int result = dictAgeGroupMapper.insertSelective(dictagegroup);
		if(systemConfigService.getRedis()){
		    dictagegroupRedis.setDictagegroup(dictagegroup);
		}
		return result;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updateDictagegroup
	 * </p>
	 * <p>
	 * Description:修改对象
	 * </p>
	 * 
	 * @param dictagegroup
	 * @return
	 * @see br.crm.service.dict.DictagegroupService#updateDictagegroup(br.crm.pojo.dict.Dictagegroup)
	 */
	@Override
	public int updateDictagegroup(Dictagegroup dictagegroup) {
		dictagegroup.setAgegroupUpdatetime(new Date());
		int updateByPrimaryKeySelective = dictAgeGroupMapper.updateByPrimaryKeySelective(dictagegroup);
		if(systemConfigService.getRedis()){
		    dictagegroupRedis.setDictagegroup(dictagegroup);
		}
		return updateByPrimaryKeySelective;
	}
	
	
	@Override
    public List<Dictagegroup> getAll() {
	    DictagegroupExample dictagegroupExample = new DictagegroupExample();
        dictagegroupExample.setOrderByClause(" AgeGroup_CreateTime desc");
        List<Dictagegroup> list = dictAgeGroupMapper.selectByExample(null);
        return list;
    }

}
