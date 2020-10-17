package com.cy.db.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserRoleDao {
    int deleteUserRoleObjectByUserId(Integer id);

    int saveUserRoleObjectByUserId(Integer id, Integer[] roleIds);

    List<Integer> fidRoleIdsByUserId(Integer id);
}
