package br.crm.service.impl.dict;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.mapper.dict.DictSmsRecordMapper;
import br.crm.mapper.dict.self.DictSmsRecordSelfMapper;
import br.crm.pojo.dict.DictSmsRecord;
import br.crm.pojo.dict.DictSmsRecordExample;
import br.crm.service.dict.DictSMSRecordService;
import br.order.redis.redis.RedisService;
import br.order.common.utils.SendSmsUtils;

/**
 * 
 * @ClassName: DictSMSRecordServiceImpl
 * @Description: 手机发送短信接口实现
 * @author zxy
 * @date 2016年9月13日 下午3:33:43
 *
 */
@Service
public class DictSMSRecordServiceImpl implements DictSMSRecordService {

	@Autowired
	private DictSmsRecordMapper smsMapper;

	@Autowired
	private DictSmsRecordSelfMapper dictSmsRecordSelfMapper;
	@Autowired
	private RedisService redisService;
	

	public RedisService getRedisService() {
		return redisService;
	}

	public void setRedisService(RedisService redisService) {
		this.redisService = redisService;
	}
	
	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: sendSMS
	 * </p>
	 * <p>
	 * Description:短信发送
	 * </p>
	 * 
	 * @param mobile
	 * @param contents
	 * @return
	 * @see br.crm.service.dict.DictSMSRecordService#sendSMS(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public Map<String, Object> sendSMS(String mobile, String contents) {
		Map<String, Object> result = new HashMap<String, Object>();
		// 1.查询当天的手机号码在当天发送的次数有没有超过5条?
		int count = dictSmsRecordSelfMapper.getSMSCount(mobile);
		
		if (count >= 5) {
			result.put("message", "该手机号已发送次数过多，请明天重试。");
			result.put("result", 0);
			return result;
		}

		//Map<String, Object> map = SendSmsUtils.SendSms(mobile, contents);
		//Integer sendsms_result = (Integer) map.get("code");
		Integer sendsms_result = 2;
		if (sendsms_result.intValue() == 2) {
			DictSmsRecord sms = new DictSmsRecord();
			sms.setSmsContent(contents);
			sms.setSmsCreate(new Date());
			sms.setSmsPhone(mobile);
			sms.setSmsStatus(sendsms_result);			
			int i = smsMapper.insertSelective(sms);
			result.put("message", "发送成功");
			result.put("result", sendsms_result);
			//设置redis数据库的存活时间
			redisService.set(RedisConstant.br_order_dict_SMSRecord_smsPhone.concat(mobile),
					contents, 360);
		} else {
			result.put("message", "发送失败");
			result.put("result", sendsms_result);
		}
		return result;
	}

	

	

}
