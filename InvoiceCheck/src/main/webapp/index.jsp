<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
		<base href="<%=basePath%>">
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>电子发票核查系统</title>
		<link rel="stylesheet" type="text/css" href="css/login.css"/>
		<link rel="icon" type="x-icon" href="images/title_icon.png"/>
		<script type="text/javascript" src="./js/jquery-2.1.0.js" charset="utf-8"></script>
	</head>
	<body class="loginBody">
		<div class="login">
			<div class="loginTitle"><h1>北京润华信通电子发票核查系统</h1></div>
			<div class="loginContent">
			<form method="post" id="userForm" action="rest/user/login">
				<div class="loginItem">
					<p>用户名：</p>
					<input type="text" id="UserName" name="loginName" />
				</div>
				<div class="loginItem">
					<p>登录密码：</p>
					<input type="password" id="PassWord" name="password"/>
				</div>
				<div class="loginItem">
					<div id="Login" onclick="submit()"  />登录</div> <!-- type="button" id="Login"  -->
				</div>
			</form>	
			</div>
		</div>
		<footer class="loginFooter">&copy; 2018 北京润华信通科技有限公司 版权所有</footer>
		<div class="cloud" id="cloud1">
			<div class="top"></div>
		</div>
		<div class="cloud" id="cloud2">
			<div class="top"></div>
			<div class="bottom"></div>
		</div>
		<div class="cloud" id="cloud3">
			<div class="top"></div>
			<div class="bottom"></div>
		</div>
		<div class="clouds" id="Clouds1"></div>
		<div class="clouds" id="Clouds2"></div>
		<div class="clouds" id="Clouds3"></div>
	<script>
		  resize() 
		 window.onresize=function(){
			resize()
		}  
		  UserName.onkeydown=function(){UserName.style.background="#fff"};
		  PassWord.onkeydown=function(){PassWord.style.background="#fff"};
		function submit(){
			if(UserName.value==""){
				UserName.style.background="pink"
			};
			if(PassWord.value==""){
				PassWord.style.background="pink"
			};
			if(PassWord.value==""||UserName.value=="") return
			$("#userForm").submit();
		}
		
	
		 /* Login.onclick=function(){
			window.open("views/main.jsp");
			var xhr=new XMLHttpRequest();
			xhr.open("post","user/login"); //url地址
			xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
			var req={};
			req.userName=UserName.value;
			req.passWord=PassWord.value;
			for(var i in req){
				if(req[i]=="") return
			};
			xhr.send(req);
			xhr.onreadystatechange=function(){
				if(xhr.readyState==4&&xhr.status==200){
					console.log(JSON.stringify(xhr.responseText))
				}
			}
		}  */
		function resize(){
			document.body.style.height=window.innerHeight+"px"
		}
	</script>
	</body>
</html>
