package com.kr.travel.springbootprj.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kr.travel.springbootprj.home.dvo.ProductManagementDvo;
import com.kr.travel.springbootprj.home.mapper.ProductManagementMapper;
import com.kr.travel.springbootprj.home.service.ProductManagementService;

@Service
public class ProductManagementServiceImpl implements ProductManagementService{
	
	@Autowired
	ProductManagementMapper mapper;
	
	@Override
	public List<ProductManagementDvo> productManagementList(ProductManagementDvo param) {
		return mapper.productManagementList(param);
	}
	
}