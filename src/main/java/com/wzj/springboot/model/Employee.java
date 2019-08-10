package com.wzj.springboot.model;

import javax.persistence.*;

public class Employee {
    /**
     * 员工
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 微信公众号openid
     */
    @Column(name = "wechat_public_openid")
    private String wechatPublicOpenid;

    /**
     * 工号
     */
    @Column(name = "job_number")
    private String jobNumber;

    /**
     * 部门表ID
     */
    @Column(name = "department_id")
    private String departmentId;

    /**
     * 职位表ID
     */
    @Column(name = "job_id")
    private Long jobId;

    /**
     * 员工角色id
     */
    @Column(name = "employee_role_id")
    private Long employeeRoleId;

    /**
     * 头像
     */
    @Column(name = "head_img")
    private String headImg;

    /**
     * 名称
     */
    private String name;

    /**
     * 电话
     */
    private String phone;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 联系地址
     */
    private String addr;

    /**
     * 身份证
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 学历0高中1专科2本科3硕士4博士
     */
    private Integer edu;

    /**
     * 籍贯
     */
    @Column(name = "native_place")
    private String nativePlace;

    /**
     * 民族
     */
    private String nation;

    /**
     * 性别0男1女
     */
    private Integer sex;

    /**
     * 0未婚1已婚
     */
    @Column(name = "marriage_status")
    private Integer marriageStatus;

    /**
     * 毕业院校
     */
    @Column(name = "graduate_school")
    private String graduateSchool;

    /**
     * 专业
     */
    private String major;

    /**
     * 毕业时间
     */
    @Column(name = "graduate_time")
    private String graduateTime;

    /**
     * 0实习员工1正式员工
     */
    @Column(name = "job_type")
    private Integer jobType;

    /**
     * 0正常状态1离职(冻结)
     */
    private Integer status;

    /**
     * 离职时间
     */
    @Column(name = "dimission_time")
    private String dimissionTime;

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
     * 获取员工
     *
     * @return id - 员工
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置员工
     *
     * @param id 员工
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取微信公众号openid
     *
     * @return wechat_public_openid - 微信公众号openid
     */
    public String getWechatPublicOpenid() {
        return wechatPublicOpenid;
    }

    /**
     * 设置微信公众号openid
     *
     * @param wechatPublicOpenid 微信公众号openid
     */
    public void setWechatPublicOpenid(String wechatPublicOpenid) {
        this.wechatPublicOpenid = wechatPublicOpenid;
    }

    /**
     * 获取工号
     *
     * @return job_number - 工号
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * 设置工号
     *
     * @param jobNumber 工号
     */
    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    /**
     * 获取部门表ID
     *
     * @return department_id - 部门表ID
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门表ID
     *
     * @param departmentId 部门表ID
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取职位表ID
     *
     * @return job_id - 职位表ID
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * 设置职位表ID
     *
     * @param jobId 职位表ID
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
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
     * 获取头像
     *
     * @return head_img - 头像
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置头像
     *
     * @param headImg 头像
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取密码
     *
     * @return pwd - 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码
     *
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取联系地址
     *
     * @return addr - 联系地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置联系地址
     *
     * @param addr 联系地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * 获取身份证
     *
     * @return id_card - 身份证
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证
     *
     * @param idCard 身份证
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取学历0高中1专科2本科3硕士4博士
     *
     * @return edu - 学历0高中1专科2本科3硕士4博士
     */
    public Integer getEdu() {
        return edu;
    }

    /**
     * 设置学历0高中1专科2本科3硕士4博士
     *
     * @param edu 学历0高中1专科2本科3硕士4博士
     */
    public void setEdu(Integer edu) {
        this.edu = edu;
    }

    /**
     * 获取籍贯
     *
     * @return native_place - 籍贯
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * 设置籍贯
     *
     * @param nativePlace 籍贯
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    /**
     * 获取民族
     *
     * @return nation - 民族
     */
    public String getNation() {
        return nation;
    }

    /**
     * 设置民族
     *
     * @param nation 民族
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * 获取性别0男1女
     *
     * @return sex - 性别0男1女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别0男1女
     *
     * @param sex 性别0男1女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取0未婚1已婚
     *
     * @return marriage_status - 0未婚1已婚
     */
    public Integer getMarriageStatus() {
        return marriageStatus;
    }

    /**
     * 设置0未婚1已婚
     *
     * @param marriageStatus 0未婚1已婚
     */
    public void setMarriageStatus(Integer marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    /**
     * 获取毕业院校
     *
     * @return graduate_school - 毕业院校
     */
    public String getGraduateSchool() {
        return graduateSchool;
    }

    /**
     * 设置毕业院校
     *
     * @param graduateSchool 毕业院校
     */
    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    /**
     * 获取专业
     *
     * @return major - 专业
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置专业
     *
     * @param major 专业
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * 获取毕业时间
     *
     * @return graduate_time - 毕业时间
     */
    public String getGraduateTime() {
        return graduateTime;
    }

    /**
     * 设置毕业时间
     *
     * @param graduateTime 毕业时间
     */
    public void setGraduateTime(String graduateTime) {
        this.graduateTime = graduateTime;
    }

    /**
     * 获取0实习员工1正式员工
     *
     * @return job_type - 0实习员工1正式员工
     */
    public Integer getJobType() {
        return jobType;
    }

    /**
     * 设置0实习员工1正式员工
     *
     * @param jobType 0实习员工1正式员工
     */
    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    /**
     * 获取0正常状态1离职(冻结)
     *
     * @return status - 0正常状态1离职(冻结)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0正常状态1离职(冻结)
     *
     * @param status 0正常状态1离职(冻结)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取离职时间
     *
     * @return dimission_time - 离职时间
     */
    public String getDimissionTime() {
        return dimissionTime;
    }

    /**
     * 设置离职时间
     *
     * @param dimissionTime 离职时间
     */
    public void setDimissionTime(String dimissionTime) {
        this.dimissionTime = dimissionTime;
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