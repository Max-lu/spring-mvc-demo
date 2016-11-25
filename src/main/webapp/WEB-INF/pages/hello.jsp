<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="<c:url value="/css/style.css"/>"/>
<html>
<body>
	<h1>${message}</h1>
	<form action="${pageContext.request.contextPath}/login" method="post">
		username:<input type="text" name="username" placeholder="username...">
		password:<input type="password" name="password" placeholder="password">
		nickname:<input type="text" name="nickname" placeholder="nickname...">
		age:<input type="number" name="age" placeholder="age...">
		phone:<input type="text" name="phone" placeholder="phone">
		<input type="submit" value="submit">
	</form>

	<form action="${pageContext.request.contextPath}/login2" method="post">
		username:<input type="text" name="username" placeholder="username...">
		password:<input type="password" name="password" placeholder="password">
		nickname:<input type="text" name="nickname" placeholder="nickname...">
		age:<input type="number" name="age" placeholder="age...">
		phone:<input type="text" name="phone" placeholder="phone">
		<input type="submit" value="submit">
	</form>

	<form:form commandName="loginForm2" action="${pageContext.request.contextPath}/login3" method="post">
		<form:errors path="*" cssClass="error"/>
		<br/>
		username:<form:input path="username" type="text" name="username" placeholder="username..."/>
		password:<form:input path="password" type="password" name="password" placeholder="password"/>
		nickname:<form:input path="nickname" type="text" name="nickname" placeholder="nickname..."/>
		age:<form:input path="age" type="number" name="age" placeholder="age..."/>
		phone:<form:input path="phone" type="text" name="phone" placeholder="phone"/>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>