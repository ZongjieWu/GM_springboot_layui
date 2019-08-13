package com.wzj.springboot.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzj.springboot.enums.Result;
import com.wzj.springboot.model.Employee;
import com.wzj.springboot.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/05/17.
 */
@RestController
@RequestMapping("/employee/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("add")
    public Map<String,Object> add(Employee employee) {
        if(employee.getDepartmentId()==null){
        } else if(employee.getDepartmentId()!=null){
            //处理部门后台带，的数据
            String deptStr="";
            String[] deptArr=employee.getDepartmentId().split(",");
            for(int i=0;i<deptArr.length;i++){
                if(i==deptArr.length-1){
                    deptStr+=deptArr[i];
                }else{
                    deptStr+=deptArr[i]+",";
                }
            }
            employee.setDepartmentId(deptStr);
        }


        Employee e1=employeeService.findBy("phone",employee.getPhone());
        Employee e2=employeeService.findBy("jobNumber",employee.getJobNumber());
        if(e1==null||e2==null){
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            employee.setAddTime(simpleDateFormat.format(new Date()));
            employee.setModifyTime(simpleDateFormat.format(new Date()));
            employeeService.save(employee);
        }else{
            return Result.retrunFailMsg("工号和电话是唯一的");
        }
        return Result.retrunSucess();
    }

    @PostMapping("delete")
    public Map<String,Object> delete(@RequestParam Long id) {
	    employeeService.deleteById(id);
	    return Result.retrunSucess();
    }

    @PostMapping("delManage")
    public Map<String,Object> delManage(@RequestParam Long id) {
        Map<String,Object> pmap=new HashMap<>();
        pmap.put("id",id);
        employeeService.deleteManage(pmap);
        return Result.retrunSucess();
    }


    @PostMapping("update")
    public Map<String,Object> update(Employee employee) {
        if(employee.getDepartmentId()==null){
        } else if(employee.getDepartmentId()!=null){
            //处理部门后台带，的数据
            String deptStr="";
            String[] deptArr=employee.getDepartmentId().split(",");
            for(int i=0;i<deptArr.length;i++){
                if(i==deptArr.length-1){
                    deptStr+=deptArr[i];
                }else{
                    deptStr+=deptArr[i]+",";
                }
            }
            employee.setDepartmentId(deptStr);
        }

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        employee.setModifyTime(simpleDateFormat.format(new Date()));
	    employeeService.update(employee);
	    return Result.retrunSucess();
    }

    @RequestMapping("updatePassword")
    public Map<String,Object> updatePassword(Long id,String oldPwd,String newPwd) {
        Employee admin=employeeService.findById(id);
        if(!admin.getPwd().equals(oldPwd)){
            return Result.retrunFailMsg("旧密码不正确");
        }
        Employee a=new Employee();
        a.setId(admin.getId());
        a.setPwd(newPwd);
        employeeService.update(a);
        return Result.retrunSucess();
    }

    @PostMapping("frost")
    public Map<String,Object> frost(Employee employee) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        employee.setModifyTime(simpleDateFormat.format(new Date()));
        employee.setDimissionTime(simpleDateFormat.format(new Date()));
        employeeService.update(employee);
        return Result.retrunSucess();
    }
    @PostMapping("batchFrost")
    public Map<String,Object> batchFrost(String ids,Integer status) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Employee employee=null;
        String[] idsArr=ids.split(",");
        for(int i=0,count=idsArr.length;i<count;i++){
            employee=new Employee();
            employee.setId(Long.valueOf(idsArr[i]));
            employee.setModifyTime(simpleDateFormat.format(new Date()));
            employee.setDimissionTime(simpleDateFormat.format(new Date()));
            employee.setStatus(status);
            employeeService.update(employee);
        }
        return Result.retrunSucess();
    }

    @PostMapping("detail")
    public Map<String,Object> detail(@RequestParam Long id) {
        Employee employee = employeeService.findById(id);
        return Result.retrunSucessMsgData(employee);
    }

    @PostMapping("allByStatusForSelect")
    public Map<String,Object> allByStatus(Integer status) {
        Map<String,Object> paramMap=new HashMap<>();
        if(status==null){
        }else{
            paramMap.put("status",status);
        }
        List<Map<String,Object>> mapList=employeeService.allByStatusForSelect(paramMap);
        return Result.retrunSucessMsgData(mapList);
    }



    @PostMapping("managePaging")
    public Map<String,Object> managePaging(Integer page,Integer limit,String keywords){
        Map<String,Object> paramMap=new HashMap<>();
        if(keywords==null||keywords.equals("")){
        }else{
            paramMap.put("keywords",keywords);
        }
        PageHelper.orderBy(" e.id desc");
        PageHelper.startPage(page,limit);
        PageInfo<Map<String,Object>> employeePageInfo=employeeService.manageList(paramMap);

        Map<String,Object> map=Result.retrunSucessMsgData(employeePageInfo.getList());
        map.put("count",employeePageInfo.getTotal());
        return map;
    }

}
