package com.cy.db.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleMenuDao {

    int deleteRoleMenuObjectByMenuId(Integer id);

    int saveRoleMenuByRoleId(Long id, Integer[] menuIds);

    List<Integer> findMenuIdsByRoleId(Integer id);

    int deleteRoleMenuObjectByRoleId(Long id);
}
