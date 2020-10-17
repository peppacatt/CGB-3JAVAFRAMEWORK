package com.cy.db.sys.dao;

import com.cy.db.common.po.CheckBox;
import com.cy.db.common.po.SysRole;
import com.cy.db.common.po.SysRoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleDao {

    long findRowCount(String name);

    List<SysRole> findPageCurrentRecords(String name, long startIndex, int pageSize);

    int saveRoleObject(SysRole entity);

    SysRoleMenu findRoleMenuObject(Integer id);

    int updateRoleObject(SysRole entity);

    List<CheckBox> findRoles();
}
