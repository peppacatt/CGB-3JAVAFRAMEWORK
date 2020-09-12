package com.wsw.pj.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wsw.pj.goods.dao.GoodsDao;

@SpringBootTest
public class TestMyBatis02 {

	@Autowired
	private GoodsDao goodsDao;
	
	@Test
	public void testDeleteByIds() {
		int rows = goodsDao.deleteByIds(2,3);
		System.out.println("影响行数："+rows);
	}
	
}
