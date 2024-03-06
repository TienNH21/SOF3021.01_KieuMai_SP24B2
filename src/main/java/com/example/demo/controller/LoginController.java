package com.example.demo.controller;

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
    public String login(
        @RequestParam("username") String un,
        @RequestParam("password") String pwd
    ) {
        System.out.println(un + "-" + pwd);
        return "login";
    }
}
