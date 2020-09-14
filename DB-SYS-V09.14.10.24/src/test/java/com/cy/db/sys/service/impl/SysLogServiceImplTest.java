package com.cy.db.sys.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.db.sys.common.pojo.PageObject;
import com.cy.db.sys.pojo.SysLog;
import com.cy.db.sys.service.SysLogService;

@SpringBootTest
public class SysLogServiceImplTest {

	@Autowired
	private SysLogService sysLogService;
	
	@Test
	public void findPageObjects() {
		PageObject<SysLog> findPageObjects = sysLogService.findPageObjects("", 1L);
		System.out.println("-------"+findPageObjects);
	}
	
	@Test
	public void deleteObject() {
		int rows = sysLogService.deleteObjects(171,172);
		System.out.println("影响行数："+rows);
	}
	
}
