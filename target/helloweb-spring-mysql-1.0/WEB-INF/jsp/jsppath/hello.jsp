<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<body ng-app="myApp">
  <h2>${message}</h2>
  <div ng-controller="helloWorldCtrl">
    <div>Hello {{ name }}!</div>
    <input ng-model="name"></input>
  </div>
  <script src="resources/js/opensource/angular.js"></script>
  <script src="resources/js/app.js"></script>
  <script src="resources/js/controllers.js"></script>
</body>
</html>