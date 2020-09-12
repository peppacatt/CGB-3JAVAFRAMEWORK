package com.wsw.pj.common.pool;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ObjectPoolTests {

	@Autowired 
	ObjectPool objectPool;
	
	@Autowired
	ObjectPool objectPool02;
	
	
	@Test
	public void testObjectPool() {
		System.out.println("objectPool="+objectPool);
		System.out.println("objectPool02="+objectPool02);
		System.out.println(objectPool==objectPool02);
	}
	
	
}
