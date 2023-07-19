package com.korea.k2.shop;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShopDaoImpl implements ShopDao {

	@Autowired
	private  SqlSessionTemplate  mybatis;
	
	@Override
	public List<MemberVO> selectAll(MemberVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectList("ShopDao.selectAll", vo);
	}

	@Override
	public void insert(MemberVO vo) {
		mybatis.insert("ShopDao.insert", vo);
	}
	
	@Override
	public int custno() {
		// TODO Auto-generated method stub
		return mybatis.selectOne("ShopDao.custno");
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectOne("ShopDao.selectOne", vo);
	}

	@Override
	public void update(MemberVO vo) {
		mybatis.update("ShopDao.update", vo);
		
	}

	@Override
	public String idCk(MemberVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectOne("ShopDao.IDCK", vo);
	}

	@Override
	public List<MoneyVO> ShopMoney() {
		// TODO Auto-generated method stub
		return mybatis.selectList("ShopDao.ShopMoney");
	}

}
