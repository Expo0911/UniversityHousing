<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Lease List</title>
</head>
<body>
<center>
	<h2>Former Lease List</h2>
	<table border="1">
		
		<tr>
			<td>Lease ID</td>
			<td>Student ID</td>	
			<td>House ID</td>
			<td>Room ID</td>
			<td>Room number</td>
			<td>Duration</td>
			<td>Enter Date</td>
			<td>Leave Date</td>
			<td>Deposit</td>	
			<td>Payment</td>
			<td>Penalty</td>
		</tr>
		<s:iterator value="#request.all" id="lease">
		<tr>
			<td><a href="showLease.action?id=<s:property value='#lease.id'/>"><s:property value="#lease.id"/></a></td>	
			<td><s:property value="#lease.studentId"/></td>
			<td><s:property value="#lease.houseId"/></td>
			<td><s:property value="#lease.roomId"/></td>
			<td><s:property value="#lease.roomNum"/></td>
			<td><s:property value="#lease.duration"/></td>
			<td><s:property value="#lease.enterDate"/></td>
			<td><s:property value="#lease.leaveDate"/></td>
			<td><s:property value="#lease.deposit"/></td>
			<td><s:property value="#lease.payment"/></td>
			<td><s:property value="#lease.penalty"/></td>
		</tr>
		</s:iterator>	
	</table>
	<a href="leaseOptions.jsp">Back</a>		
</center>
</body>
</html>