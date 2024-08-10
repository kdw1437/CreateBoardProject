<%@page import="model.BoardDAO"%>
<%@page import="model.BoardBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

<%
	request.setCharacterEncoding("euc-kr");

%>
<!-- 데이터를 한번에 받아오는 빈클래스를 사용하도록 -->
<jsp:useBean id="boardbean" class="model.BoardBean">
	<jsp:setProperty name="boardbean" property="*" />
</jsp:useBean>


<%
	//데이터베이스 객체 생성
	BoardDAO bdao = new BoardDAO();
	bdao.reWriteBoard(boardbean);
	
	//답변 데이터를 모두 저장 후 전체 게시글 보기를 설정
	response.sendRedirect("BoardList.jsp");
%>
</body>
</html>