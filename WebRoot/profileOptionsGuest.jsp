<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Profile Options</title>
	<link href="<%=request.getContextPath()+"/css/style.css"%>" rel="stylesheet" type="text/css" />
<style>
#header {
	background-color: grey;
	color: white;
	text-align: center;
	padding-top: 30px;
    padding-right: 50px;
    padding-bottom: 30px;
    padding-left: 50px;
} 
</style>
</head>

<body style="font-family: sans-serif; font-weight:lighter ">
	
	<div id="header">
		<%
				out.print("<font size='5'>Welcome to University Housing System</font>");
		%>
	</div>
	<br><br><br>
	<div align="center">
	<h2>Logged in Student->Profile Options</h2>
		<br><a href="<%="showGuest.action?id="+session.getAttribute("login")%>" style="color: midnightblue;">View Profile</a>
		<br><br><a href="<%="updateGuest.jsp?id="+session.getAttribute("login")%>" style="color: midnightblue;">Update Profile</a>
		<br><br><a href="student.jsp" style="color: midnightblue;">Back</a>
		<br><HR><br>
		
	</div>
	<br><br><br>
	<div id="footer">Copyright ©2015 CSC540 Database Team.</div>
</body>
</html>
