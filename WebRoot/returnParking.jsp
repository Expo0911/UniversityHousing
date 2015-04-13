<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Return Parking</title>
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
	<h2>Logged in Student->Parking Options->Return Parking Spot</h2>
					<tr>
				<form action="returnSpot.action" method="post">
				<td>
					<label for="spot">Enter Parking Spot ID To Return:</label>

					<input type="text" name="id" placeholder="Enter spot id" required>
				</td>
				<td colspan="2" align="center">
					<input type="submit" value="Return Spot" style="width: 116px">
					&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" value="Back" style="width:50px" onclick="javascript:window.location='parkingOptions.jsp';">
				</td>
				</form>
			</tr>
		
	</div>
	<br><br><br>
	<div id="footer">Copyright ©2015 CSC540 Database Team.</div>
</body>
</html>
