<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h2> 1-10������ ���ڸ� ȭ�鿡 ǥ��</h2>


<%
	//��ũ��Ʈ���� ǥ����
	//1���� 10������ ���ڸ� ȭ�鿡 ����Ͻÿ�.
	for (int i = 1; i < 11; i++){
%>		
	<%= i %><br>
<%	
	}

%>

</body>
</html>