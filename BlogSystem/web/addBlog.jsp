<%-- 
    Document   : AddBlog
    Created on : 17 Mar, 2019, 1:07:35 PM
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
          MyBlog stu =new MyBlog();
          String cstr=request.getParameter("toAdd");
          String msg="";
          if(cstr != null && !cstr.isEmpty())
        {
          
        String stitle=request.getParameter("title");
        JAXBElement <String> title;
        title= new JAXBElement(new QName("http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary","title"),String.class,stitle);
        stu.setTitle(title);
        
        String scontent=request.getParameter("content");
        JAXBElement <String> content;
        content = new JAXBElement(new QName("http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary","content"),String.class,scontent);
        stu.setContent(content);
        
        
        String sblogby=request.getParameter("blogby");
        JAXBElement <String> blogby;
        blogby = new JAXBElement(new QName("http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary","blogby"),String.class,sblogby);
        stu.setBlogby(blogby);
    
        String spassword=request.getParameter("password");
        JAXBElement <String> password;
        password = new JAXBElement(new QName("http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary","password"),String.class,spassword);
        stu.setPassword(password);
    
        
      
        msg=client.addBlog(stu);
        }
        if(msg != null && !msg.isEmpty())
        {  
        

              session.setAttribute("addResult", msg);
              response.sendRedirect("addResult.jsp");
        
        %>
        
        
        
        
        <%}else{%>
        
        <%= 
            
  "<nav>"
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
        
    +    " <div class='row container'>"
    + "<div class='col s12 m12 l12'>"
     +" <div class='card blue-grey darken-1'>"
       +" <div class='card-content white-text'>"
         + "<div class='row center'>"
            +"<form class='col s12' action='addBlog.jsp' method='post' >"
            +" <div class='row' style='font-size:30px;'>"
            +" Add New Blog"        
            +" </div>"        
            +" <div class='row'>"
             +  " <div class='input-field col s12'>"
                   +"<input placeholder='Title of Blog'  type='text' name='title' class='validate'>"
                    +"<label for='Title'>Title</label>"
               +" </div>"
             +"</div>"
           
            +" <div class='row'>"
         +"<div class='input-field col s12'>"
            +"<textarea id='textarea2' class='materialize-textarea' data-length='2000' name='content'></textarea>"
            +"<label for='textarea2'>Content</label>"
          +"</div>"
            + "</div>"
                    
            +" <div class='row'>"
             +  " <div class='input-field col s12'>"
                   +"<input placeholder='Author of Blog'  type='text' name='blogby' class='validate' >"
                    +"<label for='Blogby'>Blog Created by</label>"
               +" </div>"
             +"</div>"
                    
             +" <div class='row '>"
             +  " <div class='input-field col s12'>"
                   +"<input placeholder='Password'  type='password' name='password' class='validate'>"
                    +"<label for='password'>Password</label>"
               +" </div>"
             +"</div>"
             
          
             + "<input type='hidden' name='toAdd' value='1'>"
             
            + "  <button class='btn waves-effect waves-light' type='submit' name='action' >Submit "
            + " <i class='material-icons right'>send</i> "
            + " </button> "
                    
            + " <button class='btn waves-effect waves-light red' type='reset' name='action'  >Reset "
            + " <i class='material-icons right'>clear</i> "
            + " </button> "
                    
           +" </form>"
                +"&nbsp;"
                     +"<div class='center'>"
                    + "<a href='index.jsp' class='waves-effect waves-light btn blue'>HOME</a>"
                +"</div>"
           + " </div> "
             + " </div> "
          + " </div> "
         + " </div> "
     +" </div>"     

            
             
                %>       
                <%}%>
                
           
    </body>
</html>
