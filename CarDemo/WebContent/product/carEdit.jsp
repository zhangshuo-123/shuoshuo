<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<script type="text/javascript">
$(function(){
	$("#button").click(function(){
		var arctic = $("#arctic").val();
		var cmoney = $("#cmoney").val();
		$("#msg").empty;
		var aa = {
				"arctic" : arctic,
				"cmoney" : cmoney
		};
		$.post("/CarDemo/InsertArcticServlet",aa,function(data){
			if (data.result =="success") {
				var msg = "<em>"+data.error+"</em>";
				$("#msg").append(msg);
			}else{
				var msg = "<em>"+data.error+"</em>";
				$("#msg").append(msg);
			}
		},"json")
	});
})






</script>
</head>
<body  class="modal white">



<!--     内容      -->
<div id="content" class="white">

		<div class="bloc">
				<div class="title">新增车型<a class="toggle"></a></div>
				<div class="content">
					<form action="../InsertArcticServlet" method="post">
						<div class="input" style="300px;">
										
								<label for="file">选择车系</label>
						<select >
							<c:forEach items="${requestScope.list}" var="list">
			                <option >${list.amg}</option>
			         	  </c:forEach>
		        	       </select>		
						</div>
						<div class="input">
								<label for="arctic">车型名称</label>
								<input type="text" name="arctic" id="arctic">
						</div>
						<div class="input">
								<label for="file">车型图片</label>
								<div class="uploader" id="uniform-file">
										<input type="file" id="file" size="20" style="opacity: 0;">
										<span class="filename"></span><span class="action">请选择图片</span>
								</div>
						</div>
						<div class="input">
								<label for="cmoney">官方指导价</label>
								<input type="text" name="cmoney" id="cmoney">
						</div>
						<div class="button">
								<input type="button" id="button" value="确定添加">
								<br>
								<br>
								<br>
						</div>
						
				</form>	
				</div>
		</div>
</div>
<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
</body>
</html>