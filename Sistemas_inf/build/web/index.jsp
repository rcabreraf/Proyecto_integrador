<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion de Carga Pesada</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
 
<center>
<div style="background-color:darkred; height:150px; margin-top:0px;">
  <div class="row">
    <div class="col-sm" style="margin-top:50px"> <button style=";background-color:red; height:50px; width:150px; border:0px; color: rgb(255,255,255);" onclick="ir('index.jsp');">Iniciar Sesión</button> </div>
    <div class="col-sm" style="margin-top:50px"> <button style=";background-color:red; height:50px; width:150px; border:0px; color: rgb(255,255,255);"  onclick="ir('registrar.jsp');">Registrarse</button> </div>
  </div>
</div>
</center>


<body 


<div class="container"">
  <div class="row">
    <div class="col-sm" style="margin-top:50px;"></div>
    <div class="col-sm" style="margin-top:50px"></div>
    <div class="col-sm" style="margin-top:50px">
    
        	<form action="verificar.jsp" method="GET" style="
  padding-left:  50px;
  padding-right: 50px;
  margin-left:   30px;
  margin-right:  30px;
  border: 10px solid ;
  background-color:#000000 ;
  color:#FFFFFF ;
  text-align: center;
				">
			
    		<center><img style="text-align:center; border-radius:400px; margin-top" src="img/avatar.png" width="200" height="200"></center>
    		<br><br>
    		<p style="text-align:center;">Ingrese su Dirección de Correo</p>
    		<input name="user" type="text" placeholder="Correo" style="border:0px;border-bottom: 1px solid #FFFFFF; background-color:#000000; color:#FFFFFF;" required>
    		<br><br>
    		<p style="text-align:center;">Ingrese su Contraseña</p>
    		<input name="pass" type="password" placeholder="Contraseña" style="border:0px;border-bottom: 1px solid #FFFFFF; background-color:#000000; color:#FFFFFF;" required>
    		<br><br><br>
    		<center><input type="submit" style="border-radius:10px; background:red; border:0px; color:rgb(255,255,255); width:200px; height:50px;" value="Aceptar"></center>
    		<br style="text-align:center;"><br><br><br>
    		<%
    		try{
    		String msm = request.getParameter("msm"); 
    		
    		if(!msm.equals(null)){
    		%>
    		<h1 style="color:red;"><%=msm%></h1>
    		<%}}catch(Exception e){
    			
    		}
    		
    		%>
    		
    	</form> 
    	
    </div>
    <div class="col-sm" style="margin-top:50px"></div>
    <div class="col-sm" style="margin-top:50px"></div>
    
  </div>
</div>
</body>


<script>
function ir(path){
	location.href=path;
}
</script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>