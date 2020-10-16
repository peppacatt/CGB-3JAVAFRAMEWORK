package com.cy.db.common.po;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SysRoleMenu implements Serializable {

    private static final long serialVersionUID = -4371227092737846522L;
    private Long id;
    private String name;
    private String note;
    private List<Integer> menuIds;

}
