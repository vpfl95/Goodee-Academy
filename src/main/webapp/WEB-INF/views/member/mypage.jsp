<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot.jsp"></c:import>
<script defer src="/js/util.js"></script>
<script defer src="/js/memberJoin.js"></script>
</head>
<body>
	<h1>My Page</h1>
	<sec:authentication property="Principal" var="user"/>
    <h3>ID : ${user.id}</h3>
    <h3>Name : <sec:authentication property="Principal.name"/> </h3>
    <h3>Email : <sec:authentication property="name"/> </h3>
</body>
</html>