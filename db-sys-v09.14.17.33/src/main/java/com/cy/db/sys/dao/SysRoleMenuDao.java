package com.cy.db.sys.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface SysRoleMenuDao {

    @Delete("DELETE FROM sys_role_menus WHERE menu_id=#{menuId}")
    int deleteObjectsByMenuId(Integer menuId);

    @Delete("DELETE FROM sys_role_menus WHERE role_id=#{roleId}")
    int deleteObjectsByRoleId(Long roleId);

    int insertObjects(Long roleId, Integer[] menuIds);

    @Select("SELECT menu_id FROM sys_role_menus WHERE role_id=#{roleId}")
    List<Integer> findMenuIdsByRoleId(Integer roleId);

}
