<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>ParkingSpot</title>
</head>
<body>
<center>
	<h2>ParkingSpot</h2>
	<table border="1">
		<s:set name="parkingSpot" value="#request.parkingSpot"/>
		<tr>
			<td>ParkingSpot ID</td>
			<td><s:property value="#parkingSpot.id"/></td>
		</tr>
		<tr>	
			<td>Lot ID</td>	
			<td><s:property value="#parkingSpot.lotId"/></td>	
		</tr>
		<tr>
			<td>Classification</td>
			<td><s:property value="#parkingSpot.classification"/></td>
		</tr>
		<tr>
			<td>Fee</td>
			<td><s:property value="#parkingSpot.fee"/></td>
		</tr>
		<tr>
			<td>Start Date:</td>
			<td><s:property value="#parkingSpot.startDate"/></td>
		</tr>	
		<tr>
			<td>End Date:</td>
			<td><s:property value="#parkingSpot.endDate"/></td>
		</tr>	
	</table>
	<a href="parkingOptions.jsp">Back</a>		
</center>
</body>
</html>