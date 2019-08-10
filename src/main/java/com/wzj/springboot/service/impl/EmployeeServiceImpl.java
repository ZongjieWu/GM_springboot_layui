package com.wzj.springboot.service.impl;

import com.wzj.springboot.dao.mapper.EmployeeMapper;
import com.wzj.springboot.model.Employee;
import com.wzj.springboot.service.service.EmployeeService;
import com.wzj.springboot.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by Zongjie Wu on 2019/08/10.
 */
@Service
public class EmployeeServiceImpl extends AbstractService<Employee> implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

}
