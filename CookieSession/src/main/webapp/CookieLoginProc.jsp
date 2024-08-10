<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	request.setCharacterEncoding("euc-kr");
	
	//out.write("아이디 저장=" + request.getParameter("save"));
	
	//아이디 저장 체크 박스가 체크되었는지 판단여부
	String save = request.getParameter("save");
	//아이디 값을 저장
	String id = request.getParameter("id");
	
	//체크되었는지를 비교 판단
	if(save != null) {//아이디 저장이 눌렸다면
		//쿠키를 만들려면 쿠키클래스를 생성해주어야 한다.
		Cookie cookie = new Cookie("id", id);//1번째 String에는 key값을 적어준다. 2번째 String에는 value값을 적어준다. (자바로 따지면 Map interface이다.)
		
		//쿠키 유효시간 설정
		cookie.setMaxAge(60*1); //10분간 유효
		
		//사용자에게 쿠키 값을 넘겨줌.
		response.addCookie(cookie);
		
		out.write("쿠키 생성 완료");
	}
	
	
	
%>


</body>
</html>