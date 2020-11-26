<%@page import="dao.RegisterDao"%>
<%@page import="model.Member"%> 
<%@page import="servlets.Register"%> 
<%@page import="java.util.ArrayList"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Invitation</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<style type="text/css">
form {
  border: 3px solid #778899;
  text-align: center;
  margin: 0 auto; 
  width:350px;
}

input[type=text], input[type=password], input[type=email] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

/* Extra style for the cancel button (red) */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the avatar image inside this container */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

/* Avatar image */
img.avatar {
  width: 70%;
  border-radius: 70%;
}

/* Add padding to containers */
.container {
  padding: 16px;
}

/* The "Forgot password" text */
span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
    display: block;
    float: none;
  }
  .cancelbtn {
    width: 100%;
  }
  
</style>
</head>
<body>
	<form action="/ncp-proj-trial-1/reg" method="post" >
	  <div class="imgcontainer">
	    <img src="sanjana/register/bg-01.jpg" alt="Avatar" class="avatar">
	  </div>

				
				  
		<table>
			<tr >
				<td>First Name</td>
				<td><input type="text" name="fname" placeholder="Enter First name" required></td>
			</tr>
			<tr >
				<td>Last Name</td>
				<td><input type="text" name="lname" placeholder="Enter Last name" required></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" size="30" name="email" placeholder="Enter email addess" required></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="phone" placeholder="Enter phone number" required></td>
			</tr>
			
			<tr>
				<td>Event Name</td>
				
				<td>
				<%ArrayList<Member> events = (ArrayList<Member>)request.getAttribute("listCategory"); %>
				
			    <select name="eventname" >
				    <%
					    for(Member event: events)
					    {%>
					    	<option value ="<%=event.getEvent_name()%>||<%=event.getEvent_id()%>"><%=event.getEvent_name()%></option>
					    <%} %>
			    </select>
			    
			    </td> 		    	
			
			</tr>
			
			<tr>
				<td></td>
				<td><button type="submit" name="register">Register</button></td>
			</tr>
		</table>
	</form>
</body>
</html>