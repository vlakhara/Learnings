package com.vipul.springSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("")
    private String greetings(HttpServletRequest request) {
        try {
            return "Welcome, " + request.getSession().getId();
        } catch(Exception exception) {
            return "Error";
        }
    }
}
