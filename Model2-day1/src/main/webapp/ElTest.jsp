<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	int i = 3;

	out.println("i = " + i);
	
	request.setAttribute("ia", 3); //������ ��� ��ü, request��ü�� session��ü�� ��Ƴ��� �����͸� ȭ�鿡 ����� �� ���� ����.
%>
	
	<p>
i = <%=i %>
	<p>
i = ${ia }

</body>
</html>