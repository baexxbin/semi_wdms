package com.semi.wdms.user.admin.dto;

import com.semi.wdms.user.enums.Role;
import lombok.Data;

@Data
public class RequestManagerDTO {
    // account필드
    private String email;
    private String password;
    private String name;
    private String tel;
    private Role role;
    private Long regUsrId;
    private Long updtUsrId;

    // manager필드
    private String team;

}
