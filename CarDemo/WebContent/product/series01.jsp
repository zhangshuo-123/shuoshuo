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
function deleteById(pID){
	var result = window.confirm('你确定要删除该员工吗？');
	if(!result) return;
	window.location.href="DeleteStaffServlet?pID="+pID;
}

</script>
</head>
<body>

<!--     内容      -->
<div id="content" class="white">
		<h1><img src="/CarDemo/images/posts.png" alt="">员工管理</h1>
		
		<!--操作栏-->
		<c:if test="${sessionScope.staff.section==1}">
		<div class="bloc">
				<div class="title"> 操作 <a class="toggle"></a></div>
				<div class="content dashboard">
						<div class="center" style="display: block; width: auto;"> 
						 <a href="InsertStaffServlet" class="shortcut zoombox w500 h300"> 
						 <img src="/CarDemo/images/glyph-add.png" alt="" width="48" height="48"> 添加员工 </a> 
						<a href="seriesEdit01.jsp" class="shortcut zoombox w500 h300"> 
						<img src="/CarDemo/images/glyph-add.png" alt="" width="48" height="48"> 查询 </a> 	
								<div class="cb"></div>
						</div>
				</div>
		</div>
	</c:if>
		
		<div class="bloc">
				<div class="title"> 员工列表 <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" class="toggle"></a></div>
				<div class="content">
					<form action="QueryStaffServlet" method="get">
						<table>
								<thead>
										<tr>
												<th>工号</th>
												<th>姓名</th>
												<th>部门</th>
											<c:if test="${sessionScope.staff.section==1}">
							                    <th>操作</th>
							               </c:if>
										</tr>
								</thead>
								<tbody>
							   <c:forEach items="${requestScope.list}" var="list">
										<tr>
												<td>${list.name}</td>
												<td>${list.password}</td>
												<td>${list.section}</td>
												<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"><img src="/CarDemo/images/edit.png" alt=""></a>
									             <a onclick="deleteById(${list.pID})"
									              title="删除">
												<img src="/CarDemo/images/delete.png" alt=""></a></td>
										</tr>
								</c:forEach>
								</tbody>
								<!--循环遍历员工基本数据-->
						</table>
						<!-- 分页区 -->
		<div class="page">
		<c:choose>
			<c:when test="${totalpage==1 }">
				首页 &nbsp; &nbsp;上一页&nbsp; &nbsp;   下一页 &nbsp; &nbsp;  末页
             </c:when>

			<c:when test="${nowpage==1 }">
				首页&nbsp; &nbsp;    上一页 &nbsp; &nbsp;  
				<a href="QueryStaffServlet?nowpage=${nowpage+1 }">下一页</a>&nbsp; &nbsp;
				<a href="QueryStaffServlet?nowpage=${totalpage }">末页</a>
			</c:when>
			<c:when test="${nowpage<totalpage }">
				<a href="QueryStaffServlet?nowpage=1 ">首页</a>&nbsp; &nbsp;
				<a href="QueryStaffServlet?nowpage=${nowpage-1 }">上一页</a>&nbsp; &nbsp;
				<a href="QueryStaffServlet?nowpage=${nowpage+1 }">下一页</a>&nbsp; &nbsp;
				<a href="QueryStaffServlet?nowpage=${totalpage}">末页</a>
			</c:when>
			<c:when test="${nowpage==totalpage}">
                <a href="QueryStaffServlet?nowpage=1 ">首页</a>&nbsp; &nbsp;
				<a href="QueryStaffServlet?nowpage=${nowpage-1 }">上一页</a>&nbsp; &nbsp;
				下一页  &nbsp; &nbsp; 末页
			</c:when>

		</c:choose>
				</div>
			</div>
		</div>
		</form>
	</div>
	<br>
<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
</body>
<br>
</html>