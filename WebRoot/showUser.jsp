<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>�û���ϸ��Ϣ</title>
</head>
<body>
<center>
	<h2>�û���ϸ��Ϣ</h2>
	<table border="1">
		<s:set name="user" value="#request.user"/>
		<tr>
			<td>�û�ID</td>
			<td><s:property value="#user.id"/></td>
		</tr>
		<tr>	
			<td>�û���</td>	
			<td><s:property value="#user.username"/></td>	
		</tr>
		<tr>
			<td>����</td>
			<td><s:property value="#user.password"/></td>
		</tr>
		<tr>
			<td>����</td>
			<td><s:property value="#user.age"/></td>
		</tr>
		<tr>
			<td>��������</td>
			<td><s:property value="#user.birth"/></td>
		</tr>
		<tr>
			<td>Type</td>
			<td><s:property value="#user.type"/></td>			
		</tr>	
	</table>
	<a href="showAll.action">�����û��б�</a>		
</center>
</body>
</html>