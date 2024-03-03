package com.semi.wdms.user.admin.dto;

import com.semi.wdms.user.enums.Role;

public class RequestAccountDto {
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

    // manager필드
    private String team;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public Role getRole() {
        return role;
    }

    public Long getRegUsrId() {
        return regUsrId;
    }

    public Long getUpdtUsrId() {
        return updtUsrId;
    }

    public int getComCd() {
        return comCd;
    }

    public int getDlrCd() {
        return dlrCd;
    }

    public int getBrchCd() {
        return brchCd;
    }

    public String getTeam() {
        return team;
    }
}
