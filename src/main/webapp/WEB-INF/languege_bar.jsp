
<%@ page contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8"
         language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <title>Title</title>
</head>
<body>
<a href="${request.contextPAth}?lang=en"><spring:message code="language.en"/></a>
<a href="${request.contextPAth}?lang=ru"><spring:message code="language.ru"/></a>
<br/>
</body>
</html>
