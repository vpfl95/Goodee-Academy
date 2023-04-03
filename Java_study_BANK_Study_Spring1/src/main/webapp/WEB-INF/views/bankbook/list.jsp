<%@page import="java.util.ArrayList"%>
<%@page import="com.iu.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	ArrayList<BankBookDTO>  arr = (ArrayList<BankBookDTO>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBook List</h1>
	<table border="1">
		<thead>
			<tr>
				<th>Name</th><th>Rate</th>
			</tr>
		</thead>
		<tbody>
			<% for(BankBookDTO book:arr){%>
				<tr>
					<td><a href="./detail?booknum=<%=book.getBooknum()%>"><%= book.getBookname() %></a></td>
					<td> <%= book.getBookrate() %></td>
				</tr>
			<%} %>
		</tbody>
		
	</table>
	<a href="./detail">detail</a>
</body>
</html>