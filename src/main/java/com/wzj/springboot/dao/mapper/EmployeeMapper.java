package com.wzj.springboot.dao.mapper;

import com.wzj.springboot.dao.MyMapper;
import com.wzj.springboot.model.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends MyMapper<Employee> {
}