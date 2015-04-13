<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title> Requests List</title>
</head>
<body>
	<center>
		<h2> Request List</h2>
		<h3>Lease Request List</h3>
		<table border="1">
			<tr>
				<td>id</td>
				<td>Student id</td>
				<td>Preference1</td>
				<td>Preference2</td>
				<td>Preference3</td>
				<td>Payment Method</td>
				<td>Start Date</td>
				<td>End Date</td>
				<td>Status</td>
				<td>Approve/Waiting List</td>

			</tr>
			<s:iterator value="#request.req" id="lease">
				<tr>
					<td><s:property value="#lease.id" /></a></td>
					<td><s:property value="#lease.studentId" /></td>
					<td><s:property value="#lease.preference1" /></td>
					<td><s:property value="#lease.preference2" /></td>
					<td><s:property value="#lease.preference3" /></td>
					<td><s:property value="#lease.paymentMethod" /></td>
					<td><s:property value="#lease.startDate" /></td>
					<td><s:property value="#lease.endDate" /></td>
					<td><s:property value="#lease.status" /></td>
					<s:if test="%{#lease.status!='Approved' }"><td><a href="formLease.action?id=<s:property value='#lease.id'/>">Process</a></td></s:if>
					<s:else><td>Processed</td></s:else>
				</tr>
			</s:iterator>
		</table>
		
		<a href="admin.jsp">Back</a>
	</center>
</body>
</html>