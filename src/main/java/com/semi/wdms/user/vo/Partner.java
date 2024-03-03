package com.semi.wdms.user.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.Serializable;

@AllArgsConstructor
@Builder
public class Partner implements Serializable {
    private Long usrId;
    private Long comCd;
    private Long dlrCd;
    private Long brchCd;

    private Long regUsrId;
    private Long updtUsrId;

    public int getUsrId() {
        return usrId;
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

}
