<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MemberList Page</h1>
	<table>
		<tr>
			<td>UserName</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
		</tr>
		<c:forEach items="${requestScope.list}" var="dto">
			<tr>
				<td>${dto.userName}</td>
				<td>${dto.name}</td>
				<td>${dto.email}</td>
				<td>${dto.phone}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>