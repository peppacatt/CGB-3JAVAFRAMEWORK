package com.cy.db.sys.dao;

import com.cy.db.sys.common.pojo.Node;
import com.cy.db.sys.pojo.SysMenu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysMenuDao {

    List<Map<String,Object>> findObjects();

    @Select("SELECT COUNT(*) FROM sys_role_menus WHERE parentId=#{id}")
    int getChildCount(Integer id);

    @Delete("DELETE FROM sys_menu WHERE id=#{id}")
    int deleteObjects(Integer id);

    @Select("SELECT id,name,parentId FROM sys_menus")
    List<Node> findZtreeMenuNodes();

    int insertObjects(SysMenu sysMenu);

    int updateObjects(SysMenu sysMenu);

}
