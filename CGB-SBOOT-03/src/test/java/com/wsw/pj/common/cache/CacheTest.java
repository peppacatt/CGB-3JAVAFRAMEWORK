package com.wsw.pj.common.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CacheTest {

	@Autowired
	@Qualifier("weakCache")
	private Cache cache;
	
	@Test
	public void testCache() {
		System.out.println(cache);
	}
	
	
}
