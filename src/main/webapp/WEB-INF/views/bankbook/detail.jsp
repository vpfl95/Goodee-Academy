<%@page import="com.iu.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--<%
	//��û�� �߻��ϸ� ����, ������ ������ �Ҹ�: RequestScope
	BankBookDTO  bankBookDTO = (BankBookDTO)request.getAttribute("dto");
--%>

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
				<td>${requestScope.dto.getBookNum()}</td>
				<td>${requestScope.dto.bookName}</td>
				<td>${dto.bookRate}</td>
				<td>${dto.bookSale}</td>
			</tr>
	</table>

	
	<!-- ����� -->
	<a href="../member/login">Login</a>
	<!-- ������ -->
	<a href="/member/join">Join</a>
	
	<a href="./list">����Ʈ����</a>
	
	<a href="./update?bookNum=${dto.bookNum}">������Ʈ</a>
	
	<a href="./delete?bookNum=${dto.bookNum}">����</a>
</body>
</html>