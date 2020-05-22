<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<center>
<%
	if(session.getAttribute("userName")==null)
	{
		response.sendRedirect("Login.jsp");
	}

%>

<h3>Welcome ${userName}</h3>
</center>
</body>
</html>