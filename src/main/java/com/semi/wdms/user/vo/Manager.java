package com.semi.wdms.user.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class Manager {

    private Long usrId;
    private String team;
    private Long regUsrId;
    private Long updtUsrId;

    public Long getUsrId() {
        return usrId;
    }

    public String getTeam() {
        return team;
    }

    public Long getRegUsrId() {
        return regUsrId;
    }

    public Long getUpdtUsrId() {
        return updtUsrId;
    }

}
