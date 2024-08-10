<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="model.MemberDAO" %>
<!DOCTYPE html>
<html>
<body>

<%
	request.setCharacterEncoding("euc-kr"); //한글처리
	
	//취미 부분은 별도로 읽어드려서 다시 빈클래스에 저장
	String[] hobby = request.getParameterValues("hobby");
	//배열에 있는 내용을 하나의 스트링으로 저장
	String texthobby = "";
	for (int i = 0; i<hobby.length; i++) {
		texthobby += hobby[i] + " ";
	}
%>
	<!-- useBean을 이용하여 한꺼번에 데이터를 받아온다. -->
	<jsp:useBean id="mbean" class="model.MemberBean">
		<jsp:setProperty name="mbean" property="*"/> <!-- 맵핑 시키시오 -->
	</jsp:useBean>
<%
	mbean.setHobby(texthobby); //기존 취미는 주소번지가 저장되기에 위에 배열의 내용을 하나의 스트링으로 저장한 변수를 다시 입력

	//데이터베이스 클래스 객체 생성
	MemberDAO mdao = new MemberDAO();
	mdao.insertMember(mbean);
	
	//회원 가입이 되었다면 회원 정보를 보여주는 페이지로 이동시킴
	response.sendRedirect("MemberList.jsp");
	
%>

	오라클에 완료~

</body>
</html>