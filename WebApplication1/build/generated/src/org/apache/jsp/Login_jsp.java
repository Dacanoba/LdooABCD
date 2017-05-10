package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    if(session.getAttribute("Email") != null)
        response.sendRedirect("index.jsp");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link href=\"Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"cuerpo\">\n");
      out.write("        <form class=\"formaslog\"  action=\"ControladorUsers\" method=\"POST\">\n");
      out.write("            <label>Username</label> <input class=\"buscar\" type=\"text\" name=\"TxtLogUname\"><br>\n");
      out.write("            <label>Password</label> <input class=\"buscar\"  type=\"password\" name=\"TxtLogPword\">\n");
      out.write("             <button class =\"imagenDerechaLog\" type=\"submit\">\n");
      out.write("                 <img style =\"position: absolute; width: 8%; height: 17%; margin-top: -6%; margin-left: 5%;\" src=\"Login.png\"/>\n");
      out.write("            <input type=\"hidden\" value=\"Login\" name=\"action\">\n");
      out.write("        </form>\n");
      out.write("       \n");
      out.write("            <form  method=\"GET\" action=\"/Register.jsp\">\n");
      out.write("                 <button class =\"imagenRegistro\" type=\"sumbit\"  >\n");
      out.write("                 <img style =\"position: absolute; width: 8%; height: 17%; margin-top: -10%; margin-left: 70%;\" src=\"registro.png\"/> \n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("     </body>\n");
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
