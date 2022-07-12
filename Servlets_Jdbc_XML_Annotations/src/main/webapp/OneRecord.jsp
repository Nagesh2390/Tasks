<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="Header.jsp" %>
<body>
	<table align="center">
		<tr>
			<td>Pin Number</td>
			<td>Name</td>
			<td>Gender</td>
			<td>Marks</td>
		</tr>
		
		<tr>
			<td>${Student.name}</td>
			<td>${Student.gender}</td>
			<td>${Student.telugu}</td>
			<td>${Student.english}</td>
			<td>${Student.maths}</td>
		</tr>
	
	</table>
</body>
<%@include file="Footer.jsp" %>
</html>