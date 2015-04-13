<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>House Options</title>
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
	<h2>Logged in Student->House Options</h2>
		<br><a href="<%="invoiceOptions.jsp"%>" style="color: midnightblue;">View Invoices</a>
		<br><br><a href="<%="leaseOptions.jsp"%>" style="color: midnightblue;">View Leases</a>
		<br><br><a href="requestOptions.jsp" style="color: midnightblue;">New Request</a>
		<br><br><a href="<%="requestViewCancel.jsp"%>" style="color: midnightblue;">View/Cancel Requests</a>
		<br><br><a href="<%="showAllHouse.action"%>" style="color: midnightblue;">View Vacancy Houses</a>
		<%-- <br><a href="<%="showStudent.action?id="+session.getAttribute("login")%>" style="color: midnightblue;">Profile</a> --%>
		<br><br><a href="student.jsp" style="color: midnightblue;">Back</a>
		<br><HR><br>
		
	</div>
	<br><br><br>
	<div id="footer">Copyright ©2015 CSC540 Database Team.</div>
</body>
</html>
