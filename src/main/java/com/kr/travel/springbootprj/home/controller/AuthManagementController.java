package com.kr.travel.springbootprj.home.controller;

import com.kr.travel.springbootprj.home.dvo.AuthManagementDvo;
import com.kr.travel.springbootprj.home.service.AuthManagementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthManagementController {

    private AuthManagementService authManagementService;

    public AuthManagementController(AuthManagementService authManagementService) {
        this.authManagementService = authManagementService;
    }

    @GetMapping("/auth")
    public List<AuthManagementDvo> authList(@RequestParam String username, @RequestParam String role_name) {

        AuthManagementDvo param = new AuthManagementDvo();
        param.setUsername(username);
        param.setRole_name(role_name);

        List<AuthManagementDvo> dvo = authManagementService.authList(param);
        return dvo;
    }

}
