package com.cy.db.sys.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.db.sys.pojo.SysLog;

@SpringBootTest
public class SysLogDaoTest {

	@Autowired
	private SysLogDao sysLogDao;
	
	@Test
	public void getRowCountTest() {
		long rowCount = sysLogDao.getRowCount("");
		System.out.println("rowCount-------"+rowCount);
	}
	
	@Test
	public void findPageObjecsTest() {
		List<SysLog> findPageObjects = sysLogDao.findPageObjects("", 3L, 3);
		for(SysLog temp:findPageObjects) {
			System.out.println(temp);
		}
	}
	
	@Test
	public void deleteObjects() {
		int deleteObjects = sysLogDao.deleteObjects(173,174);
		System.out.println("影响行数："+deleteObjects);
	}
	
}
