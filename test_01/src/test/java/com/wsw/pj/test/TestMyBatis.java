package com.wsw.pj.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wsw.pj.goods.dao.GoodsDao;

@SpringBootTest
public class TestMyBatis {
		
	@Autowired
	private GoodsDao goodsDao;
	
	@Test
	public void testDeleteById() {
		int row = goodsDao.deleteById(1);
		System.out.println("影响行数："+row);
	}
	
	
}
