package com.oracle.shiro;

import java.io.Serializable;
/**
 *
 * 
 * 身份牌
 * 
 * 存储用户的 信息  
 * 当登录之后将用户的信息存放进这个类中  
 **/
public class Principal implements Serializable{
	private Integer id;
	private String loginName;
	
	public Principal() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Principal(Integer id, String loginName) {
		super();
		this.id = id;
		this.loginName = loginName;
	}
}
