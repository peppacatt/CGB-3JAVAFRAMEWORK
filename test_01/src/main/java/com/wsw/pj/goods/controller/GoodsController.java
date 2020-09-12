package com.wsw.pj.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wsw.pj.goods.pojo.Good;
import com.wsw.pj.goods.service.GoodsService;

@Controller

@RequestMapping("/goods/")
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("goodsHome")
	public String goodsHome(Model model) {
		List<Good> goodsList = goodsService.retrieveAll();
		model.addAttribute("goods",goodsList);
		return "goods";
	}
	
	@RequestMapping("goodsDeleteById/{id}")
	public String goodsDeleteById(@PathVariable Integer id) {
		goodsService.deleteById(id);
		return "redirect:/goods/goodsHome";
	}
	
	@RequestMapping("toGoodCreate")
	public String toGoodCreate() {
		return "goods-add";
	}
	
	@RequestMapping("submitCreateGood")
	public String submitCreateGood(Good good) {
		goodsService.create(good);
		return "redirect:/goods/goodsHome";
	}
	
	@RequestMapping("toGoodUpdate/{id}")
	public String toGoodUpdate(@PathVariable Integer id,Model model) {
		Good good = goodsService.retrieveGoodById(id);
		model.addAttribute("good",good);
		return "good-update";
	}
	
	@RequestMapping("submitUpdateGood")
	public String submitUpdateGood(Good good) {
		goodsService.updateGoodById(good);
		return "redirect:/goods/goodsHome";
	}

	
	
}
