<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

<!-- RequestLogin���� �Ѿ�� ���̵�� �н����带 �о�帲 -->

<% //��ũ��Ʈ�� �ȿ� �ڹ� �ڵ带 ���ش�.
	
	//������� ������ ����Ǿ� �ִ� ��ü�� Request ��ü�̴�. Request ��ü�� getParameter()��� �޼ҵ带 �̿��ؼ� ������� ������ ������ �� �ִ�.
	String id = request.getParameter("id"); //������� id���� �о����� ���� id�� �����Ͻÿ�.
	
	String pass = request.getParameter("pass");
	


%>

	<h2>
	����� ���̵�� <%= id %> �̰� �н������ <%= pass %> �Դϴ�.
	</h2>
	
	<a href="RequestForward.jsp">����������</a>
</body>
</html>