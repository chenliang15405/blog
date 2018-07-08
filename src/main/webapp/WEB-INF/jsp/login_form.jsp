<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title></title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css" tppabs="${pageContext.request.contextPath}/static/css/style.css">
	<style>
	body{height:100%;background:#16a085;overflow:hidden;}
	canvas{z-index:-1;position:absolute;}
	</style>
	<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/verificationNumbers.js" tppabs="${pageContext.request.contextPath}/static/js/verificationNumbers.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/Particleground.js" tppabs="${pageContext.request.contextPath}/static/js/Particleground.js"></script>
    <%--  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/static/css/bootstrap.min.css"> --%>
	<script>
		$(document).ready(function() {
		  //粒子背景特效
		  $('body').particleground({
		    dotColor: '#5cbdaa',
		    lineColor: '#5cbdaa'
		  });
		});
		
	</script>
	</head>
	<body>
		<form action="<%=request.getContextPath() %>/login" method="post">
			<dl class="admin_login">
				 <dt>
				  <strong>Blog登录界面</strong>
				  <em>My Blog</em>
				 </dt>
			</dl>
		 <div style="margin:auto;margin-left:550px;">
		 	<div>
		 		<label style="font-family:cursive; font-weight: bold;font-size: 20px;">登录名：</label>
				<input  type="text" name="username" placeholder="账号" style="height:20px;"/>
		 	</div>
		 	<div style="padding-top:15px;">
		 		<label style="font-family:cursive; font-weight: bold;font-size: 20px;">密码：</label>
		 		&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="password" name="password" placeholder="密码" style="height:20px;"/>
		 	</div>
		 	<div style="padding-top:15px;margin-left:90px;">
		 		 <input type="submit" value="立即登陆" style="height:30px;width:100px;">
		 	</div>
			<div>
				<font color="red">${blogResult.msg }</font>
			</div>			
		</div>
		</form>
	</body>
</html>