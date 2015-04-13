<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Lease</title>
</head>
<body>
<center>
	<h2>Lease</h2>
	<table border="1">
		<s:set name="lease" value="#request.lease"/>
		<tr>
			<td>Lease ID</td>
			<td><s:property value="#lease.id"/></td>
		</tr>
		<tr>	
			<td>Student ID</td>	
			<td><s:property value="#lease.studentId"/></td>	
		</tr>
		<tr>
			<td>House ID</td>
			<td><s:property value="#lease.houseId"/></td>
		</tr>
		<tr>
			<td>Room ID</td>
			<td><s:property value="#lease.roomId"/></td>
		</tr>
		<tr>
			<td>Parking ID</td>
			<td><s:property value="#lease.parkingId"/></td>
		</tr>
		<tr>
			<td>Room number</td>
			<td><s:property value="#lease.roomNum"/></td>			
		</tr>	
		<tr>
			<td>Duration</td>
			<td><s:property value="#lease.duration"/></td>			
		</tr>
		<tr>
			<td>Enter Date</td>
			<td><s:property value="#lease.enterDate"/></td>			
		</tr>
		<tr>
			<td>Leave Date</td>
			<td><s:property value="#lease.leaveDate"/></td>			
		</tr>
		<tr>
			<td>Deposit</td>
			<td><s:property value="#lease.deposit"/></td>			
		</tr>
		<tr>
			<td>Payment</td>
			<td><s:property value="#lease.payment"/></td>			
		</tr>
		<tr>
			<td>Penalty</td>
			<td><s:property value="#lease.penalty"/></td>			
		</tr>
		<tr>
			<td>Inspect Date</td>
			<td><s:property value="#lease.inspectDate"/></td>			
		</tr>			
	</table>
	<a href="leaseOptions.jsp">Back</a>		
</center>
</body>
</html>