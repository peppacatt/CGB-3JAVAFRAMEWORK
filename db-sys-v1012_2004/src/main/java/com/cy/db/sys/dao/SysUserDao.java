package com.cy.db.sys.dao;

import com.cy.db.common.po.SysUser;
import com.cy.db.common.po.SysUserDept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysUserDao {

    long findRowCount(String username);

    List<SysUserDept> findUserDeptRecords(String username, long startIndex, int pageSize);

    int updateValidById(Integer id, Byte valid, String admin);

    int saveUserObject(SysUser entity);

    int updateUser(SysUser entity);

    SysUserDept findUserDeptByUserId(Integer id);
}
