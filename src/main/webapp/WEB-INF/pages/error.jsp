<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>ERROR-400</h1>

    <table border="1" cellpadding="3" cellspacing="2">
        <thead>
            <tr>
                <th>Field</th>
                <th>Message</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${errors}" var="error">
                <tr>
                    <td>${error.field}</td>
                    <td>${error.message}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>