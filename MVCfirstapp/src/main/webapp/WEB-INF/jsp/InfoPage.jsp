<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User profile Page</h1>
  <table>
    <tr>
      <td>First Name</td>
      <td>${user.name}</td>
    </tr>
    <tr>
      <td>Phone </td>
      <td>${user.phone}</td>
    </tr>
      <tr>
      <td>Age</td>
      <td>${user.age}</td>
    </tr>
  </table>

</body>
</html>