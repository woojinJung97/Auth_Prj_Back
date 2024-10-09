package com.kr.travel.springbootprj.home.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kr.travel.springbootprj.home.dvo.UserManagementDvo;
import com.kr.travel.springbootprj.home.service.UserManagementService;

@RestController
public class UserManagementController {

	UserManagementService service;
	
	@GetMapping("/api/user/userManagement")
    public List<UserManagementDvo> userManagementList(
     @RequestParam String userId,
     @RequestParam String userName,
     @RequestParam boolean isActive,
     @RequestParam String createAt
     ) {
		
		UserManagementDvo param = new UserManagementDvo();
		param.setUserId(userId);
		param.setUserName(userName);
		param.setActive(isActive);
		param.setCreateAt(createAt);
		
		
		List<UserManagementDvo> dvo = service.userManagementList(param);
    	return dvo;
    }
}
