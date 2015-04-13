<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Parking Request</title>
</head>
<body>
<center>
	<h2>Parking Request List</h2>
	<table border="1">
		
		<tr>
			<td>ID</td>
			<td>StudentID</td>	
			<td>classification</td>
			<td>nearby</td>
			<td>status</td>	
			
		</tr>
		<s:iterator value="#request.parkingRequest" id="parkingRequest">
		<tr>
			<td><s:property value="#parkingRequest.id"/></td>
			<td><s:property value="#parkingRequest.studentId"/></td>	
			<td><s:property value="#parkingRequest.classification"/></td>
			<td><s:property value="#parkingRequest.nearby"/></td>
			<s:if test="%{#parkingRequest.status=='Pending' }"><td><a href="assignSpot.action?id=<s:property value='#parkingRequest.id'/>">Process</a></td></s:if>
			<s:else><td>Processed</td></s:else>
			
		</tr>
		</s:iterator>	
	</table>
		<a href="admin.jsp">Back</a>	
</center>
</body>
</html>