package com.rs.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("hello")
    public String getMessage(Authentication a) {
        return "Hello Spring Resource Server!!";
    }
}
