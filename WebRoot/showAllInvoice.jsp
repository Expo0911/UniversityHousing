<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Invoice List</title>
</head>
<body>
<center>
	<h2>Invoice List</h2>
	<table border="1">
		
		<tr>
			<td>List ID</td>
			<td>Lease ID</td>	
			<td>Pay Date</td>
			<td>Pay Method</td>
			<td>Status</td>
			<td>Penalty</td>
			<td>Damage Charge</td>
			<td>Late Fee</td>
			<td>Total</td>	
		</tr>
		<s:iterator value="#request.all" id="invoice">
		<tr>
			<td><a href="showInvoice.action?id=<s:property value='#invoice.id'/>"><s:property value="#invoice.id"/></a></td>	
			<td><s:property value="#invoice.leaseId"/></td>
			<td><s:property value="#invoice.payDate"/></td>
			<td><s:property value="#invoice.payMethod"/></td>
			<td><s:property value="#invoice.status"/></td>
			<td><s:property value="#invoice.penalty"/></td>
			<td><s:property value="#invoice.damageCharge"/></td>
			<td><s:property value="#invoice.lateFee"/></td>
			<td><s:property value="#invoice.total"/></td>
		</tr>
		</s:iterator>	
	</table>
	<a href="invoiceOptions.jsp">Back</a>		
</center>
</body>
</html>