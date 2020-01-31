package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;

public final class cliente_005fpedido_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Gestion de Carga Pesada</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n");
provincias pv = new provincias(); 
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body \r\n");
      out.write("  style=\"background-image:url('img/background.jpg '); height:900px;\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  background-size: 1500px 1200px;\"> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\"\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-sm\" style=\"margin-top:50px;\"></div>\r\n");
      out.write("    <div class=\"col\" style=\"  \r\n");
      out.write("    \t\t  margin-top:50px;\r\n");
      out.write("              padding-left:  0px;\r\n");
      out.write("\t\t\t  padding-right: 0px;\r\n");
      out.write("\t\t\t  margin-left:   0px;\r\n");
      out.write("\t\t\t  margin-right:  0px;\r\n");
      out.write("\t\t\t  border: 0px solid ;\r\n");
      out.write("\t\t\t  \">\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        \t<div style=\"\r\n");
      out.write("\t\t\t  padding-left:  50px;\r\n");
      out.write("\t\t\t  padding-right: 0px;\r\n");
      out.write("\t\t\t  margin-left:   0px;\r\n");
      out.write("\t\t\t  margin-right:  0px;\r\n");
      out.write("\t\t\t  border: 0px solid ;\r\n");
      out.write("\t\t\t  opacity:60%;\r\n");
      out.write("\t\t\t  background-color:#000000 ;\r\n");
      out.write("\t\t\t  color:#FFFFFF ;\r\n");
      out.write("\t\t\t  border-radius: 0px 0px 0px 100px;\r\n");
      out.write("\t\t\t  text-align: center;\r\n");
      out.write("\t\t\t  margin: 0px;\r\n");
      out.write("\t\t\t\">\r\n");
      out.write("\t\t\t<br><br><br><br><br><br><br>\r\n");
      out.write("    \t\t<center><img style=\"text-align:center; border-radius:300px; background-color:#FFFFFF ;\" src=\"img/registro.png\" width=\"200\" height=\"100\"></center>\r\n");
      out.write("    \t\t<h1>INFORMACIÓN DE CONTACTO</h1>\r\n");
      out.write("    \t\t<br><br>\r\n");
      out.write("    \t\t<p style=\"text-align:left; font-size:15px;\"><img src=\"img/msm.png\" width=\"30\" height=\"20\">info.PlanetExpress@support.com</p>\r\n");
      out.write("    \t\t<p style=\"text-align:left; font-size:15px;\"><img src=\"img/cel.png\" width=\"20\" height=\"30\">1800 planet</p>\r\n");
      out.write("    \t\t<br><br><br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("\t\t\t</div> \r\n");
      out.write("    </div>\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col\" style=\"  \r\n");
      out.write("    \t\t  margin-top:50px;\r\n");
      out.write("    \t\t  padding-left:  0px;\r\n");
      out.write("\t\t\t  padding-right: 0px;\r\n");
      out.write("\t\t\t  margin-left:   0px;\r\n");
      out.write("\t\t\t  margin-right:  0px;\r\n");
      out.write("\t\t\t  border: 0px solid ;\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("         \t<form  action=\"cliente_guardar.jsp\" method=\"GET\" style=\"\r\n");
      out.write("\t\t\t  padding-left:  25px;\r\n");
      out.write("\t\t\t  padding-bottom:  25px;\r\n");
      out.write("\t\t\t  padding-right: 50px;\r\n");
      out.write("\t\t\t  margin-left:   0px;\r\n");
      out.write("\t\t\t  margin-right:  0px;\r\n");
      out.write("\t\t\t  border: 20px solid #FFFFFF;\r\n");
      out.write("\t\t\t  background-color:#F6D1D1 ;\r\n");
      out.write("\t\t\t  color: #000000;\r\n");
      out.write("\t\t\t  text-align: left;\r\n");
      out.write("\t\t\t  margin: 0px;\r\n");
      out.write("\t\t\t  width:600px;\r\n");
      out.write("\t\t\t  border-radius: 0px 100px 0px 0px;\r\n");
      out.write("\t\t\t\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("    \t\t<br><br>\r\n");
      out.write("    \t\t<h1>USUARIO CLIENTE</h1>\r\n");
      out.write("    \t\t<br>\r\n");
      out.write("    \t\t<h3>Usuario:</h3>\r\n");
      out.write("    \t\t<br>\r\n");
      out.write("    \t\t <fieldset>\r\n");
      out.write("\t\t        <legend>Tipo de Carga</legend>\r\n");
      out.write("\t\t        <label>\r\n");
      out.write("\t\t            <input type=\"radio\" name=\"carga\" value=\"Liquidos\"> Líquidos\r\n");
      out.write("\t\t        </label>\r\n");
      out.write("\t\t        <label>\r\n");
      out.write("\t\t            <input type=\"radio\" name=\"carga\" value=\"Paquetes\"> Paquetes\r\n");
      out.write("\t\t        </label>\r\n");
      out.write("\t\t        <label>\r\n");
      out.write("\t\t            <input type=\"radio\" name=\"carga\" value=\"Enlatados\"> Enlatados\r\n");
      out.write("\t\t        </label>\r\n");
      out.write("\t\t         <label>\r\n");
      out.write("\t\t            <input type=\"radio\" name=\"carga\" value=\"Otro\"> Otro\r\n");
      out.write("\t\t        </label>\r\n");
      out.write("\t\t    \t</fieldset>\r\n");
      out.write("    \t\t<br>\r\n");
      out.write("    \t\t<table>\r\n");
      out.write("    \t\t\t<tr>\r\n");
      out.write("    \t\t\t\t<td><p>Ingrese peso de carga: </p></td>\r\n");
      out.write("    \t\t\t\t<td><input type=\"text\" name=\"kg\" style=\"width:50px;\"></td>\r\n");
      out.write("    \t\t\t\t<td>Kg</td>\r\n");
      out.write("    \t\t\t\t<td style=\"padding-left:  25%; padding-right:  22%; text-align:right;\"><input type=\"text\" name=\"tiempo\" style=\"width:50px;\"></td>\r\n");
      out.write("    \t\t\t\t<td>h</td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr>\r\n");
      out.write("    \t\t\t\t<td></td>\r\n");
      out.write("    \t\t\t\t<td></td>\r\n");
      out.write("    \t\t\t\t<td></td>\r\n");
      out.write("    \t\t\t\t<td style=\"padding-left:  25%; padding-right:  25%px; text-align:center;\"><p>tiempo de entrega</p></td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t</table>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t<table>\r\n");
      out.write("\t    \t\t<tr>\r\n");
      out.write("\t    \t\t\t<td>Inicio</td>\r\n");
      out.write("\t    \t\t\t<td>Llegada</td>\r\n");
      out.write("\t    \t\t</tr>\r\n");
      out.write("\t \t\t\t<tr>\r\n");
      out.write("\t    \t\t\t<td>\r\n");
      out.write("\t    \t\t\t\t");
      out.print(pv.cargarprovincias("origen"));
      out.write("\r\n");
      out.write("\t    \t\t\t</td>\r\n");
      out.write("\t    \t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(pv.cargarprovincias("destino"));
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t    \t\t</tr>\r\n");
      out.write("\t \t \r\n");
      out.write("    \t\t</table>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t<br><br>\r\n");
      out.write("    \t\t<p>Fecha de Ingreso de Pedido:</p>\r\n");
      out.write("    \t\t<table>\r\n");
      out.write("    \t\t<tr>\r\n");
      out.write("    \t\t\t<td>\r\n");
      out.write("    \t\t\t\t<select name=\"dia\">\r\n");
      out.write("    \t\t\t\t\t");
for(int i=1; i<=30; i++){ 
      out.write("\r\n");
      out.write("    \t\t\t\t\t<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\r\n");
      out.write("    \t\t\t\t\t");
}
      out.write("\r\n");
      out.write("    \t\t\t\t</select>\r\n");
      out.write("    \t\t\t</td>\r\n");
      out.write("   \t\t\t\t<td>\r\n");
      out.write("    \t\t\t\t<select name=\"mes\">\r\n");
      out.write("    \t\t\t\t\t");
for(int i=1; i<=12; i++){ 
      out.write("\r\n");
      out.write("    \t\t\t\t\t<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\r\n");
      out.write("    \t\t\t\t\t");
}
      out.write("\r\n");
      out.write("    \t\t\t\t</select>\r\n");
      out.write("    \t\t\t</td>\r\n");
      out.write("    \t\t\t<td>\r\n");
      out.write("    \t\t\t\t<select name=\"anio\">\r\n");
      out.write("    \t\t\t\t\t");
for(int i=2020; i>=2015; i--){ 
      out.write("\r\n");
      out.write("    \t\t\t\t\t<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\r\n");
      out.write("    \t\t\t\t\t");
}
      out.write("\r\n");
      out.write("    \t\t\t\t</select>\r\n");
      out.write("    \t\t\t</td>\r\n");
      out.write("       \t\t</tr>\r\n");
      out.write("    \t\t</table>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t<br><br><br><br>\r\n");
      out.write("    \t\t<input class=\"btn btn-primary\" type=\"Submit\" style=\"color: #000000;background-color: #E26C6C; border: 0px;\" value=\"Aceptar pedido\">\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t<a class=\"btn btn-primary\" style=\"background-color: #E26C6C; border: 0px;\" onclick=\"ir('cliente.jsp');\">Cancelar</a>\r\n");
      out.write("    \t\t<a class=\"btn btn-primary\" style=\"background-color: #E26C6C; border: 0px;\" onclick=\"ir('index.jsp');\">Salir</a>\r\n");
      out.write("    \t\t\t");

    		try{
    		String msm = request.getParameter("msm"); 
    		
    		if(!msm.equals(null)){
    		
      out.write("\r\n");
      out.write("    \t\t<h1 style=\"color:red;\">");
      out.print(msm);
      out.write("</h1>\r\n");
      out.write("    \t\t");
}}catch(Exception e){
    			
    		}
    		
    		
      out.write("\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t</form>\r\n");
      out.write("    \t\t    \r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm\" style=\"margin-top:50px\"></div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function ir(path){\r\n");
      out.write("\tlocation.href=path;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
