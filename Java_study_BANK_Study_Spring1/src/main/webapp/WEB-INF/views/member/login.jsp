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
        <form action="./login" method="post">
            <div class="container">
                <h2>ID �α���</h2>
                <div>
                    <input type="text" name="id" placeholder="���̵�">
                </div>
                <div>
                    <input type="password" name="pw" placeholder="��й�ȣ">
                </div>
                
                <div class="login">                
                    <form> 
                            <input type="submit" value="�α���">
                    </form>                    
                </div>
            </div>    
        </form>
    </div>
</body>
</html>