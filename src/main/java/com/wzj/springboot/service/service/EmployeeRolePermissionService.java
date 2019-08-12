package com.wzj.springboot.service.service;
import com.wzj.springboot.model.EmployeeRolePermission;
import com.wzj.springboot.service.Service;

import java.util.List;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/06/17.
 */
public interface EmployeeRolePermissionService extends Service<EmployeeRolePermission> {
    List<Long> listByRoleId(Map<String, Object> map);
}
