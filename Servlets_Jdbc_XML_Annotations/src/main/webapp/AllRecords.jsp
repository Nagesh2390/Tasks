<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Records</title>
</head>
<%@ include file="Header.jsp" %>
<body>
	<h3>See All records</h3>
	<table align="center">
		<tr>
			<td>Pin Number</td>
			<td>Name</td>
			<td>Gender</td>
			<td>Marks</td>
		</tr>
		<tr>
			<c:forEach items="${All}" var="a">
				<td>${a.pinnumber}</td>
				<td>${a.name}</td>
				<td>${a.gender}</td>
				<td>${a.telugu}</td>
			</c:forEach>
		</tr>
	</table>
	<a href="Profile.jsp">Profile</a>
</body>
<%@include file="Footer.jsp" %>
</html>