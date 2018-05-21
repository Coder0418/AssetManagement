<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%String path = request.getContextPath(); %>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- CSS -->
<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet" href="<%=path %>/loginForms/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=path %>/loginForms/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="<%=path %>/loginForms/css/form-elements.css">
<link rel="stylesheet" href="<%=path %>/loginForms/css/style.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->

<!-- Favicon and touch icons -->
<link rel="shortcut icon" href="loginForms/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="<%=path %>/loginForms/ico/apple-touch-icon-144-precomposed.png">
<link rel="<%=path %>/apple-touch-icon-precomposed" sizes="114x114"
	href="<%=path %>/loginForms/ico/apple-touch-icon-114-precomposed.png">
<link rel="<%=path %>/apple-touch-icon-precomposed" sizes="72x72"
	href="<%=path %>/loginForms/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="<%=path %>/loginForms/ico/apple-touch-icon-57-precomposed.png">
<title>Login</title>
</head>
<body background="<%=path %>/loginForms/img/backgrounds/1.jpg">

	<!-- Top content -->
	<div class="top-content">

		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1>
							<strong>固定资产管理平台</strong>
						</h1>
						<!-- <div class="description"> -->
						<!-- <p> -->
						<!-- This is a free responsive login form made with Bootstrap.  -->
						<!-- Download it on <a href="#"><strong>AZMIND</strong></a>, customize and use it as you like! -->
						<!-- </p> -->
						<!-- </div> -->
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">
						<div class="form-top">
							<div class="form-top-left">
								<h3>登陆</h3>
								<p>Enter your username and password to log on:</p>
							</div>
							<div class="form-top-right">
								<i class="fa fa-lock"></i>
							</div>
						</div>
						<div class="form-bottom">
							<form role="form" action="userController/userLogin" method="post" class="login-form">
								<input type="radio" name="radio" value="user" checked="checked">用户
								<input type="radio" name="radio" value="admin">管理员
								<div class="form-group">
									<label class="sr-only" for="form-username">Username</label> 
									<input
										type="text" name="form-username" placeholder="Username..."
										class="form-username form-control" id="form-username"/>
								</div>
								<div class="form-group">
									<label class="sr-only" for="form-password">Password</label> <input
										type="password" name="form-password" placeholder="Password..."
										class="form-password form-control" id="form-password">
								</div>
								<button type="submit" class="btn">登陆</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- Javascript -->
	<script src="<%=path %>/loginForms/js/jquery-1.11.1.min.js"></script>
	<script src="<%=path %>/loginForms/bootstrap/js/bootstrap.min.js"></script>
	<script src="<%=path %>/loginForms/js/jquery.backstretch.min.js"></script>
	<script src="<%=path %>/loginForms/js/scripts.js"></script>

	<!--[if lt IE 10]>
        <script src="loginForms/js/placeholder.js"></script>
    <![endif]-->

</body>
</html>