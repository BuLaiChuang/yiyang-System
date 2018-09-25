<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="com.medcare.older.pojo.OldRecord"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>住院记录</title>
<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet" />

<!-- MetisMenu CSS -->
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet" />

<!-- DataTables CSS -->
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet" />

<!-- Custom CSS -->
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet" />

<!-- Custom Fonts -->
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet"
	type="text/css" />
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet"
	type="text/css" />
	
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="layui/css/layui.css"  media="all">

<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="js/jquery.XYTipsWindow.min.2.8.js"></script>
<link href="css/box_style.css" type="text/css" rel="stylesheet" />
<link rel="stylesheet" href="css/youtiy.css" media="all">
<script src="js/jquery.min.js"></script>
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div>
  <button class="layui-btn layui-btn-normal" data-toggle="modal" data-target="#myModal" onclick="addRecord()">添加</button>
</div>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                                                         添加住院记录
                </h4>
            </div>
            <form id="form_data" action="addRecord.action" method="post">
            <input type='hidden' name='old_id' value='${sessionScope.user.user_login_id }'/>
            <div class="modal-body">
                                        住院医院: <input type="text" id="record_hospital" name="record_hospital"/>
            </div>
            <div class="modal-body">
                                        住院科室: <input type="text" id="record_section" name="record_section"/>
            </div>
             <div class="modal-body">
                                        住院病房:<input type="text" id="record_sickroom" name="record_sickroom"/>
            </div>
             <div class="modal-body">
                                        住院号: <input type="text" id="record_number" name="record_number"/>
            </div>
             <div class="modal-body">
                                        住院时间: <input type="date" id="record_starttime" name="record_starttime"/>
            </div>
             <div class="modal-body">
                                        出院时间: <input type="date" id="record_endtime" name="record_endtime"/>
            </div>
             <div class="modal-body">
                                        描述: <input type="text" id="record_describe" name="record_describe"/>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
                <button type="submit" class="btn btn-primary">
                                                     提交
                </button>
            </div>
            </form>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>



<div class="row">
  <div class="col-lg-12">
	<div class="panel panel-default">
	 <div class="panel-heading">住院记录</div>
	 <!-- /.panel-heading -->
	 <table class="table table-bordered table-striped">
		<thead>
			<tr>
				<td>住院医院</td>
				<td>住院科室</td>
				<td>住院病房</td>
				<td>住院号</td>
				<td>住院日期</td>
				<td>出院日期</td>
				<td>描述</td>
				<td>操作</td>
			</tr>
		</thead>
        <tbody>
			<c:forEach var="row" items="${data}">
				<tr>
					<td>${row.record_hospital}</td>
					<td>${row.record_section}</td>
					<td>${row.record_sickroom}</td>
					<td>${row.record_number}</td>
					<td><fmt:formatDate value="${row.record_starttime}" pattern="yyyy--MM--dd" /></td>
					<td><fmt:formatDate value="${row.record_endtime}" pattern="yyyy--MM--dd " /></td>
					<td>${row.record_describe}</td>
					<td><a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#myModal2" onclick="editRecord(${row.record_id})">修改</a> 
						<a href="#" class="btn btn-danger btn-xs"  onclick="deleteRecord(${row.record_id})">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	  </table>
	</div>
  </div>
</div>

<!-- 客户编辑对话框 -->
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
   <div class="modal-content">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-label="Close">
		<span aria-hidden="true">&times;</span>
		</button>
		<h4 class="modal-title" id="myModalLabel">修改住院记录</h4>
	</div>
   <div class="modal-body">
	  <form class="form-horizontal" id="edit_record_form">
		<input type="hidden" id="edit_record_id" name="record_id"/>
		  <div class="form-group">
		   <label for="edit_record_hospital" class="col-sm-2 control-label">住院医院</label>
		    <div class="col-sm-10">
			   <input type="text" class="form-control" id="edit_record_hospital"  name="record_hospital">
			</div>
		  </div>
		  <div class="form-group">
		   <label for="edit_record_section" class="col-sm-2 control-label">住院科室</label>
		    <div class="col-sm-10">
			   <input type="text" class="form-control" id="edit_record_section"  name="record_section">
			</div>
		  </div>
		  <div class="form-group">
		   <label for="edit_record_sickroom" class="col-sm-2 control-label">住院病房</label>
		    <div class="col-sm-10">
			   <input type="text" class="form-control" id="edit_record_sickroom" name="record_sickroom">
			</div>
		  </div>
		  <div class="form-group">
		   <label for="edit_record_number" class="col-sm-2 control-label">住院号</label>
		    <div class="col-sm-10">
			   <input type="text" class="form-control" id="edit_record_number"  name="record_number">
			</div>
		  </div>
		  <div class="form-group">
		   <label for="edit_record_starttime" class="col-sm-2 control-label">住院时间</label>
		    <div class="col-sm-10">
			   <input type="date" class="form-control" id="edit_record_starttime" name="record_starttime">
			</div>
		  </div>
		  <div class="form-group">
		   <label for="edit_record_endtime" class="col-sm-2 control-label">住院时间</label>
		    <div class="col-sm-10">
			   <input type="text" class="form-control" id="edit_record_endtime" name="record_endtime">
			</div>
		  </div>
		  <div class="form-group">
		   <label for="edit_record_number" class="col-sm-2 control-label">描述</label>
		    <div class="col-sm-10">
			   <input type="text" class="form-control" id="edit_record_describe"  name="record_describe">
			</div>
		  </div>
		 <div class="modal-footer">
			<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			<button type="button" class="btn btn-primary" onclick="updateRecord()">保存修改</button>
		 </div>
		 </form>
	</div>
  </div>
 </div>
	<!-- /#wrapper -->






<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>

	<!-- Custom Theme JavaScript -->
<script src="<%=basePath%>js/sb-admin-2.js"></script>
    <script type="text/javascript">
    function editRecord(id) {
		$.ajax({
			type:"get",
			url:"<%=basePath%>editRecord.action",
			data:{"record_id":id},
			success:function(data) {
				$("#edit_record_id").val(data.record_id);
				$("#edit_record_hospital").val(data.record_hospital);
				$("#edit_record_section").val(data.record_section);
				$("#edit_record_sickroom").val(data.record_sickroom)
				$("#edit_record_number").val(data.record_number)
				$("#edit_record_starttime").val(data.record_starttime)
				$("#edit_record_endtime").val(data.record_endtime);
				$("#edit_record_describe").val(data.record_describe);
			}
		});
	}
	function updateRecord() {
		$.post("<%=basePath%>updateRecord.action",$("#edit_record_form").serialize(),function(data){
			if(data=="0"){
			    alert("住院信息更新成功！");
			}else{
				alert("住院信息更新失败！");
			}
			window.location.reload();
		});
	}
	
		function deleteRecord(id) {
			if(confirm('确实要删除该记录吗?')) {
				
				$.post("deleteRecord.action",{"id":id},function(data){
					if(data=="0"){
						alert("记录删除成功！");
					}else{
						alert("记录删除失败！");
					}
					window.location.reload();
				});
			}
		}
	</script>

</body>
</html>