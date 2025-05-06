package com.kr.travel.springbootprj.users.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private String email;
    private String nickname;
    private String passwd;

}
