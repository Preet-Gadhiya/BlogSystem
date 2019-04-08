package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">    \n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Blog service= new Blog();
            IBlog client= service.getBasicHttpBindingIBlog();
            MyBlog blog =new MyBlog();
            String st=request.getParameter("para");
             if(st != null && !st.isEmpty())
          {
                 int id=Integer.parseInt(st);
                 blog=client.getBlogById(id);
            
          }
       
            if(blog.getBlogNO() != null && blog.getBlogNO() !=0)//not NULL
            {    
      out.write("           \n");
      out.write("                ");
      out.print(   "<nav>"
   +" <div class='nav-wrapper'>"
   +"   <a href='#' class='brand-logo center'>MyBlogger</a>"
    +"  <ul id='nav-mobile' class='left hide-on-med-and-down'>"
    +"    <li> "
          + "<a class='navbar-brand' href='index.jsp'>"
  + "  <i class='material-icons' style='font-size:50px;'>home</i> "
 + "</a>"
          +"</li>"
     +" </ul>"
    +"</div>"
 +" </nav>"
                    + "<br><br>"
                        + "<table class='table table-hover'>"
                        + "<tr>"
                        + "<td>"
                        + "Blog Number"
                        + "</td>"
                        + "<td>" 
                        + blog.getBlogNO()
                        +"</td>"
                        +"</tr>"
                        
                        + "<tr>"
                        + "<td>"
                        + "Blog Title"
                        + "</td>"
                        + "<td>" 
                        + blog.getTitle().getValue()
                        +"</td>"
                        +"</tr>"
                        
                        
                       + "<tr>"
                        + "<td>"
                        + "Date of created"
                        + "</td>"
                        + "<td>" 
                        +blog.getDoc().getDay()
                        +"-"
                        +blog.getDoc().getMonth()
                        +"-"
                        + blog.getDoc().getEonAndYear()
                        +"</td>"
                        +"</tr>"
                        
                        
                        +  "<tr>"
                        + "<td>"
                        + "Blog is Written by"
                        + "</td>"
                        + "<td>" 
                        + blog.getBlogby().getValue()
                        +"</td>"
                        +"</tr>"
                        
                        +  "<tr>"
                        + "<td>"
                        + "Blog Content"
                        + "</td>"
                        + "<td>" 
                        + blog.getContent().getValue()
                        +"</td>"
                        +"</tr>"
                        
                        
                +"</table>"
                
                +"<br /><form action='updateBlog.jsp' class='center' method='get'>"
                + "<input type='hidden' name='updateblogNO' value='"+blog.getBlogNO()+"'>"
                                
                + "<input type='submit' class='btn blue' value='Update Record'/></form><br>"
                                
                  +"<form action='deleteBlog.jsp' class='center' method='get'>"   
                  +"<input type='hidden' name='deleteblogNO' value='"+blog.getBlogNO()+"'>"              
                + "<input type='submit' class='btn red' value='Delete Record'/></form>"           
                                
                  +"<br><a class='btn ' href='index.jsp'>HOME</a>" 
                );
      out.write("       \n");
      out.write("           \n");
      out.write("         ");
 
          
              }
          
           
            else//not found
            {
      out.write("\n");
      out.write("            ");
      out.print(
                "<br><h4>Student Not Found.</h4>"
                 +"<br><a class='btn' href='index.jsp'>HOME</a>"     
            );
      out.write("\n");
      out.write("        ");

            }
        
        
      out.write("\n");
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
