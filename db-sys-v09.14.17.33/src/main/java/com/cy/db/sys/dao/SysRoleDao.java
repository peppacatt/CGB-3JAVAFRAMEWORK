package com.cy.db.sys.dao;

import com.cy.db.sys.common.pojo.CheckBox;
import com.cy.db.sys.pojo.SysRole;
import com.cy.db.sys.pojo.SysRoleMenu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SysRoleDao {

    List<SysRole> findPageObjects(@Param("name") String name, @Param("startIndex") Long startIndex, @Param("pageSize") Integer pageSize);

    long getRowCount(@Param("name") String name);

    @Insert("INSERT INTO sys_roles (name,note,createdTime,modifiedTime,createdUser,modifiedUser) VALUES (#{name}, NOW(), NOW(), #{createdUser}, #{modifiedUser})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertObjects(SysRole entity);

    SysRoleMenu findObjectById(@Param("id") Integer id);

    int updateObject(SysRole entity);

    @Select("SELECT id,name FROM sys_roles")
    List<CheckBox> findRoles();

}
