<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Guest Info</title>
</head>
<body>
	<center>
		<h2>Guest Info</h2>
		<table border="1" style="height: 963px; width: 399px; ">
			<s:set name="guest" value="#request.guest" />
			<tr>
				<td>uid</td>
				<td><s:property value="#guest.id" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><s:property value="#guest.password" /></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><s:property value="#guest.fname" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><s:property value="#guest.lname" /></td>
			</tr>
			<tr>
				<td>User Type</td>
				<td><s:property value="#guest.type" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><s:property value="#guest.gender" /></td>
			</tr>
			<tr>
				<td>Tel</td>
				<td><s:property value="#guest.tel" /></td>
			</tr>
			<tr>
				<td>Alternative Tel</td>
				<td><s:property value="#guest.alterTel" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><s:property value="#guest.addr" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><s:property value="#guest.city" /></td>
			</tr>
			<tr>
				<td>PostCode</td>
				<td><s:property value="#guest.postCode" /></td>
			</tr>
			<tr>
				<td>Birth Date</td>
				<td><s:property value="#guest.birthDate" /></td>
			</tr>
			<tr>
				<td>category</td>
				<td><s:property value="#guest.category" /></td>
			</tr>
			<tr>
				<td>Nationality</td>
				<td><s:property value="#guest.nation" /></td>
			</tr>
			<tr>
				<td>Smoker</td>
				<td><s:property value="#guest.smoker" /></td>
			</tr>
			<tr>
				<td>Special Need</td>
				<td><s:property value="#guest.need" /></td>
			</tr>
			<tr>
				<td>Comment</td>
				<td><s:property value="#guest.comment" /></td>
			</tr>
			<tr>
				<td>Status</td>
				<td><s:property value="#guest.status" /></td>
			</tr>
			<tr>
				<td>Courses</td>
				<td><s:property value="#guest.courses" /></td>
			</tr>


		</table>
		<a href="profileOptionsGuest.jsp">Back</a>
	</center>
</body>
</html>