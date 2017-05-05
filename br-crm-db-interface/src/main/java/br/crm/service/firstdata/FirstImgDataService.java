package br.crm.service.firstdata;

import java.util.List;
import java.util.Map;

import br.crm.pojo.dict.DictImg;
import br.crm.pojo.firstshow.Firstimgshow;
import br.crm.vo.firstdata.FirstimgshowVo;

public interface FirstImgDataService {

	List<FirstimgshowVo> showFirstImgDataList();

	int addFirstImgData(Firstimgshow firstimgshow);

	FirstimgshowVo getFirstImgDataById(String firstimgshowId);

	int updateFirstImgData(Firstimgshow firstimgshow);

	List<DictImg> getImgByBranchId(String id);

	List<DictImg> getImgBySuiteId(String id);

	List<Map<String,String>> getImgIndex();

	List<Map<String, String>> getSuiteByOrgId(String orgId);

	void initData();

	List<Map<String, String>> getFirstImgs();

}
