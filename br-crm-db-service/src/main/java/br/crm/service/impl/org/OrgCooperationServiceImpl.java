package br.crm.service.impl.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.RedisConstant;
import br.crm.mapper.org.OrganizationCooperationMapper;
import br.crm.pojo.org.OrganizationCooperation;
import br.crm.pojo.org.OrganizationCooperationExample;
import br.crm.service.org.OrgCooperationService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.org.OrgCooperationRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: OrgCooperationServiceImpl
 * @Description: 合作意向接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:07:50
 *
 */
@Service
public class OrgCooperationServiceImpl implements OrgCooperationService {
	@Autowired
	private OrganizationCooperationMapper organizationCooperationMapper;
	
	@Autowired
	private OrgCooperationRedis orgCooperationRedis;
	@Autowired
	private SystemConfigService systemConfigService;
	/**
	 * <p>
	 * Title:insertOrgCooperation
	 * </p>
	 * <p>
	 * Description: 新增合作意向
	 * </p>
	 * 
	 * @param orgCooperation
	 * @return
	 * @see br.crm.service.org.OrgCooperationService#insertOrgCooperation(br.crm.pojo.org.OrganizationCooperation)
	 */
	@Override
	public int insertOrgCooperation(OrganizationCooperation orgCooperation) {
		Long orgCooperationId = organizationCooperationMapper.insertSelective(orgCooperation);
		if(systemConfigService.getRedis()){
		    orgCooperationRedis.setOrgCooperation(orgCooperation);
		}
		return 1;
	}

	/**
	 * <p>
	 * Title:getOrgCooperationByOrgId
	 * </p>
	 * <p>
	 * Description: 根据机构id查询合作意向信息
	 * </p>
	 * 
	 * @param orgId
	 * @return
	 * @see br.crm.service.org.OrgCooperationService#getOrgCooperationByOrgId(java.lang.Long)
	 */
	@Override
	public List<OrganizationCooperation> getOrgCooperationByOrgId(String orgId) {
		OrganizationCooperationExample example2 = new OrganizationCooperationExample();
		br.crm.pojo.org.OrganizationCooperationExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andOrgIdEqualTo(orgId);
		return organizationCooperationMapper.selectByExample(example2);
	}

	/**
	 * <p>
	 * Title:updateOrgCooperation
	 * </p>
	 * <p>
	 * Description: 修改机构合作意向信息
	 * </p>
	 * 
	 * @param organizationCooperation
	 * @return
	 * @see br.crm.service.org.OrgCooperationService#updateOrgCooperation(br.crm.pojo.org.OrganizationCooperation)
	 */
	@Override
	public int updateOrgCooperation(OrganizationCooperation organizationCooperation) {
		 int updateByPrimaryKeySelective = organizationCooperationMapper.updateByPrimaryKeySelective(organizationCooperation);
		if(systemConfigService.getRedis()){
		    orgCooperationRedis.setOrgCooperation(organizationCooperation);
		}
		return updateByPrimaryKeySelective;
	}

	/**
	 * <p>
	 * Title:deleteOrgCooperation
	 * </p>
	 * <p>
	 * Description: 删除机构合作意向
	 * </p>
	 * 
	 * @param orgCooperationId
	 * @return
	 * @see br.crm.service.org.OrgCooperationService#deleteOrgCooperation(java.lang.Long)
	 */
	@Override
	public int deleteOrgCooperation(Long orgCooperationId) {
	    if(systemConfigService.getRedis()){
	        orgCooperationRedis.deleteOrgCooperation(orgCooperationId);
	    }
		return organizationCooperationMapper.deleteByPrimaryKey(orgCooperationId);
	}
	
	/**
	 * <p>Title:getAll</p> 
	 * <p>Description:获取所有合作意向 </p> 
	 * @return
	 * @see br.crm.service.org.OrgCooperationService#getAll()
	 */
	@Override
    public List<OrganizationCooperation> getAll() {
	    List<OrganizationCooperation> list = organizationCooperationMapper.selectByExample(null);
        return list;
    }

}
