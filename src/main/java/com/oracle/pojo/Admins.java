package com.oracle.pojo;
public class Admins {
    private Integer id;
    private String loginname;
    private String pwd;
    private java.util.Date logindate;
    private Integer failcount;
    private java.util.Date lockexpiredate;
    private Integer status;
    public Admins() {
        super();
    }
    public Admins(Integer id,String loginname,String pwd,java.util.Date logindate,Integer failcount,java.util.Date lockexpiredate,Integer status) {
        super();
        this.id = id;
        this.loginname = loginname;
        this.pwd = pwd;
        this.logindate = logindate;
        this.failcount = failcount;
        this.lockexpiredate = lockexpiredate;
        this.status = status;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return this.loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public java.util.Date getLogindate() {
        return this.logindate;
    }

    public void setLogindate(java.util.Date logindate) {
        this.logindate = logindate;
    }

    public Integer getFailcount() {
        return this.failcount;
    }

    public void setFailcount(Integer failcount) {
        this.failcount = failcount;
    }

    public java.util.Date getLockexpiredate() {
        return this.lockexpiredate;
    }

    public void setLockexpiredate(java.util.Date lockexpiredate) {
        this.lockexpiredate = lockexpiredate;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
