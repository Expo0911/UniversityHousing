<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Add New Request</title>
</head>
<script type="text/javascript">
function CheckHouses(val,id){
 var element=document.getElementById(id);
 if(val=='Specific Hall')
   element.style.display='inline-block';
 else  
   element.style.display='none';
}
</script> 
<body>
	<center>
		<h2>Add New Request</h2>
		<s:actionerror />
		<s:form action="addRequest">

		<s:if test="%{#session.category!='Freshman'}">
			<s:select label="Select Your First Preferences" onchange='CheckHouses(this.value,"preference1");'
				list="#{'Apartment':'Apartment', 'Residence Hall':'Residence Hall','Specific Hall':'Specific Hall','Off Campus':'Off Campus','Family Apartment':'Family Apartment'}"
				name="preference1" value="Specific Hall" />
			<s:textfield name="preference1" id="preference1" cssStyle='display:none'></s:textfield>
			
			<s:select label="Select Your Second Preferences" onchange='CheckHouses(this.value,"preference2");'
				list="#{'Apartment':'Apartment', 'Residence Hall':'Residence Hall','Specific Hall':'Specific Hall','Off Campus':'Off Campus','Family Apartment':'Family Apartment'}"
				name="preference2" value="Specific Hall" />
			<s:textfield name="preference2" id="preference2" cssStyle='display:none'></s:textfield>
			
			<s:select label="Select Your Third Preferences" onchange='CheckHouses(this.value,"preference3");'
				list="#{'Apartment':'Apartment', 'Residence Hall':'Residence Hall','Specific Hall':'Specific Hall','Off Campus':'Off Campus','Family Apartment':'Family Apartment'}"
				name="preference3" value="Specific Hall" />
			<s:textfield name="preference3" id="preference3" cssStyle='display:none'></s:textfield> 
		</s:if>
		<s:else>
			<s:select label="Select Your First Preferences" onchange='CheckHouses(this.value,"preference1");'
				list="#{'Apartment':'Apartment', 'Residence Hall':'Residence Hall','Specific Hall':'Specific Hall','Family Apartment':'Family Apartment'}"
				name="preference1" value="Specific Hall" />
			<s:textfield name="preference1" id="preference1" cssStyle='display:none'></s:textfield>
			
			<s:select label="Select Your Second Preferences" onchange='CheckHouses(this.value,"preference2");'
				list="#{'Apartment':'Apartment', 'Residence Hall':'Residence Hall','Specific Hall':'Specific Hall','Family Apartment':'Family Apartment'}"
				name="preference2" value="Specific Hall" />
			<s:textfield name="preference2" id="preference2" cssStyle='display:none'></s:textfield>
			
			<s:select label="Select Your Third Preferences" onchange='CheckHouses(this.value,"preference3");'
				list="#{'Apartment':'Apartment', 'Residence Hall':'Residence Hall','Specific Hall':'Specific Hall','Family Apartment':'Family Apartment'}"
				name="preference3" value="Specific Hall" />
			<s:textfield name="preference3" id="preference3" cssStyle='display:none'></s:textfield> 
		</s:else>	
			
			<s:select label="Payment Method"
				list="#{'Monthly':'Monthly', 'Semester':'Once per Semester'}"
				name="paymentMethod" value="Monthly" ></s:select>
   			

			<s:textfield name="startDate"
				label="Start Date (Format (MM/DD/YEAR))"></s:textfield>
			<s:textfield name="endDate" label="Start Date (Format (MM/DD/YEAR))"></s:textfield>

			<s:submit value="Submit"></s:submit>
			<s:reset value="Reset"></s:reset>
    
		</s:form>
		<a href="requestOptions.jsp">Back to Request</a>

	</center>
</body>
</html>