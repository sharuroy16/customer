<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<title>Customer</title>
	<%@ page isELIgnored="false" %>
	<link href="resources/css/table.css" rel="stylesheet" media="screen">
</head>
<body>
	<div align="center">
		<br>
		<h5><img alt="BlaSec Logo" src="resources/images/logo.png" width="300"></h5>
		<br>
		<h3 style="color: #cc0000;">- HOME -</h3>
		<hr>
		<h5><a href="add">Add new login credentials</a></h5>
		<br>
		<h3>Login Details</h3>
		<table border="1" cellpadding="5" id="index">
			<tr>
				<th>ID</th>
				<th>User Name</th>
				<th>User Password</th>
			</tr>
			<c:forEach items="${loginDetails}" var="loginDetails">
			<tr>
				<td>${loginDetails.id}</td>
				<td>${loginDetails.username}</td>
				<td>${loginDetails.userpassword}</td>
				<td>
					<a href="edit?id=${loginDetails.id}">Edit</a>&nbsp;&nbsp;&nbsp;<a href="delete?id=${loginDetails.id}">Delete</a>
				</td>
			</tr>
			</c:forEach>
		</table>
		<br>
	</div>	
</body>
</html>