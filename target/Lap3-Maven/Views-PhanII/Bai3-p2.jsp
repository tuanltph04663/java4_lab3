<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome  Declaration tag!</h1>
        <%! String name = "Nguyen Anh Van";%>
        <%! int age = 22;%>
        <%= "Name is:"+name%></br>
        <%= "Age is:"+age%>
        

    </body>
</html>
