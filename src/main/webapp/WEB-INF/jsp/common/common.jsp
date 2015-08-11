<%-- =================================================================
JSTL 선언 및 기본적인 전역변수 선언
================================================================== --%>
<%-- 인코딩 선언 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%-- JSP EL 사용설정 --%>
<%@ page isELIgnored="false" %>
<c:set var="_ctx" 				value="${pageContext.request.contextPath}" 	scope="request" />
<c:set var="_resource" 	value="${_ctx}/resources" scope="request" />
<%-- =================================================================
//JSTL 선언 및 기본적인 전역변수 선언
================================================================== --%>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="" />
<meta name="author" content="" />
<title><c:if test="${_currentMenu != null}">${_currentMenu.name}</c:if></title>
<link rel="shortcut icon" href="${_resource}/images/favicon.png">

<%-- =================================================================
JS 전역변수 선언
================================================================== --%>
<script>
	var _ctx		= "${_ctx}";
	
	var _resource	= "${_resource}";
</script>
<%-- =================================================================
//JS 전역변수 선언
================================================================== --%>


<%-- =================================================================
CSS 
================================================================= --%>
<%-- Custom Fonts --%>
<link href="${_resource}/css/font-awesome.min.css" 				rel="stylesheet">
<%-- Bootstrap --%>
<link href="${_resource}/lib/bootstrap/css/bootstrap.min.css" 	rel="stylesheet">
<%-- UI CSS --%>
<link href="${_resource}/css/ui.css" 							rel="stylesheet">
<%-- =================================================================
//CSS 
================================================================= --%>

<%-- =================================================================
IE9 이하 HTML5 마크업 호환 스크립트
================================================================= --%>

<%-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries --%>
<%-- WARNING: Respond.js doesn't work if you view the page via file:// --%>
<%--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]--%>
<%-- =================================================================
//IE9 이하 HTML5 마크업 호환 스크립트
================================================================= --%>
   
<%-- =================================================================
LIB
================================================================= --%>

<%-- Jquery --%>
<script src="${_resource}/lib/jquery/jquery-1.11.0.min.js"></script>

<%-- Bootstrap --%>
<script src="${_resource}/lib/bootstrap/js/bootstrap.min.js"></script>

<%-- AngularJS --%>
<script src="${_resource}/lib/angular/angular.js"></script>

<%-- Alert --%>
<script src="${_resource}/lib/common/toaster.js"></script>

<%-- Custom --%>
<script src="${_resource}/lib/common/TweenMax.min.js"></script>
<script src="${_resource}/lib/common/resizeable.js"></script>
<script src="${_resource}/js/app.js"></script>
<script src="${_resource}/js/controllers.js"></script>

<%-- Common --%>
<script src="${_resource}/lib/common/common.js"></script>  

<%-- =================================================================
//LIB 
================================================================= --%>