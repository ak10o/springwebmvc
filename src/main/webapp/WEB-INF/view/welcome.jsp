<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the world of Spring</title>
</head>
<body>
	Hello <b><%= request.getParameter("studentName") %></b>!
	
	<br>
	
	The message: <%= request.getAttribute("message") %>
</body>
</html>