package com.wzj.springboot.service.service;
import com.github.pagehelper.PageInfo;
import com.wzj.springboot.model.EmployeePermission;
import com.wzj.springboot.service.Service;

import java.util.List;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/06/15.
 */
public interface EmployeePermissionService extends Service<EmployeePermission> {
    PageInfo<Map<String,Object>> paging(Map<String, Object> map);
    List<Long> idList(Map<String, Object> map);
}
