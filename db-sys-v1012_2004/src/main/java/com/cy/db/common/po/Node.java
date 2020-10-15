package com.cy.db.common.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class Node implements Serializable {

    private static final long serialVersionUID = 3137209144799646320L;
    private Integer id;
    private String name;
    private Integer parentId;

}
