<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/jquery.wysiwyg.old-school.css">

<!-- jQuery AND jQueryUI -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<link rel="stylesheet" href="css/style2.css">
<!--<script type="text/javascript" src="js/index.js"></script>-->
</head>

<body>
<!--      左侧菜单     -->
<div id="sidebar">
		<ul>
				<li><a><img src="images/layout.png" alt="">品牌车型</a>
						<ul>
								<li><a href="QueryDemioServlet" target="right">车系管理</a></li>
								<li><a href="QueryArcticServlet" target="right">车型管理</a></li>
								
						</ul>
				</li>
				<li><a><img src="images/comment.png" alt="">用车指南</a> 
						<ul>
								<li><a href="QueryLedServlet" target="right">故障灯管理</a></li>
						
						</ul>
				</li>
				<li><a><img src="images/huser.png" alt=""> 客户管理</a>
						<ul>
								<li><a href="QueryCmanagementServlet" target="right">客户管理</a></li>
						</ul>
				</li>
				<li><a><img src="images/lab.png" alt="">员工管理</a>
						<ul>
								<li><a href="QueryStaffServlet" target="right">员工管理</a></li>						
						</ul>
				</li>
				
		</ul>
</div>
</body>
</html>