package com.serviceb.serviceb.controller;

import com.serviceb.serviceb.model.DataModel;
import com.serviceb.serviceb.model.JsonResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
