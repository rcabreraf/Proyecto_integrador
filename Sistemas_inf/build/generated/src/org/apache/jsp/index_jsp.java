package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write(" \r\n");
      out.write("<center>\r\n");
      out.write("<div style=\"background-color:darkred; height:150px; margin-top:0px;\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-sm\" style=\"margin-top:50px\"> <button style=\";background-color:red; height:50px; width:150px; border:0px; color: rgb(255,255,255);\" onclick=\"ir('index.jsp');\">Iniciar Sesión</button> </div>\r\n");
      out.write("    <div class=\"col-sm\" style=\"margin-top:50px\"> <button style=\";background-color:red; height:50px; width:150px; border:0px; color: rgb(255,255,255);\"  onclick=\"ir('registrar.jsp');\">Registrarse</button> </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\"\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-sm\" style=\"margin-top:50px;\"></div>\r\n");
      out.write("    <div class=\"col-sm\" style=\"margin-top:50px\"></div>\r\n");
      out.write("    <div class=\"col-sm\" style=\"margin-top:50px\">\r\n");
      out.write("    \r\n");
      out.write("        \t<form action=\"verificar.jsp\" method=\"GET\" style=\"\r\n");
      out.write("  padding-left:  50px;\r\n");
      out.write("  padding-right: 50px;\r\n");
      out.write("  margin-left:   30px;\r\n");
      out.write("  margin-right:  30px;\r\n");
      out.write("  border: 10px solid ;\r\n");
      out.write("  background-color:#000000 ;\r\n");
      out.write("  color:#FFFFFF ;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("\t\t\t\t\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("    \t\t<center><img style=\"text-align:center; border-radius:400px; margin-top\" src=\"img/avatar.png\" width=\"200\" height=\"200\"></center>\r\n");
      out.write("    \t\t<br><br>\r\n");
      out.write("    \t\t<p style=\"text-align:center;\">Ingrese su Dirección de Correo</p>\r\n");
      out.write("    \t\t<input name=\"user\" type=\"text\" placeholder=\"Correo\" style=\"border:0px;border-bottom: 1px solid #FFFFFF; background-color:#000000; color:#FFFFFF;\" required>\r\n");
      out.write("    \t\t<br><br>\r\n");
      out.write("    \t\t<p style=\"text-align:center;\">Ingrese su Contraseña</p>\r\n");
      out.write("    \t\t<input name=\"pass\" type=\"password\" placeholder=\"Contraseña\" style=\"border:0px;border-bottom: 1px solid #FFFFFF; background-color:#000000; color:#FFFFFF;\" required>\r\n");
      out.write("    \t\t<br><br><br>\r\n");
      out.write("    \t\t<center><input type=\"submit\" style=\"border-radius:10px; background:red; border:0px; color:rgb(255,255,255); width:200px; height:50px;\" value=\"Aceptar\"></center>\r\n");
      out.write("    \t\t<br style=\"text-align:center;\"><br><br><br>\r\n");
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
      out.write("    \t\t\r\n");
      out.write("    \t</form> \r\n");
      out.write("    \t\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm\" style=\"margin-top:50px\"></div>\r\n");
      out.write("    <div class=\"col-sm\" style=\"margin-top:50px\"></div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
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
