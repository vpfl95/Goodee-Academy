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
    	<h1>${board}</h1>
	    <table class="table table-dark table-striped">
	    	<tr>
	    		<th>번호</th>
	    		<th>제목</th>
	    		<th>내용</th>
	    		<th>작성자</th>
	    		<th>작성일</th>
	    		<th>조회수</th>
	    	</tr>
	    	<tr>
	    		<td>${boardDTO.num}</td>
	    		<td>${boardDTO.title}</td>
	    		<td>${boardDTO.contents}</td>
	    		<td>${boardDTO.writer}</td>
	    		<td>${boardDTO.regDate}</td>
	    		<td>${boardDTO.hit}</td>
	    	</tr>
	    </table>
	    <a href="./update">수정</a>
	    <a href="./delete">삭제</a>
    </section>
	
   
	<c:import url="../template/footer.jsp"></c:import>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>