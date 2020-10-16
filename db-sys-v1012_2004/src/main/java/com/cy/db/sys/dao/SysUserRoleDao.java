package com.cy.db.sys.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserRoleDao {
    int deleteUserRoleObjectByUserId(Integer id);

    int saveUserRoleObjectByUserId(Integer id, Integer[] roleIds);
}
