package com.kr.travel.springbootprj.home.dvo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserManagementDvo {

	/* not null */
    private String id; 
    private String userName;
    private String email;
    private String password;
    
    private String role;
    private Date createAt;
    
    private String address; 
	
}
