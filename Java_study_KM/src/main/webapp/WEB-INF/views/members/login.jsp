<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style type="text/css">
	
	#loginButton{
		background-color: aqua;
		margin: 10px 10px 10px 10px;
		padding: 10px;
		border: none;
		width: 150px;
		font-size: 20px;
		cursor: pointer;
	}
	
	.boxes{
		margin: 10px 10px 10px 10px;
		font-size: 20px;
	}
	
</style>
</head>
<body>
	<h1>로그인 페이지</h1>
	<hr>
	<form method="post" action="login">
		<input class="boxes" type="text" name="userName" placeholder="ID" required="required"><br>
		<input class="boxes" type="password" name="password" placeholder="PW" required="required"><br>
		<input id="loginButton" type="submit" value="로그인">
	</form>
	<br>
	<br>
	<a href="/">메인 페이지</a>
</body>
</html>