<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>����û�</title>
</head>
<body>
<center>
	<h2>����û�</h2>
	<s:actionerror/>
	<s:form action="add">
		<s:textfield label="�û���" name="username"></s:textfield>
		<s:password label="����" name="password"></s:password>
		<s:textfield label="����" name="age"></s:textfield>
		<s:textfield name="birth" label="Format (MM/DD/YEAR)" ></s:textfield>
		<s:textfield label="Type" name="type"></s:textfield>
		<s:submit value="�ύ"></s:submit>
		<s:reset value="����"></s:reset>
	</s:form>	
</center>
</body>
</html>