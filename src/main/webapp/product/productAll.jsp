<%@ page language="java" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%> 
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <c:import url="/include/top.jsp" />

 <section>
 <br>
 <div align=center>
 <h2> 상품목록 페이지</h2>
 <form action="${path}/selectAll.do"> 
<table border=1>
<tr align=center>
<td>제품번호</td>
<td>제품이름</td>
<td>제품가격</td>
<td>제품설명</td>
<td>제품이미지</td>
<td>날짜</td>
</tr>
 
<c:forEach items="${li }" var="m">
<tr align=center>
<td>${m.productId }</td>
<td>
<a href="${path}/productselectOne.do?productId=${m.productId}">${m.productName }
</a></td>
<td>${m.productPrice }</td>
<td>${m.productDesc }</td>
<td><img src="${path}/product/files/${m.productImgStr }" width=100></td>
<td><fmt:formatDate value="${m.productDate}" pattern="yyyy-MM-dd"/>
</tr>
</c:forEach>
</table>

</form>
 </div>
 <br> 
 </section>
 <c:import url="/include/bottom.jsp" />