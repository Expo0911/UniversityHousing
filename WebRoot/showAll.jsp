<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>�û��б�</title>
</head>
<body>
<center>
	<h2>�û��б�</h2>
	<table border="1">
		
		<tr>
			<td>�û�ID</td>
			<td>�û���</td>	
			<td>����</td>
			<td>Type</td>
			<td>�Ƿ�ɾ��</td>
			<td>�Ƿ����</td>		
		</tr>
		<s:iterator value="#request.all" id="user">
		<tr>
			<td><a href="showUser.action?id=<s:property value='#user.id'/>"><s:property value="#user.id"/></a></td>
			<td><s:property value="#user.username"/></td>	
			<td><s:property value="#user.password"/></td>
			<td><s:property value="#user.type"/></td>
			<td><a href="delete.action?id=<s:property value='#user.id'/>">ɾ��</a></td>
			<td><a href="update.jsp?id=<s:property value='#user.id'/>">����</a></td>	
		</tr>
		</s:iterator>	
	</table>
	<a href="add.jsp">������û�</a>		
</center>
</body>
</html>