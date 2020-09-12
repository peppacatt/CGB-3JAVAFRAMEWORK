package com.wsw.pj.common.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestSearchService {

	@Autowired
	private SearchService searchService;
	
	@Test
	public void testCache() {
		System.out.println(searchService.getCache());
	}
	
}
