<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Staff</title>
</head>
<body>
<center>
	<h2>Staff List</h2>
	<table border="1">
		
		<tr>
			<td>ID</td>
			<td>fname</td>	
			<td>lname</td>
			<td>address</td>
			<td>city</td>	
			<td>postCode</td>
			<td>birthDate</td>
			<td>gender</td>
			<td>position</td>
			<td>workAt</td>	
		</tr>
		<s:iterator value="#request.all" id="ticket">
		<tr>
			<td><a href="showStaff.action?id=<s:property value='#staff.id'/>"><s:property value="#ticket.id"/></a></td>
			<td><s:property value="#staff.fname"/></td>	
			<td><s:property value="#staff.lname"/></td>
			<td><s:property value="#staff.address"/></td>
			<td><s:property value="#staff.city"/></td>
			<td><s:property value="#staff.postCode"/></td>
			<td><s:property value="#staff.birthDate"/></td>
			<td><s:property value="#staff.gender"/></td>
			<td><s:property value="#staff.position"/></td>
			<td><s:property value="#staff.workAt"/></td>
			
			
			
		</tr>
		</s:iterator>	
	</table>
			
</center>
</body>
</html>