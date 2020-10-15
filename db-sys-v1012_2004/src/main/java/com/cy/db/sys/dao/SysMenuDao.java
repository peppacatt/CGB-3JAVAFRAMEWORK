package com.cy.db.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysMenuDao {

    List<Map<String, Object>> findMenuObject();

    int findChildMenuCount(Integer id);

    int deleteCheckedMenuObject(Integer id);

}
