<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login JSP</h1>
        <form action="/Lap3-Maven/ControllerLogin" method="post">
            UserName:<input type="text" name="username" placeholder="Nhap UserName"></br>
            PassWord:<input type="password" name="password" placeholder="Nhap PassWord"></br>
            <input type="submit" name="action" value="Login">
            <input type="reset"  value="Reset">
        </form>
    </body>
</html>

