<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Update Form

<br>

<form:form action="/student/update" modelAttribute="student">
<form:hidden path="id"/>
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