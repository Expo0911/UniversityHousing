<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>用户详细信息</title>
</head>
<body>
<center>
	<h2>用户详细信息</h2>
	<table border="1">
		<s:set name="user" value="#request.user"/>
		<tr>
			<td>用户ID</td>
			<td><s:property value="#user.id"/></td>
		</tr>
		<tr>	
			<td>用户名</td>	
			<td><s:property value="#user.username"/></td>	
		</tr>
		<tr>
			<td>密码</td>
			<td><s:property value="#user.password"/></td>
		</tr>
		<tr>
			<td>年龄</td>
			<td><s:property value="#user.age"/></td>
		</tr>
		<tr>
			<td>出生日期</td>
			<td><s:property value="#user.birth"/></td>
		</tr>
		<tr>
			<td>Type</td>
			<td><s:property value="#user.type"/></td>			
		</tr>	
	</table>
	<a href="showAll.action">返回用户列表</a>		
</center>
</body>
</html>