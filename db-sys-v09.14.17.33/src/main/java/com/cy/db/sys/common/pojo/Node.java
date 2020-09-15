package com.cy.db.sys.common.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Node implements Serializable {
    private static final long serialVersionUID = 3831698654495418122L;

    private Integer id;
    private String name;
    private Integer parentId;

}
