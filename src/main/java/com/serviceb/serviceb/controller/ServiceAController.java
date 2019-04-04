package com.serviceb.serviceb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceAController {

    @RequestMapping("/invoke")
    public String invoke(){
        return "serviceb";
    }

    @RequestMapping("/invokeAdd")
    public Integer invokeAdd(int a ,int b){
        return a+b;
    }
}
