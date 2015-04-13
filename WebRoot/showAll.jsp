<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>用户列表</title>
</head>
<body>
<center>
	<h2>用户列表</h2>
	<table border="1">
		
		<tr>
			<td>用户ID</td>
			<td>用户名</td>	
			<td>密码</td>
			<td>Type</td>
			<td>是否删除</td>
			<td>是否更新</td>		
		</tr>
		<s:iterator value="#request.all" id="user">
		<tr>
			<td><a href="showUser.action?id=<s:property value='#user.id'/>"><s:property value="#user.id"/></a></td>
			<td><s:property value="#user.username"/></td>	
			<td><s:property value="#user.password"/></td>
			<td><s:property value="#user.type"/></td>
			<td><a href="delete.action?id=<s:property value='#user.id'/>">删除</a></td>
			<td><a href="update.jsp?id=<s:property value='#user.id'/>">更新</a></td>	
		</tr>
		</s:iterator>	
	</table>
	<a href="add.jsp">添加新用户</a>		
</center>
</body>
</html>