<%--
  Created by IntelliJ IDEA.
  User: cjMoke
  Date: 2019/4/26
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="loginStudent">
        email:<input type="text" name="s_email"><br>
        password:<input type="password" name="s_password"><br>
        <input type="submit" value="input">
        ${message}
    </form>
</body>
</html>
