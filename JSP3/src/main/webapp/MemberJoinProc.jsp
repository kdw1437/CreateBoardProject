<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

	<center>
	<h2> ȸ�� ���� ����</h2>
	<%
		request.setCharacterEncoding("euc-kr");
		
	
	%>
	
	<!-- request�� �Ѿ�� �����͸� �ڹ� ����� ���� �����ִ� useBean -->
	<jsp:useBean id="mbean" class="bean.MemberBean"><!-- ��ü���� MemberBean mbean = new MemberBean(); -->
	
	<!--  JSP ������ �ڹٺ� Ŭ���� (MemberBean�ǹ�)�� �����͸� ����(�����͸� �־��ش�.) -->
		<jsp:setProperty name="mbean" property="*" /><!-- �ڵ����� ��� ���ν��� �ֽÿ� -->
		
	</jsp:useBean>
	
	<h2>����� ���̵�� <jsp:getProperty property="id" name="mbean"/></h2>
	<h2>����� �н� <jsp:getProperty property="pass1" name="mbean"/></h2>
	<h2>����� �̸��� <jsp:getProperty property="email" name="mbean"/></h2>
	</center>
	
	<h2>����� ��ȭ��</h2>
	<%=mbean.getTel() %>
</body>
</html>