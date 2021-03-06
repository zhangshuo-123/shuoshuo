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
</head>
<body class="modal white">
<script type="text/javascript" src="/CarDemo/js/main.js"></script>
<link rel="stylesheet" href="/CarDemo/css/style2.css">

<!--     内容      -->
<div id="content" class="white">
		<div class="bloc">
				<div class="title">新增明细<a class="toggle"></a></div>
				<div class="content">
						<div class="input" style="300px;">
								<label for="file">标题</label>
								<input type="text" id="input1" value="长安福特">
						</div>
						<div class="input">
								<label for="file">示例图片</label>
								<div class="uploader" id="uniform-file">
										<input type="file" id="file" size="20" style="opacity: 0;">
										<span class="filename"></span><span class="action">请选择图片</span></div>
						</div>
						<div class="input textarea">
								<label for="textarea1">描述</label>
								<textarea name="text" id="textarea1" rows="7" cols="4"></textarea>
						</div>
						<div class="submit">
								<input type="submit" value="确定">
						</div>
				</div>
		</div>
</div>
<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
</body>
</html>