package com.wzj.springboot.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzj.springboot.enums.Result;
import com.wzj.springboot.model.EmployeePermission;
import com.wzj.springboot.model.EmployeeRolePermission;
import com.wzj.springboot.service.service.EmployeePermissionService;
import com.wzj.springboot.service.service.EmployeeRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/06/15.
 */
@RestController
@RequestMapping("/permission/")
public class EmployeePermissionController {

    @Autowired
    private EmployeePermissionService employeePermissionService;
    @Autowired
    private EmployeeRolePermissionService employeeRolePermissionService;

    @PostMapping("add")
    public Map<String,Object> add(EmployeePermission employeePermission) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        employeePermission.setAddTime(simpleDateFormat.format(new Date()));
        employeePermission.setModifyTime(simpleDateFormat.format(new Date()));
        employeePermissionService.save(employeePermission);
        return Result.retrunSucess();
    }

    @PostMapping("delete")
    public Map<String,Object> delete(@RequestParam Long id) {
	    employeePermissionService.deleteById(id);
	    return Result.retrunSucess();
    }

    @PostMapping("update")
    public Map<String,Object> update(EmployeePermission employeePermission) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        employeePermission.setModifyTime(simpleDateFormat.format(new Date()));
	    employeePermissionService.update(employeePermission);
	    return Result.retrunSucess();
    }

    @PostMapping("detail")
    public Map<String,Object> detail(@RequestParam Long id) {
        EmployeePermission employeePermission = employeePermissionService.findById(id);
        return Result.retrunSucessMsgData(employeePermission);
    }


    @PostMapping("allParent")
    public Map<String,Object> allParent(Long parentId) {
        EmployeePermission ep=new EmployeePermission();
        ep.setParentId(parentId);
        List<EmployeePermission> epList=employeePermissionService.queryListByWhere(ep);
        return Result.retrunSucessMsgData(epList);
    }


    @PostMapping("paging")
    public Map<String,Object> paging(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit, Long parentId, String keywords) {
        Map<String,Object> paramMap=new HashMap<>();
        if(keywords==null||keywords.equals("")){
        }else{
            paramMap.put("keywords",keywords);
        }
        paramMap.put("parentId",parentId);
        PageHelper.startPage(page, limit);
        PageInfo<Map<String,Object>> employeePermissionPageInfo = employeePermissionService.paging(paramMap);
        Map<String,Object> map=Result.retrunSucessMsgData(employeePermissionPageInfo.getList());
        map.put("count",employeePermissionPageInfo.getTotal());
        return map;
    }

    @PostMapping("listByRoleId")
    public Map<String,Object> listByRoleId(Long roleId){
        List<EmployeePermission> permissionList=employeePermissionService.findAll();
        Map<String,Object> listByRoleIdMap=new HashMap<>();
        listByRoleIdMap.put("roleId",roleId);
        List<Long> permissionIdList=employeeRolePermissionService.listByRoleId(listByRoleIdMap);


        Map<String,Object> map=new HashMap<>();
        Map<String,Object> m=new HashMap<>();


        m.put("list",permissionList);
        m.put("checkedId",permissionIdList.toArray());
        m.put("roleId",roleId);
        map.put("code",0);
        map.put("msg","获取成功");
        map.put("data",m);

        return map;
    }


    @RequestMapping("updatePermission")
    @ResponseBody
    private Map<String,Object> updatePermission(Long rid, String authids){

        String[] authidsArr=authids.split(",");
        System.out.println("rid==="+rid);
        System.out.println("authids===="+authids);
        /*
        * 先删除再添加
        * **/
        EmployeeRolePermission erp=new EmployeeRolePermission();
        erp.setEmployeeRoleId(rid);
        try {
            synchronized (EmployeePermission.class){
                employeeRolePermissionService.deleteByWhere(erp);
            }
            if(authids.trim().length()>0){
                EmployeeRolePermission employeeRolePermission;
                for(int i=0;i<authidsArr.length;i++){
                    employeeRolePermission=new EmployeeRolePermission();
                    employeeRolePermission.setEmployeeRoleId(rid);
                    employeeRolePermission.setEmployeePermissionId(Long.parseLong(authidsArr[i]));
                    employeeRolePermissionService.save(employeeRolePermission);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return Result.retrunSucess();
    }

}
