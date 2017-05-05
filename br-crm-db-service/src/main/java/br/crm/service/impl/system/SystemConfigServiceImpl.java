package br.crm.service.impl.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.common.utils.Base64;
import br.crm.mapper.system.SysConfigMapper;
import br.crm.pojo.system.SysConfig;
import br.crm.service.system.SystemConfigService;

@Service
public class SystemConfigServiceImpl implements SystemConfigService {

	@Autowired
	private SysConfigMapper sysConfigMapper;

	@Override
	public Map<String, String> getSystem() {
		Map<String, String> map = new HashMap<String, String>();
		List<SysConfig> list = sysConfigMapper.selectByExample(null);
		if (CollectionUtils.isNotEmpty(list)) {
			for (SysConfig sys : list) {
				map.put("Redis", new String(Base64.decode(sys.getSysConfigRedis())));
				map.put("search", new String(Base64.decode(sys.getSysConfigSearch())));
			}
		}
		return map;
	}

	@Override
	public int editRedisSystem(String newConfigRedis) {
		List<SysConfig> list = sysConfigMapper.selectByExample(null);
		if (CollectionUtils.isNotEmpty(list)) {
			SysConfig config = list.get(0);
			config.setSysConfigRedis(newConfigRedis);
			int i = sysConfigMapper.updateByPrimaryKeySelective(config);
			return i;
		}
		return 0;
	}
	
	@Override
	public int editSearchSystem(String newConfigSearch) {
		List<SysConfig> list = sysConfigMapper.selectByExample(null);
		if (CollectionUtils.isNotEmpty(list)) {
			SysConfig config = list.get(0);
			config.setSysConfigSearch(newConfigSearch);
			int i = sysConfigMapper.updateByPrimaryKeySelective(config);
			return i;
		}
		return 0;
	}
	

	@Override
	public Boolean getRedis() {
		List<SysConfig> list = sysConfigMapper.selectByExample(null);
		if (CollectionUtils.isNotEmpty(list)) {
			SysConfig sysConfig = list.get(0);
			String isRedis = new String(Base64.decode(sysConfig.getSysConfigRedis()));
			if (isRedis.equals("1")) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean getSearch() {
		List<SysConfig> list = sysConfigMapper.selectByExample(null);
		if (CollectionUtils.isNotEmpty(list)) {
			SysConfig sysConfig = list.get(0);
			String isSearch = new String(Base64.decode(sysConfig.getSysConfigSearch()));
			if (isSearch.equals("1")) {
				return true;
			}
		}
		return false;
	}

	

}
