package com.wzj.springboot.service.impl;

import com.wzj.springboot.dao.mapper.EmployeeRolePermissionMapper;
import com.wzj.springboot.model.EmployeeRolePermission;
import com.wzj.springboot.service.AbstractService;
import com.wzj.springboot.service.service.EmployeeRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/06/17.
 */
@Service
public class EmployeeRolePermissionServiceImpl extends AbstractService<EmployeeRolePermission> implements EmployeeRolePermissionService {

    @Autowired
    private EmployeeRolePermissionMapper employeeRolePermissionMapper;

    @Override
    public List<Long> listByRoleId(Map<String, Object> map) {
        return employeeRolePermissionMapper.listByRoleId(map);
    }


}
