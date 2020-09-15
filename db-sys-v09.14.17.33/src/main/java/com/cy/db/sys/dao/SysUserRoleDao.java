package com.cy.db.sys.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SysUserRoleDao {

    @Select("SELECT role_id FROM sys_user_roles WHERE user_id=#{userId}")
    List<Integer> findRoleIdsByUserId(Integer userId);

    int insertObjects(@Param("userId") Integer userId, @Param("roleIds") Integer[] roleIds);

    @Delete("DELETE FROM sys_user_roles WHERE user_id=#{userId}")
    int deleteObjectsByUserId(Integer userId);

}
