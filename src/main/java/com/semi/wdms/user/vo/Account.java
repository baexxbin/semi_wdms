package com.semi.wdms.user.vo;

import com.semi.wdms.user.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.Serializable;
import java.sql.Timestamp;

@AllArgsConstructor
@Builder
public class Account implements Serializable {
    private int usrId;
    private String email;
    private String password;
    private String name;
    private String phone;
    private Role role;
    private Long regUsrId;
    private Timestamp regDate;
    private Long updtUsrId;
    private Timestamp updtDate;
    private boolean delYn;

    public int getUsrId() {
        return usrId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Role getRole() {
        return role;
    }

    public Long getRegUsrId() {
        return regUsrId;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public Long getUpdtUsrId() {
        return updtUsrId;
    }

    public Timestamp getUpdtDate() {
        return updtDate;
    }

    public boolean isDelYn() {
        return delYn;
    }
}
