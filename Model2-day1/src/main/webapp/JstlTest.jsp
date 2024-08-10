<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>

<!-- 변수 선언하는 방법 -->
<c:set var="sum" value="0" />


<!-- 반복문 for -->

<c:forEach var="i" begin="1" end="10" step="${i=i+2 }" >

<c:set var="sum" value="${sum = sum + i }" />

</c:forEach>

${sum }

</body>
</html>