package com.wzj.springboot.entity;

import javax.persistence.*;

@Table(name = "remit_record")
public class RemitRecord {
    /**
     * 打款记录
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 企业id
     */
    @Column(name = "enterprise_id")
    private Long enterpriseId;

    /**
     * 企业logo
     */
    @Column(name = "enterprise_logo")
    private String enterpriseLogo;

    /**
     * 企业名称
     */
    @Column(name = "enterprise_name")
    private String enterpriseName;

    /**
     * 企业账号
     */
    @Column(name = "enterprise_phone")
    private String enterprisePhone;

    /**
     * 打款凭证
     */
    @Column(name = "remit_authentication")
    private String remitAuthentication;

    /**
     * 服务类型
     */
    @Column(name = "service_type")
    private String serviceType;

    /**
     * 0未审核1审核通过2审核不通过
     */
    private Integer status;

    /**
     * 审核时间
     */
    @Column(name = "authentication_time")
    private String authenticationTime;

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
     * 获取打款记录
     *
     * @return id - 打款记录
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置打款记录
     *
     * @param id 打款记录
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取企业id
     *
     * @return enterprise_id - 企业id
     */
    public Long getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * 设置企业id
     *
     * @param enterpriseId 企业id
     */
    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * 获取企业logo
     *
     * @return enterprise_logo - 企业logo
     */
    public String getEnterpriseLogo() {
        return enterpriseLogo;
    }

    /**
     * 设置企业logo
     *
     * @param enterpriseLogo 企业logo
     */
    public void setEnterpriseLogo(String enterpriseLogo) {
        this.enterpriseLogo = enterpriseLogo;
    }

    /**
     * 获取企业名称
     *
     * @return enterprise_name - 企业名称
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * 设置企业名称
     *
     * @param enterpriseName 企业名称
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    /**
     * 获取企业账号
     *
     * @return enterprise_phone - 企业账号
     */
    public String getEnterprisePhone() {
        return enterprisePhone;
    }

    /**
     * 设置企业账号
     *
     * @param enterprisePhone 企业账号
     */
    public void setEnterprisePhone(String enterprisePhone) {
        this.enterprisePhone = enterprisePhone;
    }

    /**
     * 获取打款凭证
     *
     * @return remit_authentication - 打款凭证
     */
    public String getRemitAuthentication() {
        return remitAuthentication;
    }

    /**
     * 设置打款凭证
     *
     * @param remitAuthentication 打款凭证
     */
    public void setRemitAuthentication(String remitAuthentication) {
        this.remitAuthentication = remitAuthentication;
    }

    /**
     * 获取服务类型
     *
     * @return service_type - 服务类型
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * 设置服务类型
     *
     * @param serviceType 服务类型
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * 获取0未审核1审核通过2审核不通过
     *
     * @return status - 0未审核1审核通过2审核不通过
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0未审核1审核通过2审核不通过
     *
     * @param status 0未审核1审核通过2审核不通过
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取审核时间
     *
     * @return authentication_time - 审核时间
     */
    public String getAuthenticationTime() {
        return authenticationTime;
    }

    /**
     * 设置审核时间
     *
     * @param authenticationTime 审核时间
     */
    public void setAuthenticationTime(String authenticationTime) {
        this.authenticationTime = authenticationTime;
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