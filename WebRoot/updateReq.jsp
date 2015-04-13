<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%session.setAttribute("req_id", request.getParameter("id")); %>
<html>
<head>
	<title>Enter Date</title>
</head>
<body>
<center>
	<h2>Please Enter the inspection date and Extra Fees</h2>
	<s:actionerror/>
	<s:form action="updateTerminReq">
		<s:textfield label="Extra Fee" name="extraFee"></s:textfield>
		<s:textfield label="Inspection Date" name="inspectionDate"></s:textfield>
		<s:submit value="Approve"></s:submit>
		<s:reset value="Reset"></s:reset>
		
	</s:form>
	<a href="approveTerminReq.action">Back</a>
</center>
</body>
</html>