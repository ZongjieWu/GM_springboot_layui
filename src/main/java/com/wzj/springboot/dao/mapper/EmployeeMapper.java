package com.wzj.springboot.dao.mapper;

import com.wzj.springboot.dao.MyMapper;
import com.wzj.springboot.model.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeMapper extends MyMapper<Employee> {
    List<Map<String,Object>> paging(Map<String, Object> map);
    List<Long> idByDepartmentId(Map<String, Object> map);
    List<Long> idByJobId(Map<String, Object> map);
    List<Map<String,Object>> allByStatusForSelect(Map<String, Object> map);
    Map<String,Object> detail(Map<String, Object> map);
    List<Map<String,Object>> manageList(Map<String, Object> map);
    void deleteManage(Map<String, Object> map);
    List<Map<String,Object>> findRole(Map<String, Object> map);
    List<Map<String,Object>> findPermission(Map<String, Object> map);
    Integer countEmployeeOnline();
    Integer findByWechatPublicOpenid(String wechatPublicOpenid);
    String findJobNumberByWeChatPublicOpenid(String wechatPublicOpenid);
}