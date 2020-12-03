package com.oracle.serviceImpl;

import com.oracle.mapper.AdminMapper;
import com.oracle.pojo.Admins;
import com.oracle.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    public Admins getAdminByLoginName(String loginName) {
        return adminMapper.selectAdminByLoginName(loginName);
    }

    public List<String> getAdminPermissionURL(Integer adminId) {
        return adminMapper.selectAdminPermissionById(adminId);
    }
}
