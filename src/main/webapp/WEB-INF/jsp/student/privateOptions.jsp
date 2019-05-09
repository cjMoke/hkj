<%--
  Created by IntelliJ IDEA.
  User: cjMoke
  Date: 2019/4/27
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title_</title>
</head>
<body>
    privateOptions.jsp页面<br>
    <form action="privateOptions" enctype="multipart/form-data" method="post">
        更改密码：<input value="${sessionScope.student.s_password}" name="s_password" type="password"><br>
        上传头像：<input type="file" name="image" accept="image/*" /> <br>
        更改签名：<input type="text" value="${sessionScope.student.s_autograph}" name="s_autograph" id="">
        <input type="submit" value="设置">
    </form>
</body>
</html>
