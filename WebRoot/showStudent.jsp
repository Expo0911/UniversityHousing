<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Student Info</title>
</head>
<body>
	<center>
		<h2>Student Info</h2>
		<table border="1" style="height: 963px; width: 399px; ">
			<s:set name="student" value="#request.student" />
			<tr>
				<td>uid</td>
				<td><s:property value="#student.id" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><s:property value="#student.password" /></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><s:property value="#student.fname" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><s:property value="#student.lname" /></td>
			</tr>
			<tr>
				<td>User Type</td>
				<td><s:property value="#student.type" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><s:property value="#student.gender" /></td>
			</tr>
			<tr>
				<td>Tel</td>
				<td><s:property value="#student.tel" /></td>
			</tr>
			<tr>
				<td>Alternative Tel</td>
				<td><s:property value="#student.alterTel" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><s:property value="#student.addr" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><s:property value="#student.city" /></td>
			</tr>
			<tr>
				<td>PostCode</td>
				<td><s:property value="#student.postCode" /></td>
			</tr>
			<tr>
				<td>Birth Date</td>
				<td><s:property value="#student.birthDate" /></td>
			</tr>
			<tr>
				<td>category</td>
				<td><s:property value="#student.category" /></td>
			</tr>
			<tr>
				<td>Nationality</td>
				<td><s:property value="#student.nation" /></td>
			</tr>
			<tr>
				<td>Smoker</td>
				<td><s:property value="#student.smoker" /></td>
			</tr>
			<tr>
				<td>Special Need</td>
				<td><s:property value="#student.need" /></td>
			</tr>
			<tr>
				<td>Comment</td>
				<td><s:property value="#student.comment" /></td>
			</tr>
			<tr>
				<td>Status</td>
				<td><s:property value="#student.status" /></td>
			</tr>
			<tr>
				<td>Courses</td>
				<td><s:property value="#student.courses" /></td>
			</tr>


		</table>
		<a href="profileOptions.jsp">Back</a>
	</center>
</body>
</html>