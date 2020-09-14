package com.cy.db.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cy.db.sys.pojo.SysLog;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysLogDao {

	long getRowCount(@Param("username") String username);
	
	List<SysLog> findPageObjects(@Param("username") String username, @Param("startIndex") Long startIndex, @Param("pageSize") Integer pageSize);
	
	int deleteObjects(@Param("ids") Integer... ids);
	
}
