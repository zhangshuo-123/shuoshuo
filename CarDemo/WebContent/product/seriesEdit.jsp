<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统</title>
<link rel="stylesheet" href="/CarDemo/css/style.css">
<link rel="stylesheet" href="/CarDemo/css/jquery.wysiwyg.old-school.css">
<script src="js/jquery-3.1.1.min.js" ></script>
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
			var amg = $("#amg").val();
			var money = $("#money").val();
			$("#msg").empty;
			var aa = {
					"amg" : amg,
					"money" : money
			};
			$.post("/CarDemo/InsertDemioServlet",aa,function(data){
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
     <body class="modal white">


        <!--     内容      -->
		<div id="content" class="white">
		<!--

			-->
			<div class="bloc">
				<div class="title">新增车系<a class="toggle"></a></div>
					<div class="content" style="height:290px;">
					<form action="../InsertDemioServlet" method="post">
						车系名称：<input type="text"/ name="amg" id="amg"> <br>
						车系报价：<input type="text" name="money" id="money"/> <br>
						<!--  创建时间：<input type="text" name="dTime"/> <br>
						创建人：<input type="text" name="demperson"/> <br>-->
						 <em id="msg"></em>
						<input type="button" id="button" value="提交"/>
						</form>			
 		 			</div>	
 				</div>
			</div><br>

		<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all">
		</div>
	 </body><br>

</html>