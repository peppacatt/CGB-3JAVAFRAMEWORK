package com.cy.db.sys.service;


import com.cy.db.common.po.Node;
import com.cy.db.common.po.SysDept;

import java.util.List;
import java.util.Map;

public interface SysDeptService {
	 List<Map<String,Object>> findObjects();
	 List<Node> findZTreeNodes();
	 int saveObject(SysDept entity);
	 int updateObject(SysDept entity);
	 int deleteObject(Integer id);
}
