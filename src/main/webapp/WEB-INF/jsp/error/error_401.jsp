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
	 		<i class="fa fa-warning"></i>
	 		<strong>해당 페이지에 접근 권한이 없습니다</strong>
	 		<span>이용에 불편을 드려 죄송합니다</span>
	 	</div>
	</div>
	<!-- //contents -->
</body>
</html>