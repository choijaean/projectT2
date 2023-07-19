package com.korea.k2.cart;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDaoImpl implements CartDao{
	
	@Autowired
	private  SqlSessionTemplate  mybatis;
	
	@Override
	public void insert(CartVO vo) {
		mybatis.insert("cartDao.insert", vo);
		
	}

	@Override
	public List<CartVO> selectAll(CartVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectList("cartDao.selectAll", vo);
	}

	@Override
	public void delete(CartVO vo) {
		mybatis.delete("cartDao.delete", vo);
		
	}

	@Override
	public void deleteAll(CartVO vo) {
		mybatis.delete("cartDao.deleteAll", vo);
		
	}

	@Override
	public void update(CartVO vo) {
		mybatis.update("cartDao.update", vo);
		
	}

	@Override
	public void insertorder(CartorderVO vo) {
		mybatis.insert("cartDao.insertorder", vo);
		
	}

	@Override
	public void insertordermoney(CartordermoneyVO vo) {
		mybatis.insert("cartDao.insertordermoney", vo);
		
	}

	@Override
	public int selectidx(CartordermoneyVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectOne("cartDao.selectidx", vo);
	}

	@Override
	public List<CartordermoneyVO> selectAllorder(CartordermoneyVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectList("cartDao.selectAllorder", vo);
	}


}
