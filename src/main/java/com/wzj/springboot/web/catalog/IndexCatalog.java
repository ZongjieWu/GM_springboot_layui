package com.wzj.springboot.web.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexCatalog {

    @GetMapping("")
    public String jumpIndex(){
        return "/admin/login";
    }
}
