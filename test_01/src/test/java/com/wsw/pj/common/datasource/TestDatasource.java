package com.wsw.pj.common.datasource;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDatasource {

	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testDataSource() throws Exception {
		System.out.println(dataSource.getConnection());
	}
	
}
