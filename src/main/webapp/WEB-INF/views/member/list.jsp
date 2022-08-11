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
	<h1>Member List</h1>
		<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>EMAIL</td>
				<td>PHONE</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach begin="0" end="10" var="i">
				<h3>${pageScope.i}</h3>
			</c:forEach>
			
			<c:forEach items="${requestScope.list}" var="dto">
				<tr>
					<td>${pageScope.dto.id}</td>
					<td>${pageScope.dto.name}</td>
					<td>${pageScope.dto.email}</td>
					<td>${pageScope.dto.phone}</td>
				</tr>
			</c:forEach>
			<%-- <%for(BankMembersDTO member: arr){%>
			<tr>
				<td><%=member.getId()%></td>
				<td><%=member.getName()%></td>
				<td><%=member.getEmail()%></td>
				<td><%=member.getPhone()%></td>
			</tr>
			<%} %> --%>
		</tbody>
			
		</table>
</body>
</html>