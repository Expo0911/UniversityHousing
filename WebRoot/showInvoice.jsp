<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Invoice</title>
</head>
<body>
<center>
	<h2>Invoice</h2>
	<table border="1">
		<s:set name="invoice" value="#request.invoice"/>
		<tr>
			<td>Invoice ID</td>
			<td><s:property value="#invoice.id"/></td>
		</tr>
		<tr>	
			<td>Lease ID</td>	
			<td><s:property value="#invoice.leaseId"/></td>	
		</tr>
		<tr>
			<td>Pay Date</td>
			<td><s:property value="#invoice.payDate"/></td>
		</tr>
		<tr>
			<td>Pay Method</td>
			<td><s:property value="#invoice.payMethod"/></td>
		</tr>
		<tr>
			<td>Status</td>
			<td><s:property value="#invoice.status"/></td>
		</tr>
		<tr>
			<td>Penalty</td>
			<td><s:property value="#invoice.penalty"/></td>			
		</tr>	
		<tr>
			<td>Damage Charge</td>
			<td><s:property value="#invoice.damageCharge"/></td>			
		</tr>
		<tr>
			<td>Late Fee</td>
			<td><s:property value="#invoice.lateFee"/></td>			
		</tr>
		<tr>
			<td>Total</td>
			<td><s:property value="#invoice.total"/></td>			
		</tr>			
	</table>
	<a href="invoiceOptions.jsp">Return</a>		
</center>
</body>
</html>