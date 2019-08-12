package com.wzj.springboot.model;

import javax.persistence.*;

@Table(name = "employee_role_permission")
public class EmployeeRolePermission {
    /**
     * 员工角色权限id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 员工角色id
     */
    @Column(name = "employee_role_id")
    private Long employeeRoleId;

    /**
     * 员工权限id
     */
    @Column(name = "employee_permission_id")
    private Long employeePermissionId;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private String addTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private String modifyTime;

    /**
     * 获取员工角色权限id
     *
     * @return id - 员工角色权限id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置员工角色权限id
     *
     * @param id 员工角色权限id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取员工角色id
     *
     * @return employee_role_id - 员工角色id
     */
    public Long getEmployeeRoleId() {
        return employeeRoleId;
    }

    /**
     * 设置员工角色id
     *
     * @param employeeRoleId 员工角色id
     */
    public void setEmployeeRoleId(Long employeeRoleId) {
        this.employeeRoleId = employeeRoleId;
    }

    /**
     * 获取员工权限id
     *
     * @return employee_permission_id - 员工权限id
     */
    public Long getEmployeePermissionId() {
        return employeePermissionId;
    }

    /**
     * 设置员工权限id
     *
     * @param employeePermissionId 员工权限id
     */
    public void setEmployeePermissionId(Long employeePermissionId) {
        this.employeePermissionId = employeePermissionId;
    }

    /**
     * 获取添加时间
     *
     * @return add_time - 添加时间
     */
    public String getAddTime() {
        return addTime;
    }

    /**
     * 设置添加时间
     *
     * @param addTime 添加时间
     */
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}