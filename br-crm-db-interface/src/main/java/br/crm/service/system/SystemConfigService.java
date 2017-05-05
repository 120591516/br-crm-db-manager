package br.crm.service.system;

import java.util.Map;

public interface SystemConfigService {

	Map<String, String> getSystem();

	int editRedisSystem(String newConfigRedis);

	int editSearchSystem(String newConfigSearch);
	
	Boolean getRedis();
	
	Boolean getSearch();

	
}
