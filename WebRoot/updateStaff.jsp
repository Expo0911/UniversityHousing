<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Update Profile</title>
</head>
<body>
<center>
	<h2>Update Profile</h2>
	<s:actionerror/>
	<s:form action="updateStaff">
	<s:set name="id" value="#parameters.id[0]"></s:set>
		<s:textfield label="Staff_id" name="id"></s:textfield>
		<s:password label="password" name="password"></s:password>
		<s:textfield label="First Name" name="fname"></s:textfield>
		<s:textfield label="Last Name" name="lname"></s:textfield>
		<s:textfield label="address" name="addr"></s:textfield>
		<s:textfield label="city" name="city"></s:textfield>
		<s:textfield label="postcode" name="postCode"></s:textfield>
		<s:textfield label="Birthday" name="birthDate"></s:textfield>
		<s:submit value="Confirm"></s:submit>
		<s:reset value="Reset"></s:reset>
	</s:form>
	<a href="profileOptionsAdmin.jsp">Back</a>
</center>
</body>
</html>