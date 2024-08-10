<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

	<h2>ResponseRedirect.jsp 페이지 입니다.</h2>
	
	<%
		request.setCharacterEncoding("euc-kr");
	
		String id = request.getParameter("id");
	
		
	%>
	
	<h3> 아이디 = <%=id %></h3>
	
</body>
</html>