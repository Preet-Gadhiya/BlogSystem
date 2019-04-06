<%-- 
    Document   : deleteBlog
    Created on : 18 Mar, 2019, 12:11:12 AM
    Author     : Rp
--%>

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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">    
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>
    <body>
        
        <%
          Blog service= new Blog();
          IBlog client= service.getBasicHttpBindingIBlog();
          String str=request.getParameter("deleteblogNO");
          int id=Integer.parseInt(str);
          String mess=client.deleteBlog(id);
         %>
         <%=   "<nav>"
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
             +"<h4>"
                 +mess
                 +"</h4>"
       +"  <br/><a class='btn' href='index.jsp'>Home</a>"
                 %>
    </body>
</html>
