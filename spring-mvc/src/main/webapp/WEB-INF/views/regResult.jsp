<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Response</title>
</head>
<body>
	User Registered Successfully. User Details are:
	<br />
	<%=request.getAttribute("user")%>
</body>
</html>