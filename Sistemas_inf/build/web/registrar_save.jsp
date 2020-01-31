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
vehiculo vh = new vehiculo();

String nom = request.getParameter("d1");
String ape = request.getParameter("d2");
String ced = request.getParameter("d3");
String correo = request.getParameter("d4");
String contra = request.getParameter("d7");
String tipo = request.getParameter("d8");
String gen = request.getParameter("d9");


if(ced.length() <=  10){
if(us.registrarUsuario(ced, nom, ape, gen, correo,contra, tipo)){
	if(tipo.equals("3")){
		String placa = request.getParameter("placa");
		vh.registrarDuenio(placa, ced);

		response.sendRedirect("registrar.jsp?msm=El usuario fue creado satisfactoriamente");
	}else{
		response.sendRedirect("registrar.jsp?msm=El usuario fue creado satisfactoriamente");
	}
}else{
	response.sendRedirect("registrar.jsp?msm=Ingresar datos correctos");
}
}else{
	response.sendRedirect("registrar.jsp?msm=La cedula no posee 10 digitos");
}
%>
</body>
</html>