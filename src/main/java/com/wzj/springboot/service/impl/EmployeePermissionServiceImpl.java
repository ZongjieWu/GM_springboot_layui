package com.wzj.springboot.service.impl;

import com.github.pagehelper.PageInfo;
import com.wzj.springboot.dao.mapper.EmployeePermissionMapper;
import com.wzj.springboot.model.EmployeePermission;
import com.wzj.springboot.service.AbstractService;
import com.wzj.springboot.service.service.EmployeePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/06/15.
 */
@Service
public class EmployeePermissionServiceImpl extends AbstractService<EmployeePermission> implements EmployeePermissionService {

    @Autowired
    private EmployeePermissionMapper employeePermissionMapper;



    @Override
    public PageInfo<Map<String, Object>> paging(Map<String, Object> map) {
        return new PageInfo<>(employeePermissionMapper.paging(map));
    }

    @Override
    public List<Long> idList(Map<String, Object> map) {
        return employeePermissionMapper.idList(map);
    }


}
