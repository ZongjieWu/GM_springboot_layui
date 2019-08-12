package com.wzj.springboot.dao.mapper;

import com.wzj.springboot.dao.MyMapper;
import com.wzj.springboot.model.EmployeePermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeePermissionMapper extends MyMapper<EmployeePermission> {
    List<Map<String,Object>> paging(Map<String, Object> map);
    List<Long> idList(Map<String, Object> map);
}