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
    <div class="col-sm" style="margin-top:50px"> <button style=";background-color:red; height:50px; width:150px; border:0px; color: rgb(255,255,255);" onclick="ir('registrar.jsp');">Registrarse</button> </div>
  </div>
</div>
</center>


<body 


<div class="container"">
  <div class="row">
    <div class="col-sm" style="margin-top:50px;"></div>
    <div class="col" style="  
    		  margin-top:50px;
              padding-left:  0px;
			  padding-right: 0px;
			  margin-left:   0px;
			  margin-right:  0px;
			  border: 0px solid ;
			  ">
    			
    
    
    
        	<div style="
			  padding-left:  50px;
			  padding-right: 0px;
			  margin-left:   0px;
			  margin-right:  0px;
			  border: 0px solid ;
			  opacity:60%;
			  background-color:#000000 ;
			  color:#FFFFFF ;
			  border-radius: 0px 0px 0px 100px;
			  text-align: center;
			  margin: 0px;
			">
			<br><br><br><br><br><br><br><br><br><br><br><br><br>
    		<center><img style="text-align:center; border-radius:300px; background-color:#FFFFFF ;" src="img/registro.png" width="200" height="100"></center>
    		<h1>Registrate es ¡Gratis!</h1>
    		<br><br>
    		<p style="text-align:left; font-size:15px;"><img src="img/msm.png" width="30" height="20"></p>
    		<p style="text-align:left; font-size:15px;"><img src="img/cel.png" width="20" height="30"></p>
    		<br><br><br><br><br><br><br><br><br><br><br><br>
			</div> 
    </div>
     
    
    <div class="col" style="  
    		  margin-top:50px;
    		  padding-left:  0px;
			  padding-right: 0px;
			  margin-left:   0px;
			  margin-right:  0px;
			  border: 0px solid ;">
    
    
         	<form action="registrar_save.jsp" method="GET" style="
			  padding-left:  25px;
			  padding-bottom:  25px;
			  padding-right: 50px;
			  margin-left:   0px;
			  margin-right:  0px;
			  border: 0px solid ;
			  background-color:#FFFFFF ;
			  color: #000000;
			  text-align: left;
			  margin: 0px;
			  width:500px;
			  border-radius: 0px 100px 0px 0px;
			">
			
    		<br><br>
    		<p style="text-align:left;">Nombres</p>
    		<input name="d1" type="text" placeholder="Ingrese su nombre" style="border:0px;border-bottom: 1px solid #F6D1D1; background-color:#FFFFFF; color:#000000; width:450px;" required>
    		<p style="text-align:left;">Apellidos</p>
    		<input name="d2" type="text" placeholder="Ingrese sus apellidos" style="border:0px;border-bottom: 1px solid #F6D1D1; background-color:#FFFFFF; color:#000000; width:450px;" required>
    		<p style="text-align:left;">Cédula</p>
    		<input name="d3" type="text" placeholder="Ingrese su cédula" style="border:0px;border-bottom: 1px solid #F6D1D1; background-color:#FFFFFF; color:#000000; width:450px;" required>
    		<p style="text-align:left;">Correo</p>
    		<input name="d4" type="text" placeholder="Ingrese su correo" style="border:0px;border-bottom: 1px solid #F6D1D1; background-color:#FFFFFF; color:#000000; width:450px;" required>
    		<p style="text-align:left;">Clave</p>
    		<input name="d7" type="password" placeholder="Ingrese su clave" style="border:0px;border-bottom: 1px solid #F6D1D1; background-color:#FFFFFF; color:#000000; width:450px;" required>
    		<br><br><br>
	    		 <fieldset>
		        <legend>Tipo de Cuenta</legend>
		        <label>
		            <input type="radio" name="d8" value="1" selected onclick="limpiar();"> Cliente
		        </label>
		    	</fieldset>
		    	
		    	
		    	 <fieldset>
		        <legend>Género</legend>
		        <label>
		            <input type="radio" name="d9" value="Hombre" selected> Hombre
		        </label>
		        <label>
		            <input type="radio" name="d9" value="Mujer"> Mujer
		        </label>
		    	</fieldset>
		    	
		    	<div id="plac">
		    	
		    	</div>
		    	
		    <br><br>
    		<center><input type="submit" style=" background: #F6D1D1; border:0px; color:rgb(255,255,255); width:400px; height:50px;" value="Registrar"></center>
    		<br>
    		
    		<center><a class="btn btn-primary" style="border: 100px solid ; background: #F6D1D1; border:0px; color:rgb(255,255,255); width:400px; height:50px;" onclick="ir('index.jsp');">Login</a>
    		
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
    
  </div>
</div>

<br>
<br>
<br>
</body>


<script>
function ir(path){
	location.href=path;
} 
function alerta(){
	var p =	"<br>";
	p += "<p style='text-align:left;'>Placa</p>";
	p += "<input name='placa' type='text' placeholder='Ingrese la placa' style='border:0px;border-bottom: 1px solid #F6D1D1; background-color:#FFFFFF; color:#000000; width:450px;' required>";

	document.getElementById("plac").innerHTML = p;
}
function limpiar(){
	document.getElementById("plac").innerHTML = "";
}
</script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>