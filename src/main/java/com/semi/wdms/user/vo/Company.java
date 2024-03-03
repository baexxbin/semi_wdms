package com.semi.wdms.user.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.sql.Timestamp;

@AllArgsConstructor
@Builder
public class Company {
    private String comCd;
    private String comNm;
    private int regUserId;
    private Timestamp regDate;
    private int updtUserId;
    private Timestamp updtDate;
    private boolean delYN;

    public String getComCd() {
        return comCd;
    }

    public String getComNm() {
        return comNm;
    }

    public int getRegUserId() {
        return regUserId;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public int getUpdtUserId() {
        return updtUserId;
    }

    public Timestamp getUpdtDate() {
        return updtDate;
    }

    public boolean isDelYN() {
        return delYN;
    }
}
