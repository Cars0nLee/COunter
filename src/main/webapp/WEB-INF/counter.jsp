<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter2</title>
</head>
<body>
	<h2>You have visited this server <c:out value="${count2}" /> times.</h2>
	<a href="http://localhost:8080"> Test another visit?</a>
</body>
</html>
