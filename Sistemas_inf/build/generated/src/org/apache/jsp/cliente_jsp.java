package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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

cotizable cot = new cotizable();
usuario us = new usuario();

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
      out.write("\t\t\t<br><br><br><br><br><br><br><br><br><br><br><br><br>\r\n");
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
      out.write("         \t<div style=\"\r\n");
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
      out.write("    \t\t<h3>Usuario: ");
      out.print(us.getNameByCi(us.getCi()));
      out.write(' ');
      out.print(us.getLastNameByCi(us.getCi()) );
      out.write("</h3>\r\n");
      out.write("    \t\t<br>\r\n");
      out.write("    \t\t<h3>Tabla de pedidos realizados:</h3>\r\n");
      out.write("    \t\t<br>\r\n");
      out.write("    \t\t");
      out.print(cot.getCotizable(us.getCi()));
      out.write("\r\n");
      out.write("    \t\t<br><br>\r\n");
      out.write("    \t\t");

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
      out.write("    \t\t<br><br>\r\n");
      out.write("    \t\t<button style=\"background-color: #E26C6C; border: 0px;\" onclick=\"ir('cliente_pedido.jsp');\">Realizar nuevo pedido</button>\r\n");
      out.write("    \t\t<button style=\"background-color: #E26C6C; border: 0px;\" onclick=\"ir('cliente.jsp?msm=Datos actualizados al dia');\">Actualizar datos</button>\r\n");
      out.write("    \t\t<button style=\"background-color: #E26C6C; border: 0px;\" onclick=\"ir('index.jsp');\">Salir</button>\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t\t    \r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm\" style=\"margin-top:50px\"></div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
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
