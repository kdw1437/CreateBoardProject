<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<center>
	<h2> 결과 보기 </h2>
	
	<%
		String exp2 = request.getParameter("exp2");
	
		if (exp2.equals("+")) {
	%>		
		결과는 ${ param.exp1 + param.exp3 }
	<%
		};
	%>
	 //java코드를 jsp에서 안 쓸 수 있도록 만들어주는 것이 JSTL이다.
	</center>
	
</body>
</html>