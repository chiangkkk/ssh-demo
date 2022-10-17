<%--
  Created by IntelliJ IDEA.
  User: ChiangKai
  Date: 2022/10/17
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form表单</title>
</head>
<body>
<form action="" method="post">
    name: <input type="text" name="name" value="${requestScope.name}">
    <br>
    password: <input type="password" name="password" value="${requestScope.password}">
    <br>
    age:
    <input type="number" name="model.age">
    <br>
    sex: <input type="text" name="model.sex">
    <br>
    <input type="submit">
</form>
</body>
</html>
