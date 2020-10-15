package com.cy.db.sys.service;

import java.util.List;
import java.util.Map;

public interface SysMenuService {
    List<Map<String,Object>> findMenuObject();

    int deleteCheckedMenuObject(Integer id);
}
