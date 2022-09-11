package com.example.demo.controller;

import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello(){
        return "Welcome to Our site";
    }

    @GetMapping("/user")
    public String protectedHello(){
    		return "Welcome user";
    }

    @GetMapping("/admin")
    public String admin(){
    		return "Welcome admin";
    }

}
