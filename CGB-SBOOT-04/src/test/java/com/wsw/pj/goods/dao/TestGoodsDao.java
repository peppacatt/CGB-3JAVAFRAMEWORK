package com.wsw.pj.goods.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestGoodsDao {
	
	/**
	 * 	关联数据层接口，并由spring为其进行值的注入
	 */
	@Autowired
	private GoodsDao goodsDao;
	
	@Test
	void testDeleteById() {
		int rows = goodsDao.deleteById(1);
		System.out.println("rows="+rows);
	}
	
	@Test
	public void testDeleteObject() {
		int rows = goodsDao.deleteObjects(2,3);
		System.out.println("影响行数："+rows);
	}
}
