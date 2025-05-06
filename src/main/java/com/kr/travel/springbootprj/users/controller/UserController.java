package com.kr.travel.springbootprj.users.controller;

import com.kr.travel.springbootprj.users.dto.UserDto;
import com.kr.travel.springbootprj.users.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    @Tag(name = "회원가입")
    public ResponseEntity<?> register(@RequestBody UserDto userDto) {
        boolean success = userService.register(userDto);
        if (success) {
            return ResponseEntity.ok("회원가입 성공");
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("이미 존재하는 이메일입니다.");
        }
    }

}
