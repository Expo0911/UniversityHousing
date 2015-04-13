<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Ticket Information</title>
</head>
<body>
<center>
	<h2>Detained Information of Ticket</h2>
	<table border="1">
		<s:set name="ticket" value="#request.ticket"/>
		<tr>
			<td>Ticket ID</td>
			<td><s:property value="#ticket.id"/></td>
		</tr>
		<tr>	
			<td>Student ID</td>	
			<td><s:property value="#ticket.studentId"/></td>	
		</tr>
		<tr>
			<td>Type</td>
			<td><s:property value="#ticket.type"/></td>
		</tr>
		<tr>
			<td>Date</td>
			<td><s:property value="#ticket.date"/></td>
		</tr>
		<tr>
			<td>Issue</td>
			<td><s:property value="#ticket.location"/></td>
		</tr>
		<tr>
			<td>Comments</td>
			<td><s:property value="#ticket.description"/></td>			
		</tr>	
		<tr>
			<td>Status</td>
			<td><s:property value="#ticket.status"/></td>
		</tr>
	
	</table>
	<a href="showTicketStatus.action">Back to status list</a>		
</center>
</body>
</html>