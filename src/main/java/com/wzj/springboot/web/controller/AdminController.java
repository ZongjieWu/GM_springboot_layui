package com.wzj.springboot.web.controller;

import com.wzj.springboot.enums.Result;
import com.wzj.springboot.model.Employee;
import com.wzj.springboot.service.service.EmployeeService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/03/03.
 */
@Validated
@RestController
@RequestMapping("/admin/")
public class AdminController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("login")
    public Map<String,Object> login(@NotNull @NotEmpty String phone, @NotNull @NotEmpty  String pwd, HttpSession session){
        try {
            Subject subject = SecurityUtils.getSubject();
            Map<String,Object> map=new HashMap<String,Object>();
            Employee employee=new Employee();
            employee.setPhone(phone);
            employee.setPwd(pwd);

            Employee e=employeeService.findOne(employee);

            if(e==null){
                return Result.retrunFailMsg("账号或密码错误");
            }else{
                session.setAttribute("admin",e);
                subject.login(new UsernamePasswordToken(phone, pwd));
                return Result.retrunSucess();
            }
        }catch (Exception e){
            return Result.retrunFailMsg("账号或密码错误");
        }

    }

}
