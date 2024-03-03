package com.semi.wdms.user.admin.service;

import com.semi.wdms.user.admin.dto.RequestAccountDto;
import com.semi.wdms.user.admin.dto.RequestManagerDTO;
import com.semi.wdms.user.admin.dto.RequestPartnerDTO;
import com.semi.wdms.user.vo.Company;

import java.util.List;


public interface AdminUserService {

    List<Company> getCompanyList();

    //    List<Dealer> getDealerList();
//    List<Branch> getBranchList();
//    void insertPartnerAccount(int usrId, RequestPartnerDTO requestPartnerDTO);

//    void insertManagerAccount(int usrId, RequestManagerDTO requestManagerDTO);

    // 중복제거 코드
//    void insertAccount(int usrId, RequestAccountDto requestAccountDto);

    // 중복제거 코드
    void insertRequestAccount(int usrId, RequestAccountDto requestAccountDto);
}
