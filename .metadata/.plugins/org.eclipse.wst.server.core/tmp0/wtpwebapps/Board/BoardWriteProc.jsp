<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="model.BoardDAO" %>
<!DOCTYPE html>
<html>
<body>

<%
	request.setCharacterEncoding("euc-kr"); //한글 처리
	

%>

<!-- 게시글 작성한 데이터를 한번에 읽어드림 -->
<jsp:useBean id="boardbean" class="model.BoardBean">
	<jsp:setProperty name="boardbean" property="*" /> //없는 것들은 null이 들어온다. 데이터베이스 쪽 가서 데이터가 들어온다.
</jsp:useBean>

<%
	//데이터 베이스 쪽으로 빈클래스를 넘겨줌
	BoardDAO bdao = new BoardDAO();

	//데이터 저장 메소드를 호출
	bdao.insertBoard(boardbean);
	
	//게시글 저장 후 전체 게시글 보기
	response.sendRedirect("BoardList.jsp");


%>	
</body>
</html>