<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Customer Confirmation</title>
</head>
<body>

	The customer confirmed is: ${customer.firstName} ${customer.lastName} 
	<br><br>
	Free Passes: ${customer.freePasses} 
	<br><br>
	Postal code: ${customer.postalCode} 
	<br><br>
	Course code: ${customer.courseCode} 
</body>
</html>