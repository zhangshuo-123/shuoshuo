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
<!--<script type="text/javascript" src="js/index.js"></script>-->
<script type="text/javascript" src="/CarDemo/js/main.js"></script>
<link rel="stylesheet" href="/CarDemo/css/style2.css">
</head>
<body>

<!--     内容      -->
<div id="content" class="white">
		<h1><img src="/CarDemo/images/posts.png" alt="">配件管理</h1>
		
		<!--操作栏-->
		<div class="bloc">
				<div class="title"> 操作 <a class="toggle"></a></div>
				<div class="content dashboard">
						<div class="center" style="display: block; width: auto;">
						 <a href="accessoryEdit.jsp" class="shortcut zoombox w500 h320"> 
						 <img src="/CarDemo/images/glyph-add.png" alt="" width="48" height="48"> 添加配件 </a>
								<div class="cb"></div>
						</div>
				</div>
		</div>
		
		
		<div class="bloc">
				<div class="title"> 配件列表 <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" class="toggle"></a></div>
				<div class="content">
						<table>
								<thead>
										<tr>
												<th>配件名称</th>
												<th>所属车系</th>
												<th>配件价格</th>
												<th>创建时间</th>
												<th>创建人</th>
												<th>操作</th>
										</tr>
								</thead>
								<tbody>
										<tr>
												<td>蓄电池</td>
												<td>英朗TX</td>
												<td>12.00</td>
												<td>2014-01-16 2:12:32</td>
												<td>David</td>
												<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"> <img src="../images/edit.png" alt=""></a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"> <img src="../images/delete.png" alt=""></a></td>
										</tr>
										<tr>
												<td>蓄电池</td>
												<td>英朗TX</td>
												<td>12.00</td>
												<td>2014-01-16 2:12:32</td>
												<td>David</td>
												<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"> <img src="../images/edit.png" alt=""></a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"> <img src="../images/delete.png" alt=""></a></td>
										</tr>
										<tr>
												<td>蓄电池</td>
												<td>英朗TX</td>
												<td>12.00</td>
												<td>2014-01-16 2:12:32</td>
												<td>David</td>
												<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"> <img src="../images/edit.png" alt=""></a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"> <img src="../images/delete.png" alt=""></a></td>
										</tr>
										<tr>
												<td>蓄电池</td>
												<td>英朗TX</td>
												<td>12.00</td>
												<td>2014-01-16 2:12:32</td>
												<td>David</td>
												<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"> <img src="../images/edit.png" alt=""></a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"> <img src="../images/delete.png" alt=""></a></td>
										</tr>
										<tr>
												<td>蓄电池</td>
												<td>英朗TX</td>
												<td>12.00</td>
												<td>2014-01-16 2:12:32</td>
												<td>David</td>
												<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"> <img src="../images/edit.png" alt=""></a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"> <img src="../images/delete.png" alt=""></a></td>
										</tr>
										<tr>
												<td>蓄电池</td>
												<td>英朗TX</td>
												<td>12.00</td>
												<td>2014-01-16 2:12:32</td>
												<td>David</td>
												<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"> <img src="../images/edit.png" alt=""></a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"> <img src="../images/delete.png" alt=""></a></td>
										</tr>
										<tr>
												<td>蓄电池</td>
												<td>英朗TX</td>
												<td>12.00</td>
												<td>2014-01-16 2:12:32</td>
												<td>David</td>
												<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"> <img src="../images/edit.png" alt=""></a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"> <img src="../images/delete.png" alt=""></a></td>
										</tr>
										<tr>
												<td>蓄电池</td>
												<td>英朗TX</td>
												<td>12.00</td>
												<td>2014-01-16 2:12:32</td>
												<td>David</td>
												<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"> <img src="../images/edit.png" alt=""></a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"> <img src="../images/delete.png" alt=""></a></td>
										</tr>
										<tr>
												<td>蓄电池</td>
												<td>英朗TX</td>
												<td>12.00</td>
												<td>2014-01-16 2:12:32</td>
												<td>David</td>
												<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"> <img src="../images/edit.png" alt=""></a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"> <img src="../images/delete.png" alt=""></a></td>
										</tr>
										<tr>
												<td>蓄电池</td>
												<td>英朗TX</td>
												<td>12.00</td>
												<td>2014-01-16 2:12:32</td>
												<td>David</td>
												<td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"> <img src="../images/edit.png" alt=""></a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"> <img src="../images/delete.png" alt=""></a></td>
										</tr>
								</tbody>
						</table>
						<div class="pagination"> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" class="prev">«</a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#">1</a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" class="current">2</a> ... <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#">21</a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#">22</a> <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" class="next">»</a> </div>
				</div>
		</div>
</div>
<br>
<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
</body>
<br>
</html>