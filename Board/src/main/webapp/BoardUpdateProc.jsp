<%@page import="model.BoardDAO"%>
<%@page import="model.BoardBean" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

<%
	request.setCharacterEncoding("euc-kr");

%>
<!-- ����� �����͸� �о�帮�� ��Ŭ���� ���� -->
<jsp:useBean id="boardbean" class="model.BoardBean">
	<jsp:setProperty name="boardbean" property="*"/>
</jsp:useBean>

<%
	//������ ���̽��� ����
	BoardDAO bdao = new BoardDAO();
	//�ش� �Խñ��� �н����� ���� ����
	String pass = bdao.getPass(boardbean.getNum());
	
	//���� �н����尪�� update�� �ۼ��ߴ� password���� ������ ��
	if(pass.equals(boardbean.getPassword())) {
		
		//������ �����ϴ� �޼ҵ� ȣ��
		bdao.updateBoard(boardbean);
		
		//������ �Ϸ�Ǹ� ��ü �Խñ� ����
		response.sendRedirect("BoardList.jsp");
	} else {//�н����尡 Ʋ���ٸ�
%>
	<script type="text/javascript">
		alert("�н����尡 ��ġ ���� �ʽ��ϴ�. �ٽ� Ȯ���� �������ּ���");
		history.go(-1);	
	</script>
<%
	}
%>	

</body>
</html>