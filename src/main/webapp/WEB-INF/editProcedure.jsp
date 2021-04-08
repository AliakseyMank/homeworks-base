<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty procedure.title}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty procedure.title}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty procedure.title}">
    <c:url value="/addProcedure" var="var"/>
</c:if>
<c:if test="${!empty procedure.title}">
    <c:url value="/editProcedure" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty procedure.title}">
        <input type="hidden" name="id" value="${procedure.procedure_id}">
    </c:if>
    <label for="title">Title</label>
    <input type="text" name="title" id="title">
    <label for="price">Price</label>
    <input type="int" name="price" id="price">
    <label for="description">Description</label>
    <input type="text" name="description" id="description">

    <c:if test="${empty procedure.title}">
        <input type="submit" value="Add new procedure">
    </c:if>
    <c:if test="${!empty procedure.title}">
        <input type="submit" value="Edit procedure">
    </c:if>
</form>
</body>
</html>