<%@page import="model.MemberBean"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<!-- 1. 데이터 베이스에서 한 회원의 정보를 가져옴 2. table태그를 이용하여 화면에 회원의 정보를 출력 -->
<%

	String id = request.getParameter("id");	//memberlist id를 받아줌

	MemberDAO mdao = new MemberDAO();
	MemberBean mbean = mdao.oneSelectMember(id); //해당하는 id의 회원정보를 리턴받아야한다.

%>	

<Center>
<h2> 회원 정보 보기 </h2>
</Center>
	<table width="400" borders="1">
	<tr height="50">
		<td align="center" width="150">아이디</td>
		<td width="250"> <%=mbean.getId() %> </td>
	</tr>
	<tr height="50">
		<td align="center" width="150">이메일</td>
		<td width="250"> <%=mbean.getEmail() %> </td>
	</tr>
	<tr height="50">
		<td align="center" width="150">전화</td>
		<td width="250"> <%=mbean.getTel() %> </td>
	</tr>
	<tr height="50">
		<td align="center" width="150">취미</td>
		<td width="250"> <%=mbean.getHobby() %> </td>
	</tr>
	<tr height="50">
		<td align="center" width="150">직업</td>
		<td width="250"> <%=mbean.getJob() %> </td>
	</tr>
	<tr height="50">
		<td align="center" width="150">나이</td>
		<td width="250"> <%=mbean.getAge() %> </td>
	</tr>
	<tr height="50">
		<td align="center" width="150">정보</td>
		<td width="250"> <%=mbean.getInfo() %> </td>
	</tr>
	<tr height="50">
		<td align="center" colspan="2">
		<button onclick="location.href='MemberUpdateForm.jsp?id=<%=mbean.getId()%>'">수정</button>
	</tr>	
	
	</table>
</body>
</html>