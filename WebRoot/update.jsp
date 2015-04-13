<%@page import="com.javaweb.service.UserService"%>
<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>更新用户</title>
</head>
<body>
<center>
	<h2>更新用户</h2>
	<s:actionerror/>
	<s:form action="update">
		<s:set name="id" value="#parameters.id[0]"></s:set>
		<s:textfield label="用户ID" name="id"></s:textfield>
		<s:textfield label="用户名" name="username"></s:textfield>
		<s:password label="密码" name="password"></s:password>
		<s:textfield label="年龄" name="age"></s:textfield>
		<s:textfield label="生日" name="birth"></s:textfield>
		<s:textfield label="Type" name="type"></s:textfield>
		<s:submit value="更新"></s:submit>
		<s:reset value="重置"></s:reset>
	</s:form>
</center>
</body>
</html>