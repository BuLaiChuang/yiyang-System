<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>血糖信息</title>
</head>
<body>
 <div id="container" style="width: 600px;height:400px;"></div>
    <!-- 引入 highcharts.js -->
    <script src="http://cdn.hcharts.cn/highcharts/highcharts.js"></script>
    <script>
   
    	var XueTang="${XueTang}"
    var chart = Highcharts.chart('container', {
    	title: {
    		text: '血糖测量情况'
    	},
    	subtitle: {
    		text: '数据来源：移动穿戴设备'
    	},
    	yAxis: {
    		title:{  
    		       text:'血糖(mmol/L)'  
    		   }  
    		
    		
  	},
  	xAxis: {
  		
        labels: {
            enabled: false
        }           
    },
    
    	legend: {
    		layout: 'vertical',
    		align: 'right',
    		verticalAlign: 'middle'
    	},
    	plotOptions: {
    		series: {
    			label: {
    				connectorAllowed: true
    			},
    			//pointStart: 2010
    		}
    	},
    	
    	series: [{
    		name: '血糖值',
    		data: eval("[" +XueTang+ "]")
    	}],
    	
    	responsive: {
    		rules: [{
    			condition: {
    				maxWidth: 500
    			},
    			chartOptions: {
    				legend: {
    					layout: 'horizontal',
    					align: 'center',
    					verticalAlign: 'bottom'
    				}
    			}
    		}]
    	}
    });
       
    </script>
    
 <table class="table table-striped table-bordered table-hover table-condensed">
  <caption>血糖</caption>
  <thead>
    <tr>
    	
			<td>血糖</td>
			<td>血糖测量时间与上次用餐时间差</td>
			<td>测量时间</td>
			<td>操作</td>
    </tr>
  </thead>
  <tbody>
      <c:forEach var="row" items="${data}" >
			<tr>
			<td>${row.health_xt}</td>
			<td>${row.health_xt_time_cha}</td>
			<td>${row.health_xt_time}</td>
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