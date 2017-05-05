
package br.crm.service.impl.examitem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.examitem.OrganizationExamFeeItemDetailMapper;
import br.crm.mapper.examitem.OrganizationExamItemMapper;
import br.crm.mapper.examitem.OrganizationExamItemUserMapper;
import br.crm.mapper.examitem.self.OrgExamItemSelfMapper;
import br.crm.mapper.permission.OrganizationUserMapper;
import br.crm.pojo.examitem.OrganizationExamFeeItemDetailExample;
import br.crm.pojo.examitem.OrganizationExamItem;
import br.crm.pojo.examitem.OrganizationExamItemExample;
import br.crm.pojo.examitem.OrganizationExamItemExample.Criteria;
import br.crm.pojo.examitem.OrganizationExamItemUser;
import br.crm.pojo.examitem.OrganizationExamItemUserExample;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.pojo.permission.OrganizationUserExample;
import br.crm.service.examitem.OrgExamItemService;
import br.order.redis.redis.RedisService;
import br.crm.service.system.SystemConfigService;
import br.crm.vo.examitem.OrgExamItemDetailVo;
import br.crm.vo.examitem.OrgExamItemQu;
import br.crm.vo.examitemvalue.OrgExamItemVo;
import br.crm.vo.permission.OrgUserVo;
import br.order.redis.examitem.OrgExamItemRedis;

/**
 * (体检项service)
 * 
 * @ClassName: OrgExamItemServiceImpl
 * @Description: TODO(体检项service)
 * @author 王文腾
 * @date 2016年9月13日 上午11:06:40
 */
@Service
public class OrgExamItemServiceImpl implements OrgExamItemService {
	/**
	 * {体检项DAO}
	 */
	@Autowired
	private OrganizationExamItemMapper organizationExamItemMapper;

	/**
	 * {体检项自定义DAO} 
	 */
	@Autowired
	private OrgExamItemSelfMapper orgExamItemSelfMapper;

	/**
	 * {收费项-体检项DAO}
	 */
	@Autowired
	private OrganizationExamFeeItemDetailMapper organizationExamFeeItemDetailMapper;

	/**
	 * 体检项-医生DAO
	 */
	@Autowired
	private OrganizationExamItemUserMapper OrganizationExamItemUserMapper;

	/**
	 * 医生DAO
	 */
	@Autowired
	private OrganizationUserMapper organizationUserMapper;
	@Autowired
	private OrganizationExamItemUserMapper organizationExamItemUserMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private OrgExamItemRedis orgExamItemRedis;
	 

	/**
	 * 条件查询分页显示体检项列表
	 * <p>
	 * Title: getOrgExamItemByPage
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param orgExamItemQu
	 *            条件查询对象
	 * @param page
	 *            当前页面
	 * @param rows
	 *            当前页显示行数
	 * @return PageInfo<OrgExamItemVo>
	 * @see br.crm.service.examitem.OrgExamItemService#getOrgExamItemByPage(br.crm.vo.examitem.OrgExamItemQu,
	 *      java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public PageInfo<OrgExamItemVo> getOrgExamItemByPage(OrgExamItemQu orgExamItemQu, Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		String userId = orgExamItemQu.getUserId();
		orgExamItemQu.setUserId(null);
		List<OrgExamItemVo> list = orgExamItemSelfMapper.selectByLike(orgExamItemQu);	
		OrganizationExamItemUserExample example = new OrganizationExamItemUserExample();
		br.crm.pojo.examitem.OrganizationExamItemUserExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andOrganizationExamItemStatusEqualTo(0);
		if(userId!=null){
			createCriteria.andOrganizationUserIdEqualTo(userId);
		}
		List<OrganizationExamItemUser> examItemUserList = organizationExamItemUserMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(list)&&CollectionUtils.isNotEmpty(examItemUserList)){
			for (OrgExamItemVo orgExamItemVo : list) {
				for (OrganizationExamItemUser organizationExamItemUser : examItemUserList) {
					if(orgExamItemVo.getExamItemId().equals(organizationExamItemUser.getOrganizationExamItemId())){
						orgExamItemVo.setChecked(true);
					}
				}
			}
		}		
		PageInfo<OrgExamItemVo> pageInfo = new PageInfo<OrgExamItemVo>(list);
		return pageInfo;
	}

	/**
	 * 添加体检项信息
	 * <p>
	 * Title: insertOrgExamItem
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param orgExamItem
	 *            体检项对象
	 * @return int
	 * @see br.crm.service.examitem.OrgExamItemService#insertOrgExamItem(br.crm.pojo.org.OrganizationExamItem)
	 */
	@Override
	public int insertOrgExamItem(OrganizationExamItem orgExamItem) {
		orgExamItem.setExamItemId(UUIDUtils.getId());
		orgExamItem.setExamItemStatus(0);
		orgExamItem.setExamItemCreateTime(new Date());
		orgExamItem.setExamItemEditTime(orgExamItem.getExamItemCreateTime());
		Boolean redis = systemConfigService.getRedis();   
		if(redis){
			orgExamItemRedis.insertOrgExamItem(orgExamItem);
		}
		return organizationExamItemMapper.insertSelective(orgExamItem);
	}

	/**
	 * 获取体检项信息
	 * <p>
	 * Title: getOrgExamItemById
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param orgExamItemId
	 *            体检项id
	 * @return OrganizationExamItem
	 * @see br.crm.service.examitem.OrgExamItemService#getOrgExamItemById(java.lang.String)
	 */
	@Override
	public OrganizationExamItem getOrgExamItemById(String orgExamItemId) {
		Boolean redis = systemConfigService.getRedis(); 
		if(redis){
			return orgExamItemRedis.getOrgExamItemById(orgExamItemId);
		}	
		return  organizationExamItemMapper.selectByPrimaryKey(orgExamItemId);
	}

	/**
	 * 修改体检项信息
	 * <p>
	 * Title: updateOrgExamItem
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param orgExamItem
	 *            体检项对象
	 * @return int
	 * @see br.crm.service.examitem.OrgExamItemService#updateOrgExamItem(br.crm.pojo.org.OrganizationExamItem)
	 */
	@Override
	public int updateOrgExamItem(OrganizationExamItem orgExamItem) {
		Boolean redis = systemConfigService.getRedis(); 
		if(redis){
			orgExamItemRedis.updateOrgExamItem(orgExamItem);
		}
		return organizationExamItemMapper.updateByPrimaryKeySelective(orgExamItem);
	}

	/**
	 * 获取可用收费项列表
	 * <p>
	 * Title: getAllOrgExamItem
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @return List<OrganizationExamItem>
	 * @see br.crm.service.examitem.OrgExamItemService#getAllOrgExamItem()
	 */
	@Override
	public List<OrganizationExamItem> getAllOrgExamItem() {
		OrganizationExamItemExample example = new OrganizationExamItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andExamItemStatusEqualTo(0);
		List<OrganizationExamItem> list = organizationExamItemMapper.selectByExample(example);
		return list;
	}

	/**
	 * 获取的体检项列表(指定收费项下的体检项带checked)
	 * <p>
	 * Title: getAllExamItemByFeeItem
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param id
	 *            收费项id
	 * @return List<OrgExamItemDetailVo>
	 * @see br.crm.service.examitem.OrgExamItemService#getAllExamItemByFeeItem(java.lang.String)
	 */
	@Override
	public PageInfo<OrgExamItemDetailVo> getAllExamItemByFeeItem(String id,Integer page,Integer rows) {
		PageHelper.startPage(page, rows);
		// 查询所有的体检项
		List<OrgExamItemDetailVo> list = orgExamItemSelfMapper.getAllExamItem();
		// 查询指定收费项下的体检项
		List<OrgExamItemDetailVo> feeList = orgExamItemSelfMapper.getAllExamItemByFeeItemId(id);
		for (OrgExamItemDetailVo orgExamItem : list) {
			for (OrgExamItemDetailVo orgExamItemVo : feeList) {
				if (orgExamItemVo != null) {
					if (orgExamItem.getExamItemId().equals(orgExamItemVo.getExamItemId())) {
						orgExamItem.setChecked(true);
						break;
					}
				}
			}
		}
		PageInfo<OrgExamItemDetailVo> pageInfo = new PageInfo<OrgExamItemDetailVo>(list);
		return pageInfo;
	}

	/**
	 * 根据收费项id查询关联体检项列表
	 * <p>
	 * Title: getExamItemByFeeItem
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param id
	 * @return List<OrganizationExamItem>
	 * @see br.crm.service.examitem.OrgExamItemService#getExamItemByFeeItem(java.lang.String)
	 */
	@Override
	public PageInfo<OrganizationExamItem> getExamItemByFeeItem(String id,Integer page,Integer rows) {
		PageHelper.startPage(page, rows);
		 List<OrganizationExamItem> list = orgExamItemSelfMapper.getExamItemByFeeItemId(id);
		 PageInfo<OrganizationExamItem> pageInfo = new PageInfo<OrganizationExamItem>(list);
		 return pageInfo;
	}

	/**
	 * 查询体检项关联关系信息数量
	 * <p>
	 * Title: countExamItemRelation
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param id
	 *            体检项id
	 * @return int
	 * @see br.crm.service.examitem.OrgExamItemService#countExamItemRelation(java.lang.String)
	 */
	@Override
	public int countExamItemRelation(String id) {
		OrganizationExamFeeItemDetailExample example = new OrganizationExamFeeItemDetailExample();
		br.crm.pojo.examitem.OrganizationExamFeeItemDetailExample.Criteria criteria = example.createCriteria();
		criteria.andExamFeeItemDetailIdEqualTo(id);
		int count = organizationExamFeeItemDetailMapper.countByExample(example);
		if (count > 0) {
			return -1;
		}
		return count;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getUserByItemId
	 * </p>
	 * <p>
	 * Description:获取检查项
	 * </p>
	 * 
	 * @param examItemId
	 *            体检项ID
	 * @return
	 * @see br.crm.service.examitem.OrgExamItemService#getUserByItemId(java.lang.String)
	 */
	@Override
	public OrganizationUser getUserByItemId(String examItemId) {
		OrganizationUser result = null;
		OrganizationExamItemUserExample example = new OrganizationExamItemUserExample();
		example.createCriteria().andOrganizationExamItemIdEqualTo(examItemId);
		List<OrganizationExamItemUser> list = OrganizationExamItemUserMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			OrganizationExamItemUser organizationExamItemUserVo = list.get(0);
			OrganizationUserExample userExample = new OrganizationUserExample();
			userExample.createCriteria().andUserIdEqualTo(organizationExamItemUserVo.getOrganizationUserId());
			List<OrganizationUser> userList = organizationUserMapper.selectByExample(userExample);
			if (CollectionUtils.isNotEmpty(userList)) {

				result = userList.get(0);
			}
		}
		return result;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getUserVoByItemId
	 * </p>
	 * <p>
	 * Description:根据检查项ID查询医生
	 * </p>
	 * 
	 * @param id
	 *            体检项ID
	 * @return
	 * @see br.crm.service.examitem.OrgExamItemService#getUserVoByItemId(java.lang.String)
	 */
	@Override
	public List<OrgUserVo> getUserVoByItemId(String id) {

		List<OrgUserVo> list = orgExamItemSelfMapper.getUserVoByItemId(id);

		return list;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: saveUser
	 * </p>
	 * <p>
	 * Description: 保存修改过的医生
	 * </p>
	 * 
	 * @param userId
	 *            医生id
	 * @param @param
	 *            itemId 体检项ids
	 * @return
	 * @see br.crm.service.examitem.OrgExamItemService#saveUser(java.lang.String,
	 *      java.lang.String)
	 */
	

	@Override
	public List<OrgExamItemVo> getOrgExamItemByUserId(String userId) {
		List<OrgExamItemVo> result = new ArrayList<OrgExamItemVo>();
		OrganizationExamItemUserExample userExample = new OrganizationExamItemUserExample();
		userExample.createCriteria().andOrganizationUserIdEqualTo(userId);
		List<OrganizationExamItemUser> list = OrganizationExamItemUserMapper.selectByExample(userExample);
		if (CollectionUtils.isNotEmpty(list)) {
			for (OrganizationExamItemUser organizationExamItemUser : list) {
				OrganizationExamItemExample example = new OrganizationExamItemExample();
				example.createCriteria().andExamItemIdEqualTo(organizationExamItemUser.getOrganizationExamItemId());
				List<OrganizationExamItem> examItemList = organizationExamItemMapper.selectByExample(example);
				if (CollectionUtils.isNotEmpty(examItemList)) {
					for (OrganizationExamItem organizationExamItem : examItemList) {
						OrgExamItemVo vo = new OrgExamItemVo();
						try {
							BeanUtils.copyProperties(vo, organizationExamItem);
							result.add(vo);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return result;
	}

	

}
