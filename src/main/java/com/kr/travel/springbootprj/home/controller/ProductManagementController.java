package com.kr.travel.springbootprj.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kr.travel.springbootprj.home.dvo.ProductManagementDvo;
import com.kr.travel.springbootprj.home.service.ProductManagementService;

@RestController
public class ProductManagementController {

    @Autowired
	ProductManagementService service;

	@GetMapping("/api/category/products")
	 public List<ProductManagementDvo> productManagementList (
	     @RequestParam(required = false) int id,
	     @RequestParam(required = false) String name
	  ) {
		
		ProductManagementDvo param = new ProductManagementDvo();
		param.setId(id);
		param.setName(name);
	
		List<ProductManagementDvo> dvo = service.productManagementList(param);
	 	return dvo;
	 }
}

