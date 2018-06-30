package com.mybatis.model;

public class TbAdminRole {
    private Integer adminRoleId;

    private Integer adminId;

    private Integer roleId;

    private TbRole tbRole;

    public TbRole getTbRole() {
        return tbRole;
    }

    public void setTbRole(TbRole tbRole) {
        this.tbRole = tbRole;
    }


    public Integer getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(Integer adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}