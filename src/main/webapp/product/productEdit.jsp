<%@ page language="java" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%> 
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <c:import url="/include/top.jsp" />

 <section>
 <br>
 <div align=center>
 <h2> 상품목록 페이지</h2>
<form> 
<input type=hidden name=productId value="${p.productId}">
<input type=hidden name=custNo value="${m.custno}">
<input type=hidden name=productImgStr value="${p.productImgStr }">

<table border=1>
<tr><td>상품번호</td><td>&ensp;${p.productId } </td>
<td rowspan=4 width=110><img src="${path}/product/files/${p.productImgStr }" width=150></td></tr>
<tr><td>상품이름</td><td><input type=text value="${p.productName }"></td></tr>
<tr><td>상품가격</td><td><input type=text value="${p.productPrice }"></td></tr>
<tr><td>상품설명</td><td><textarea rows=6 cols=30>${p.productDesc }</textarea> </td></tr>
<tr><td>구매수량</td><td colspan=2><input type=number name=amount min=1 max=5></td></tr>
<tr><td>등록날짜</td><td colspan=2>&ensp;<fmt:formatDate value="${p.productDate}" pattern="yyyy-MM-dd" /></td></tr>
<tr><td colspan=3 align=center>
<input type=submit value="구매하기" formaction="${path}/cartinsert.do">
<input type=submit value="목록보기" formaction="${path}/productselectAll.do">
<input type=submit value="삭제하기" formaction="${path}/productdelete.do">
</td>
</table>

</form>
 </div>
 <br> 
 </section>
 <c:import url="/include/bottom.jsp" />