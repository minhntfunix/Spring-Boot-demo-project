<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

<table>

		<tr>
			<th>id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Date of birth</th>
			<th>email</th>
			<th>Action</th>
			<th>Action</th>
		</tr>

		
		<c:forEach var="student" items="${student}">
		<tr>

			<td>${student.id}</td>
			<td>${student.firstName}</td>
			<td>${student.lastName}</td>
			<td>
			
			<fmt:formatDate value="${student.dob}" 
                type="date" pattern="dd-MM-yyyy" />
		
			
			
			</td>
			<td>${student.email}</td>
			<td>
	<a href="${pageContext.request.contextPath}/student/delete?id=${student.id}">
			
			Delete
			
			</a>
			</td>
			
			
			<td>
	<a href="${pageContext.request.contextPath}/student/showFormUpdate?id=${student.id}">
			
			Update
			
			</a>
			
			
			</td>
		</tr>
		</c:forEach>




	</table>

	
	
	

	<a href="/" > Go back to the homepage</a>

	
</body>
</html>