<%@page import="com.iu.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	BankBookDTO  bankBookDTO = (BankBookDTO)request.getAttribute("dto");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Detail Page</h1>
	<table border="1">
			<tr>
				<th>Num</th>
				<th>Name</th>
				<th>Rate</th>
				<th>Sale</th>
			</tr>
			<tr>
				<td> <%= bankBookDTO.getBooknum() %></td>
				<td> <%= bankBookDTO.getBookname() %></td>
				<td> <%= bankBookDTO.getBookrate() %></td>
				<td> <%= bankBookDTO.getBooksale() %></td>
			</tr>
	</table>
	
	
	<!-- 상대경로 -->
	<a href="../member/login">Login</a>
	<!-- 절대경로 -->
	<a href="/member/join">Join</a>
</body>
</html>