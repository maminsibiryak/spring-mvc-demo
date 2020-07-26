<%--
  Created by IntelliJ IDEA.
  User: Andrey
  Date: 19.07.2020
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student registration form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    Country:
    <%--    <form:select path="country">--%>
    <%--        <form:option value="Brazil" label="Brazil"/>--%>
    <%--        <form:option value="France" label="France"/>--%>
    <%--        <form:option value="Russia" label="Russia"/>--%>
    <%--        <form:option value="USA" label="USA"/>--%>
    <%--    </form:select>--%>
    Options:
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>

    <input type="submit" value="Submit">

</form:form>
</body>
</html>
