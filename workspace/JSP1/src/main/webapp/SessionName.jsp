<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>세션 네임 페이지 입니다</h2>
	
	<%
		String name1 = (String)session.getAttribute("name1");	
	%>
	
	<%=name1 %> 님 반갑습니다.
</body>
</html>

<!--  세션을 집어넣게 되면 여러 페이지에서 session.getAttribute하면 된다. -->