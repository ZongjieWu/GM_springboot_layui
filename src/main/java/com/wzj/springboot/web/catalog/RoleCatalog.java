package com.wzj.springboot.web.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("role")
public class RoleCatalog {
    @GetMapping("jumpPaging")
    public String jumpManage(){
        return "/admin/permission/role";
    }
}
