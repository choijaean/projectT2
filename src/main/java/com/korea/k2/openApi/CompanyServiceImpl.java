package com.korea.k2.openApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl  implements CompanyService{

	@Autowired
	private CompanyDao dao;
	
	@Override
	public void insert(CompanyVO vo) {
		dao.insert(vo);
		
	}

	@Override
	public void evinsert(EvSearchVO vo) {
		dao.evinsert(vo);
		
	}

	@Override
	public List<CompanyVO> listcompany(CompanyVO vo) {
		// TODO Auto-generated method stub
		return dao.listcompany(vo);
	}

	@Override
	public List<EvSearchVO> listev(EvSearchVO vo) {
		// TODO Auto-generated method stub
		return dao.listev(vo);
	}

	@Override
	public CompanyVO onecompany(CompanyVO vo) {
		
		return dao.onecompany(vo);
	}

	@Override
	public EvSearchVO oneev(EvSearchVO vo) {
		// TODO Auto-generated method stub
		return dao.oneev(vo);
	}

}
