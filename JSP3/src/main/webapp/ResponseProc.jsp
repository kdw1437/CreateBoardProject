<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

	<h2>이 페이지는 로그인 정보가 넘어오는 페이지 입니다.</h2>
	
	<%
		request.setCharacterEncoding("euc-kr");
	
		String id = request.getParameter("id");
	
		//response.sendRedirect("ResponseRedirect.jsp"); //흐름 제어
	%>
	
	<jsp:forward page="ResponseRedirect.jsp"/><!-- 흐름 제어 -->
	<h3> 아이디 = <%=id %></h3>

</body>
</html>