package com.korea.k2.product;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class productDaoImpl implements productDao {

	@Autowired
	private  SqlSessionTemplate  mybatis;
	
	@Override
	public void insert(productVO vo) {
		mybatis.insert("product.insert", vo);
		
	}

	@Override
	public List<productVO> selectAll(productVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectList("product.selectAll", vo);
	}

	@Override
	public productVO selectOne(productVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectOne("product.selectOne", vo);
	}

	@Override
	public void delete(productVO vo) {
		mybatis.delete("product.delete", vo);
		
	}

}
