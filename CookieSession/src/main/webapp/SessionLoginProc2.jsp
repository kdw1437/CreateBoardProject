<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

	<center>
		<h1> 세션 로그인 처리 2 </h1>
	
	

	
<%
	//세션을 이용하여 데이터를 불러옴 (세션을 이용해서 데이터를 유지시켜주는게 좋다.)
	String id = (String)session.getAttribute("id");
	String pass = (String)session.getAttribute("pass");
%>
		<h2> 당신의 아이디는 <%=id %> 입니다. </h2>
		
		
	</center>
	

</body>
</html>