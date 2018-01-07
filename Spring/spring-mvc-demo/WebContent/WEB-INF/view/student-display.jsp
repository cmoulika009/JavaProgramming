<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- This JSTL tag is used to get & print array values -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Confirmation Page</title>
</head>
<body>

	<!-- This call getter methods of respective attribute -->
	Student is registered with details: ${student.firstName}
	${student.lastName}
	
	<br /> Country of Student is: ${student.country}
	
	<br /> Gender: ${student.gender}
	
	<!-- Print Array Values in HTML Form -->
	<br /> Programming Skills:
	<ul>
		<c:forEach var="temp" items="${student.language}">
			<li>${temp}</li>
		</c:forEach>
	</ul>

</body>
</html>