package com.kr.travel.springbootprj.users.mapper;

import com.kr.travel.springbootprj.users.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void insertUser(UserDto userDto);
    UserDto findByEmail(String email);

}
