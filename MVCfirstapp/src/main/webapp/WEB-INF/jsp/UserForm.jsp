<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
<!DOCTYPE html>
<html>
<head>
<style>
.error{color:red}
</style>
</head>
<body>
<h1>WELCOME  </h1>
<form:form action="process" modelAttribute="Userdata">
<h3>Input Name</h3>
<form:input path="name"/>
<form:errors path="name" cssClass="error"> </form:errors>
<br><br>
<h3>Input password</h3>
<form:input path="pwd"/>
<form:errors path="pwd" cssClass="error" ></form:errors>
<br><br>
<h3>Input Age</h3>
<form:input path="age"/>
<form:errors path="age" cssClass="error"></form:errors>
<br><br>
<h3>Input Email</h3>
<form:input path="email"/>
<form:errors path="email" cssClass="error"> </form:errors>
<br><br>
<h3>Input Phone</h3>
<form:input path="phone"/>
<form:errors path="phone" cssClass="error"> </form:errors>
<br><br>

	
<form:button>Sign UP</form:button>
</form:form> 
</body>
</html>