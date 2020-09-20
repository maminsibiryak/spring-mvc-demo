<jsp:useBean id="customer" scope="request" type="com.homework.springdemo.mvc.domain.Customer"/>
<%--
  Created by IntelliJ IDEA.
  User: Andrey
  Date: 31.08.2020
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer confirmation page </title>
</head>
<body>
The customer is confirmed: ${customer.firstName}_${customer.lastName}
</body>
</html>
