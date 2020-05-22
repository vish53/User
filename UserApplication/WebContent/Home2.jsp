<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<%
	if(session.getAttribute("lastName")==null)
	{
		response.sendRedirect("Error.jsp");
	}
%>
<h3>Welcome ${lastName }</h3>
</center>
</body>
</html>