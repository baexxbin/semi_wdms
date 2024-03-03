package com.semi.wdms.user.admin.service.dao;

import com.semi.wdms.user.admin.dto.RequestAccountDto;
import com.semi.wdms.user.vo.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminUserDAO {

    List<Company> getCompanyList();
//    List<Dealer> getDealerList(String comCd);
//
//    List<Branch> getBranchList(String comCd, String dlrCd);

//    void createPartnerAccount(int usrId, RequestPartnerDTO requestPartnerDTO);

//    void createPartnerInfo(int usrId, RequestPartnerDTO requestPartnerDTO);

//    void createManagerAccount(int usrId, RequestManagerDTO requestManagerDTO);

//    void createManagerInfo(int usrId, RequestManagerDTO requestManagerDTO);

    void createAccount(int usrId, RequestAccountDto requestAccountDto);
    void createPartner(int usrId, RequestAccountDto requestAccountDto);
    void createManager(int usrId, RequestAccountDto requestAccountDto);
    int getEmailCount(@Param("email") String email);

}
