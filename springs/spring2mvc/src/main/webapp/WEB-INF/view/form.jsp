<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<label>Register</label>
<form action="./form" method="post">
<table>

<tr>
<td>Id</td>
<td><input type="number" name="id"></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td>Gender</td>
<td><input type="text" name="gender"></td>
</tr>
<tr>
<td>DOJ</td>
<td><input type="date" name="doj"></td>
</tr>
<tr>
<td><input type="reset" name="reset"></td>
<td><input type="submit" name="Register"></td>







</table>

</fieldset>
</form>

</body>
</html>