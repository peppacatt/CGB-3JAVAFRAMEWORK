package com.cy.db.common.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageObject<T> implements Serializable {

    private static final long serialVersionUID = 6916893269032772666L;
    private Integer pageSize;
    private List<T> records;
    private Long pageCurrent;
    private Long pageCount;
    private Long rowCount;

    public PageObject(Integer pageSize, List<T> records, Long pageCurrent, Long rowCount){
        super();
        this.pageSize = pageSize;
        this.records = records;
        this.pageCurrent = pageCurrent;
        this.rowCount = rowCount;
        this.pageCount = (this.rowCount-1)/this.pageSize+1;
    }

}
