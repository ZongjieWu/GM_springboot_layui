package com.wzj.springboot.web.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/permission")
public class PermissionCatalog {

    @GetMapping("/jumpPaging")
    public String jumpConsole(HttpServletRequest request){
        request.setAttribute("parentId",0);
        return "/admin/permission/paging";
    }

    /**
     *跳转至部门分页列表
     * */
    @GetMapping("/jumpDetail")
    public String jumpDetail(HttpServletRequest request,Long id){
        request.setAttribute("parentId",id);
        return "/admin/permission/paging";
    }

    @GetMapping("jumpUpdatePermission")
    public String jumpUpdatePermission(){
        return "/admin/permission/updatePermission";
    }


}
