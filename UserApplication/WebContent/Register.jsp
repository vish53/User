<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<script type="text/javascript">
function validateform(){  
	var userName=document.myform.userName.value;  
	var password=document.myform.password.value; 
	var firstName=document.myform.firstName.value;
	var lastName=document.myform.lastName.value;
	var confirmPassword=document.myform.confirmPassword.value;
	  
	if (userName==null || userName==""||firstName==null || firstName=="" ||lastName==null || lastName==""){  
	  alert("This field can't be blank");    
	  return false;
	}
	else if(password.length<6 )
		{  
		if(password==confirmPassword)
			return true;
		else
			alert("password doesn't match");
			return false;
		}
	  alert("Password must be at least 6 characters long.");   
	  return false;
	  } 


</script>
<center>
	<h3>USER REGISTRATION</h3>
<form name="myform" action="Register" method="post" onsubmit="return validateform()">
	<table border="2">
	<tr><td>FirstName :</td><td><input type ="text" name="firstName"></td></tr>
	<tr><td>LastName  :</td><td><input type="text" name="lastName"></td></tr>
	<tr><td>Email     :</td><td><input type="email" name="email"></td></tr>
	<tr><td>Contact   :</td><td><input type="tel" name="contact"></td></tr>
	<tr><td>Username  :</td><td><input type="text" name="userName"></td></tr>
	<tr><td>Password  :</td><td><input type="password" name="password"></td></tr>
	<tr><td>ConfirmPassowrd :</td><td><input type="password" name="confirmPassword"></td></tr>
	<tr><td>Address:</td><td><input type="text" name="address"></td></tr>
	<table>
	<tr><td colspan="1"><input type="submit" value="Submit"></td><td><input type="reset" value="Reset"></td></tr></table>
	</table>
	</form>
</center>	
</body>
</html>