<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>


<div style="text-align: center"> <!-- 구역나누기, 그룹나누기, 부분적인 작업공간을 나눌때 -->
	<a href="${path}/member/list">회원관리</a> <!-- localhost:8080/member/list로 접속 -->
</div>