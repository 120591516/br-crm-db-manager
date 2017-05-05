package br.crm.service.examitem;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.examitem.OrganizationExamItem;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.vo.examitem.OrgExamItemDetailVo;
import br.crm.vo.examitem.OrgExamItemQu;
import br.crm.vo.examitemvalue.OrgExamItemVo;
import br.crm.vo.permission.OrgUserVo;

public interface OrgExamItemService {

    PageInfo<OrgExamItemVo> getOrgExamItemByPage(OrgExamItemQu orgExamItemQu,Integer page, Integer rows);

    int insertOrgExamItem(OrganizationExamItem orgExamItem);

    OrganizationExamItem getOrgExamItemById(String orgExamItemId);

    int updateOrgExamItem(OrganizationExamItem orgExamItem);

    List<OrganizationExamItem> getAllOrgExamItem();

    PageInfo<OrgExamItemDetailVo> getAllExamItemByFeeItem(String id,Integer page,Integer rows);

    PageInfo<OrganizationExamItem> getExamItemByFeeItem(String id,Integer page,Integer rows);

    int countExamItemRelation(String id);

	OrganizationUser getUserByItemId(String examItemId);

	List<OrgUserVo> getUserVoByItemId(String id);	

	List<OrgExamItemVo> getOrgExamItemByUserId(String userId);
	
	
	
}
