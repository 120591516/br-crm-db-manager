package br.crm.service.dict;

import java.util.Map;

public interface DictSMSRecordService {

	public Map<String,Object> sendSMS(String phone, String contents);
	
	
}
