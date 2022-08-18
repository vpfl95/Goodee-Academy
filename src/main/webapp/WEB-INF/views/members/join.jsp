<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join Member</title>
</head>
<body>
	<h1>회원가입 페이지</h1>
	<form method="post" action="join">
        ID<input class="boxes" type="text" name="userName" required="required"><br>
        PW<input class="boxes" type="password" name="password" required="required"><br>
        이름<input class="boxes" type="text" name="name" required="required"><br>
        이메일<input class="boxes" type="email" name="email" required="required"><br>
        전화번호<input class="boxes" type="tel" name="phone" required="required"><br>
        <input id="join" type="submit" value="회원가입">
        <input id="retry" type="reset" value="다시입력">
    </form>
    <a href="/">메인페이지</a>
</body>
</html>