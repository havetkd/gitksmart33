package kr.or.ksmart.ksmart_mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ksmart.ksmart_mybatis.mapper.GoodsMapper;
import kr.or.ksmart.ksmart_mybatis.vo.Goods;

@Service
public class GoodsService {

	@Autowired GoodsMapper goodsmapper;
	public List<Goods> getGoodsList(){
		return goodsmapper.getGoodsList();
		
	}
}
