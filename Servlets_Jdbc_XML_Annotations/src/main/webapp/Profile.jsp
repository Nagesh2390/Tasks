<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="Header.jsp" %>
<body text-align="center">
Hello you have successfully logged in
<br>
Would you like to view Student Records?<br>
Click Below
<br>
<a href="Enter_PinNumber.html">See Specific Record</a><br>
<a href="getAllRecords">See All Records</a><br>
<a href="InsertRecords.html">Insert Records</a><br>
<a href="UpdateRecord.html">Update Records</a><br>
<a href="Delete.html">Delete Records</a><br>
<a href="logout">LogOut</a>
</body>
<%@include file="Footer.jsp" %>
</html>