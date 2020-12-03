<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理中心</title>  
    <link rel="stylesheet" href="${root}/resources/css/pintuer.css">
    <link rel="stylesheet" href="${root}/resources/css/admin.css">
    <script src="${root}/resources/js/jquery.js"></script>  
</head>
<body>
	<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />后台管理中心</h1>
  </div>
  <div class="head-l"><a class="button button-little bg-green" href="http://127.0.0.1:8080/shop-web" target="_blank"><span class="icon-home"></span> 前台首页</a> &nbsp;&nbsp;<a href="##" class="button button-little bg-blue"><span class="icon-wrench"></span> 清除缓存</a> &nbsp;&nbsp;<a class="button button-little bg-red" href="../logout.jsp"><span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
  <h2><span class="icon-user"></span>基本设置</h2>
  
    <h2><span class="icon-pencil-square-o"></span>新闻管理</h2>
  <ul>
  <shiro:hasPermission name="admin:news:list">
    <li><a href="${root}/admin/news/list" target="right"><span class="icon-caret-right"></span>浏览新闻</a></li>
   </shiro:hasPermission> 
   <shiro:hasPermission name="admin:news:add">
    <li><a href="${root}/admin/news/edit" target="right"><span class="icon-caret-right"></span>添加新闻</a></li>
   </shiro:hasPermission>
  </ul>
   
   
   
    <h2><span class="icon-pencil-square-o"></span>系统管理</h2>
  <ul>
  	<shiro:hasPermission name="admin:role:list">
    <li><a href="${root}/admin/role/list" target="right"><span class="icon-caret-right"></span>浏览角色</a></li>
    </shiro:hasPermission>
    <shiro:hasPermission name="admin:role:add">
    <li><a href="${root}/admin/admin/list" target="right"><span class="icon-caret-right"></span>添加角色</a></li>
    </shiro:hasPermission>
  </ul>
   
</div>
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>
<ul class="bread">
  <li><a href="{:U('Index/info')}" target="right" class="icon-home"> 首页</a></li>
  <li><a href="##" id="a_leader_txt">网站信息</a></li>
  <li><b>当前语言：</b><span style="color:red;">中文</php></span>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;切换语言：<a href="##">中文</a> &nbsp;&nbsp;<a href="##">英文</a> </li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="info.html" name="right" width="100%" height="100%"></iframe>
</div>
<div style="text-align:center;">
</div>
</body>
</html>