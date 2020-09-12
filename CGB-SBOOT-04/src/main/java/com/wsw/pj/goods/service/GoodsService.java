package com.wsw.pj.goods.service;

import java.util.List;

import com.wsw.pj.goods.pojo.Goods;

/**
 * 商品模块的业务层接口，负责具体业务
 * @author tarena
 *
 */
public interface GoodsService {
	int deleteById(Integer id);
	List<Goods> retrieveGoodsAll();
	int createGood(String name,String remark);
}
