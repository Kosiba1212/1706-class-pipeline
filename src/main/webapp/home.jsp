<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1><%=request.getParameter("username") %>You are now logged in!</h1>
	
	<a href="aboutMe">Click to go to the about me page</a>
</body>
</html>