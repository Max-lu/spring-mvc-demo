<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: max.lu
  Date: 2016/4/21
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1>error</h1>
<form:form commandName="errors">
  <form:errors path="*"/>
</form:form>

