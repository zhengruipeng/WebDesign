<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/05/30
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.println(request.getParameter("name"));
    out.println(request.getParameter("val"));
%>
</body>
</html>
