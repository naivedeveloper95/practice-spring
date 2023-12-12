<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.satyam.spring.springmvc.dto.Employee, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Object Details</title>
</head>
<body>

	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");

	for (Employee emp : employees) {
		out.println("<br />");
		out.println(emp.getId());
		out.println(emp.getName());
		out.println(emp.getSalary());
		out.println("<br />");
	}
	%>

</body>
</html>