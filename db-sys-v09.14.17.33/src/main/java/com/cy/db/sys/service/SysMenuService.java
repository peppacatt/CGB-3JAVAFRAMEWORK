package com.cy.db.sys.service;

import com.cy.db.sys.common.pojo.Node;
import com.cy.db.sys.pojo.SysMenu;

import java.util.List;
import java.util.Map;

public interface SysMenuService {

    List<Map<String,Object>> findObjects();

    int deleteObjects(Integer id);

    List<Node> findZtreeMenuNodes();

    int inserObjects(SysMenu sysMenu);

    int updateObjects(SysMenu sysMenu);

}
