<%@ page language="java" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%> 
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <c:import url="/include/top.jsp" />
<script>
function delK(k){
	//alert(k);
	location.href="cartdelete.do?cartId="+k+"&custNo="+${m.custno};
}

function delAllK(){
	//alert("확인");
	location.href="cartdeleteAll.do"
}


</script>
 <section>
 <br>
 <div align=center>
 <h2> 장바구니 </h2>

<form method=post name=f1>

<c:if test="${empty m.id }">
<h2> 로그인을 하세요 </h2>
</c:if>
<c:if test="${!empty m.id }">
<table border=1> 
<tr align=center>
<td>custno</td>
<td>cartid</td>
<td>productid</td>
<td>productname</td>
<td>amount</td>
</tr>
<c:forEach items="${li}" var="d">
<c:if test="${d.custNo ne ''}">
<tr align=center>
<td>${d.custNo }</td>
<td>${d.cartId }</td>
<td>${d.productId }</td>
<td>${d.productName }</td>
<td>${d.amount}</td>
<td><input type=button value="삭제" onClick="delK('${d.cartId}')"></td>
</tr>
</c:if>
</c:forEach>

</table>
</c:if>
</form>
 </div>
 <br> 
 </section>
 <c:import url="/include/bottom.jsp" />