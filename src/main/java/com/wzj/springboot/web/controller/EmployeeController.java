package com.wzj.springboot.web.controller;
import com.wzj.springboot.model.Employee;
import com.wzj.springboot.service.service.EmployeeService;
import com.wzj.springboot.enums.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/08/10.
 */
@RestController
@RequestMapping("/employee/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("add")
    public Map<String,Object> add(Employee employee) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        employee.setAddTime(simpleDateFormat.format(new Date()));
        employee.setModifyTime(simpleDateFormat.format(new Date()));
        employeeService.save(employee);
        return Result.retrunSucess();
    }

    @PostMapping("delete")
    public Map<String,Object> delete(@RequestParam Long id) {
	    employeeService.deleteById(id);
	    return Result.retrunSucess();
    }

    @PostMapping("update")
    public Map<String,Object> update(Employee employee) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        employee.setModifyTime(simpleDateFormat.format(new Date()));
	    employeeService.update(employee);
	    return Result.retrunSucess();
    }

    @PostMapping("detail")
    public Map<String,Object> detail(@RequestParam Long id) {
        Employee employee = employeeService.findById(id);
        return Result.retrunSucessMsgData(employee);
    }

    @PostMapping("paging")
    public Map<String,Object> paging(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        Example example=new Example(Employee.class);
        Example.Criteria criteria=example.createCriteria();
        PageHelper.startPage(page, limit);
        PageInfo<Employee> employeePageInfo = employeeService.queryPageListByWhereExample(" id desc",page,limit,example);
        Map<String,Object> map=Result.retrunSucessMsgData(employeePageInfo.getList());
        map.put("count",employeePageInfo.getTotal());
        return map;
    }
}
