
<%-- 
    Document   : update
    Created on : 17 Mar, 2019, 10:20:46 PM
    Author     : Rp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="javax.xml.datatype.DatatypeFactory"%>
<%@page import="javax.xml.datatype.XMLGregorianCalendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="javax.xml.namespace.QName"%>
<%@page import="javax.xml.bind.JAXBElement"%>
<%@page import="org.datacontract.schemas._2004._07.wcfblogservicelibrary.MyBlog"%>
<%@page import="org.tempuri.IBlog"%>
<%@page import="org.tempuri.Blog"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">    
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>
    <body>
        <%
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
            {    %>           
                <%=   "<nav>"
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
                                
                  +"<br><a class='btn ' href='home.jsp'>HOME</a>" 
                %>       
           
         <% 
          
              }
          
           
            else//not found
            {
                response.sendRedirect("index.jsp");
            }
        
        %>
    </body>
</html>