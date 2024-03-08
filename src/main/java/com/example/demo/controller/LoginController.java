package com.example.demo.controller;

import com.example.demo.requests.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("login")
    public String getForm()
    {
        return "login";
    }

    @PostMapping("login")
    public String login(LoginRequest request) {
        System.out.println(request.getUsername() + "-" + request.getPassword());
        return "login";
    }
}
