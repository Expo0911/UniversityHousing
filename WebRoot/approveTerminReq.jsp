<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title> Requests List</title>
</head>
<body>
	<center>
		<h2>Terminal Request List</h2>
		<table border="1">
			<tr>
				<td>id</td>
				<td>Lease Id</td>
				<td>Reason</td>
				<td>Submit Date</td>
				<td>Inspection Date</td>
				<td>Extra Fee </td>
				<td>Status</td>
				<td>Approve?</td>
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
					<s:if test="%{#ter.status!='Approved'}"><td><a href="updateReq.jsp?id=<s:property value='#ter.id'/>">Approve</a></td></s:if>
					<s:else><td>Approved</td></s:else>
				</tr>
			</s:iterator>
		</table>
		<a href="admin.jsp">Back</a>
	</center>
</body>
</html>