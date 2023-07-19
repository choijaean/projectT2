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
<td>위치</td>
<td>주소</td>
<td>충전기</td>
<td>대수</td>

</tr>
 

<c:forEach items="${li }" var="m">
<tr align=center>
<td>${m.csNm}</td>
<td>${m.addr}</td>
<td>${m.cpNm}</td>
<td>${m.cpStat} </td>
</tr>
</c:forEach>
</table>

</form>
 </div>
 <br> 
 </section>
 <c:import url="/include/bottom.jsp" />