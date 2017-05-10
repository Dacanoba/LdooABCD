package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Utilitis.ComentariosPOJO;

public final class Tecnologias_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tecnologias</title>\n");
      out.write("        <link href=\"stilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write(" ");

     
       List comentarios = (List) session.getAttribute("comentar");
    if(session.getAttribute("Email") == null){
        session.setAttribute("Email", "Invitado");
 }
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("<div class=\"navbar\">\n");
      out.write("  <a href=\"index.jsp\">Home</a>\n");
      out.write("  <a href=\"Deportes.jsp\">Deportes</a>\n");
      out.write("  <a href=\"Tema.jsp\">Tema</a>\n");
      out.write("  <a href=\"#Tecnologias\">Tecnologias</a>\n");
      out.write("  <h4>");
      out.print( session.getAttribute("Email") );
      out.write("</h4>\n");
      out.write("</div><br><br><br>\n");
      out.write("\n");
      out.write("       <form action=\"ComentariosControlador\" method=\"get\">\n");
      out.write("           <input type=\"submit\" value=\"clickme\">\n");
      out.write("        </form>\n");
      out.write("        \n");
  for (Object obj : comentarios){
            ComentariosPOJO comentario = (ComentariosPOJO) obj;
        
      out.write("        \n");
      out.write("<div class=\"main\">\n");
      out.write("  <h1>");
      out.print(comentario.getImagen() );
      out.write("</h1>\n");
      out.write("  <h2>");
      out.print(comentario.getTitulo() );
      out.write(" </h2>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
 } //cierre de for 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
