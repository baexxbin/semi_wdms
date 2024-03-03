package com.semi.wdms.post.claim.service.impl;

import com.semi.wdms.post.claim.dto.RequestClaimDTO;
import com.semi.wdms.post.claim.service.ManagerClaimService;
import com.semi.wdms.post.claim.service.dao.ManagerClaimDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.Null;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ManagerClaimServiceImpl implements ManagerClaimService {

    private final ManagerClaimDAO managerClaimDAO;

    @Override
    public void insertCalim(int usrId, RequestClaimDTO requestClaimDTO) {
        if (requestClaimDTO.getAttId() != null) {

        }
    }
}
