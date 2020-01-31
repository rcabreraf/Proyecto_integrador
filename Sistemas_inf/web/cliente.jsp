<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion de Carga Pesada</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<%
cotizable cot = new cotizable();
usuario us = new usuario();
%>
</head>



<body 
  style="background-image:url('img/background.jpg '); height:900px;
  background-repeat: no-repeat;
  background-size: 1500px 1200px;"> 


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
    		<h1>INFORMACIÓN DE CONTACTO</h1>
    		<br><br>
    		<p style="text-align:left; font-size:15px;"><img src="img/msm.png" width="30" height="20">info.PlanetExpress@support.com</p>
    		<p style="text-align:left; font-size:15px;"><img src="img/cel.png" width="20" height="30">1800 planet</p>
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
    
    
         	<div style="
			  padding-left:  25px;
			  padding-bottom:  25px;
			  padding-right: 50px;
			  margin-left:   0px;
			  margin-right:  0px;
			  border: 20px solid #FFFFFF;
			  background-color:#F6D1D1 ;
			  color: #000000;
			  text-align: left;
			  margin: 0px;
			  width:600px;
			  border-radius: 0px 100px 0px 0px;
			">
			
    		<br><br>
    		<h1>USUARIO CLIENTE</h1>
    		<br>
    		<h3>Usuario: <%=us.getNameByCi(us.getCi())%> <%=us.getLastNameByCi(us.getCi()) %></h3>
    		<br>
    		
    		<br><br>
    		<button style="background-color: #E26C6C; border: 0px;" onclick="ir('cliente_pedido.jsp');">Realizar Consulta</button>
    		<button style="background-color: #E26C6C; border: 0px;" onclick="ir('cliente.jsp?msm=Datos actualizados al dia');">Actualizar datos</button>
    		<button style="background-color: #E26C6C; border: 0px;" onclick="ir('index.jsp');">Salir</button>
    			
    		</div>
    		    
    
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
</script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>