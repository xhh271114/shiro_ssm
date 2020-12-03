package com.oracle.shiro;

import java.util.Date;
import java.util.List;


import com.oracle.pojo.Admins;
import com.oracle.service.AdminService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;



public class AuthenticationRealm extends AuthorizingRealm{


    @Autowired
    private AdminService adminService;
	//授权操作
    //根据一个用户身份牌 信息获取该用户的权限列表

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		Principal principal=(Principal) principals.fromRealm(getName()).iterator().next();
		if(principal!=null) {
			//获取身份牌信息标识进行查询

            List<String> permissionURL=this.adminService.getAdminPermissionURL(principal.getId());
			if(permissionURL!=null) {
				SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
				authorizationInfo.addStringPermissions(permissionURL);
				return authorizationInfo;
			}
		}
		return null;
	}

//	认证操作获取令牌信息，完成用户的认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		AuthenticationToKen authenticationToKen=(AuthenticationToKen) token;
		String loginName=authenticationToKen.getUsername();
		String password=new String(authenticationToKen.getPassword());
		if(!authenticationToKen.isValid()) {
			throw new UnsupportedTokenException();
		}
		if(loginName!=null&&!"".equals(loginName)) {
			Admins admins=this.adminService.getAdminByLoginName(loginName);
			if(admins==null) {
				throw new UnknownAccountException();
			}
			if(!admins.getPwd().equals(password)) {
			    //登录失败几次后，锁定一段时间，写这里
				throw new IncorrectCredentialsException();
			}
			//更新登录时间
			return new SimpleAuthenticationInfo(new Principal(admins.getId(),admins.getLoginname()), password, getName());

		}
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
