<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%> 
 
 <c:import url="/include/top.jsp" />
 <section>
 <br>
 <div align=center>
<form action = "${path}/login.do">
<table border=1>
<tr><td>아이디</td><td><input type=text name=id></td></tr>
<tr><td>비밀번호</td><td><input type=text name=password></td></tr>
<tr><td colspan=2 align=center><input type=submit value=로그인하기></td></tr>
</table>
</form>
 </div>
 <br> 
 </section>
  <c:import url="/include/bottom.jsp" />