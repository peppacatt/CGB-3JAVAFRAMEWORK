package com.cy.pj.sys.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.sys.pojo.SysLog;

@SpringBootTest
public class SysLogDaoTests {
	
	@Autowired
	private SysLogDao sysLogDao;
	
	@Test
	void testGetRowCount() {
		long rowCount=sysLogDao.getRowCount("");
		System.out.println("rowCount="+rowCount);
	}
	
	@Test
	void testFindPageObjects() {
		List<SysLog> list=sysLogDao.findPageObjects("admin", 0L, 3);
		for(SysLog log:list) {
			System.out.println(log);
		}
	}
}




