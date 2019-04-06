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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">    \n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Blog system</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image:url('images/home.jpg');\">\n");
      out.write("        <nav>       \n");
      out.write("      <div class='nav-wrapper'>\n");
      out.write("      <a href='#' class='brand-logo center '>MyBlogger</a>\n");
      out.write("      <ul id='nav-mobile' class='left hide-on-med-and-down'>\n");
      out.write("        <li> \n");
      out.write("          <a class='navbar-brand ' href='index.jsp'>\n");
      out.write("          <i class='material-icons' style='font-size:50px;'>home</i> \n");
      out.write("          </a>\n");
      out.write("          </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write(" </nav>\n");
      out.write("      </br></br></br></br></br></br>\n");
      out.write("      <ul class=\"collection with-header center \" style=\"margin: auto;width: 50%;\">\n");
      out.write("          <li class=\"collection-header green\"><h4>Welcome To MyBlogger</h4></li>\n");
      out.write("        <li class=\"collection-item\"><div>Add New Blog<a href=\"addBlog.jsp\" class=\"secondary-content\"><i class=\"material-icons\">send</i></a></div></li>\n");
      out.write("        <li class=\"collection-item\"><div>Show All Blogs<a href=\"allBlog.jsp\" class=\"secondary-content\"><i class=\"material-icons\">send</i></a></div></li>\n");
      out.write("      </ul> \n");
      out.write("    \n");
      out.write("    </body>\n");
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
