package com.wsw.pj.goods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsw.pj.goods.dao.GoodsDao;
import com.wsw.pj.goods.pojo.Good;
import com.wsw.pj.goods.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsDao goodsDao;
	
	@Override
	public List<Good> retrieveAll() {
		List<Good> list = goodsDao.retrieveAll();
		return list;
	}
	
	@Override
	public int deleteById(Integer id) {
		return goodsDao.deleteById(id);
	}
	
	@Override
	public int create(Good good) {
		good.setCreatedTime(new java.util.Date());
		return goodsDao.create(good);
	}

	
	@Override
	public Good retrieveGoodById(Integer id) {
		return goodsDao.retrieveGoodById(id);
	}
	
	@Override
	public int updateGoodById(Good good) {
		return goodsDao.updateGoodById(good);
	}
	
}
