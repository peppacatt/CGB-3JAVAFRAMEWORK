package com.cy.db.sys.service;

import com.cy.db.common.po.Node;
import com.cy.db.common.po.SysMenu;

import java.util.List;
import java.util.Map;

public interface SysMenuService {
    List<Map<String,Object>> findMenuObject();

    int deleteCheckedMenuObject(Integer id);

    List<Node> findZtreeMenuNodes();

    int saveMenuObject(SysMenu entity);

    int updateMenuObject(SysMenu entity);
}
