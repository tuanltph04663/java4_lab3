<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome Declaration!</h1>
        <%! int a = 3;%>
        <% if (a > 5) { %>
        <H3> hi </H3>
            <%} else {%>
        <h3> a value should not be less than 6 </h3>
        <% }%>
    </body>
</html>