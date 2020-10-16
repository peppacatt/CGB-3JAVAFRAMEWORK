package com.cy.db.sys.dao;

import com.cy.db.common.po.SysUser;
import com.cy.db.common.po.SysUserDept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserDao {

    long findRowCount(String username);

    List<SysUserDept> findUserDeptRecords(String username, long startIndex, int pageSize);

    int updateValidById(Integer id, Byte valid, String admin);

    int saveUserObject(SysUser entity);
}
