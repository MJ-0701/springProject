package com.example.springproject.controller;

import com.example.springproject.dto.request.UserReq;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/user")
    public UserReq user(UserReq userReq){
        return userReq;
    }
}
