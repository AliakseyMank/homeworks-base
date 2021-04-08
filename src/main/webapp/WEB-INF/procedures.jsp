<%@ page contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><spring:message code="procedure.title"/></title>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body>
<jsp:include page="languege_bar.jsp"/>
<h2><spring:message code="procedure.procedure"/></h2>
<table>
    <tr>
        <th><spring:message code="procedure.id"/></th>
        <th><spring:message code="procedure.title"/></th>
        <th><spring:message code="procedure.description"/></th>
        <th><spring:message code="procedure.price"/></th>
        <th><spring:message code="procedure.price"/></th>
    </tr>
    <c:forEach var="procedure" items="${proceduresList}">
    <tr>
        <td>${procedure.procedure_id}</td>
        <td>${procedure.title}</td>
        <td>${procedure.description}</td>
        <td>${procedure.price}</td>


        <td>
            <a href="/editProcedure/${procedure.procedure_id}">edit</a>
            <a href="/deleteProcedure/${procedure.procedure_id}">delete</a>
        </td>

    </tr>
    </c:forEach>
</table>
<c:url value="/addProcedure" var="addProc"/>
<a href="${addProc}">Add new Procedure</a>

<c:url value="/startPage" var="startPage"/>
<a href="${startPage}">Go to start page</a>

</body>
</html>