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
<script type="text/javascript" src="/CarDemo/js/main.js"></script>
<link rel="stylesheet" href="/CarDemo/css/style2.css">
<script type="text/javascript">
function deleteById(customerID){
	var result = window.confirm('你确定要删除该客户吗？');
	if(!result) return;
	window.location.href="DeleteCmanagementServlet?customerID="+customerID;
}
</script>
</head>
<body>


<!--     内容      -->
<div id="content" class="white">
		<h1><img src="/CarDemo/images/users1.png" alt="">客户管理</h1>
			<!--操作栏-->
		<c:if test="${sessionScope.staff.section==1}">
		<div class="bloc">
			<div class="title">
				操作 <a class="toggle"></a>
			</div>
			<div class="content dashboard">
				<div class="center" style="display: block; width: auto;">
					<a href="product/seriesEdit.jsp" class="shortcut zoombox w500 h300"> <img
						src="/CarDemo/images/glyph-add.png" alt="" width="48" height="48">
						添加客户
					</a>
					<div class="cb"></div>
				</div>
			</div>
		</div>

</c:if>
		<div class="bloc">
				<div class="title"> 客户列表 </div>
				<form action="QueryCmanagementServlet" method="get">
				<div class="content">
						<table>
								<thead>
										<tr>
												<th>姓名</th>
												<th>申请贷款信息</th>
												<th>省/市</th>
												<th>手机号</th>
												<th>状态</th>
												<th>申请时间</th>
								<c:if test="${sessionScope.staff.section==1}">
							                     <th>操作</th>
							</c:if>
										</tr>
								</thead>
								<tbody>
								  <c:forEach  items="${requestScope.cmanagement}" var="list">
										<tr>
									
												<td>${list.customerName}</td>
												<td>${list.loanInformation}</td>
												<td>${list.city}</td>
												<td>${list.phoneNum}</td>
												<td>${list.cstate}</td>
												<td>${list.applicationTime}</td>
													<td><a class="shortcut zoombox w500 h360" href="customer/customerupdate.jsp?customerID=${list.customerID}&state=${list.state}&customerName=${list.customerName}	&loanInformation=${list.loanInformation}&city=${list.city}&phoneNum=${list.phoneNum}&applicationTime${list.applicationTime}" title="修改">
								<img src="/CarDemo/images/edit.png" alt=""></a>
							<a onclick="deleteById(${list. customerID})"
									title="删除"><img src="/CarDemo/images/delete.png" alt=""></a>
								</td>
										</tr>
										
									
										</c:forEach>
								</tbody>
						</table>
						<div class="page">
		<c:choose>
			<c:when test="${totalpage==1 }">
				首页 &nbsp; &nbsp;上一页&nbsp; &nbsp;   下一页 &nbsp; &nbsp;  末页
             </c:when>

			<c:when test="${nowpage==1 }">
				首页&nbsp; &nbsp;    上一页 &nbsp; &nbsp;  
				<a href="QueryCmanagementServlet?nowpage=${nowpage+1 }">下一页</a>&nbsp; &nbsp;
				<a href="QueryCmanagementServlet?nowpage=${totalpage }">末页</a>
			</c:when>
			<c:when test="${nowpage<totalpage }">
				<a href="QueryCmanagementServlet?nowpage=1 ">首页</a>&nbsp; &nbsp;
				<a href="QueryCmanagementServlet?nowpage=${nowpage-1 }">上一页</a>&nbsp; &nbsp;
				<a href="QueryCmanagementServlet?nowpage=${nowpage+1 }">下一页</a>&nbsp; &nbsp;
				<a href="QueryCmanagementServlet?nowpage=${totalpage}">末页</a>

			</c:when>
			<c:when test="${nowpage==totalpage}">
				<a href="QueryCmanagementServlet?nowpage=1 ">首页</a>&nbsp; &nbsp;
				<a href="QueryCmanagementServlet?nowpage=${nowpage-1 }">上一页</a>&nbsp; &nbsp;
				下一页  &nbsp; &nbsp; 末页
			</c:when>
		</c:choose>
		
				</div>
						<div class="left input">
								<div class="selector" id="uniform-tableaction"><span>全部</span>
										<select name="action" id="tableaction" style="opacity: 0;">
												<option value="">全部</option>
												<option value="">已审核</option>
												<option >审核中</option>
												<option >未处理</option>
										</select>
								</div>
						</div>
				</div>
		</div>
			</form>
</div>
<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
</body>
</html>