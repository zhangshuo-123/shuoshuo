<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统</title>
<link rel="stylesheet" href="/CarDemo/css/style.css">
<link rel="stylesheet" href="/CarDemo/css/jquery.wysiwyg.old-school.css">

<!-- jQuery AND jQueryUI -->
<script type="text/javascript" src="/CarDemo/js/jquery.min.js"></script>
<script type="text/javascript" src="/CarDemo/js/jquery-ui.min.js"></script>
<script type="text/javascript" src="/CarDemo/js/min.js"></script>
<!--<script type="text/javascript" src="js/index.js"></script>-->
<script type="text/javascript" src="/CarDemo/js/main.js"></script>
<link rel="stylesheet" href="/CarDemo/css/style2.css">

</head>
<body class="modal white">


<!--     内容      -->
<div id="content" class="white">
<!--

-->
<div class="bloc">
		<div class="title">查询员工<a class="toggle"></a></div>
		<div class="content" style="height:290px;">
				<!--<div class="input">
						<label for="file">员工id</label>
						<input type="text" id="input1" value="1001">
				</div>-->
				<!--<div class="input">
						<label for="input1">报价</label>
						<input type="text" id="input1" name=""  width="50px">-
						<input type="text" id="input2" name=""  width="50px><br/>
						<label for="input1">(*万元)</label>
				</div>
				<div class="inpput"></div>-->
				<!--<div class="submit">
						<input type="submit" value="确定">
						
				</div>-->
				<form action="QueryStaffServlet" method="get">
					员工id:<input type="text" name="input1"/>	
					<input type="submit" value="确定">
				</form>
				
		</div>
</div>
</div>
<br>

<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
</body><br>

</html>