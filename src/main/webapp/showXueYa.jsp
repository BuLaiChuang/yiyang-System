<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>血压信息</title>


</head>
<body>
 <div id="container" style="width: 600px;height:400px;"></div>
    <!-- 引入 highcharts.js -->
    <script src="http://cdn.hcharts.cn/highcharts/highcharts.js"></script>
    <script>
    var XueYambtime="${XueYambtime}"
    	var XueYasz="${XueYasz}"
    	var XueYass="${XueYass}"
    	var XueYamb="${XueYamb}"
    		var chart = Highcharts.chart('container',{
    			chart: {
    				type: 'column'
    			},
    			title: {
    				text: '血压各值统计'
    			},
    			subtitle: {
    				text: '移动穿戴设备'
    			},
    			xAxis: {
    				categories:eval("[" +XueYambtime+ "]"),
    				crosshair: true
    			},
    			yAxis: {
    				min: 0,
    				title: {
    					text: ''
    				}
    			},
    			tooltip: {
    				// head + 每个 point + footer 拼接成完整的 table
    				headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
    				pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
    				'<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
    				footerFormat: '</table>',
    				shared: true,
    				useHTML: true
    			},
    			plotOptions: {
    				column: {
    					borderWidth: 0
    				}
    			},
    			series: [{
    				name: '舒张压(mmHg)',
    				data:eval("[" +XueYasz+ "]")
    			}, {
    				name: '收缩压(mmHg)',
    				data:eval("[" +XueYass+ "]")
    			}, {
    				name: '脉搏(次/分)',
    				data:eval("[" +XueYamb+ "]")
    			}]
    		});
    </script>
   <table class="table table-striped table-bordered table-hover table-condensed">
  <caption>血压详情</caption>
  <thead>
    <tr>
    	
			<td>舒张压</td>
			<td>收缩压</td>
			<td>脉搏</td>
			<td>测量时间</td>
			<td>操作</td>
    </tr>
  </thead>
  <tbody>
      <c:forEach var="row" items="${data}" >
			<tr>
			<td>${row.health_sz}</td>
			<td>${row.health_ss}</td>
			<td>${row.health_mb}</td>
			<td>${row.health_mb_time}</td>
			<td><a href="javascript:removeUser(${row.health_id})">删除</a></td>
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
		if(confirm("请问你真的要删除吗？")){
			window.location = "removeUser.action?id="+id;
		}
	}
</script>
</html>