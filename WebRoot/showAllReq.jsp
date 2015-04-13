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
				<td>Student/Approved id</td>
				<td>Preference1</td>
				<td>Preference2</td>
				<td>Preference3</td>
				<td>Payment Method</td>
				<td>Start Date</td>
				<td>End Date</td>
				<td>Status</td>
				

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
					
				</tr>
			</s:iterator>
		</table>
		<h3>Terminal Request List</h3>
		<table border="1">
			<tr>
				<td>id</td>
				<td>Lease Id</td>
				<td>Reason</td>
				<td>Submit Date</td>
				<td>Inspection Date</td>
				<td>Extra Fee </td>
				<td>Status</td>

			</tr>
			<s:iterator value="#request.termin" id="ter">
				<tr>
					<td><s:property value="#ter.id" /></a></td>
					<td><s:property value="#ter.leaseId" /></td>
					<td><s:property value="#ter.reason" /></td>
					<td><s:property value="#ter.date" /></td>
					<td><s:property value="#ter.inspectionDate" /></td>
					<td><s:property value="#ter.extraFee" /></td>
					<td><s:property value="#ter.status" /></td>
				</tr>
			</s:iterator>
		</table>
		<a href="requestViewCancel.jsp">Back</a>
	</center>
</body>
</html>