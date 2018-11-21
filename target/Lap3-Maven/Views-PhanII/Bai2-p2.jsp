<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome expression tag!</h1>
        <% application.setAttribute("name","Nguyen Anh Van");%>
        <a href="Display.jsp">Click here for display</a>
    </body>
</html>