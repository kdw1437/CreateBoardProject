<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

	<h2>ResponseRedirect.jsp ������ �Դϴ�.</h2>
	
	<%
		request.setCharacterEncoding("euc-kr");
	
		String id = request.getParameter("id");
	
		
	%>
	
	<h3> ���̵� = <%=id %></h3>
	
</body>
</html>