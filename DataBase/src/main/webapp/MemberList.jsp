<%@page import="model.MemberBean"%>
<%@page import="java.util.Vector"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

	<!-- 1. ������ ���̽����� ��� ȸ���� ������ ������  2. table �±׸� �̿��Ͽ� ȭ�鿡 ȸ������ ������ ��� -->
	
<%

	MemberDAO mdao = new MemberDAO();
	//ȸ������ ������ �󸶳� ����Ǿ� �ִ��� �𸣱⿡ ���������� Vector�� �̿��Ͽ� �����͸� ��������.
	Vector<MemberBean> vec = mdao.allSelectMember();
	
	
%>

<center>
<h2> ��� ȸ�� ���� </h2>

<table width="800" border="1">
	<tr height="50">
		<td align="center" width="150"> ���̵� </td>
		<td align="center" width="150"> �̸��� </td>
		<td align="center" width="150"> ��ȭ��ȣ </td>
		<td align="center" width="150"> ��� </td>
	</tr>
	<%
		for(int i = 0; i<vec.size(); i++) {
			MemberBean bean = vec.get(i); //���Ϳ� ��� ��Ŭ������ �ϳ��� ����
	%>
	<tr height="50">
		<td align="center" width="150"> 
		<a href="MemberInfo.jsp?id=<%=bean.getId()%>">
		<%= bean.getId() %> </a></td>
		<td align="center" width="150"> <%= bean.getEmail() %> </td>
		<td align="center" width="150"> <%= bean.getTel() %> </td>
		<td align="center" width="150"> <%= bean.getHobby() %> </td>
	</tr>
	<%} %>
</table>
</center>

</body>
</html>