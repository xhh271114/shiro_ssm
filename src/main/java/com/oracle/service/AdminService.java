package com.oracle.service;

import com.oracle.pojo.Admins;

import java.util.List;

public interface AdminService {


    public Admins getAdminByLoginName(String loginName);

    public List<String> getAdminPermissionURL(Integer adminId);

}
