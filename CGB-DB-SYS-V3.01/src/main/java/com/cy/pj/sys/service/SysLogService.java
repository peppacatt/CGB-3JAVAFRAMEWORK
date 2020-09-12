package com.cy.pj.sys.service;
import com.cy.pj.common.pojo.PageObject;
import com.cy.pj.sys.pojo.SysLog;
/**
   * 现在的项目都会分层设计，每次对象都会对应的接口，层与层对象进行耦合时
   * 建议耦合与接口。
 */
public interface SysLogService {
    /**
     * 	分页查询日志信息
     * @param username 用户名
     * @param pageCurrent 当前页页码
     * @return 封装了查询和计算结果的一个分页对象
     */
	PageObject<SysLog> findPageObjects(String username,Long pageCurrent);
}
