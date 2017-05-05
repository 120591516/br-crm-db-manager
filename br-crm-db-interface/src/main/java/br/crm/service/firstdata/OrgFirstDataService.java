package br.crm.service.firstdata;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.branch.OrganizationBranchImg;
import br.crm.pojo.firstshow.Firstdatashow;
import br.crm.pojo.suite.OrganizationExamSuiteImg;
import br.crm.vo.firstdata.FirstdatashowVo;

public interface OrgFirstDataService {

	PageInfo<Firstdatashow> showFirstData(Integer page, Integer rows,FirstdatashowVo firstdatashowVo);

	int saveShowFirstData(FirstdatashowVo firstdatashowVo);

	int deleteShowFirstData(String firstdatashowId);

	List<FirstdatashowVo> selectSuite();

	List<FirstdatashowVo> selectBranch();

	List<OrganizationBranchImg> getImgByBranchId(String branchId);

	List<OrganizationExamSuiteImg> getImgByOrgExamSuiteId(String examSuiteId);

	int selectSuiteCountByBranch(String branchId);


}
