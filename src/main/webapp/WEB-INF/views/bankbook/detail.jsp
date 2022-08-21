<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	
	<table class="table table-dark table-striped">
		<tr>
			<td>Book Num</td>
			<td>Book Name</td>
			<td>Book Rate</td>
			<td>Book Sale</td>
			<td>Book Contents</td>
		</tr>
			<tr>
				<td>${dto.bookNum}</td>
				<td>${dto.bookName}</td>
				<td>${dto.bookRate}</td>
				<td>${dto.bookSale}</td>
				<td>${dto.bookContents}</td>
			</tr>
	</table>
	<button class="btn btn-sm btn-dark" onclick="location.href='./update?bookNum=${dto.bookNum}'">수정</button >
	<button class="btn btn-sm btn-dark" onclick="location.href='./delete?bookNum=${dto.bookNum}'">삭제</button >

	<c:import url="../template/footer.jsp"></c:import>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>