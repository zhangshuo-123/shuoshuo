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
<script type="text/javascript" src="/CarDemo/js/main.js"></script>
<link rel="stylesheet" href="/CarDemo/css/style2.css">
<!--<script type="text/javascript" src="js/index.js"></script>-->
</head>



<style type="text/css">
	body{
		padding:0;
		margin:0;	
		overflow-y:hidden;
	}
	.main{
		height:100%;
		width:100%;
		position:absolute;
	}
	.top{
		width:100%;
		height:42px;
		position:absolute;
		top:0;
		z-index:102;
	}
	.bottom{
		width:100%;
		height:100%;
		position:absolute;
		top:0;
		z-index:101;
	}
	.left{
		width:14.4%;
		height:100%;
		clear:both;
		float:left;
		position:absolute;
		top:0;
	}
	.right{
		width:100%;
		height:100%;
	}
</style>

<body>

	<div class="main">
		<div class="top">
			<iframe name="top" width="100%" height="100%" src="top.jsp"></iframe>
		</div>
		<div class="bottom">
			<div class="left">
				<iframe name="left" width="100%" height="100%" src="left.jsp" scrolling="no" ></iframe>
			</div>
			<div class="right">
				<iframe name="right" width="100%" height="100%" src="welcome.jsp"></iframe>
			</div>
		</div>
	</div>

</body>
</html>