package com.wsw.pj.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wsw.pj.goods.pojo.Good;

@Mapper
public interface GoodsDao {
	
	@Select("SELECT * FROM tb_goods")
	List<Good> retrieveAll();
	
	@Delete("DELETE FROM tb_goods WHERE id=#{id}")
	int deleteById(Integer id);
	
	int deleteByIds(@Param("ids")Integer... ids);
	
	@Insert("INSERT INTO tb_goods VALUE (null,#{name},#{remark},#{createdTime})")
	int create(Good good);
	
	@Select("SELECT * FROM tb_goods WHERE id=#{id}")
	Good retrieveGoodById(Integer id);
	
	@Update("UPDATE tb_goods SET name=#{name},remark=#{remark} WHERE id=#{id}")
	int updateGoodById(Good good);
	
	
}
