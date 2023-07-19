package com.korea.k2.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao dao;
	
	
	@Override
	public void insert(CartVO vo) {
		dao.insert(vo);
	}


	@Override
	public List<CartVO> selectAll(CartVO vo) {
		// TODO Auto-generated method stub
		return dao.selectAll(vo);
	}


	@Override
	public void delete(CartVO vo) {
		dao.delete(vo);
		
	}


	@Override
	public void deleteAll(CartVO vo) {
		dao.deleteAll(vo);
		
	}


	@Override
	public void update(CartVO vo) {
		dao.update(vo);
		
	}


	@Override
	public void insertorder(CartorderVO vo) {
		dao.insertorder(vo);
		
	}


	@Override
	public void insertordermoney(CartordermoneyVO vo) {
		dao.insertordermoney(vo);
	}


	@Override
	public int selectidx(CartordermoneyVO vo) {
		// TODO Auto-generated method stub
		return dao.selectidx(vo);
	}


	@Override
	public List<CartordermoneyVO> selectAllorder(CartordermoneyVO vo) {
		// TODO Auto-generated method stub
		return dao.selectAllorder(vo);
	}



}
