package com.wsw.pj.goods.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsw.pj.goods.dao.GoodsDao;
import com.wsw.pj.goods.pojo.Goods;
import com.wsw.pj.goods.service.GoodsService;


/**
 * 	业务层对象，后续会在此对象中执行：
 * 	1）核心业务（例如：点击购买商品信息，要生成点单项信息，扣减库存.....）
 * 	2）扩展业务（例如：事务控制，权限控制，日志记录...）
 * @author tarena
 *
 */

@Service   //是一个特殊的@Component
public class GoodsServiceImpl implements GoodsService{

	private static final Logger log = LoggerFactory.getLogger(GoodsServiceImpl.class);
	
	@Autowired
	private GoodsDao goodsDao;
	
	@Override
	public int deleteById(Integer id) {
		long t1 = System.currentTimeMillis();
		int row = goodsDao.deleteById(id);
		long t2 = System.currentTimeMillis();
		log.info("deleteById execute time : {}",(t2-t1));
		return row;
	}
	
	@Override
	public List<Goods> retrieveGoodsAll(){
		return goodsDao.retrieveGoodsAll();
	}
	
	@Override
	public int createGood(String name,String remark) {
		int row = goodsDao.createGood(name,remark);
		return row;
	}
	
}
