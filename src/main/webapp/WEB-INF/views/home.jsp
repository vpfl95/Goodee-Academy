<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<c:if test="${empty sessionScope.member}">
	<div>
		<a href="./member/login.iu">Login</a>
		<a href="./member/join.iu">Join</a>
	</div>
</c:if>

<c:if test="${not empty sessionScope.member}">
	<h3>${member.name}님 환영합니다</h3>
	<div>
		<a href="./member/logout.iu">Logout</a>
		<a href="#">MyPage</a>
	</div>
</c:if>

<div>
	<a href="./member/search.iu">Member Search</a><br>
</div>
<div>
	<a href="./bankbook/list.iu">상품리스트</a>
	<a href="./bankbook/add.iu">BankBook add</a>
</div>


</body>
</html>
