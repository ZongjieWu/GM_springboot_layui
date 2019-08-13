package com.wzj.springboot.service.impl;

import com.github.pagehelper.PageInfo;
import com.wzj.springboot.dao.mapper.EmployeeMapper;
import com.wzj.springboot.model.Employee;
import com.wzj.springboot.service.AbstractService;
import com.wzj.springboot.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/05/17.
 */
@Service
public class EmployeeServiceImpl extends AbstractService<Employee> implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public PageInfo<Map<String, Object>> paging(Map<String, Object> map) {
        List<Map<String,Object>> employeeList=employeeMapper.paging(map);
        return new PageInfo<>(employeeList);
    }

    @Override
    public List<Long> idByDepartmentId(Map<String, Object> map) {
        return employeeMapper.idByDepartmentId(map);
    }

    @Override
    public List<Long> idByJobId(Map<String, Object> map) {
        return employeeMapper.idByJobId(map);
    }

    @Override
    public List<Map<String, Object>> allByStatusForSelect(Map<String, Object> map) {
        return employeeMapper.allByStatusForSelect(map);
    }

    @Override
    public Map<String, Object> detail(Map<String, Object> map) {
        return employeeMapper.detail(map);
    }

    @Override
    public PageInfo<Map<String,Object>> manageList(Map<String, Object> map) {
        return new PageInfo<Map<String,Object>>(employeeMapper.manageList(map));
    }

    @Override
    public void deleteManage(Map<String, Object> map) {
        employeeMapper.deleteManage(map);
    }

    @Override
    public List<Map<String, Object>> findRole(Map<String, Object> map) {
        return employeeMapper.findRole(map);
    }

    @Override
    public List<Map<String, Object>> findPermission(Map<String, Object> map) {
        return employeeMapper.findPermission(map);
    }

    @Override
    public Integer countEmployeeOnline() {
        return employeeMapper.countEmployeeOnline();
    }

    @Override
    public Integer findByWechatPublicOpenid(String wechatPublicOpenid) {
        return employeeMapper.findByWechatPublicOpenid(wechatPublicOpenid);
    }

    @Override
    public String findJobNumberByWeChatPublicOpenid(String wechatPublicOpenid) {
        return employeeMapper.findJobNumberByWeChatPublicOpenid(wechatPublicOpenid);
    }
}
