package br.crm.service.impl.dict;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.dict.DictEmailRecordMapper;
import br.crm.pojo.dict.DictEmailRecord;
import br.crm.service.dict.DictEmailService;

/**
 * 
 * @ClassName: DictEmailServiceImpl
 * @Description: Email接口实现
 * @author zxy
 * @date 2016年9月13日 下午3:32:47
 *
 */
@Service
public class DictEmailServiceImpl implements DictEmailService {
	@Autowired
	private DictEmailRecordMapper dictEmailMapper;


	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: insertEmail
	 * </p>
	 * <p>
	 * Description:添加对象信息
	 * </p>
	 * 
	 * @param dictEmail
	 * @return
	 * @see br.crm.service.dict.DictEmailService#insertEmail(br.crm.pojo.dict.DictEmailRecord)
	 */
	@Override
	public Long insertEmail(DictEmailRecord dictEmail) {
		dictEmail.setDictEmailStatus(0);
		dictEmail.setDictEmailCreateTime(new Date());
		int i = dictEmailMapper.insertSelective(dictEmail);
		if (i > 0) {
			return dictEmail.getDictEmailId();
		} else {
			return 0L;
		}
	}




}
