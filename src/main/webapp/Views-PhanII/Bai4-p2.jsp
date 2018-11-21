<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome  Methods Declaration!</h1>
        <%!
            int sum(int a, int b, int c) {
                return a + b + c;               
            }
        
        %>
        <%= "Tong cua 3 so: " + sum(10, 20, 30)%>
    </body>
</html>
