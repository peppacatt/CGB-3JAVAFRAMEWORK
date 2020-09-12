package com.wsw.pj.goods.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestGoodsService {

	@Autowired
	private GoodsService goodsService;
	
	@Test
	public void testDeleteById() {
		int row = goodsService.deleteById(4);
		System.out.println("影响行数："+row);
	}
	
}
