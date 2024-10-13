package com.kr.travel.springbootprj.home.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kr.travel.springbootprj.home.dvo.UserManagementDvo;

@Mapper
public interface UserManagementMapper {

	/**
	 * 사용자 관리 조회
	 * @param userManagementDvo
	 * @return List<UserManagementDvo> 
	 * */
	List<UserManagementDvo> userManagementList(UserManagementDvo param);
}
