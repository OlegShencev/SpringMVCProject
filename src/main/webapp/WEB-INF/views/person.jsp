<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Person Information page</title>
</head>
<body>
<h2>Submitted Person Information</h2>
<table>
    <tr>
        <td>Name :</td>
        <td><c:out value="${name}"/></td>

    </tr>
    <tr>
        <td>Age :</td>
        <td><c:out value="${age}"/></td>
    </tr>
</table>
</body>
</html>