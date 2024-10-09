package com.kr.travel.springbootprj.home.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kr.travel.springbootprj.home.dvo.UserManagementDvo;
import com.kr.travel.springbootprj.home.mapper.UserManagementMapper;
import com.kr.travel.springbootprj.home.service.UserManagementService;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	UserManagementMapper mapper;
	
	@Override
	public List<UserManagementDvo> userManagementList(UserManagementDvo param){
		return mapper.userManagementList(param);
	}
	
	
}
