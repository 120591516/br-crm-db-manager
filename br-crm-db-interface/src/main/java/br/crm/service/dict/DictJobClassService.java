package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictjobclass;

public interface DictJobClassService {

    PageInfo<Dictjobclass> getJobClassList(Integer page, Integer rows);

    int addJobClass(Dictjobclass dictjobclass);

    Dictjobclass getJobClassById(Long idJobclass);

    int updateJobClass(Dictjobclass dictjobclass);

    List<Dictjobclass> getAll();

}
