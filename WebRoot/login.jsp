<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Log in as Student/Supervisor</title>
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

</script>
	<div align="center">Login as a Student or Supervisor
	<br><br>
		<form action="login.action" method="post">
		<table><tbody>
			<tr>
				<td>
					<label for="user">Unity id:</label>
				</td>
				<td >
					<input type="text" name="id" placeholder="Enter unity id" required>
				</td>
			</tr>
			<tr><td><br></td></tr>
			<tr>
				<td>
					<label for="pwd">Password:</label>
				</td>
				<td>
					<input type="password" name="password" placeholder="Enter password" required>
				</td>
			</tr>
			<tr><td><br></td></tr>
		
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Login" style="width:50px">
					&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" value="Back" style="width:50px" onclick="javascript:window.location='loginInit.jsp';">
					&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" value="Exit" onclick="self.close()" style="width:50px">
				</td>
			</tr>			
		</tbody></table>
		<br> 
		<%
			if(session.getAttribute("login")!="false" && session.getAttribute("login")!=null){
				session.setAttribute("login", null);
				out.print("Successful logged out");
			}
				
			if(session.getAttribute("login")=="false")
				out.print("Wrong Input, Please input again!");
		 %>
		<br>	
		</form>
		
		<br><HR><br>
		
	</div>
	<br><br><br>
	<div id="footer">Copyright ©2015 CSC540 Database Team.</div>
</body>
</html>
