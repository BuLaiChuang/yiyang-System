<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
欢迎[${sessionScope.user.user_name }]访问
<a  href="oldRecord.jsp" target="lower_right">住院记录</a><br>
<a  href="index.jsp" target="lower_right">完善</a><br>
<button type="submit" id="perfect-button" >完善</button>
<button  id="old_record" onclick="tiaozhuan()">住院记录</button>
<a  href="homeDoctor.jsp" target="lower_right">家庭医生</a><br>
<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script>
$('#perfect-button').click(function (event) {
	event.preventDefault();
	$('form').fadeOut(500);
	$('.wrapper').addClass('form-success');
	window.location.href="index.jsp";
});
</script>
</body>
</html>