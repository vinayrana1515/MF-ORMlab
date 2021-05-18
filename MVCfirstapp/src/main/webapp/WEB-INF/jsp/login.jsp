  
  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<body>
<h2>Hello World! welcome </h2>

<form:form action="login2" modelAttribute="user" method="get">
<h3>Input Email</h3>
<form:input path="email"/>
<br><br>
<h3>Input password</h3>
<form:input path="pwd"/>
<br><br>
<form:button>Login </form:button>
</form:form>
</body>
</html>