
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Start page</title>
</head>
<body>
<h2>Users</h2>
<table>
    <tr>
        <th>user_id</th>
        <th>f.name</th>
        <th>s.name</th>
        <th>role</th>
        <th>procedures</th>
    </tr>
    <c:forEach var="user" items="${userList}">
        <tr>
            <td>${user.user_id}</td>
            <td>${user.fname}</td>
            <td>${user.sname}</td>
            <td>${user.role}</td>

        </tr>

    </c:forEach>
</table>
<h2>Doctors</h2>
<table>
<tr>
    <th>user_id</th>
    <th>f.name</th>
    <th>s.name</th>
    <th>role</th>
</tr>
<c:forEach var="doctor" items="${doctorsList}">
    <tr>
        <td>${doctor.user_id}</td>
        <td>${doctor.fname}</td>
        <td>${doctor.sname}</td>
        <td>${doctor.role}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
