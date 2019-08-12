package com.wzj.springboot.service.impl;

import com.wzj.springboot.dao.mapper.EmployeeRoleMapper;
import com.wzj.springboot.model.EmployeeRole;
import com.wzj.springboot.service.AbstractService;
import com.wzj.springboot.service.service.EmployeeRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Created by Zongjie Wu on 2019/06/15.
 */
@Service
public class EmployeeRoleServiceImpl extends AbstractService<EmployeeRole> implements EmployeeRoleService {

    @Autowired
    private EmployeeRoleMapper employeeRoleMapper;

}
