<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<section class="container-fluid col-lg-8 mt-5">
		<table class="table table-dark table-striped">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Phone</th>
			</tr>
			<tr>
				<td>${dto.userName}</td>
				<td>${dto.name}</td>
				<td>${dto.email}</td>
				<td>${dto.phone}</td>
			</tr>
		</table>
		 <c:forEach items="${dto.bankAccountDTOs}" var="dto">
		 	<p>${dto.accountNum}</p>
		 	<p>${dto.bankBookDTO.bookName}</p>
		 	<p>${dto.accountDate}</p>
		 </c:forEach>
	
	</section>
	
	
	<%-- <table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
		</tr>
		<tr>
			<h4>${map}</h1>
			<td>${map.dto.userName}</td>
			<td>${map.dto.name}</td>
			<td>${map.dto.email}</td>
			<td>${map.dto.phone}</td>
		</tr>
	</table>
	 <c:forEach items="${map.list}" var="dto">
	 	<p>${dto.accountNum}</p>
	 	<p>${dto.bankBookDTO.bookName}</p>
	 	<p>${dto.accountDate}</p>
	 </c:forEach> --%>
	<c:import url="../template/footer.jsp"></c:import>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>