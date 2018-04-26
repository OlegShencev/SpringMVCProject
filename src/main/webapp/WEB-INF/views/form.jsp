<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <style type="text/css">
        .error {
            color: red;
        }
    </style>
</head>

<body>
<h3>Welcome, Enter Person Details</h3>
<form:form method="POST" action="/addPerson" modelAttribute="person">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
            <form:errors path="name" cssClass="error"></form:errors>
        </tr>
        <tr>
            <td><form:label path="age">Age</form:label></td>
            <td><form:input path="age"/></td>
            <form:errors path="age" cssClass="error"></form:errors>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>