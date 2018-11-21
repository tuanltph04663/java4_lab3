<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Welcome expression tag!</h1>
	<%
		int a = 10;
		out.println("So a :" + a+"</br>");
		int b = 20;
		out.println("So b :" + b+"</br>");
		int c = 30;
		out.println("So c :" + c+"</br>");
	%>
	Tong cua a+b+c la:<%=a + b + c%>
</body>
</html>