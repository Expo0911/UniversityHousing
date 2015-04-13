<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Maintenance Tickets</title>
</head>
<body>
<center>
	<h2>Ticket List</h2>
	<table border="1">
		
		<tr>
			<td>ID</td>
			<td>StudentID</td>	
			<td>Type</td>
			<td>Date</td>
			<td>Issue</td>	
			<td>Comments</td>
			<td>Status</td>	
		</tr>
		<s:iterator value="#request.ticket" id="ticket">
		<tr>
			<td><s:property value="#ticket.id"/></td>
			<td><s:property value="#ticket.studentId"/></td>	
			<td><s:property value="#ticket.type"/></td>
			<td><s:property value="#ticket.date"/></td>
			<td><s:property value="#ticket.location"/></td>
			<td><s:property value="#ticket.description"/></td>
			<s:if test="%{#ticket.status=='Pending' }"><td><a href="formTicket.action?id=<s:property value='#ticket.id'/>">Process</a></td></s:if>
			<s:else><td>Processed</td></s:else>
			
		</tr>
		</s:iterator>	
	</table>
		<a href="login.action">Back</a>	
</center>
</body>
</html>