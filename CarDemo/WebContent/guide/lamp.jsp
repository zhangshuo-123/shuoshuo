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
</head>
<body>
<script type="text/javascript" src="/CarDemo/js/main.js"></script>
<link rel="stylesheet" href="/CarDemo/css/style2.css">

<!--     内容      -->
<div id="content" class="white">
		<h1><img src="/CarDemo/images/posts.png" alt="">故障灯管理</h1>
		<div class="bloc">
				<div class="title"> 故障灯 <a class="toggle"></a></div>
				<div class="content">
						<table>
								<thead>
										<tr>
												<th>故障灯</th>
												<th>标题</th>
												<th>描述</th>
												<th>创建时间</th>
												<th>创建人</th>
								
										</tr>
								</thead>
								<tbody>
								<c:forEach items="${requestScope.led}" var="list">
										<tr>
												<td><a href="" class="zoombox">
														<image width="90" height="70" src="/CarDemo/images/guzhangdeng/1.png" /></a>
												</td>
											    <td>${list.title}</td>
												<td>${list.describe}</td>
												<td>${list.crestionTime}</td>
												<td>${list.creator}</td>
										</tr>
										<tr>
								</c:forEach>			
								</tbody>
						</table>
                       <!-- 分页区 -->
		<div class="page">
		<c:choose>
			<c:when test="${totalpage==1 }">
				首页 &nbsp; &nbsp;上一页&nbsp; &nbsp;   下一页 &nbsp; &nbsp;  末页
             </c:when>

			<c:when test="${nowpage==1 }">
				首页&nbsp; &nbsp;    上一页 &nbsp; &nbsp;  
				<a href="QueryLedServlet?nowpage=${nowpage+1 }">下一页</a>&nbsp; &nbsp;
				<a href="QueryLedServlet?nowpage=${totalpage }">末页</a>
			</c:when>
			<c:when test="${nowpage<totalpage }">
				<a href="QueryLedServlet?nowpage=1 ">首页</a>&nbsp; &nbsp;
				<a href="QueryLedServlet?nowpage=${nowpage-1 }">上一页</a>&nbsp; &nbsp;
				<a href="QueryLedServlet?nowpage=${nowpage+1 }">下一页</a>&nbsp; &nbsp;
				<a href="QueryLedServlet?nowpage=${totalpage}">末页</a>

			</c:when>
			<c:when test="${nowpage==totalpage}">
				<a href="QueryLedServlet?nowpage=1 ">首页</a>&nbsp; &nbsp;
				<a href="QueryLedServlet?nowpage=${nowpage-1 }">上一页</a>&nbsp; &nbsp;
				下一页  &nbsp; &nbsp; 末页
			</c:when>
		</c:choose>
				</div>
		</div>
</div>
<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
</body>
</html>