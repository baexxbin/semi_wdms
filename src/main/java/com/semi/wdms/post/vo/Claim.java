package com.semi.wdms.post.vo;

public class Claim {
    private Long clmId;
    private String clmTitle;
    private String clmContent;
    private Long attId;
    private Long manId;
    private String pri;
    private String comCd;
    private String part;
    private String clmStatus;
    private Long regUsrId;
    private Long updtUsrId;

    public Long getClmId() {
        return clmId;
    }

    public String getClmTitle() {
        return clmTitle;
    }

    public String getClmContent() {
        return clmContent;
    }

    public Long getAttId() {
        return attId;
    }

    public Long getManId() {
        return manId;
    }

    public String getPri() {
        return pri;
    }

    public String getComCd() {
        return comCd;
    }

    public String getPart() {
        return part;
    }

    public String getClmStatus() {
        return clmStatus;
    }

    public Long getRegUsrId() {
        return regUsrId;
    }

    public Long getUpdtUsrId() {
        return updtUsrId;
    }
}
