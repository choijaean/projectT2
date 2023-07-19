package com.korea.k2.cart;

import java.util.List;

public interface CartDao {
	//1.장바구니 넣기
	void insert(CartVO vo);
	//2.장바구니 삭제
	void delete(CartVO vo);
	//3.장바구니 전체삭제
	void deleteAll(CartVO vo);
	//4.장바구니 수량변경
	void update(CartVO vo);
	//5.주문서 저장
	void insertorder(CartorderVO vo);
	//6.주문금액 저장
	void insertordermoney(CartordermoneyVO vo);
	//7. 주문서 뭉치기
	int selectidx (CartordermoneyVO vo);
	//8. 주문서 보기
	List<CartordermoneyVO> selectAllorder(CartordermoneyVO vo);
	List<CartVO> selectAll(CartVO vo);
}
