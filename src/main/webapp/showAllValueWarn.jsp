<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>异常信息查询</title>
</head>
<body>

   <table class="table table-striped table-bordered table-hover table-condensed">
  <caption>异常信息</caption>
  <thead>
    <tr>
    	
			<td>预警项目</td>
			<td>预警内容</td>
			<td>预警时间</td>
			<td>处理状态</td>
			
			<td>操作</td>
    </tr>
  </thead>
  <tbody>
      
      <c:forEach var="row" items="${data}" >
			<tr>
			<td>${row.healthy_name}</td>
			<td><font color=red>${row.warn}</font></td>
			<td>${row.healthy_time}</td>
			<td><c:if test = "${row.healthy_state=='未处理'}"><font color=red>${row.healthy_state}</font></c:if>
			    <c:if test = "${row.healthy_state=='已处理'}"><font color=green>${row.healthy_state}</font></c:if>
			</td>
			<td><a href="javascript:removeUser(${row.healthy_id})">处理</a></td>
		</tr>
		</c:forEach>

  </tbody>
 
</table>
	<tr>
  <ul class="pagination">
	<li><a href="#">&laquo;</a></li>
	<li><a href="#">1</a></li>
	<li><a href="#">2</a></li>
	<li><a href="#">3</a></li>
	<li><a href="#">4</a></li>
	<li><a href="#">5</a></li>
	<li><a href="#">&raquo;</a></li>
    </ul>
   </tr>
</body>
<script type="text/javascript">
	function removeUser(id){
		if(confirm("问您确定处理次异常吗？")){
			window.location = "handleOneValueWarn.action?healthy_id="+id;
		}
	}
</script>






</body>
</html>