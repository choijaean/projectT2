<%@ page language="java"  pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%> 
  
 <c:set var="path" value="${pageContext.request.contextPath}" scope="session" />
 <c:set var="key" value="20f5bcf9cafa865bd0c38622d86f21ae" scope="session" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>qwertyDot</title>
<link href="${path}/include/top.css" rel="stylesheet" type="text/css"  />
<style type="text/css">

</style>

</head>
<body>
<c:set var="path" value="${pageContext.request.contextPath}" scope="application" />
<header>
 <b> qwertyDot </b>
</header>
<nav>
&emsp;<a href="${path}/selectform.do">회원등록</a>
&emsp;<a href="${path}/selectAll.do">회원목록</a>
&emsp;<a href="${path}/ShopMoney.do">회원매출조회</a>

<c:if test="${userId eq 'admin'}">
&emsp;<a href="${path}/listcompany.do">회사목록조회</a>
&emsp;<a href="${path}/OpenSelectAllMap.do">회사목록맵</a>
&emsp;<a href="${path}/listev.do">전기차충전소</a>
&emsp;<a href="${path}/OpenSelectev.do">전기차지도출력</a>
</c:if>

&emsp;<a href="${path}/product/productForm.jsp">상품등록하기</a>
&emsp;<a href="${path}/productselectAll.do">상품목록보기</a>
&emsp;<a href="${path}/cartlist.do">장바구니</a>
&emsp;<a href="${path}/index.jsp">홈으로</a>

<c:if test="${empty m.custno}">
&emsp;<a href="${path}/login/login.jsp">로그인</a>
</c:if>
<c:if test="${!empty m.custno}">
&emsp;<a href="${path}/logout.do?custno=${m.custno}">${m.custname }</a>
</c:if>

</nav>