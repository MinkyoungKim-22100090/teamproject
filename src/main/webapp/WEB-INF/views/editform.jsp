<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kimminkyoung
  Date: 2022/12/02
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Post</h1>
<form:hidden path="seq"/>
<table id="edit">
    <tr><td>카테고리</td><td><form:input path="category"/></td></tr>
    <tr><td>제목</td><td><form:input path="title"/></td></tr>
    <tr><td>글쓴이</td><td><form:input path="riter"/></td></tr>
    <tr><td>내용</td><td><form:textarea cols="50" rows="5" path="content"/></td></tr>
</table>
</body>
</html>
