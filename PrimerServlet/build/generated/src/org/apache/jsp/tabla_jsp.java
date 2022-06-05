package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import conexion.UsuariosAcciones;
import conexion.ClaseConexion;
import usuarios.Usuario;
import java.util.List;

public final class tabla_jsp extends org.apache.jasper.runtime.HttpJspBase
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

     ClaseConexion con = new ClaseConexion();
     UsuariosAcciones ua = new UsuariosAcciones(con);
     List<Usuario> lista = ua.getUsuarios();
    

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form  action=\"NavbarController\" method=\"post\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg  navbar-light bg-dark justify-content-between\" action=\"ControlIndex\">\n");
      out.write("            <button class=\"navbar-brand btn btn-dark text-white\" name=\"btnInicio\">Inicio</button> \n");
      out.write("            <button class=\" navbar-brand navbar-toggler text-white\" type=\"button\" data-toggle=\"collapse\" \n");
      out.write("                    data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" \n");
      out.write("                    aria-label=\"Toggle navigation\">Menu</button>\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item dropdown\">\n");
      out.write("                  <div class=\"btn-group\">\n");
      out.write("                      <button class=\"btn btn-dark dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                          Acciones usuarios\n");
      out.write("                      </button>\n");
      out.write("                      <div class=\"dropdown-menu\">\n");
      out.write("                        <button class=\"dropdown-item\" name=\"btnIrRegistro\">Registrar</button>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("              </li>\n");
      out.write("               <li class=\"nav-item\">\n");
      out.write("                      <button class=\"btn btn-dark text-white\" name=\"btnTablaUsuarios\">Ver usuarios</button> \n");
      out.write("               </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <button class=\"btn btn-dark my-2 my-sm-0\" >Logout</button>\n");
      out.write("        </nav>\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    <table class=\"table table-striped\">\n");
      out.write("        <thead>\n");
      out.write("          <tr>\n");
      out.write("            <th scope=\"col\">Nombre</th>\n");
      out.write("            <th scope=\"col\">Apellido paterno</th>\n");
      out.write("            <th scope=\"col\">Apellido materno</th>\n");
      out.write("            <th scope=\"col\">Correo</th>\n");
      out.write("          </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("          ");
 for(Usuario usr : lista) {
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( usr.getNombre() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( usr.getApaterno() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( usr.getAmaterno() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( usr.getCorreo() );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("          ");
}
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
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
