package com.wsw.pj.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wsw.pj.goods.pojo.Goods;
import com.wsw.pj.goods.service.GoodsService;

@Controller
@RequestMapping("/goods/")
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("doGoodsUI")
	public String doGoodsUI(Model model) {
		List<Goods> list = goodsService.retrieveGoodsAll();
		model.addAttribute("goods",list);
		return "goods";
	}
	
	@RequestMapping("doDeleteById/{id}")
	public String doDeleteById(@PathVariable Integer id) {
		goodsService.deleteById(id);
		return "redirect:/goods/doGoodsUI";
	}
	
	@RequestMapping("doCreateGoodUI")
	public String doCreateGoodUI() {
		return "goods-add";
	}
	
	@RequestMapping("doSaveGood")
	public String doSaveGood(String name,String remark) {
		goodsService.createGood(name,remark);
		return "redirect:/goods/doGoodsUI";
	}
	
	
}
