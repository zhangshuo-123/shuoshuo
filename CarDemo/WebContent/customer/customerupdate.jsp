<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统</title>
<link rel="stylesheet" href="/CarDemo/css/style.css">
<link rel="stylesheet" href="/CarDemo/css/jquery.wysiwyg.old-school.css">
<script src="js/jquery-3.1.1.min.js"></script>
<!-- jQuery AND jQueryUI -->
<script type="text/javascript" src="/CarDemo/js/jquery.min.js"></script>
<script type="text/javascript" src="/CarDemo/js/jquery-ui.min.js"></script>
<script type="text/javascript" src="/CarDemo/js/min.js"></script>
<!--<script type="text/javascript" src="js/index.js"></script>-->
<script type="text/javascript" src="/CarDemo/js/main.js"></script>
<link rel="stylesheet" href="/CarDemo/css/style2.css">
<script type="text/javascript">

	$(function(){
		$("#button").click(function(){
			var customerName = $("#customerName").val();
			var loanInformation = $("#loanInformation").val();
			var city = $("#city").val();
			var phoneNum = $("#phoneNum").val();
			var state = $("#state").val();
			var clients = {
					"customerID" : "${param.customerID}",
					"customerName" : customerName,
					"loanInformation" : loanInformation ,
					"city" : city ,
					"phoneNum" : phoneNum ,
					"state" : state
			};
			$.post("/CarSystem/UpdateCmanagementServlet",clients,function(data){
				if (data.result == "true") {
					var mag = "<em>"+data.error+"</em>"
					$("#mag").append(mag);
				}else{
					var mag = "<em>"+data.error+"</em>"
					$("#mag").append(mag);
				}
			},"json");
		});
	})


</script>
</head>
<body class="modal white">


	<!--     内容      -->
	<div id="content" class="white">

		<div class="bloc">
			<div class="title">
				修改客户<a class="toggle"></a>
			</div>

			<div class="content" style="height: 400px;">
				<div class="input">
					<label for="file">姓名</label> <input type="text" id="customerName"
						value="${param.customerName }">
				</div>
				<div class="input">
					<label for="input1">申请贷款信息</label> <input type="text" id="loanInformation"
						value="${param.loanInformation }">
				</div>
				<div class="input">
					<label for="input1">省/市</label> <input type="text" id="city"
						value="${param.city }">
				</div>
				<div class="input">
					<label for="input1">手机号</label> <input type="text" id="phoneNum"
						value="${param.phoneNum }">
				</div>
				<div class="input">
					<label for="input1">状态</label> <select name="state"
						id="state" style="opacity: 0;">
						<option value="1">未处理</option>
						<option value="2">已审核</option>
						<option value="3">审核中</option>
					</select>
				</div>
				<div class="inpput"></div>
				<div class="submit">
					<em id="mag"></em> <input type="button" value="确定" id="button">

				</div>
			</div>
		</div>
	</div>
	<br>

	<div id="ui-datepicker-div"
		class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
</body>
<br>

</html>