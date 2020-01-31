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
cotizable cot = new cotizable();
provincias pv = new provincias();

String tipo_carga = request.getParameter("carga");
String peso = request.getParameter("kg");
String tiempo = request.getParameter("tiempo");

int origen = Integer.parseInt(request.getParameter("origen"));
int destino = Integer.parseInt(request.getParameter("destino"));
String ciudad_destino = pv.getProvinciaName(destino);
String ciudad_origen = pv.getProvinciaName(origen);


String ci = us.getCi();
String dia = request.getParameter("dia");
String mes = request.getParameter("mes");
String anio = request.getParameter("anio");

String date = dia+"/"+mes+"/"+anio;


if (cot.cotizar(date, tiempo, peso, tipo_carga, ci, ciudad_destino, ciudad_origen, destino, origen)){
	response.sendRedirect("cliente.jsp");	
}else{
	response.sendRedirect("cliente_pedido.jsp?msm=Datos no validos, inténtelo de nuevo!");
}
%>
</body>
</html>