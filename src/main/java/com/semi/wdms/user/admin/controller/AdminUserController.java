package com.semi.wdms.user.admin.controller;

import com.semi.wdms.user.admin.dto.RequestAccountDto;
import com.semi.wdms.user.admin.dto.RequestPartnerDTO;
import com.semi.wdms.user.admin.service.AdminUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@Controller
public class AdminUserController {
    private final AdminUserService adminUserService;


//    @PostMapping("/admin/account/partner")
//    @ResponseBody
//    public ResponseEntity<Void> createPartnerAccount(
//            @AuthenticationPrincipal CustomUserDetails user,
//            @RequestBody RequestPartnerDTO requestPartnerDTO
//            ){
//        adminUserService.insertPartnerAccount(user.getUsrId(), requestPartnerDTO);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }


    @PostMapping("/admin/account/partner")
    @ResponseBody
    public ResponseEntity<Void> createPartnerAccount(
            @RequestBody RequestPartnerDTO requestPartnerDTO
    )
    {
        Integer userId = 1;
        adminUserService.insertPartnerAccount(userId, requestPartnerDTO);
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }


//    @PostMapping("/admin/account/manager")
//    @ResponseBody
//    public ResponseEntity<Void> createManagerAccount(
//            @AuthenticationPrincipal CustomUserDetails user,
//            @RequestBody RequestPartnerDTO requestPartnerDTO
//    ){
//        adminUserService.insertPartnerAccount(user.getUsrId(), requestPartnerDTO);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }



//    중복제거 코드

    @PostMapping("/admin/account/partner")
    @ResponseBody
    public ResponseEntity<Void> createAccount(
            @AuthenticationPrincipal CustomUserDetails user,
            @RequestBody RequestAccountDto requestAccountDto
            ){
        adminUserService.insertRequestAccount(user.getUsrId(), requestAccountDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/admin/account/test")
    @ResponseBody
    public String getAccountInfo(){
        return adminUserService.getCompanyList().toString();
    }


}
