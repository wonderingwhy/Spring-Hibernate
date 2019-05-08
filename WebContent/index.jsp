<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="/sprhib/js/jquery-1.7.1.min.js"></script>
	 <script type="text/javascript">
		$(document).ready(function(){
			$("#login").click(function(){
			
			var username=$("#username").attr("value");
			var password=$("#password").attr("value");
			var user ={username:username,password:password};
			
			$.ajax({
				url:"/sprhib/test1/getUser",
				type:"post",
				data:user,
				success:function(data){
					alert("username-----"+data.username+" password------"+data.password);
				}
			});
			});
		});
	</script>
	<script type="text/javascript">
		function addUser(){
			var form=document.forms[0];
			form.action="/sprhib/test1/addUser";
			form.method="post";
			form.submit();
		}
	</script>
  </head>
  
  <body>
  <img alt="图片" src="/sprhib/img/profile_default_head.png"> <hr/>
   <form action="">
   		姓名:<input type="text" id="username" name="username"><br/>
   		密码:<input type="password" id="password" name="password"><br/>
   		<input type="button" value="注册" onclick="addUser()">
   		<input type="button" id="login" value="登录">
   	</form>
   <div>
  <!--  <a href="javascript:alert('hello')">点击</a> -->
  	<!-- <img alt="图片" src="/sprhib/img/profile_default_head.png"> -->
   	<%-- <c:forEach items="${result }" var="m">
   		${m.key }------->${m.value }
   	</c:forEach> --%>
   </div>
  </body>
</html>
