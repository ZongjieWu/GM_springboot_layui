package com.wzj.springboot.dao.mapper;

import com.wzj.springboot.dao.MyMapper;
import com.wzj.springboot.model.EmployeeRolePermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeRolePermissionMapper extends MyMapper<EmployeeRolePermission> {
    List<Long> listByRoleId(Map<String, Object> map);
}