<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>


<form:form action="/student/submit" modelAttribute="student">
	First Name: <form:input path="firstName"/> 
		<form:errors path="firstName" cssClass="error"></form:errors>
	
	<br>
	Last Name: <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"></form:errors>
		
		
	<br>
	Date of birth: <form:input path="dob"/>
	<form:errors path="dob" cssClass="error"></form:errors>
	
	<br>
	Email: <form:input path="email"/>
	<form:errors path="email" cssClass="error"></form:errors>
	
	<br>
	<input type="submit" value="Submit">
	
	
</form:form>


<a href="/" > Go back to the homepage</a>


</body>
</html>