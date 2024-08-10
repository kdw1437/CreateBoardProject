<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %> <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2> 세션 연습 </h2>

	<%
	
		String name = "shin";
		//세션을 이용하여 데이터를 유지
		
		session.setAttribute("name1", name);
		//세션유지시간
		session.setMaxInactiveInterval(10); //10초간 세션을 유지
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
	<a href="SessionName.jsp"> 세션네임페이지로 이동 </a>

</body>
</html>
<!-- 웹 애플리케이션에 있는 모든 객체가 공유할 수 있게 해준다. 사용자들은 애플리케이션 정보를 보면 안된다.
개발자가 스스로 봐야 하는데, ... exception은 java의 exception과 같다. try catch이용 -->