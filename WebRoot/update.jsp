<%@page import="com.javaweb.service.UserService"%>
<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>�����û�</title>
</head>
<body>
<center>
	<h2>�����û�</h2>
	<s:actionerror/>
	<s:form action="update">
		<s:set name="id" value="#parameters.id[0]"></s:set>
		<s:textfield label="�û�ID" name="id"></s:textfield>
		<s:textfield label="�û���" name="username"></s:textfield>
		<s:password label="����" name="password"></s:password>
		<s:textfield label="����" name="age"></s:textfield>
		<s:textfield label="����" name="birth"></s:textfield>
		<s:textfield label="Type" name="type"></s:textfield>
		<s:submit value="����"></s:submit>
		<s:reset value="����"></s:reset>
	</s:form>
</center>
</body>
</html>