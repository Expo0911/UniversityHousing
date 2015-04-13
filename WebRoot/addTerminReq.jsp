<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Terminate lease request</title>
</head>
<body>
<center>
	<h2>Terminate lease request</h2>
	<s:actionerror/>
	<s:form action="addTerminReq">
		<s:textfield label="reason" name="reason"></s:textfield>
		<s:textfield name="inspectionDate" label="Desired termination date (MM/DD/YEAR)" ></s:textfield>
		<s:submit value="Submit"></s:submit>
		<s:reset value="Reset"></s:reset>
	</s:form>	
	<a href="requestOptions.jsp">Back to Request Options</a>
	<a href="showLeaseStatus.action">Show Your Lease Status</a>
</center>
</body>
</html>