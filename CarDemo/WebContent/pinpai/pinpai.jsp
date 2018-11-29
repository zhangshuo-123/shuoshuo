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
    <body>
        
        <script type="text/javascript" src="/CarDemo/js/main.js"></script>
<link rel="stylesheet" href="/CarDemo/css/style2.css">
        <!--    顶部  --> 
        <div id="head">
            <div class="left">
                <a class="button profile"><img src="/CarDemo/images/huser.png" alt=""></a>
                Hi, 
                <a>Stefan Salvatore</a>
            </div>
          
        </div>
                
                
        <!--      左侧菜单     --> 
        <div id="sidebar">
            <ul>
                <li>
                    <a ><img src="/CarDemo/images/inbox.png" alt="">
                        权限管理
                    </a>
					 <ul>
					   <li><a>角色管理</a></li>
                                                <li><a>用户管理</a></li>

  
                                            </ul>
                </li>
                <li class="current hover"><a><img src="/CarDemo/images/layout.png" alt="">产品管理</a>
                    <ul>
                          <li><a style="color:#fff" href="/CarDemo/pinpai/pinpai.jsp">品牌管理</a></li>
						  <li><a href="/CarDemo/product/series.jsp">车系管理</a></li>
						  <li><a href="/CarDemo/product/product.jsp">产品管理</a></li>
  
                   </ul>
                </li>
                <li class="nosubmenu"><a><img src="/CarDemo/images/brush.png" alt="">资讯管理</a>
                </li>
                <li class="nosubmenu"><a href="/CarDemo/customer/customer.html">
                <img src="/CarDemo/images/users.png" alt="">客户管理</a>
                </li>
                <li><a><img src="/CarDemo/images/lab.png" alt="">统计查询</a>
				 <ul>
                        <li><a href="/CarDemo/tongji/shenqingliang.jsp">客户申请量统计</a></li>
						  <li><a href="/CarDemo/tongji/dianjiliang.jsp">客户点击量统计</a></li>
  
                   </ul>
				</li>
                <li class="nosubmenu"><a><img src="/CarDemo/images/comment.png" alt="">日志管理</a></li>
				
            </ul>
            <a style="cursor:pointer" id="menucollapse">隐藏菜单</a>

        </div>
                
                
                
                
        <!--     内容      --> 
        <div id="content" class="white">
         <h1><img src="/CarDemo/images/posts.png" alt="">品牌管理</h1>
		 
		 <div class="bloc">
    <div class="title">新增品牌<a class="toggle"></a></div>
    <div class="content">
	<div class="input">
            <label for="file">品牌Logo</label>
            <div class="uploader" id="uniform-file"><input type="file" id="file" size="20" style="opacity: 0;"><span class="filename">No file selected</span><span class="action">Choose File</span></div>
        </div>
        <div class="input">
            <label for="input1">品牌名称</label>
            <input type="text" id="input1">
        </div>
         <div class="submit">
            <input type="submit" value="确定">
        </div>
    </div>
</div>

<div class="bloc">
    <div class="title">
        品牌列表
		</div>
    <div class="content">
        <table>
            <thead>
                <tr>
                    <th>品牌logo</th>
                    <th>品牌名称</th>
                    <th>创建时间</th>
                    <th>创建人</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
                                <tr>
                    <td><image width="85" height="73" src="/CarDemo/images/logo/ft.jpg" /></td>
                    <td>长安福特</td>
                    <td>2014-01-16 2:12:32</td>
                    <td>Stefan Salvatore</td>
                    <td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改"><img src="../images/edit.png" alt=""></a><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"><img src="../images/delete.png" alt=""></a></td>
                </tr>
                                <tr>
                    <td><image width="85" height="73" src="/CarDemo/images/logo/ca.jpg" /></td>
                    <td>长安汽车</td>
                    <td>2014-01-15 2:12:32</td>
                    <td>Stefan Salvatore</td>
                    <td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改">
                    <img src="/CarDemo/images/edit.png" alt=""></a><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"><img src="../images/delete.png" alt=""></a></td>
                </tr>
                                <tr>
                    <td><image width="85" height="73" src="/CarDemo/images/logo/mzd.jpg" /></td>
                    <td>长安马自达</td>
                    <td>2014-01-14 2:12:32</td>
                    <td>Stefan Salvatore</td>
                    <td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改">
                    <img src="/CarDemo/images/edit.png" alt=""></a><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"><img src="../images/delete.png" alt=""></a></td>
                </tr>
                                <tr>
                    <td><image width="85" height="73" src="/CarDemo/images/logo/lm.jpg" /></td>
                    <td>长安铃木</td>
                    <td>2014-01-14 2:12:32</td>
                    <td>Stefan Salvatore</td>
                    <td><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="修改">
                    <img src="/CarDemo/images/edit.png" alt=""></a><a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" title="删除"><img src="../images/delete.png" alt=""></a></td>
                </tr>
                           
                            </tbody>
        </table>
        <!--<div class="left input">
            <a href="pinpai/insert.html" class="zoombox w450 h223">新增品牌</a>
        </div>-->
        <div class="pagination">
            <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" class="prev">«</a>
            <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#">1</a>
            <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" class="current">2</a>
            ...
            <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#">21</a>
            <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#">22</a>
            <a href="http://www.grafikart.fr/demo/coreadmin/index.php?p=table#" class="next">»</a>
        </div>
    </div>
</div>
    
     </div>  
    
<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div></body></html>