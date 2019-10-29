<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>留言板</title>
</head>
<body>
        <c:forEach items="${MAP_IN_SESSION}" var="name">
            <c:choose>
                <c:when test="${name.key!=\"\" && name.value != \"\"}">
                    姓名：${name.key}  留言：${name.value}  <br>
                </c:when>
<%--                <c:when test="${name.key==\"\"}">没有留言</c:when>--%>
            </c:choose>
        </c:forEach>



</body>
</html>
