package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.DictconclusionWithBLOBs;
import br.crm.vo.conclusion.DictconclusionVo;

public interface DictConclusionService {

	PageInfo<DictconclusionVo> getConclusionList(Integer page, Integer rows, DictconclusionVo dictconclusionVo);

	int addConclusion(DictconclusionWithBLOBs dictconclusionWithBLOBs);

	DictconclusionVo getConclusionById(String id);

	int updateConclusion(DictconclusionWithBLOBs dictconclusionWithBLOBs);
	
	List<DictconclusionWithBLOBs> getAllDictconclusionWithBLOBs();

}
