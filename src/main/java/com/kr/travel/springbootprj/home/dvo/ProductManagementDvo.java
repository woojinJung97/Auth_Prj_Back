package com.kr.travel.springbootprj.home.dvo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductManagementDvo {

	
	private int id;          // 상품ID 
	private String name;        // 상품명 
	private String description; // 상품설명
	private String price; 		// 상품 
	private String stock;       // 재고 수량
	private String category_id; // 카테고리ID
	private String image_url;   // 이미지 ( 기본 null로 두셈 ) 
	private String created_at;  // 데이터 생성시간
}
