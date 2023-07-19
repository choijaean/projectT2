package com.korea.k2.shop;

import java.util.List;

public interface ShopService {
	List<MemberVO> selectAll(MemberVO vo);
	void insert(MemberVO vo);
	void update(MemberVO vo);
	
	int custno();
	MemberVO selectOne(MemberVO vo);
	
	String idCk(MemberVO vo);
	List<MoneyVO> ShopMoney();
}
