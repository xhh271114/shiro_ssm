package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin/common")
@Controller
public class CommonController {
@RequestMapping("/main")
    public  String  mainView(){
        return "/admin/comm/main";
    }
}
