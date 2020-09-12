package com.wsw.pj.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wsw.pj.goods.pojo.Good;
import com.wsw.pj.goods.service.GoodsService;

@SpringBootTest
public class TestMyBatis03 {

	
	@Autowired
	private GoodsService goodsService;
	
	@Test
	public void testRetrieveAll() {
		List<Good> list = goodsService.retrieveAll();
		for(Good temp:list) {
			System.out.println(temp);
		}
	}
	
}
