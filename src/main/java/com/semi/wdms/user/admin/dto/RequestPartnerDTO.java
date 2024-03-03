package com.semi.wdms.user.admin.dto;

import com.semi.wdms.user.enums.Role;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class RequestPartnerDTO {
    // account필드
    private String email;
    private String password;
    private String name;
    private String tel;
    private Role role;
    private Long regUsrId;
    private Long updtUsrId;

    // partner 필드
    private int comCd;
    private int dlrCd;
    private int brchCd;

}
