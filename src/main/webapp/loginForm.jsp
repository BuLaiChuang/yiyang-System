<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>登录</title>

<link rel="stylesheet" href="jiaoben3721/css/style.css">

<body>

<div class="login-container">
	<h1>医养结合信息服务平台</h1>
	
	<div class="connect">
		<p>您身边的医疗养护专家</p>
	</div>
	
	<form action="login.action" method="post" id="loginForm">
		<div>
			<input type="text" name="user_name" class="user_name" placeholder="用户名" autocomplete="off"/>
		</div>
		<div>
			<input type="password" name="user_password" class="user_password" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<button id="submit" type="submit">登录</button>
	</form>

	<a href="register.jsp">
		<button type="button" class="register-tis">注册</button>
	</a>

</div>

<script src="jiaoben3721/js/jquery.min.js"></script>
<script src="jiaoben3721/js/common.js"></script>
<!--背景图片自动更换-->
<script src="jiaoben3721/js/supersized.3.2.7.min.js"></script>
<script src="jiaoben3721/js/supersized-init.js"></script>
<!--表单验证-->
<script src="jiaoben3721/js/jquery.validate.min.js?var1.14.0"></script>

<script src="jiaoben3721/js/jquery-2.1.1.min.js" type="text/javascript"></script>

</body>
</html>
