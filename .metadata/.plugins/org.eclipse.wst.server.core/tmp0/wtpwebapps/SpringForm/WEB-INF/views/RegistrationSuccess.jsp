<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Succeeded!</title>

</head>
<body>
	<div align="center">
		<table border="0">
<tr>
<td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
</tr>
<tr>
<td colspan="2" align="center"><h3>Thank you for registering! Here is the review of your detail</h3></td>
</tr>

<tr>
<td>User Name:</td>
<td> ${userForm.username}</td>
</tr>

<tr>
<td>E-mail:</td>
<td> ${userForm.email}</td>
</tr>

<tr>
<td>Birthday:</td>
<td> ${userForm.birthDate}</td>
</tr>

<tr>
<td>Profession:</td>
<td> ${userForm.profession}</td>
</tr>
</table>
</div>

</body>
</html>