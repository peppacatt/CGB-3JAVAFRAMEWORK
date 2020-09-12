package com.wsw.pj.common.datasource;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDatasource {
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testConnection() throws Exception {
		System.out.println(dataSource.getClass().getName());
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
	}
	
}
