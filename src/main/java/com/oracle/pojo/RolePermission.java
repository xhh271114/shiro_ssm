package com.oracle.pojo;
public class RolePermission {
    private Integer permissions;
    private Integer roles;
    public RolePermission() {
        super();
    }
    public RolePermission(Integer permissions,Integer roles) {
        super();
        this.permissions = permissions;
        this.roles = roles;
    }
    public Integer getPermissions() {
        return this.permissions;
    }

    public void setPermissions(Integer permissions) {
        this.permissions = permissions;
    }

    public Integer getRoles() {
        return this.roles;
    }

    public void setRoles(Integer roles) {
        this.roles = roles;
    }

}
