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
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>健康阈值查询</title>
</head>
<body>

<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">健康预警信息设置</div>
						<!-- /.panel-heading -->
						<table class="table table-striped table-bordered table-hover table-condensed">
							<thead>
						    <tr>
						    	
									<td>预警项目</td>
									<td>最大值</td>
									<td>最小值</td>
									<td>操作</td>
						    </tr>
							</thead>
							<tbody>
							<c:forEach var="row" items="${data}" >
								<tr>
								<td>${row.value_name}</td>
								<td>${row.value_min}</td>
								<td>${row.value_max}</td>
								<td>											
								<a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer(${row.value_information_id})">修改</a>
								<a href="#" class="btn btn-danger btn-xs" onclick="deleteCustomer(${row.value_information_id})">删除</a>
								</td>
							</tr>
							</c:forEach>
							
								
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itcast:page url="${pageContext.request.contextPath }/customer/list.action" />
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
	
		<!-- /#page-wrapper -->


   
<div class="modal fade" id="customerEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改客户信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_customer_form">
						<input type="hidden" id="edit_value_information_id" name="value_information_id"/>
						<div class="form-group">
							<label for="edit_value_name" class="col-sm-2 control-label">最大值</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_value_name" placeholder="最大值" name="value_name">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_value_max" class="col-sm-2 control-label">最大值</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_value_max" placeholder="最大值" name="value_max">
							</div>
						</div>
						
						<div class="form-group">
							<label for="edit_value_min" class="col-sm-2 control-label">最小值</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_value_min" placeholder="最小值" name="value_min">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="updateCustomer()">保存修改</button>
				</div>
			</div>
		</div>
	</div>
  <ul class="pagination">
	<li><a href="#">&laquo;</a></li>
	<li><a href="#">1</a></li>
	<li><a href="#">2</a></li>
	<li><a href="#">3</a></li>
	<li><a href="#">4</a></li>
	<li><a href="#">5</a></li>
	<li><a href="#">&raquo;</a></li>
    </ul>
  
</body>
<script type="text/javascript">
	function removeOneValue(id){
		if(confirm("请问你真的要删除吗？")){
			window.location = "removeOneValue.action?value_information_id="+id;
		}
	}
	function updateOneValue(id){
		if(confirm("请问你真的要修改吗？")){
			window.location = "updateOneValue.action?value_information_id="+id;
		}
	}
</script>
<script type="text/javascript">
		function editCustomer(value_information_id) {
			$.ajax({
				type:"get",
				url:"<%=basePath%>edit.action",
				data:{"value_information_id":value_information_id},
				success:function(data) {
					$("#edit_value_information_id").val(data.value_information_id);
					$("#edit_value_name").val(data.value_name);
					$("#edit_value_max").val(data.value_max);
					$("#edit_value_min").val(data.value_min)
					
				}
			});
		}
		function updateCustomer() {
			$.post("<%=basePath%>update.action",$("#edit_customer_form").serialize(),function(data){
				if(data=="0"){
				    alert("阈值信息更新成功！");
				}else{
					alert("阈值信息更新失败！");
				}
				window.location.reload();
			});
		}
		
		function deleteCustomer(id) {
			if(confirm('确实要删除该警告阈值吗')) {
				$.post("<%=basePath%>customer/delete.action",{"id":id},function(data){
					if(data=="0"){
						alert("阈值删除成功！");
					}else{
						alert("阈值删除失败！");
					}
					window.location.reload();
				});
			}
		}
	</script>

</body>
</html>