package com.cy.db.sys.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleMenuDao {

    int deleteRoleMenuObjectByMenuId(Integer id);

    int saveRoleMenuByRoleId(Long id, Integer[] menuIds);
}
