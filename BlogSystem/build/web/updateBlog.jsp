<%-- 
    Document   : updateBlog
    Created on : 18 Mar, 2019, 12:10:58 AM
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
        <title>Update Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">    
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script>
        function myFunction() {
  var x = document.getElementById("myDIV");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}
        </script>
    </head>
    <body>
        <nav>       
      <div class='nav-wrapper'>
      <a href='#' class='brand-logo center'>MyBlogger</a>
      <ul id='nav-mobile' class='left hide-on-med-and-down'>
        <li> 
          <a class='navbar-brand' href='index.jsp'>
          <i class='material-icons' style='font-size:50px;'>home</i> 
          </a>
          </li>
      </ul>
    </div>
 </nav>
        <%
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
        %>
        <div class="collection" id="myDIV" style="display:none;" >
          <a href="#!" class="collection-item">Blog Updated Successfully.</a>
        </div>        
        <%
          
          MyBlog search = new MyBlog();
          String str=request.getParameter("updateblogNO");
          
          if(str != null && !str.isEmpty())
          {
            int id=Integer.parseInt(str);
            search=client.getBlogById(id);
            
          }%>
        
        <%=   
            
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
                %>       
        
        
    </body>
</html>
