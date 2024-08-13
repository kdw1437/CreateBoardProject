<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h2> 전체 게시글 보기</h2>

<table width="700" border="1" bordercolor="skyblue">
<tr height="40">
<td colspan="5" align="right">
<button onclick="location.href='BoardWriteForm.jsp'">글쓰기</button>
</td>
</tr>
<tr height="40">
<td width="50" align="center"> 번호 </td>
<td width="320" align="center"> 제목 </td>
<td width="100" align="center"> 작성자 </td>
<td width="150" align="center"> 작성일 </td>
<td width="80" align="center"> 조회수 </td>
</tr>
<c:set var="number" value="${number}" />
<c:forEach var="bean" items="${v}">
<tr height="40">
<td width="50" align="left"> ${number} </td>
<td width="320" align="left">
<c:if test="${bean.re_step > 1}">
<c:forEach var="j" begin="1" end="${(bean.re_step-1)*5}">
&nbsp;
</c:forEach>
</c:if>
<a href="BoardInfoControl.do?num=${bean.num}"> ${bean.subject}</a>
</td>
<td width="100" align="left"> ${bean.writer} </td>
<td width="150" align="left"> ${bean.reg_date} </td>
<td width="80" align="left"> ${bean.readcount} </td>
</tr>
<c:set var="number" value="${number-1}"/>
</c:forEach>
</table>
<p>
<!-- 페이지 카운터링 소스를 작성 -->
<c:if test="${count > 0}">
    <c:if test="${startPage > pageBlock}">
        <a href='BoardListCon.do?pageNum=${startPage - pageBlock}'>[이전]</a>
    </c:if>

    <c:forEach var="i" begin="${startPage}" end="${endPage}">
        <c:choose>
            <c:when test="${i == currentPage}">
                <strong>[${i}]</strong>
            </c:when>
            <c:otherwise>
                <a href='BoardListCon.do?pageNum=${i}' style="text-decoration:none">[${i}]</a>
            </c:otherwise>
        </c:choose>
    </c:forEach>

    <c:if test="${endPage < totalPages}">
        <a href='BoardListCon.do?pageNum=${startPage + pageBlock}'>[다음]</a>
    </c:if>
</c:if>

</center>
</body>
</html>