package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.datacontract.schemas._2004._07.wcfblogservicelibrary.ArrayOfMyBlog;
import java.text.SimpleDateFormat;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfblogservicelibrary.MyBlog;
import org.tempuri.IBlog;
import org.tempuri.Blog;

public final class allmyblog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">    \n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\n");
      out.write("        <title>All Blogs</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
 if(session.getAttribute("unm")==null)
          {
              response.sendRedirect("index.jsp");
          }
           Blog service= new Blog();
           IBlog client= service.getBasicHttpBindingIBlog();
           ArrayOfMyBlog as=client.getAllBlog();
            
      out.write("\n");
      out.write("            ");
      out.print(    "<nav>"
   +" <div class='nav-wrapper'>"
   +"   <a href='home.jsp' class='brand-logo center'>BlogHub</a>"
    +"  <ul id='nav-mobile' class='left hide-on-med-and-down'>"
    +"    <li> "
          + "<a class='navbar-brand' href='home.jsp'>"
  + "  <i class='material-icons' style='font-size:50px;'>home</i> "
 + "</a>"
          +"</li>"
     +" </ul>"
                       +"   <ul id='nav-mobile' class='right hide-on-med-and-down'>"
         +"       <li>"
           +"     <a class='navbar-brand' href='logout.jsp' style='font-size:30px;'> "
             +"           Logout"
               +"     </a>"
               +" </li>"
      +"</ul>"
    +"</div>"
 +" </nav>"
              + "<table class='table table-dark centered responsive-table'>"
            + "  <thead style='width:20px;'>"
               + " <tr class='blue'>"
            
         + " <th scope='col'>Blog No  </th>"
                    +" <th scope='col'></th>"
         + " <th scope='col'>Title</th>"
         + " <th scope='col'>Blog By</th>"
         + " <th scope='col'>Date of created</th>"
         + " <th scope='col' class='right-align'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </th>"  
         + " <th scope='col' >Content Summary</th>"
         + "<th scope='col'>Update</th>"
       + "  </tr>"
     + "</thead>"
     + "<tbody>"               
            );
      out.write("\n");
      out.write("        ");

        for(MyBlog s : as.getMyBlog())
    
    {
      out.write("\n");
      out.write("        ");
      out.print(
                    "<tr class='blue-grey lighten-3'>"
                    + "<td>"+ s.getBlogNO()+"</td>"
                     + "<td> </td>"      
                    + "<td>"+ s.getTitle().getValue()+"</td>"
                    + "<td>"+ s.getBlogby().getValue()+"</td>"        
                     +"<td>"
                        +s.getDoc().getDay()
                        +"-"
                        +s.getDoc().getMonth()
                        +"-"
                        + s.getDoc().getEonAndYear()
                        +"</td>"
                        +"<td>"
                        +"</td>"
                   + "<td>"
                    
                    + "<div class='card brown lighten-4'style='width:400px;'>"       
                    + "<div class='card-content left-align'>"
                         + s.getContent().getValue()
                      +"  </div> "   
                     +"  </div> "
                    +"</td>"
                    +"<td>"
                        +"<form  action='update.jsp' method='post' >"    
                            + "<input type='hidden' name='para' value='"+s.getBlogNO()+"'>"
                            
                            + " <button class='btn waves-effect waves-light' type='submit' >View"
                        + " <i class='material-icons right'></i> "
                       + " </button> "
                       +"</form>"     
                    +"</td>"        
                   + "</tr>"
                    
        );
      out.write("\n");
      out.write("    ");
 }
        
      out.write("\n");
      out.write("       ");
      out.print( "</tbody>"
         + " </table>"
        );
      out.write("    \n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
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
