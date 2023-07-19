<%@ page language="java" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%> 
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <c:import url="/include/top.jsp" />
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=20f5bcf9cafa865bd0c38622d86f21ae"></script>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(${m.latitude }, ${m.logitude }), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

// 마커가 표시될 위치입니다 
var markerPosition  = new kakao.maps.LatLng(${m.latitude }, ${m.logitude }); 

// 마커를 생성합니다
var marker = new kakao.maps.Marker({
    position: markerPosition
});

// 마커가 지도 위에 표시되도록 설정합니다
marker.setMap(map);

// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
// marker.setMap(null);    
</script>

 <section>
 <br>
 <div align=center>
 <h2> 업체상세 페이지</h2>
 <form action="${path}/listev.do"> 
 <input type=hidden value=${m.idx }>
<table border=1>
<tr><td>회사이름</td><td>${m.entrprsNm }</td></tr>
<tr><td>회사주소</td><td>${m.rdnmadr }</td></tr>
<tr><td>대표자명</td><td>${m.rprsntvNm } </td></tr>
<tr><td>대표물품</td><td>${m.mainGoods } </td></tr>
<tr><td>위도</td><td>${m.latitude } </td></tr>
<tr><td>경도</td><td>${m.logitude }</td></tr>
<tr><td colspan=2><div id="map" style="width:100%;height:350px;"></div></td></tr>
</table>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=${key }"></script>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(${m.latitude }, ${m.logitude }), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

// 마커가 표시될 위치입니다 
var markerPosition  = new kakao.maps.LatLng(${m.latitude }, ${m.logitude }); 

// 마커를 생성합니다
var marker = new kakao.maps.Marker({
    position: markerPosition
});

// 마커가 지도 위에 표시되도록 설정합니다
marker.setMap(map);

// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
// marker.setMap(null);    
</script>


</form>
 </div>
 <br> 
 </section>
 <c:import url="/include/bottom.jsp" />