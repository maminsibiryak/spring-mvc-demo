<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
    <title>Customer Registration Form</title>

</head>
<body>

<i>Fill out the form. Asterisk (*) means required.</i>
<br><br>

<form:form action="processForm" modelAttribute="customer">

    First name: <form:input path="firstName"/>

    <br><br>

    Last name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="ui-state-error"/>

    <br><br>

    Free Passes: <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="ui-state-error"/>
    <br><br>


    <input type="submit" value="Submit"/>

</form:form>

</body>

</html>
