<%--
  Created by IntelliJ IDEA.
  User: shuzheng
  Date: 12/11/20
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <%
    pageContext.setAttribute("ctp", request.getContextPath());
  %>
  <body>
  666<br>
  <img src="${ctp}/img/6acd-itriats6151651.jpg"><br>
  请按照id-name-age-gender的方式输入数据
  <form action="${ctp}/convert" method="post">
    <input type="text" name="user"><br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
