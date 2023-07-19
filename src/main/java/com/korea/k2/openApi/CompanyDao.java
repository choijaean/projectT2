package com.korea.k2.openApi;

import java.util.List;

public interface CompanyDao {
	void insert(CompanyVO vo);
	void evinsert(EvSearchVO vo);
	List<CompanyVO> listcompany(CompanyVO vo);
	List<EvSearchVO> listev(EvSearchVO vo);
	CompanyVO onecompany(CompanyVO vo);
	EvSearchVO oneev(EvSearchVO vo); 

}
