<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h2>���� ���� ������</h2>
	
	<%
	
		String name1 = request.getParameter("name");
	%>
	<%=name1	%> �� �ݰ����ϴ�.
</body>
</html>