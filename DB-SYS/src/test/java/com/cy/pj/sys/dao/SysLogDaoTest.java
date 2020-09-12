package com.cy.pj.sys.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.sys.pojo.SysLog;

@SpringBootTest
public class SysLogDaoTest {

	@Autowired
	private SysLogDao sysLogDao;
	
	@Test
	   public void testGetRowCount() {
		   long rows=sysLogDao.getRowCount("admin");
		   System.out.println("rows="+rows);
	   }
	
//	@Test
//	void testGetRowCount() {
//		int rowCount = sysLogDao.getRowCount("admin");
//		System.out.println("rowCount"+rowCount);
//	}
	
	@Test
	void testFindPageObjects() {
		List<SysLog> list = sysLogDao.findPageObjects("admin", 0L, 3);
		for(SysLog temp:list) {
			System.out.println(temp);
		}
	}
	
}
