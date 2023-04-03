<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List</title>
<style type="text/css">
	#listTable{
		border: 1px;
		margin: 10px 10px 10px 10px;
		padding: 10px;
		text-align: center;
	}
</style>
</head>
<body>
	<h1>회원 목록</h1>
	<table id="listTable">
		<thead>
			<tr>
				<td>UserName</td>
				<td>Name</td>
				<td>Email</td>
				<td>Phone</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.memberList }" var="dto">
				<tr>
					<td>${pageScope.dto.userName }</td>
					<td>${pageScope.dto.name }</td>
					<td>${pageScope.dto.email }</td>
					<td>${pageScope.dto.phone }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<br>
	<a href="/">메인페이지</a>
</body>
</html>