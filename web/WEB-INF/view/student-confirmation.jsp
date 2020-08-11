<%--
  Created by IntelliJ IDEA.
  User: Andrey
  Date: 19.07.2020
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student confirmation</title>
</head>
<body>
The student is confirmed : ${student.firstName} ${student.lastName}
Country: ${student.country}
Favorite Language: ${student.favoriteLanguage}
Operating System:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>

</body>
</html>
