<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:red">Username / Password incorrect</h1>

<form action="./authenticate" method="post">

<input type="text" name="username" placeholder="username here">

<input type="text" name="password" placeholder="password here">

<button>Login</button>

</form>
</body>
</html>