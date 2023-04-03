<%@page import="com.iu.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<a href="../member/login.iu">Login</a>
	<!-- ������ -->
	<a href="/member/join.iu">Join</a>
	
	<a href="./list">����Ʈ����</a>
	
	<a href="./update.iu?bookNum=${dto.bookNum}">����</a>
	
	<a href="./delete.iu?bookNum=${dto.bookNum}">����</a>\
	
	<c:if test="${not empty sessionScope.member}">
		<a href="../bankAccount/add.iu?bookNum=${dto.bookNum}">�����ϱ�</a>
	</c:if>
	
</body>
</html>