<%@page import="com.iu.start.member.BankMembersDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<BankMembersDTO> arr = (ArrayList<BankMembersDTO>)request.getAttribute("list");
%>
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
			<%for(BankMembersDTO member: arr){%>
			<tr>
				<td><%=member.getId()%></td>
				<td><%=member.getName()%></td>
				<td><%=member.getEmail()%></td>
				<td><%=member.getPhone()%></td>
			</tr>
			<%} %>
		</tbody>
			
		</table>
</body>
</html>