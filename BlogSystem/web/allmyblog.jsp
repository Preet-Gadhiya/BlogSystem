<%@page import="org.datacontract.schemas._2004._07.wcfblogservicelibrary.ArrayOfMyBlog"%>
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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">    
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <title>All Blogs</title>
    </head>
    <body>
        
        <% if(session.getAttribute("unm")==null)
          {
              response.sendRedirect("index.jsp");
          }
           Blog service= new Blog();
           IBlog client= service.getBasicHttpBindingIBlog();
           ArrayOfMyBlog as=client.getAllBlog();
            %>
            <%=    "<nav>"
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
            %>
        <%
        for(MyBlog s : as.getMyBlog())
    
    {%>
        <%=
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
                    
        %>
    <% }
        %>
       <%= "</tbody>"
         + " </table>"
        %>    

        
    </body>
</html>
