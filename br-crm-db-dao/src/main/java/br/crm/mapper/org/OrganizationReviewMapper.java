package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationReview;
import br.crm.pojo.org.OrganizationReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationReviewMapper {
    int countByExample(OrganizationReviewExample example);

    int deleteByExample(OrganizationReviewExample example);

    int deleteByPrimaryKey(Long orgReviewId);

    int insert(OrganizationReview record);

    int insertSelective(OrganizationReview record);

    List<OrganizationReview> selectByExample(OrganizationReviewExample example);

    OrganizationReview selectByPrimaryKey(Long orgReviewId);

    int updateByExampleSelective(@Param("record") OrganizationReview record, @Param("example") OrganizationReviewExample example);

    int updateByExample(@Param("record") OrganizationReview record, @Param("example") OrganizationReviewExample example);

    int updateByPrimaryKeySelective(OrganizationReview record);

    int updateByPrimaryKey(OrganizationReview record);
}