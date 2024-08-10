<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


<%! //서비스 메소드 안에 만들어지는 게 아니라 멤버 메소드로 만들어진다.

	public void increment() {
	
	}
%>

<%! //멤버 변수
 	int a = 10;
%>

<%
	int a = 100; //지역 변수
%>


</body>
</html>