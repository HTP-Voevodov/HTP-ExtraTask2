<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sing in</title>
</head>
<body>
	<h2>Hello!</h2>
	<form method="post" action="Servlet1">
		<table>
			<tr>
				<td>Login</td>
				<td><input type="text" name="login" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required></td>
			</tr>
		</table>
		<input type="submit" value="Sign in">
	</form>
</body>
</html>