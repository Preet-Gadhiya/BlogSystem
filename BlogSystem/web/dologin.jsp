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
        <title>Add Blog </title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">    
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script>
            $(document).ready(function() {
                $('textarea#textarea2').characterCounter();
            });
        </script>
    </head>
    <body class="grey lighten-1 ">
        
        <%
            
          Blog service= new Blog();
          IBlog client= service.getBasicHttpBindingIBlog();
          int id=client.checkUser(request.getParameter("unm"), request.getParameter("pass"));
          if(id!=0)
          {
              session.setAttribute("uid",id);
              session.setAttribute("unm", request.getParameter("unm"));
              response.sendRedirect("home.jsp");
          }
          else{
              response.sendRedirect("index.jsp");
          }
        %>
    </body>
</html>