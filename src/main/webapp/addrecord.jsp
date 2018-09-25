<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  action="addRecord.action" method="post">
                <ol>
            
                     <li><strong>住院医院：</strong><input  class="ipt" type="text" name="record_hospital"  />
                     <br><br><br>
                     <li><strong>住院科室：</strong><input class="ipt" type="text" name="record_section" size="20" /></li>
                     <br><br>
                     <li><strong>住院病房：</strong><input class="ipt" type="text" name="record_sickroom" size="20" /></li>
                     <br><br>
                     <li><strong>住院号：    </strong><input class="ipt" type="text" name="record_number" size="20" /></li>
                     <br><br>
                     <li><strong>住院时间：</strong><input class="ipt" type="text" name="record_starttime" size="20" /></li>
                     <br><br>
                     <li><strong>出院时间：</strong><input class="ipt" type="text" name="record_endtime" size="20" /></li>
                     <br><br>
                     <li><strong>住院描述：</strong><input class="ipt" type="text" name="record_describe" size="20" /></li>
					 <br><br>
                     <li><input class="btn btn-primary" type="submit" name="submit" value=" 提交 " /></li>
                </ol>
           </form>
</body>
</html>