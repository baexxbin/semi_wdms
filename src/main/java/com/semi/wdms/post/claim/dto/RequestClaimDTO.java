package com.semi.wdms.post.claim.dto;

import lombok.Data;

@Data
public class RequestClaimDTO {
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

}
