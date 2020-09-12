package com.cy.pj.sys.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.cy.pj.sys.pojo.SysLog;

@Mapper
public interface SysLogDao {
	  /**
	   * 	基于条件查询用户行为日志记录总数
	   * @param username 查询条件(用户名-基于此用户名进行模糊查询)
	   * @return 查询到的记录总数
	   */
	  long getRowCount(String username);
	  
	  /**
	   * 	基于条件查询当前页数据
	   * @param username 查询条件
	   * @param startIndex 起始位置
	   * @param pageSize 页面大小(每页最多显示多少条记录)
	   * @return 查询到的记录
	   */
	  List<SysLog> findPageObjects(String username,Long startIndex,
			   Integer pageSize);
}
