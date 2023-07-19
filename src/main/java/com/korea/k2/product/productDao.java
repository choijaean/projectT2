package com.korea.k2.product;

import java.util.List;

public interface productDao {
	void insert(productVO vo);
	void delete(productVO vo);
	List<productVO> selectAll(productVO vo);
	productVO selectOne(productVO vo);
	
}
