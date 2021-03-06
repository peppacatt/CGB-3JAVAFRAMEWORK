package com.cy.db.sys.dao;

import com.cy.db.common.po.SysLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysLogDao {

    long findRowCount(String username);

    List<SysLog> findPageCurrentRecords(String username, Long startIndex, Integer pageSize);

    int deleteObjectByIds(Integer... ids);
}
