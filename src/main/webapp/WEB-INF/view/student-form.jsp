
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	
	<form:form action="processForm" modelAttribute="student">
	
	First Name : <form:input path="firstName" label="firstName"/>
	<br><br>
	Last Name : <form:input path="lastName"/>
	<br><br>
	Country : <form:select path="country">
		<form:options items="${countryOptions}"/>
	</form:select>
	<br><br>
	Favorite Language:
        
        <!-- here we will be pre-loading the data. Spring will call student.getFfavoriteLanguageOptions() -->
        <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  />
	<br><br>
	
	Operating System:
	Linux	<form:checkbox path="operatingSystems" value="Linux"/>
	Mac os	<form:checkbox path="operatingSystems" value="Mac os"/>
	Windows	<form:checkbox path="operatingSystems" value="Windows"/>
	<br><br>
	<input type="submit" value="submit">
	</form:form>
	
</body>
</html>