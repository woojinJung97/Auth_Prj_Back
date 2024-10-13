package com.kr.travel.springbootprj.home.service;

import com.kr.travel.springbootprj.home.dvo.AuthManagementDvo;
import com.kr.travel.springbootprj.home.mapper.AuthManagementMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthManagementService {

    private final AuthManagementMapper authManagementMapper;

    public AuthManagementService(AuthManagementMapper authManagementMapper) {
        this.authManagementMapper = authManagementMapper;
    }

    public List<AuthManagementDvo> authList(AuthManagementDvo param) {
        return authManagementMapper.authList(param);
    }

}
