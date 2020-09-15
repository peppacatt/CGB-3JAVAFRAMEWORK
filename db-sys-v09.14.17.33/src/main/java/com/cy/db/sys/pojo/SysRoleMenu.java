package com.cy.db.sys.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SysRoleMenu implements Serializable {

    private static final long serialVersionUID = -6805149500779438382L;
    private Integer id;
    private String name;
    private String note;
    private List<Integer> menuIds;

}
