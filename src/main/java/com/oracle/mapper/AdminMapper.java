package com.oracle.mapper;

import com.oracle.pojo.Admins;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AdminMapper {
//根据用户登录名获取一个用户对象
@Select("select * from admins where loginname=#{loginName}")
Admins selectAdminByLoginName(@Param("loginName") String loginName);

@Select("select p.permissionurl from permissions p \n" +
"\t left join role_permission rp on(p.id=rp.permissions)\n" +
"\t left join admin_role ar on(rp.roles=ar.roles) where ar.admins=#{adminId}")
List<String> selectAdminPermissionById(@Param("adminId") Integer adminId );

}
