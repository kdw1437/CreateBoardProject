<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h2> 1-10까지의 숫자를 화면에 출력하시오.</h2>
<%
	//1-10까지의 숫자를 화면에 출력하시오. (콘솔에 띄우는 게 아니라, 브라우저에 띄우는 것이다.)
	for ( int i = 1; i < 10; i++) {
%>		
		<%= i %><br>
<% 	}



%>

</body>
</html>