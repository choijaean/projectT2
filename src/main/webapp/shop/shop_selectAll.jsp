<%@ page language="java" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%> 
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <c:import url="/include/top.jsp" />

<script >    
    <!-- 화면 전환 후 select box 고정 -->
    var ch1 = ${ch1}; // 화면전환 하면서 값을 받아온다
    
    if(ch1 == custname|| ch1 == null){
        $('#custname').attr('selected','selected');
    } else if(ch2 == phone){
        $('#phone').attr('selected','selected');
    } else{
        $('#grade').attr('selected','selected');
    }
</script>
 
 <section>
 <br>
 <div align=center>
 <h2> 회원목록 페이지</h2>
 <form action="${path}/selectAll.do"> 
<table border=1>
<tr align=center>
<td>회원번호</td>
<td>회원이름</td>
<td>전화번호</td>
<td>주소</td>
<td>가입날짜</td>
<td>회원등급</td>
<td>도시 </td>
</tr>
 
<c:forEach items="${li }" var="m">
<tr align=center>
<td>${m.custno }</td>
<td><a href="${path}/selectOne.do?custno=${m.custno}">
${m.custname }</a>
</td>
<td>${m.phone }</td>
<td>${m.address }</td>
<td><fmt:formatDate value="${m.joindate}" pattern="yyyy-MM-dd"/>
<c:if test="${m.grade eq 'A' }">
<td>VIP</td>
</c:if>
<c:if test="${m.grade eq 'B' }">
<td>일반</td>
</c:if>
<c:if test="${m.grade eq 'C' }">
<td>직원</td>
</c:if>
<td>${m.city} </td>
</tr>
</c:forEach>
</table>
<select id=ch1 name=ch1 >
 <option value='custname' id='custname' >회원이름</option>
 <option value='phone' id='phone' >전화번호</option>
 <option value='grade' id='grade' >회원등급</option>
</select>
<input type=text name=ch2>
<input type=submit value="검색하기">
</form>
 </div>
 <br> 
 </section>
 <c:import url="/include/bottom.jsp" />