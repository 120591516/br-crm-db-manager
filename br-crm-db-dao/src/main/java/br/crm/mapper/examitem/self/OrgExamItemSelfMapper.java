package br.crm.mapper.examitem.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.crm.pojo.examitem.OrganizationExamItem;
import br.crm.vo.examitem.OrgExamItemDetailVo;
import br.crm.vo.examitem.OrgExamItemQu;
import br.crm.vo.examitemvalue.OrgExamItemVo;
import br.crm.vo.permission.OrgUserVo;

public interface OrgExamItemSelfMapper {
    OrgExamItemVo selectByPrimaryKey(String examItemId);
    
    List<OrgExamItemDetailVo> getAllExamItem();

    List<OrgExamItemDetailVo> getAllExamItemByFeeItemId(@Param("id")String id);

    List<OrganizationExamItem> getExamItemByFeeItemId(String id);
    
    List<OrgExamItemVo> selectByLike(@Param("orgExamItemQu")OrgExamItemQu orgExamItemQu);

	List<OrgUserVo> getUserVoByItemId(@Param("id")String id);
}
