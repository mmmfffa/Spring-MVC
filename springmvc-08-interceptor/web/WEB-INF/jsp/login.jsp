<%--suppress ALL --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--在web-inf下的所有页面或者资源只能通过controller或者servlet进行--%>
<h1>登录页面</h1>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="name">
    密码：<input type="text" name="pws">
    <input type="submit" value="submit">
</form>
</body>
</html>
