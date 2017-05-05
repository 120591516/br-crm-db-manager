package br.crm.service.impl.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.RedisConstant;
import br.crm.mapper.org.OrganizationLevelMapper;
import br.crm.mapper.org.OrganizationMapper;
import br.crm.pojo.org.Organization;
import br.crm.pojo.org.OrganizationExample;
import br.crm.pojo.org.OrganizationLevel;
import br.crm.pojo.org.OrganizationLevelExample;
import br.crm.service.org.OrgLevelService;
import br.crm.service.system.SystemConfigService;
import br.order.common.utils.JsonUtils;
import br.order.redis.org.OrgLevelRedis;

/**
 * 
 * @ClassName: OrgLevelServiceImpl
 * @Description: 体检机构等级接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:12:56
 *
 */
@Service
public class OrgLevelServiceImpl implements OrgLevelService {

	@Autowired
	private OrganizationMapper organizationMapper;

	@Autowired
	private OrganizationLevelMapper organizationLevelMapper;

	/**
     * 系统配置service
     */
    @Autowired
    private SystemConfigService systemConfigService;
    
    @Autowired
    private OrgLevelRedis orgLevelRedis;

	@Override
	public List<Map<String, String>> getOrgAll() {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();
		OrganizationExample example = new OrganizationExample();
		example.createCriteria().andOrgStatusEqualTo(0);
		List<Organization> list = organizationMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			for (Organization organization : list) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("orgId", organization.getOrgId());
				map.put("orgName", organization.getOrgShortName());
				result.add(map);
			}
		}
		return result;
	}

	/**
	 * <p>
	 * Title:insertOrgLevel
	 * </p>
	 * <p>
	 * Description:新增体检机构等级
	 * </p>
	 * 
	 * @param organizationLevel
	 * @return
	 * @see br.crm.service.org.OrgLevelService#insertOrgLevel(br.crm.pojo.org.OrganizationLevel)
	 */
	@Override
	public int insertOrgLevel(OrganizationLevel organizationLevel) {
		int insert = organizationLevelMapper.insertSelective(organizationLevel);
		if(systemConfigService.getRedis()){
		    orgLevelRedis.setOrganizationLevel(organizationLevel);
		}
		return insert;
	}

	/**
	 * <p>
	 * Title:getAllOrgLevel
	 * </p>
	 * <p>
	 * Description: 查看所有机构等级信息
	 * </p>
	 * 
	 * @return
	 * @see br.crm.service.org.OrgLevelService#getAllOrgLevel()
	 */
	@Override
	public List<OrganizationLevel> getAllOrgLevel() {

		OrganizationLevelExample organizationLevelExample = new OrganizationLevelExample();
		organizationLevelExample.setOrderByClause(" org_level_createtime desc");
		return organizationLevelMapper.selectByExample(organizationLevelExample);
	}

	@Override
	public OrganizationLevel geOrgLevelById(String parseInt) {
	    OrganizationLevel organizationLevel =null;
	    if(systemConfigService.getRedis()){
	        organizationLevel = orgLevelRedis.getOrganizationLevel(parseInt);
	    }else{
	        organizationLevel = organizationLevelMapper.selectByPrimaryKey(Integer.parseInt(parseInt));
	    }
		return organizationLevel;
	}

	@Override
	public int updateOrgLevel(OrganizationLevel organizationLevel) {

		int i = organizationLevelMapper.updateByPrimaryKeySelective(organizationLevel);

		if(systemConfigService.getRedis()){
		    orgLevelRedis.setOrganizationLevel(organizationLevel);
		}

		return i;
	}

}
