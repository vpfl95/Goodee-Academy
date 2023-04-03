<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	<div>
        <form action="./login.iu" method="post">
            <div class="container">
                <h2>ID 로그인</h2>
                <div>
                    <input type="text" value="id5" name="id" placeholder="아이디">
                </div>
                <div>
                    <input type="password" value="id5" name="pw" placeholder="비밀번호">
                </div>
                
                <div class="login">                
                    <form> 
                            <input type="submit" value="로그인">
                    </form>                    
                </div>
            </div>    
        </form>
    </div>
</body>
</html>