<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>

	<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer salary = (Integer) request.getAttribute("salary");

	out.println("Id: " + id + "<br />");
	out.println("Name: " + name + "<br />");
	out.println("Salary: " + salary + "<br />");
	%>

	<br /> Id :
	<b> ${id}</b>
	<br /> Name :
	<b> ${name}</b>
	<br /> Salary :
	<b> ${salary}</b>

</body>
</html>