
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
function deleteById(cID){
	var result = window.confirm('你确定要删除该车型吗？');
	if(!result) return;
	window.location.href="DeleteArcticServlet?cID="+cID;
}
</script>
</head>
<body>



<!--     内容      -->
<div id="content" class="white">
		<h1><img src="/CarDemo/images/posts.png" alt="">车型管理</h1>
		
		<!--操作栏-->
		<c:if test="${sessionScope.staff.section==1}">
		<div class="bloc">
				<div class="title"> 操作 <a class="toggle"></a></div>
				<div class="content dashboard">
						<div class="center" style="display: block; width: auto;"> 
						 <a href="product/carEdit.jsp" class="shortcut zoombox w500 h360"> 
						 <img src="/CarDemo/images/glyph-add.png" alt="" width="48" height="48"> 添加车型 </a> 
								<div class="cb"></div>
						</div>
				</div>
		</div>
		</c:if>
		<div class="bloc">
				<div class="title">
					<div class="selector" id="uniform-tableaction">
					<span>全部</span><select name="action" id="tableaction" style="opacity:0;">
					<c:forEach items="${requestScope.demio}" var="dem">
					 	<option value="${dem.dID}">${dem.amg}</option>
					</c:forEach>
					</select>
					</div>
			<a class="toggle"></a></div>
			
				<div class="content">
					<table>
						<thead>
							<tr>
									<th>图片</th>
									<th>车型名称</th>
									<th>官方指导价（元）</th>
									<th>创建时间</th>
									<th>创建人</th>
										<c:if test="${sessionScope.staff.section==1}">
							<th>操作</th>
							</c:if>
							</tr>
						</thead>
						<tbody>
						 <c:forEach items="${requestScope.arctic}" var="list">
							<tr>
							    <td><a href="/CarDemo/images/cheshi/1.jpg" class="zoombox"><image width="150" height="100" src="/CarDemo/images/cheshi/1.jpg" /></a></td>
								<td>${list.arctic}</td>
								<td>${list.cmoney}</td>
								<td>${list.cTime}</td>
								<td>${list.arcperson}</td>
								<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改">
								<img src="/CarDemo/images/edit.png" alt=""></a>
								<a onclick="deleteById(${list.cID})"
									title="删除"><img src="/CarDemo/images/delete.png" alt=""></a>
								</td>
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
				<a href="QueryArcticServlet?nowpage=${nowpage+1 }">下一页</a>&nbsp; &nbsp;
				<a href="QueryArcticServlet?nowpage=${totalpage }">末页</a>
			</c:when>
			<c:when test="${nowpage<totalpage }">
				<a href="QueryArcticServlet?nowpage=1 ">首页</a>&nbsp; &nbsp;
				<a href="QueryArcticServlet?nowpage=${nowpage-1 }">上一页</a>&nbsp; &nbsp;
				<a href="QueryArcticServlet?nowpage=${nowpage+1 }">下一页</a>&nbsp; &nbsp;
				<a href="QueryArcticServlet?nowpage=${totalpage}">末页</a>

			</c:when>
			<c:when test="${nowpage==totalpage}">
				<a href="QueryArcticServlet?nowpage=1 ">首页</a>&nbsp; &nbsp;
				<a href="QueryArcticServlet?nowpage=${nowpage-1 }">上一页</a>&nbsp; &nbsp;
				下一页  &nbsp; &nbsp; 末页
			</c:when>
		</c:choose>
		
				</div>
			</div>
		</div>
		
			
						
	

<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
</body>
</html>