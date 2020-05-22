<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<!-- <script type="text/javascript">
function validateform(){  
	var userName=document.myform.userName.value;  
	var password=document.myform.password.value;  
	  
	if (userName==null || userName==""){  
	  alert("Name can't be blank");  
	  return false;  
	}else if(password.length<6){  
	  alert("Password must be at least 6 characters long.");  
	  return false;  
	  }  
	}  

</script> -->
<center>
	<h3>USER LOGIN</h3>
 <form action="Login" method="post" onsubmit="validateform()">
 
 <table border="2">
 	<tr><td>Enter UserName :</td><td><input type="text" name="userName"></td></tr>
 	<tr><td>Enter Password :</td><td><input type="password" name="password"></td></tr>
 	<table>
 	<tr><td colspan="1"><input type="submit" value="Login" align="left"></td><td><input type="reset" value="Reset"></td></tr>
 	</table>
 	</table>
 </form>
 <a href="Register.jsp"><input type="button" value="Register"></a>
 </center>
</body>
</html>