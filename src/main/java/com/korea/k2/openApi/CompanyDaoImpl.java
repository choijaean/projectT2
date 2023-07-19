package com.korea.k2.openApi;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDaoImpl implements CompanyDao {

	@Autowired
	private  SqlSessionTemplate  mybatis;
	
	@Override
	public void insert(CompanyVO vo) {
		mybatis.insert("OPENAPI.insert", vo);
		
	}

	@Override
	public void evinsert(EvSearchVO vo) {
		mybatis.insert("OPENAPI.evinsert",vo);
		
	}

	@Override
	public List<CompanyVO> listcompany(CompanyVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectList("OPENAPI.listcompany");
	}

	@Override
	public List<EvSearchVO> listev(EvSearchVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectList("OPENAPI.listev");
	}

	@Override
	public CompanyVO onecompany(CompanyVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectOne("OPENAPI.onecompany", vo);
	}

	@Override
	public EvSearchVO oneev(EvSearchVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectOne("OPENAPI.oneev", vo);
	}

}
