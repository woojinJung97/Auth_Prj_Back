package com.kr.travel.springbootprj.home.dvo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserManagementDvo {

	/* not null */
    private String userId; 
    private String userName;
    private String email;
    private String password;

    /* null 허용 */
    private String fullName;
    private boolean isActive; 
    private String createAt;
    private String updatedAt;
    
	
}
