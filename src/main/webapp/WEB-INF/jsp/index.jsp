<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
This is the index page
<br>
<br>
<a href="${pageContext.request.contextPath}/register">Click here to go to Student Registration Form </a>

<hr>
<a href="${pageContext.request.contextPath}/student/list">  Click here to go to Student list </a>
</body>
</html>