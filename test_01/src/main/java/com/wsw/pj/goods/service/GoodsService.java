package com.wsw.pj.goods.service;

import java.util.List;

import com.wsw.pj.goods.pojo.Good;

public interface GoodsService {
	
	List<Good> retrieveAll();
	
	int deleteById(Integer id);
	
	int create(Good good);
	
	Good retrieveGoodById(Integer id);
	
	int updateGoodById(Good good);
	
}
