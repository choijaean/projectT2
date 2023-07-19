package com.korea.k2.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService{

	@Autowired
	private ShopDao dao;
	
	@Override
	public List<MemberVO> selectAll(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.selectAll(vo);
	}

	@Override
	public void insert(MemberVO vo) {
		dao.insert(vo);
		
	}

	@Override
	public int custno() {
		// TODO Auto-generated method stub
		return dao.custno();
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.selectOne(vo);
	}

	@Override
	public void update(MemberVO vo) {
		dao.update(vo);
		
	}

	@Override
	public String idCk(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.idCk(vo);
	}

	@Override
	public List<MoneyVO> ShopMoney() {
		// TODO Auto-generated method stub
		return dao.ShopMoney();
	}

}
