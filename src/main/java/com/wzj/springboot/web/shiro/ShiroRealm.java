package com.wzj.springboot.web.shiro;

import com.wzj.springboot.model.Employee;
import com.wzj.springboot.service.service.EmployeeService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.shiro.authc.AuthenticationInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/27 0027.
 */
@Component
public class ShiroRealm extends AuthorizingRealm {

    //后台用户
    @Autowired
    private EmployeeService employeeService;


     /*
    * @param authenticationToken 包含用户名及密码的令牌对象，是由shiro传递过来的参数
    * @return
    * @throws AuthenticationException
    * */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String phone = (String)authenticationToken.getPrincipal();
        String password = String.valueOf((char[])authenticationToken.getCredentials());
        Employee a=new Employee();
        a.setPhone(phone);
        a.setPwd(password);
        //判断是否为后台登陆
        Employee admin=employeeService.findOne(a);
        if(admin!=null){
            return new SimpleAuthenticationInfo(authenticationToken.getPrincipal(),authenticationToken.getCredentials(),"myReam");
        }
        return null;
    }
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String phone = (String) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Map<String,Object> findRoleMap=new HashMap<>();
        findRoleMap.put("phone",phone);
        List<Map<String,Object>> roleList = employeeService.findRole(findRoleMap);
        for (Map<String,Object> role : roleList) {
            if(role.get("name")==null){
            }else{
                authorizationInfo.addRole(role.get("name").toString());
            }
        }
        List<Map<String,Object>> permissionList = employeeService.findPermission(findRoleMap);
        for (Map<String,Object> permission : permissionList) {
            if(permission.get("descript")==null){
            }else{
                authorizationInfo.addStringPermission(permission.get("descript").toString());
            }
        }
        return authorizationInfo;
    }
}
