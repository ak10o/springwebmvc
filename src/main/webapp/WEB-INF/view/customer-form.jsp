<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>

	<i>Fill out the form. Asterisk (*) means required.</i>
	<br>
	<br>

	<form:form action="processForm" modelAttribute="customer">
	
	FirstName: <form:input path="firstName" label="firstName" />
		<br>
		<br>
		<br>
	lastName (*): <form:input path="lastName" label="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
	Free Passes: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>

</body>
</html>