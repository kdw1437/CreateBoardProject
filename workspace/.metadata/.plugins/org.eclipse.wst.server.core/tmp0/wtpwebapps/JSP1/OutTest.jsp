<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- out객체는 화면에 내용을 출력하기 위해 필요한 객체이다.--%>

<%
	String name ="알리미 어플";
%>

스크립트로 표현시 <%=name %> 이 화면에 출력

<p>
<%--html에 java코드가 들어가는데 jsp이다.--%>
<%
	out.println(name + "이 화면에 출력");
	
%>

<%-- session객체 --%>

</body>
</html>