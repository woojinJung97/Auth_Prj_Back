package com.kr.travel.springbootprj.home.service;

import java.util.List;

import com.kr.travel.springbootprj.home.dvo.UserManagementDvo;

public interface UserManagementService {

	/**
	 * 사용자 관리 조회 서비스
	 * */
	List<UserManagementDvo> userManagementList(UserManagementDvo dvo);
	 
}
