<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Join Page</h1>
	 <form action="join.iu" method="post">
            <h4>���̵�</h4>
            <input type="text" name="id">
            <h4>��й�ȣ</h4>
            <input type="password" name="pw">
            <h4>��й�ȣ ��Ȯ��</h4>
            <input type="password">
            <h4>�̸�</h4>
            <input type="text" name="name">
            <h4>�������</h4>
            <input type="date">
            <h4>����</h4>
            <select>
                <option>����</option>
                <option>����</option>
            </select>
            <h4>���� Ȯ�� �̸��� <span>(����)</span></h4>
            <input type="email" name="email">
            <h4>�޴���ȭ</h4>
            <select>
                <option>���ѹα� +82</option>
                <option>�������� +22</option>
                <option>��� +35</option>
                <option>���� +45</option>
                <option>�̱� +85</option>
                <option>�߱� +55</option>
            </select>
            <div>
                <input type="text" placeholder="��ȭ��ȣ �Է�" name="phone"><input type="button" value="������ȣ �ޱ�">
            </div>
            <input type="number" placeholder="������ȣ�� �Է��ϼ���.">
            <div>
                <button>�����ϱ�</button>
            </div>
        </form>

</body>
</html>