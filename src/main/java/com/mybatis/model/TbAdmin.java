package com.mybatis.model;

import java.util.Date;
import java.util.List;

public class TbAdmin {
    private Integer adminId;

    private String adminName;

    private String adminPassword;

    private String encrypt;

    private String lastLoginIp;

    private Date lastLoginTime;

    private String email;

    private String realname;

    private Byte builtin;

    private Byte adminEnabled;

    private Byte adminStatus;

    private String adminDesc;

    private String adminUnit;

    private String autoAuditEnabled;

    private List<TbAdminRole>  tbAdminRoles;

    public List<TbAdminRole> getTbAdminRoles() {
        return tbAdminRoles;
    }

    public void setTbAdminRoles(List<TbAdminRole> tbAdminRoles) {
        this.tbAdminRoles = tbAdminRoles;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt == null ? null : encrypt.trim();
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Byte getBuiltin() {
        return builtin;
    }

    public void setBuiltin(Byte builtin) {
        this.builtin = builtin;
    }

    public Byte getAdminEnabled() {
        return adminEnabled;
    }

    public void setAdminEnabled(Byte adminEnabled) {
        this.adminEnabled = adminEnabled;
    }

    public Byte getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Byte adminStatus) {
        this.adminStatus = adminStatus;
    }

    public String getAdminDesc() {
        return adminDesc;
    }

    public void setAdminDesc(String adminDesc) {
        this.adminDesc = adminDesc == null ? null : adminDesc.trim();
    }

    public String getAdminUnit() {
        return adminUnit;
    }

    public void setAdminUnit(String adminUnit) {
        this.adminUnit = adminUnit == null ? null : adminUnit.trim();
    }

    public String getAutoAuditEnabled() {
        return autoAuditEnabled;
    }

    public void setAutoAuditEnabled(String autoAuditEnabled) {
        this.autoAuditEnabled = autoAuditEnabled == null ? null : autoAuditEnabled.trim();
    }
}