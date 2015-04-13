<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Staff detailed information</title>
</head>
<body>
<center>
	<h2>Detailed Information</h2>	
	<table border="1">
		<s:set name="staff" value="#request.staff"/>
		<tr>
			<td>Staff ID</td>
			<td><s:property value="#staff.id"/></td>
		</tr>
		<tr>	
			<td>First Name</td>	
			<td><s:property value="#staff.fname"/></td>	
		</tr>
		<tr>
			<td>Last Name</td>
			<td><s:property value="#staff.lname"/></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><s:property value="#staff.addr"/></td>
		</tr>
		<tr>
			<td>BirthDate</td>
			<td><s:property value="#staff.birthDate"/></td>			
		</tr>
		<tr>
			<td>Gender</td>
			<td><s:property value="#staff.gender"/></td>			
		</tr>
		<tr>
			<td>Position</td>
			<td><s:property value="#staff.Position"/></td>			
		</tr>
		<tr>
			<td>Work At</td>
			<td><s:property value="#staff.workAt"/></td>
			<a href="profileOptionsAdmin.jsp">Back</a>			
		</tr>			
	</table>
			
</center>
</body>
</html>