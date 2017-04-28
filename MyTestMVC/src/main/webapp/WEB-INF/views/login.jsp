<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="resources/home.css"/>" rel="stylesheet">
<title>Insert title here</title>
</head>

<body>
	<form:form method="POST" action="action" commandName="user" class="box login">

		<fieldset class="boxBody">
			<form:label path="name">Name</form:label>
			<form:input path="name" />
		
			<form:label path="password">Password</form:label>
			<form:input path="password" />
		</fieldset>
		<input type="submit" class="btnLogin" tabindex="4"/>
	</form:form>
</body>
</html>