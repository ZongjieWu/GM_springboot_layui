package com.wzj.springboot.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzj.springboot.enums.Result;
import com.wzj.springboot.model.EmployeeRolePermission;
import com.wzj.springboot.service.service.EmployeeRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/06/17.
 */
@RestController
@RequestMapping("/employeeRolePermission/")
public class EmployeeRolePermissionController {

    @Autowired
    private EmployeeRolePermissionService employeeRolePermissionService;

    @PostMapping("add")
    public Map<String,Object> add(EmployeeRolePermission employeeRolePermission) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        employeeRolePermission.setAddTime(simpleDateFormat.format(new Date()));
        employeeRolePermission.setModifyTime(simpleDateFormat.format(new Date()));
        employeeRolePermissionService.save(employeeRolePermission);
        return Result.retrunSucess();
    }

    @PostMapping("delete")
    public Map<String,Object> delete(@RequestParam Long id) {
	    employeeRolePermissionService.deleteById(id);
	    return Result.retrunSucess();
    }

    @PostMapping("update")
    public Map<String,Object> update(EmployeeRolePermission employeeRolePermission) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        employeeRolePermission.setModifyTime(simpleDateFormat.format(new Date()));
	    employeeRolePermissionService.update(employeeRolePermission);
	    return Result.retrunSucess();
    }

    @PostMapping("detail")
    public Map<String,Object> detail(@RequestParam Long id) {
        EmployeeRolePermission employeeRolePermission = employeeRolePermissionService.findById(id);
        return Result.retrunSucessMsgData(employeeRolePermission);
    }

    @PostMapping("paging")
    public Map<String,Object> paging(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        Example example=new Example(EmployeeRolePermission.class);
        Example.Criteria criteria=example.createCriteria();
        PageHelper.startPage(page, limit);
        PageInfo<EmployeeRolePermission> employeeRolePermissionPageInfo = employeeRolePermissionService.queryPageListByWhereExample(" id desc",page,limit,example);
        Map<String,Object> map=Result.retrunSucessMsgData(employeeRolePermissionPageInfo.getList());
        map.put("count",employeeRolePermissionPageInfo.getTotal());
        return map;
    }
}
