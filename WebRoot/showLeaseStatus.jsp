<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Check lease status</title>
</head>
<body>
<center>
	<h2>Lease List</h2>
	<table border="1">
		
		<tr>
			<td>ID</td>
			<td>Status</td>
			<td>InspectionDate</td>
		</tr>
		<s:iterator value="#request.all" id="lease">
		<tr>
			<td><a href="showLeaseStatus.action?id=<s:property value='#lease.id'/>"><s:property value="#lease.id"/></a></td>
			<td><s:property value="#lease.status"/></td>
			<td><s:property value="#lease.inspectDate"/></td>
		</tr>
		</s:iterator>	
	</table>
	<a href="addTerminReq.jsp">Back to Termination Request</a>
</center>
</body>
</html>
