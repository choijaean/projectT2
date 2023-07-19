package com.korea.k2.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productServiceImpl implements productService {
	
	@Autowired
	private productDao dao;
	
	@Override
	public void insert(productVO vo) {
		dao.insert(vo);
		
	}

	@Override
	public List<productVO> selectAll(productVO vo) {
		// TODO Auto-generated method stub
		return dao.selectAll(vo);
	}

	@Override
	public productVO selectOne(productVO vo) {
		// TODO Auto-generated method stub
		return dao.selectOne(vo);
	}

	@Override
	public void delete(productVO vo) {
		dao.delete(vo);
		
	}

}
