<%@ page language="java" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%> 
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <c:import url="/include/top.jsp" />


 <section>
 <br>
 <div align=center>
 <h2> 회원목록 페이지</h2>
 <form action="${path}/listev.do"> 
<table border=1>
<tr align=center>
<td>회사이름</td>
<td>회사주소</td>
<td>대표자명</td>
<td>대표물품</td>
<td>위도</td>
<td>경도</td>
</tr>
 
<c:forEach items="${li }" var="m">
<tr align=center>
<td>${m.entrprsNm }</td>
<td>${m.rdnmadr }</td>
<td>${m.rprsntvNm }</td>
<td>${m.mainGoods } </td>
<td>${m.latitude } </td>
<td>${m.logitude }</td>
</tr>
</c:forEach>
</table>

</form>
 </div>
 <br> 
 </section>
 <c:import url="/include/bottom.jsp" />