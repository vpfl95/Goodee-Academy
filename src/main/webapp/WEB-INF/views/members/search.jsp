<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Members Search</title>
<style type="text/css">
	#searchButton{
		background-color: aqua;
		margin: 10px 10px 10px 10px;
		padding: 10px;
		border: none;
		width: 150px;
		font-size: 20px;
		cursor: pointer;
	}
	
	#searchBox{
		margin: 10px 10px 10px 10px;
		font-size: 20px;
	}
</style>
</head>
<body>
	<h1>회원 검색 페이지</h1>
	<form method="post" action="search">
		<input id="searchBox" type="text" name="search" placeholder="검색어" required="required"><br>
		<input id="searchButton" type="submit" value="검색">
	</form>
	<br>
	<br>
	<a href="/">메인페이지</a>
</body>
</html>