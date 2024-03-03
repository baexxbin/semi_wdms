package com.semi.wdms.user.admin.controller;

import com.semi.wdms.user.admin.dto.RequestPartnerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class TestController {

    @GetMapping("/test")
    public String test(@RequestParam String param) {
        return "Received parameter: " + param;
    }
}
