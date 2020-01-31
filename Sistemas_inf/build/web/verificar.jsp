<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
usuario us = new usuario();
String user = request.getParameter("user");
String pass = request.getParameter("pass");

int tipo = us.Logear(user, pass);
String ci = us.getCiByCoCla(user, pass);
switch(tipo){
case 1:
	us.eraseCi();
	us.setCi(ci);
	response.sendRedirect("cliente.jsp");
	break;
case 2:
	us.eraseCi();
	us.setCi(ci);
	response.sendRedirect("Administrador.jsp");
	break;
case 3:
	us.eraseCi();
	us.setCi(ci);
	response.sendRedirect("chofer.jsp");
	break;
default:
	response.sendRedirect("iniciar.jsp?msm=El usuario no existe");
	break;
}
%>
</body>
</html>