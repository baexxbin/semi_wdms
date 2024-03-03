package com.semi.wdms.post.claim.service.dao;

import com.semi.wdms.post.claim.dto.RequestClaimDTO;
import com.semi.wdms.user.admin.dto.RequestPartnerDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

// 매니저 측의 claim 작업
@Mapper
@Repository
public interface ManagerClaimDAO {

    void createClaim(int usrId, RequestClaimDTO requestClaimDTO);

}
