package com.wsw.pj.common.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest //SpringBoot工程中的单元测试类需要使用此注解进行描述
public class DefaultCacheTests {
	@Autowired  //告诉spring
	private DefaultCache defaultCache;
	
	@Test
	public void testDefaultCache() {
		System.out.println("defaultCache="+defaultCache);
	}
	
	
}
