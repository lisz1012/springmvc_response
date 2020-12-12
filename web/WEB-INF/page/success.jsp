<%--
  Created by IntelliJ IDEA.
  User: shuzheng
  Date: 12/11/20
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Output</title>
</head>
<body>
    欢迎 <br>
    ${hw} <br>
    page: ${pageScope.hw} <br>
    request: ${requestScope.hw} <br>
    session: ${sessionScope.hw} <br>
    application: ${applicationScope.hw} <br>
    Session username:${sessionScope.username} <br>
    Request username:${requestScope.username} <br>
</body>
</html>
