<%--
  Created by IntelliJ IDEA.
  User: shuzheng
  Date: 12/11/20
  Time: 7:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>
<body>
    <form action="${ctp}/update" method="post">
        <input name="id" type="hidden" value="1" /> <br>
        <!--Name: <input name="name" type="text" value="张三" disabled /> <br>-->
        Name: 张三<br>
        Password: <input name="password" type="password" /> <br>
        Age: <input name="age" type="text" /> <br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
