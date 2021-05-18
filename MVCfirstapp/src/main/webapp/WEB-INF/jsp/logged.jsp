<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Login Success Page</h1>
  <p>You are logged in with email ${user.email}.</p>
  
    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
  <a href="${contextPath}/info">session data</a>
</body>
</html>