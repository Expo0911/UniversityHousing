<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Log in</title>
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
	<h2>Logged in Student->Parking Options</h2>

		<br><a href="<%="addParkingRequest.jsp"%>" style="color: midnightblue;">Request New Parking Spot</a>
		<br><br><a href="<%="showLot.action"%>" style="color: midnightblue;">View Parking Lot Information</a>
		<br><br><a href="showCParkingSpot.action" style="color: midnightblue;">View Current Parking Spot</a>
		<br><br><a href="<%="renewParking.jsp"%>" style="color: midnightblue;">Renew Parking Spot</a>
		<br><br><a href="<%="returnParking.jsp"%>" style="color: midnightblue;">Return Parking Status</a>
		<br><br><a href="<%="showParkingRequest.action"%>" style="color: midnightblue;">View Request Status</a>


		<%-- <br><a href="<%="showStudent.action?id="+session.getAttribute("login")%>" style="color: midnightblue;">Profile</a> --%>
		<br><br><a href="student.jsp" style="color: midnightblue;">Back</a>
		<br><HR><br>
		
	</div>
	<br><br><br>
	<div id="footer">Copyright ©2015 CSC540 Database Team.</div>
</body>
</html>
