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
	
	request.setAttribute("ia", 3); //변수를 어느 객체, request객체나 session객체에 담아놓고 데이터를 화면에 출력할 때 쓰면 좋다.
%>
	
	<p>
i = <%=i %>
	<p>
i = ${ia }

</body>
</html>