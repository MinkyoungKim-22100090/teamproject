<%--
  Created by IntelliJ IDEA.
  User: kimminkyoung
  Date: 2022/11/25
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<img src="img/tree.jpeg" width="300"/>
<h1>${title}</h1>
<c:forEach var="name" items="${classlist}" varStatus="status">
    <p>${status.count}:${name}</p>
</c:forEach>
</body>
</html>