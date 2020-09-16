package com.cy.db.sys.dao;

import com.cy.db.sys.pojo.SysUser;
import com.cy.db.sys.pojo.SysUserDept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface SysUserDao {

    List<SysUserDept> findPageObjects(@Param("username") String username, @Param("startIndex") Long startIndex, @Param("pageSize") Integer pageSize);

    long getRowCount(@Param("username") String username);

    @Update("UPDATE sys_users SET valid=#{valid}, modifiedTime=NOW(), modifiedUser=#{modifiedUser} WHERE id=#{id}")
    int validById(Integer id, Byte valid, String modifiedUser);

    int insertObjects(SysUser entity);

    int updateObjects(SysUser entity);

    SysUserDept findObjectById(Integer id);

}
