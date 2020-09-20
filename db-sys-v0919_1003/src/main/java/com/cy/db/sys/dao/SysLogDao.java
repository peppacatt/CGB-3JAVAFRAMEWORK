package com.cy.db.sys.dao;

import com.cy.db.sys.entity.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysLogDao {

    List<SysLog> retrievePageObjects(@Param("username") String username, @Param("startIndex") Long startIndex, @Param("pageSize") Integer pageSize);

    long getRowCount(@Param("username") String username);

    int deleteObjects(@Param("ids") Integer... ids);

}
