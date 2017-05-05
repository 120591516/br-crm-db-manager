package br.crm.service.impl.dict;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.dict.DictDeptTypeMapper;
import br.crm.pojo.dict.DictDeptType;
import br.crm.pojo.dict.DictDeptTypeExample;
import br.crm.service.dict.DictDeptTypeService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictDeptTypeRedis;

@Service
public class DictDeptTypeServiceImpl implements DictDeptTypeService {

	@Autowired
	private DictDeptTypeMapper dictDeptTypeMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private DictDeptTypeRedis dictDeptTypeRedis;
	
	@Override
	public int addDeptType(DictDeptType dictDeptType) {
	    int i=dictDeptTypeMapper.insertSelective(dictDeptType);
	    if(systemConfigService.getRedis()){
	        dictDeptTypeRedis.setDictDeptType(dictDeptType);
	    }
		return i;
	}

	@Override
	public int deleteDeptType(String dictDeptTypeId) {

		int i = 0;

		DictDeptType deptType = dictDeptTypeMapper.selectByPrimaryKey(dictDeptTypeId);

		if (null != deptType) {
			
			i = dictDeptTypeMapper.deleteByPrimaryKey(deptType.getDictDeptTypeId());
			if(systemConfigService.getRedis()){
			    dictDeptTypeRedis.deleteDictDeptType(dictDeptTypeId);
			}
		}
		return i;
	}

	@Override
	public int updateDeptType(DictDeptType dictDeptType) {
		int i =dictDeptTypeMapper.updateByPrimaryKey(dictDeptType);
		if(systemConfigService.getRedis()){
		    dictDeptTypeRedis.setDictDeptType(dictDeptType);
		}
		return i;
	}

	@Override
	public PageInfo<DictDeptType> selectDeptTypeList(Integer page, Integer rows) {
		
		PageHelper.startPage(page, rows);
		
		List<DictDeptType> list = dictDeptTypeMapper.selectByExample(null);
		
		PageInfo<DictDeptType> result=new PageInfo<DictDeptType>(list);
		
		return result;
	}

	@Override
	public DictDeptType getDeptTypeById(String dictDeptTypeId) {
	    DictDeptType dictDeptType =null;
	    if(systemConfigService.getRedis()){
	        dictDeptType = dictDeptTypeRedis.getDictDeptType(dictDeptTypeId);
	    }else{
	        dictDeptType=dictDeptTypeMapper.selectByPrimaryKey(dictDeptTypeId);
	    }
		return dictDeptType;
	}

    @Override
    public List<DictDeptType> getAll() {
        DictDeptTypeExample example = new DictDeptTypeExample();
        example.createCriteria().andDictDeptTypeStatusEqualTo(0);
        List<DictDeptType> list = dictDeptTypeMapper.selectByExample(example);
        return list;
    }
	
}
