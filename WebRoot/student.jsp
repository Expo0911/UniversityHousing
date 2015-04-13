<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Housing System</title>
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
	<h2>Logged in Student/Guest</h2>
	    
		<br><a href="houseOptions.jsp" style="color: midnightblue;">House Options</a>
		<br><br><a href="parkingOptions.jsp" style="color: midnightblue;">Parking Options</a>
		<br><br><a href="maintenanceOptions.jsp" style="color: midnightblue;">Maintenance</a>
		<s:if test="#session.type=='Student'">
		<br><br><a href="profileOptions.jsp" style="color: midnightblue;">Profile</a>
		</s:if>
		
		<s:if test="#session.type=='Family'">
		<br><a href="profileOptions.jsp" style="color: midnightblue;">Profile</a>
		</s:if>
		
		
		<s:if test="#session.type=='guest'">
		<br><br><a href="profileOptionsGuest.jsp" style="color: midnightblue;">Profile</a>
		</s:if>
		
		<br><br><a href="loginInit.jsp" style="color: midnightblue;">Back</a>
	
		<br><HR><br>
		
	</div>
	<br><br><br>
	<div id="footer">Copyright ©2015 CSC540 Database Team.</div>
</body>
</html>
