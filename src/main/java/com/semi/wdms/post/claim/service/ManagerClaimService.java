package com.semi.wdms.post.claim.service;

import com.semi.wdms.post.claim.dto.RequestClaimDTO;

public interface ManagerClaimService {

    void insertCalim(int usrId, RequestClaimDTO requestClaimDTO);
}
