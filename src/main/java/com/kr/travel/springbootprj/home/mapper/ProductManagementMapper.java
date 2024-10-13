package com.kr.travel.springbootprj.home.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kr.travel.springbootprj.home.dvo.ProductManagementDvo;

@Mapper
public interface ProductManagementMapper {

	// 물품 조회
	List<ProductManagementDvo> productManagementList(ProductManagementDvo dvo);
}
