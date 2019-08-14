package com.wzj.springboot.web.catalog;

import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminCatalog {
    @GetMapping("/logout")
    public String logout(HttpSession session){
        Map<String,Object> map=new HashMap<String,Object>();
        session.setAttribute("employee",null);
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "/admin/login";
    }

    @GetMapping("/jumpLogin")
    public String jumpLogin(){
        return "/admin/login";
    }

    @GetMapping("/jumpIndex")
    public String jumpIndex(HttpServletRequest request){
        Subject subject= SecurityUtils.getSubject();
        System.out.println(subject.getPrincipal());
        request.setAttribute("name",subject.getPrincipal());
        return "/admin/index";
    }

    @GetMapping("/jumpConsole")
    public String jumpConsole(){
        return "/admin/console";
    }
}
