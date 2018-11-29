<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">

<title></title>
<script src="js/jquery-3.1.1.min.js" ></script>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/jquery.wysiwyg.old-school.css">

<!-- jQuery AND jQueryUI -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<link rel="stylesheet" href="css/style2.css">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
<script type="text/javascript">
    //reloadCode方法：实现"点击看不清刷新"的功能
    function reloadCode(){
      //time变量的功能是强制刷新，忽略浏览器的缓存机制
      var time = new Date().getTime();
      document.getElementById("imagecode").src="ServletImage?d="+ time;
       //传进的time变量，因为time在变化，所以url也在变化，因此可以说是强制刷新
	}
</script>
<script type="text/javascript">



function loginsub(){
	var name=$("#name").val();
	var password=$("#password").val();
	var checkcode=$("#checkcode").val();
	$("#msg").empty();
	if (checkcode==null) {
		$("#msg").append("<em>请输入验证码</em>");
		return;
	}
		if (name !=""&&password !="") {
			var params = {
				"name":name,
				"password":password,
				"checkcode":checkcode
			};
			$.post("LoginServlet",params,function(data){
				if (data.result=="success") {
					window.location.href="index.jsp";
				} else {
 					var msg="<em>"+data.msg+"</em>";
 					$("#msg").append(msg);
				}
			},"json");
	} else {
		$("#msg").append("<em>请输入正确的用户名和密码</em>");
	}
}

</script>
</head>
	
<body>
	<!--  内 容    -->
	<div id="content" class="white">
	   <h1>欢迎登陆        东风悦达起亚4S店汽车管理系统</h1>
	
	<!-- 登录 -->
	<div class="bloc" style="width:80%">
	   <div class="title">
	         登录<a class="toggle"></a>
	   </div>
	   <div class="content dashboard">
	
	<!--    顶部   -->

		<form id="form01" action="LoginServlet" method="post">
		  <table>
		   <tr>
		      <td class="lefttd">用户名：</td>
		      <td><input type="text" id="name"/></td>
		   </tr>
		   <tr>
		      <td class="lefttd">密码：</td>
		      <td><input type="password" id="password"/></td>
		   </tr>              
		   <tr>
		      <td class="lefttd">验证码：</td>
		      <td><input type="text" name="checkcode" id="checkcode"/> 
		          <img alt="验证码" id="imagecode" src="<%=request.getContextPath()%>/ServletImage">
		          <!--src的方式实现链接到servletImage  javascript: reloadCode();-->
		          <a href="javascript: reloadCode();">看不清楚 ，换一张！</a> 
		     </td>
		   </tr>
		   <tr>
		      <td id="msg" colspan="2"> </td>
		   </tr>
		   <tr>
		       <td id="btntd" colspan="2"><input type="button" id="loginbtn" value="确认登录" onclick="loginsub()"></td>
		   
		   </tr>
		  </table>
		</form>
		</div>
	</div>
	</div>
	<br>
	<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
	</body>
</html>
