package com.wsw.pj.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wsw.pj.goods.pojo.Goods;

/**
 * 	在实现类中基于mybatis API实现与数据库的交互，这个类的对象最后会交给spring管理
 * @Mapper用于描述（做标记）数据层访问接口，用告诉mybatis框架，使用此注解的接口要由底层为创建实现类，
 * @return
 */
@Mapper
public interface GoodsDao {  //还有一些企业这个DoodsDao的名字会定义为GoodsMapper

	/**
	 * 	基于id执行商品信息的删除
	 * 	在mybatis中假如SQL映射语句比较简单，可以直接在dao方法上以注解方式映射
	 * @param id
	 * @return 删除的行数
	 */
	@Delete("DELETE FROM tb_goods WHERE id=#{id}")
	int  deleteById(Integer id);
	
	/**
	 * 	基于多个id删除商品
	 * @return
	 */
	public int deleteObjects(@Param("ids") Integer... ids);
	
	@Select("SELECT * FROM tb_goods")
	List<Goods> retrieveGoodsAll();
	
	@Insert("INSERT INTO tb_goods VALUE(null,#{name},#{remark},'2020-08-28 15:29:24')")
	int createGood(String name,String remark);
}
