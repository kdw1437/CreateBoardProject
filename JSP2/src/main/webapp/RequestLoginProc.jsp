<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

<!-- RequestLogin에서 넘어온 아이디와 패스워드를 읽어드림 -->

<% //스크립트릿 안에 자바 코드를 써준다.
	
	//사용자의 정보가 저장되어 있는 객체가 Request 객체이다. Request 객체의 getParameter()라는 메소드를 이용해서 사용자의 정보를 추출할 수 있다.
	String id = request.getParameter("id"); //사용자의 id값을 읽어드려서 변수 id에 저장하시오.
	
	String pass = request.getParameter("pass");
	


%>

	<h2>
	당신의 아이디는 <%= id %> 이고 패스워드는 <%= pass %> 입니다.
	</h2>
	
	<a href="RequestForward.jsp">다음페이지</a>
</body>
</html>