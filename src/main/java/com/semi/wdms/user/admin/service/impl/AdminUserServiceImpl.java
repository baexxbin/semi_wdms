package com.semi.wdms.user.admin.service.impl;

import com.semi.wdms.user.admin.dto.RequestAccountDto;
import com.semi.wdms.user.admin.dto.RequestManagerDTO;
import com.semi.wdms.user.admin.dto.RequestPartnerDTO;
import com.semi.wdms.user.admin.service.AdminUserService;
import com.semi.wdms.user.admin.service.dao.AdminUserDAO;
import com.semi.wdms.user.vo.Company;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.semi.wdms.user.enums.Role.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class AdminUserServiceImpl implements AdminUserService {

    private final AdminUserDAO adminUserDAO;

    @Override
    public List<Company> getCompanyList() {
        return adminUserDAO.getCompanyList();
    }

//    @Override
//    public void insertPartnerAccount(int usrId, RequestPartnerDTO requestPartnerDTO) {
//        if (isEmailAlreadyExist(requestPartnerDTO.getEmail())){
//            throw new RuntimeException();
//        }
////        adminUserDAO.createPartnerAccount(usrId, requestPartnerDTO);
//        adminUserDAO.createPartnerInfo(usrId, requestAccountDto);
//    }
//
//
//    @Override
//    public void insertManagerAccount(int usrId, RequestManagerDTO requestManagerDTO) {
//        if (isEmailAlreadyExist(requestManagerDTO.getEmail())){
//            throw new RuntimeException();
//        }
//        adminUserDAO.createManagerAccount(usrId, requestManagerDTO);
//        adminUserDAO.createManagerInfo(usrId, requestManagerDTO);
//    }



    // 중복제거 코드
    @Override
    public void insertRequestAccount(int usrId, RequestAccountDto requestAccountDto) {
        if (isEmailAlreadyExist(requestAccountDto.getEmail())){
            throw new RuntimeException();
        }
        adminUserDAO.createAccount(usrId, requestAccountDto);

        if (ROLE_PARTNER.equals(requestAccountDto.getRole())) {
            adminUserDAO.createPartner(usrId, requestAccountDto);
        } else if (ROLE_MANAGER.equals(requestAccountDto.getRole())) {
            adminUserDAO.createManager(usrId, requestAccountDto);
        }
    }


    private boolean isEmailAlreadyExist(String email) {
        return adminUserDAO.getEmailCount(email) > 0;
    }

}
