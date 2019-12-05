package kr.or.ksmart.ksmart_mybatis.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.ksmart.ksmart_mybatis.mapper.GoodsMapper;


@Controller
public class GoodsController {

	@Autowired GoodsMapper goodsmapper;
	
	@GetMapping("/goodsList")
	public String getGoodsList(Model model){
		model.addAttribute("goodsList", goodsmapper.getGoodsList());
		return "/goods/goodsList";
		
	}
	
}
