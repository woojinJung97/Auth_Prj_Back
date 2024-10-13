package com.kr.travel.springbootprj.home.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kr.travel.springbootprj.home.dvo.UserManagementDvo;
import com.kr.travel.springbootprj.home.service.UserManagementService;

@RestController
public class UserManagementController {

	@Autowired
	UserManagementService service;
	
	@GetMapping("/api/user/userManagement")
    public List<UserManagementDvo> userManagementList (
        @RequestParam(required = false) String id,
        @RequestParam(required = false) String password,
        @RequestParam(required = false) String address
     ) {
		
		UserManagementDvo param = new UserManagementDvo();
		param.setId(id);
		param.setPassword(password);
		param.setAddress(address);
		
		
//		param.setUserName(userName);
//		param.setEmail();
//		param.setCreateAt(createAt);
	
		List<UserManagementDvo> dvo = service.userManagementList(param);
    	return dvo;
    }
}
