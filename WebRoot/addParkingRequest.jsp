<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Add New Parking Request</title>
</head> 
<body>
	<center>
		<h2>Add New Parking Request</h2>
		<s:actionerror />
		<s:form action="addParkingRequest">

	
		
		<s:select label="Select a vehicle Type: " 
		list="#{'small car':'small car', 'large car':'large car', 'bike':'bike', 'handicapped':'handicapped'}" 
		name="classification" value="small car"/>
		
   		<s:select label="Accept non-nearby spot assignment or not" 
		list="#{'1':'yes', '0':'no'}" 
		name="nearby" value="1" />

			<s:submit value="Submit"></s:submit>
			<s:reset value="Reset"></s:reset>

		</s:form>
		<a href="parkingOptions.jsp">Back to Request</a>
	</center>
</body>
</html>