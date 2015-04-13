
<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Parking Request Status</title>
</head>
<body>
<center>
	<h2>Parking Request Status</h2>
	<table border="1">
		
		<tr>
			<td>ID</td>
			<td>Student_ID</td>
			<td>Status</td>
			<td>classification</td>
			<td>Non-nearby</td>
		</tr>
		<s:iterator value="#request.all" id="spot">
		<tr>
			<td><s:property value="#spot.id"/></td>
			<td><s:property value="#spot.studentId"/></td>
			<td><s:property value="#spot.status"/></td>
			<td><s:property value="#spot.classification"/></td>
			<td><s:property value="#spot.nearby"/></td>
		</tr>
		</s:iterator>	
	</table>
	<a href="parkingOptions.jsp">Back to Parking</a>
</center>
</body>
</html>