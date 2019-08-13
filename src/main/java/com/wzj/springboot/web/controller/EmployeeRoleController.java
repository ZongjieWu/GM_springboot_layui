package com.wzj.springboot.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzj.springboot.enums.Result;
import com.wzj.springboot.model.EmployeeRole;
import com.wzj.springboot.service.service.EmployeeRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/06/15.
 */
@RestController
@RequestMapping("/role/")
public class EmployeeRoleController {

    @Autowired
    private EmployeeRoleService employeeRoleService;

    @PostMapping("add")
    public Map<String,Object> add(EmployeeRole employeeRole) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        employeeRole.setAddTime(simpleDateFormat.format(new Date()));
        employeeRole.setModifyTime(simpleDateFormat.format(new Date()));
        employeeRoleService.save(employeeRole);
        return Result.retrunSucess();
    }

    @PostMapping("delete")
    public Map<String,Object> delete(@RequestParam Long id) {
	    employeeRoleService.deleteById(id);
	    return Result.retrunSucess();
    }

    @PostMapping("update")
    public Map<String,Object> update(EmployeeRole employeeRole) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        employeeRole.setModifyTime(simpleDateFormat.format(new Date()));
	    employeeRoleService.update(employeeRole);
	    return Result.retrunSucess();
    }

    @PostMapping("detail")
    public Map<String,Object> detail(@RequestParam Long id) {
        EmployeeRole employeeRole = employeeRoleService.findById(id);
        return Result.retrunSucessMsgData(employeeRole);
    }

    @PostMapping("all")
    public Map<String,Object> all() {
        List<EmployeeRole> roleList = employeeRoleService.findAll();
        return Result.retrunSucessMsgData(roleList);
    }


    @PostMapping("paging")
    public Map<String,Object> paging(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit, String keywords) {
        Example example=new Example(EmployeeRole.class);
        Example.Criteria criteria=example.createCriteria();
        if(keywords==null||keywords.equals("")){
        }else{
            criteria.andCondition(" name like '%"+keywords+"%'");
        }
        PageHelper.startPage(page, limit);
        PageInfo<EmployeeRole> employeeRolePageInfo = employeeRoleService.queryPageListByWhereExample(" id desc",page,limit,example);
        Map<String,Object> map=Result.retrunSucessMsgData(employeeRolePageInfo.getList());
        map.put("count",employeeRolePageInfo.getTotal());
        return map;
    }
}
