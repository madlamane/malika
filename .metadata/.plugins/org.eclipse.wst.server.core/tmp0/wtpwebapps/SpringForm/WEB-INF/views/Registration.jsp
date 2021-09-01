<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<div align="center">
		<form:form action="Registered" method="post" commandName="userForm">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Spring MVC Form Demo Registration</h2>
					</td>
					</tr>
					<tr>
					<td>User Name: </td>
					<td><form:input path="username" /></td>
					</tr>
					
					<tr>
					<td>Password: </td>
					<td><form:password path="password" /></td>
					</tr>
					
					<tr>
					<td>E-mail: </td>
					<td><form:input path="email" /></td>
					</tr>
					
					<tr>
					<td>Birthday (mm/dd/yyyy): </td>
					<td><form:input path="birthDate" /></td>
					</tr>
					
					<tr>
					<td>Profession: </td>
					<td><form:select path="profession" items="${professionalList}" /></td>
					</tr>
					
					<tr>
					<td colspan="2" align="center"><input type="submit" value="Register">
					</td>
					</tr>
					
					
			
			</table>
		
		
		</form:form>
	</div>

</body>
</html>