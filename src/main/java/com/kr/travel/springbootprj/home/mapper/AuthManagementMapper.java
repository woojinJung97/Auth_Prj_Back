package com.kr.travel.springbootprj.home.mapper;

import com.kr.travel.springbootprj.home.dvo.AuthManagementDvo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthManagementMapper {
    List<AuthManagementDvo> authList(AuthManagementDvo param);
}
