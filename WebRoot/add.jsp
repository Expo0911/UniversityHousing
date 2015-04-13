<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>添加用户</title>
</head>
<body>
<center>
	<h2>添加用户</h2>
	<s:actionerror/>
	<s:form action="add">
		<s:textfield label="用户名" name="username"></s:textfield>
		<s:password label="密码" name="password"></s:password>
		<s:textfield label="年龄" name="age"></s:textfield>
		<s:textfield name="birth" label="Format (MM/DD/YEAR)" ></s:textfield>
		<s:textfield label="Type" name="type"></s:textfield>
		<s:submit value="提交"></s:submit>
		<s:reset value="重置"></s:reset>
	</s:form>	
</center>
</body>
</html>