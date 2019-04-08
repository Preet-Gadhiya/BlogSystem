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

public final class updateBlog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if(session.getAttribute("unm")==null)
          {
              response.sendRedirect("index.jsp");
          }
 
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
      out.write("        <title>Update Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">    \n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        function myFunction() {\n");
      out.write("  var x = document.getElementById(\"myDIV\");\n");
      out.write("  if (x.style.display === \"none\") {\n");
      out.write("    x.style.display = \"block\";\n");
      out.write("  } else {\n");
      out.write("    x.style.display = \"none\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>       \n");
      out.write("      <div class='nav-wrapper'>\n");
      out.write("      <a href='home.jsp' class='brand-logo center'>BlogHub</a>\n");
      out.write("      <ul id='nav-mobile' class='left hide-on-med-and-down'>\n");
      out.write("        <li> \n");
      out.write("          <a class='navbar-brand' href='home.jsp'>\n");
      out.write("          <i class='material-icons' style='font-size:50px;'>home</i> \n");
      out.write("          </a>\n");
      out.write("          </li>\n");
      out.write("      </ul>\n");
      out.write("      <ul id='nav-mobile' class='right hide-on-med-and-down'>\n");
      out.write("                <li>\n");
      out.write("                    <a class='navbar-brand' href='logout.jsp' style=\"font-size:30px;\">\n");
      out.write("                        Logout\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write(" </nav>\n");
      out.write("        ");

          Blog service= new Blog();
          IBlog client= service.getBasicHttpBindingIBlog();
          MyBlog stu =new MyBlog();
          String cstr=request.getParameter("toUpdate");
          String msg="";
          if(cstr != null && !cstr.isEmpty())
        {
          Integer blogno = Integer.parseInt(request.getParameter("blogno"));
          stu.setBlogNO(blogno);
        String stitle=request.getParameter("title");
        JAXBElement <String> title;
        title= new JAXBElement(new QName("http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary","title"),String.class,stitle);
        stu.setTitle(title);
        
        String scontent=request.getParameter("content");
        JAXBElement <String> content;
        content = new JAXBElement(new QName("http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary","content"),String.class,scontent);
        stu.setContent(content);
      
        msg=client.updateBlog(stu);
        }
        
      out.write("\n");
      out.write("        <div class=\"collection\" id=\"myDIV\" style=\"display:none;\" >\n");
      out.write("          <a href=\"#!\" class=\"collection-item\">Blog Updated Successfully.</a>\n");
      out.write("        </div>        \n");
      out.write("        ");

          
          MyBlog search = new MyBlog();
          String str=request.getParameter("updateblogNO");
          
          if(str != null && !str.isEmpty())
          {
            int id=Integer.parseInt(str);
            search=client.getBlogById(id);
            
          }
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.print(   
            
            "<form action='updateBlog.jsp' method='get'>" 
            +"<table>"
                        + "<tr>"
                        + "<td>"
                        + "Blog Number"
                        + "</td>"
                        + "<td>" 
                        + "<input type='number' name='blogno' value='"+ search.getBlogNO()+"'disabled/>"
                        +"<input type='hidden' name='blogno' value='"+ search.getBlogNO()+"'/>"
                        
                        
                        +"</td>"
                        +"</tr>"
                        
                        + "<tr>"
                        + "<td>"
                        + "Tile"
                        + "</td>"
                        + "<td>" 
                        + "<input type='text' name='title' value='"+ search.getTitle().getValue()+"' required/>"
                        +"</td>"
                        +"</tr>"
                        
                        
                       + "<tr>"
                        + "<td>"
                        + "Date of Created"
                        + "</td>"
                        + "<td>" 
                        + "<input disabled type='date' name='doc' value='"+ search.getDoc().toString().substring(0,10)+"' required/>"
                        +"</td>"
                        +"</tr>"
                        
                        + "<tr>"
                        + "<td>"
                        + "Blog By "
                        + "</td>"
                        + "<td>" 
                        + "<input disabled type='text' name='blogby' value='"+ search.getBlogby().getValue()+"' required/>"
                        +"</td>"
                        +"</tr>"
                        
                        
                        +"<tr>"
                        + "<td>"
                        + "Content"
                        + "</td>"
                        + "<td>" 
                       + "<input type='text' name='content' value='"+ search.getContent().getValue()+"' required/>"
                        +"</td>"
                        +"</tr>"
                +"</table>"
                
               
                + "<input type='hidden' name='toUpdate' value='"+search.getBlogNO()+"'>"
                  +"<input type='hidden' name='updateblogNO' value='"+search.getBlogNO()+"'>"              
                + "<input onclick='myFunction()' class='btn blue' type='submit' value='Confirm Updation'/></form>"
                + "</br>"
                +"<a class='btn' href='index.jsp'>HOME</a>"     
                );
      out.write("       \n");
      out.write("        \n");
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
