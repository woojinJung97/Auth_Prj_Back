package com.kr.travel.springbootprj.home.service;

import java.util.List;


import com.kr.travel.springbootprj.home.dvo.ProductManagementDvo;

public interface ProductManagementService {
	
	List<ProductManagementDvo> productManagementList(ProductManagementDvo dvo);
}
