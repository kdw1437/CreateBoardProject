<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- out��ü�� ȭ�鿡 ������ ����ϱ� ���� �ʿ��� ��ü�̴�.--%>

<%
	String name ="�˸��� ����";
%>

��ũ��Ʈ�� ǥ���� <%=name %> �� ȭ�鿡 ���

<p>
<%--html�� java�ڵ尡 ���µ� jsp�̴�.--%>
<%
	out.println(name + "�� ȭ�鿡 ���");
	
%>

<%-- session��ü --%>

</body>
</html>