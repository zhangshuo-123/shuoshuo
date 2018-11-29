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
function deleteById(dID){
	var result = window.confirm('你确定要删除该车系吗？');
	if(!result) return;
	window.location.href="DeleteDemioServlet?dID="+dID;
}

</script>
</head>
<body>

	<!--     内容      -->
	<div id="content" class="white">
		<h1>
			<img src="/CarDemo/images/posts.png" alt="">车系管理</h1>
		<!--操作栏-->
		<c:if test="${sessionScope.staff.section==1}">
		<div class="bloc">
			<div class="title">
				操作 <a class="toggle"></a>
			</div>
			<div class="content dashboard">
				<div class="center" style="display: block; width: auto;">
				
=
					<a href="product/seriesEdit.jsp" class="shortcut zoombox w500 h300"> <img
						src="/CarDemo/images/glyph-add.png" alt="" width="48" height="48">
						添加车系
					</a>

					<div class="cb"></div>
				</div>
			</div>
		</div>

</c:if>
		<div class="bloc">
			<div class="title">
				车系列表 <a
					href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#"
					class="toggle"></a>
			</div>
			<form action="QueryDemioServlet" method="get">
			<div class="content">
				<table>
					<thead>
						<tr>
							<th>车系名称</th>
							<th>报价(*万元)</th>
							<th>创建时间</th>
							<th>创建人</th>
							<th>查看车型</th>
							<c:if test="${sessionScope.staff.section==1}">
							<th>操作</th>
							</c:if>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${requestScope.demio}" var="list">
							<tr>
								<td>${list.amg}</td>
								<td>${list.money}</td>
								<td>${list.dTime}</td>
								<td>${list.demperson}</td>
								<td><a href="QueryArcticServlet">查看车型</a></td>
								<td>
								<a onclick="deleteById(${list.dID})"
									title="删除"><img src="/CarDemo/images/delete.png" alt=""></a></td>
							</tr>
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
				<a href="QueryDemioServlet?nowpage=${nowpage+1 }">下一页</a>&nbsp; &nbsp;
				<a href="QueryDemioServlet?nowpage=${totalpage }">末页</a>
			</c:when>
			<c:when test="${nowpage<totalpage }">
				<a href="QueryDemioServlet?nowpage=1 ">首页</a>&nbsp; &nbsp;
				<a href="QueryDemioServlet?nowpage=${nowpage-1 }">上一页</a>&nbsp; &nbsp;
				<a href="QueryDemioServlet?nowpage=${nowpage+1 }">下一页</a>&nbsp; &nbsp;
				<a href="QueryDemioServlet?nowpage=${totalpage}">末页</a>

						</c:when>
						<c:when test="${nowpage==totalpage}">

							<a href="QueryDemioServlet?nowpage=1 ">首页</a>&nbsp; &nbsp;
				<a href="QueryDemioServlet?nowpage=${nowpage-1 }">上一页</a>&nbsp; &nbsp;
				下一页  &nbsp; &nbsp; 末页
				</c:when>

		</c:choose>
				</div>
			</div>
		</div>
		</form>
	</div>
	<br>
	<div id="ui-datepicker-div"
		class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
</body>
<br>
</html>













































































































































































































































<div class="cb"></div>
</div>
</div>
</div>


<div class="bloc">
	<div class="title">
		车系列表 <a
			href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#"
			class="toggle"></a>
	</div>
	<div class="content">
		<table>
			<thead>
				<tr>
					<th>车系名称</th>
					<th>报价(*万元)</th>
					<th>创建时间</th>
					<th>创建人</th>
					<th>查看车型</th>
					<th>操作</th>
				</tr>
			</thead>
			<c:forEach items="${requestScope.list}" var="demio">
				<tbody>
					<tr>
						<td>${demio.amg}</td>
						<td>${demio.money}</td>
						<td>${demio.dTime}</td>
						<td>${demio.demperson}</td>
						<td><a href="../chexing/car.html">查看车型</a></td>
						<td><a
							href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#"
							title="修改"><img src="../images/edit.png" alt=""></a> <a
							href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#"
							title="删除"><img src="../images/delete.png" alt=""> </a></td>
					</tr>
				</tbody>
			</c:forEach>



		</table>
		<div class="pagination">
			<a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#"
				class="prev">«</a> <a
				href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#">1</a>
			<a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#"
				class="current">2</a> ... <a
				href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#">21</a>
			<a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#">22</a>
			<a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#"
				class="next">»</a>
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