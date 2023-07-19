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
<td>장바구니ID</td>
<td>상품번호</td>
<td>상품이름</td>
<td>상품가격</td>
<td>제품이미지</td>
<td>개수</td>
<td>주문취소</td>
</tr>
<c:forEach items="${li}" var="c">
<c:if test="${c.custNo ne ''}">
<input type=hidden name=cartId value="${c.cartId}">
<input type=hidden name=productId value="${c.productId }">
<input type=hidden name=productName value="${c.productName }">
<tr align=center>
<td>${c.cartId }</td>
<td>${c.productId }</td>
<td>${c.productName }</td>
<td><fmt:formatNumber value="${c.productPrice}" pattern="#,###"/></td>
<td><img src="${path}/product/files/${c.productImgStr }" width=100></td>
<td><input type=number name=amount value="${c.amount}"></td>
<td><input type=button value="삭제" onClick="delK('${c.cartId}')"></td>
</tr>
</c:if>

<c:set var="sum" value='${c.productPrice*c.amount}' ></c:set>
<c:set var="total" value='${total+sum}' ></c:set>

</c:forEach>
<c:if test="${total > 30000 or total == 30000}">
<tr><td colspan=7>
배송비 : 0원<br>
장바구니 금액합계 : <fmt:formatNumber value="${total}" pattern="#,###"/></td></tr>
<input type=hidden name=baesongbi value="0">
</c:if>
<c:if test="${total < 30000}">
<tr><td colspan=7>
배송비 : 3,000원<br>
장바구니 금액합계 : <fmt:formatNumber value="${total+3000}" pattern="#,###"/></td></tr>
<input type=hidden name=baesongbi value="3000">
</c:if>
<tr><td colspan=7>

<input type=hidden name=custNo value="${m.custno}">
<input type=hidden name=totalmoney value="${total}">
<input type=submit value="구매하기" formaction="${path}/cartorder.do">
<input type=submit value="수정하기" formaction="${path}/cartupdate.do">
<input type=button value="삭제하기" onClick="delAllK()">
</td></tr>

</table>
</c:if>
</form>
 </div>
 <br> 
 </section>
 <c:import url="/include/bottom.jsp" />