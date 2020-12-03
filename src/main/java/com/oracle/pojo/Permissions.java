package com.oracle.pojo;
public class Permissions {
    private Integer id;
    private String permissionname;
    private String permissiondesc;
    private String permissionurl;
    public Permissions() {
        super();
    }
    public Permissions(Integer id,String permissionname,String permissiondesc,String permissionurl) {
        super();
        this.id = id;
        this.permissionname = permissionname;
        this.permissiondesc = permissiondesc;
        this.permissionurl = permissionurl;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionname() {
        return this.permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public String getPermissiondesc() {
        return this.permissiondesc;
    }

    public void setPermissiondesc(String permissiondesc) {
        this.permissiondesc = permissiondesc;
    }

    public String getPermissionurl() {
        return this.permissionurl;
    }

    public void setPermissionurl(String permissionurl) {
        this.permissionurl = permissionurl;
    }

}
