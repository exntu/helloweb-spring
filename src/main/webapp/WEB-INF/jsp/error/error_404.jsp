<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%-- 공통 Variable & CSS & JS --%>
	<%@ include file="/WEB-INF/jsp/common/common.jsp" %>
	<%-- //공통 Variable & CSS & JS --%>
</head>
<body>
	<%-- Loading --%>
	<div id="_loading" class="page-loading-overlay" style="display:none">
		<div class="loader-2"></div>
	</div>
	<%-- //Loading --%>
	
	<!-- contents -->
	<div class="col-md-6 col-md-offset-3">
	 	<div class="sk-ui-error">
	 		<span class="error">Error 404</span>
	 		<strong>요청하신 페이지를 찾을 수 없습니다</strong>
	 		<span>입력하신 페이지 주소가 정확한지 다시 한번 확인해 보시기 바랍니다</span>
	 	</div>
	</div>
	<!-- //contents -->
</body>
</html>