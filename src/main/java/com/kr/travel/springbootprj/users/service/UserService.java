package com.kr.travel.springbootprj.users.service;

import com.kr.travel.springbootprj.users.dto.UserDto;
import com.kr.travel.springbootprj.users.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public boolean register(UserDto userDto) {
        if (userMapper.findByEmail(userDto.getEmail()) != null) {
            return false;
        }
        userMapper.insertUser(userDto);
        return true;
    }

}
