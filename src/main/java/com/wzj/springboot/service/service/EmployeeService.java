package com.wzj.springboot.service.service;

import com.github.pagehelper.PageInfo;
import com.wzj.springboot.model.Employee;
import com.wzj.springboot.service.Service;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/05/17.
 */
public interface EmployeeService extends Service<Employee> {
    PageInfo<Map<String,Object>> paging(Map<String, Object> map);
    List<Long> idByDepartmentId(Map<String, Object> map);
    List<Long> idByJobId(Map<String, Object> map);
    List<Map<String,Object>> allByStatusForSelect(Map<String, Object> map);
    Map<String,Object> detail(Map<String, Object> map);
    PageInfo<Map<String,Object>> manageList(Map<String, Object> map);
    void deleteManage(Map<String, Object> map);
    List<Map<String,Object>> findRole(Map<String, Object> map);
    List<Map<String,Object>> findPermission(Map<String, Object> map);
    Integer countEmployeeOnline();
    Integer findByWechatPublicOpenid(String wechatPublicOpenid);
    String findJobNumberByWeChatPublicOpenid(String wechatPublicOpenid);
}
