package com.wzj.springboot.web.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminCatalog {

    @GetMapping("jumpLogin")
    public String jumpLogin(){
        return "/admin/login";
    }

    @GetMapping("jumpIndex")
    public String jumpIndex(){
        return "/admin/index";
    }

    @GetMapping("jumpConsole")
    public String jumpConsole(){
        return "/admin/console";
    }
}
