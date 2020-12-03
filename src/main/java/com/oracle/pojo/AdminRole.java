package com.oracle.pojo;
public class AdminRole {
    private Integer admins;
    private Integer roles;
    public AdminRole() {
        super();
    }
    public AdminRole(Integer admins,Integer roles) {
        super();
        this.admins = admins;
        this.roles = roles;
    }
    public Integer getAdmins() {
        return this.admins;
    }

    public void setAdmins(Integer admins) {
        this.admins = admins;
    }

    public Integer getRoles() {
        return this.roles;
    }

    public void setRoles(Integer roles) {
        this.roles = roles;
    }

}
