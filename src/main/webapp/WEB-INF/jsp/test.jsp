<%--
  Created by IntelliJ IDEA.
  User: cjMoke
  Date: 2019/4/26
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    取出的student的值为：${sessionScope.student.s_name}<br>
    <a href="studentDispatcher?flag=1">跳转到个人设置页面</a><br>
    <form action="uploadImage" method="post" enctype="multipart/form-data">
        选择图片:<input type="file" name="image" accept="image/*" /> <br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
