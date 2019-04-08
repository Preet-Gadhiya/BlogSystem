<%-- 
    Document   : index2
    Created on : 8 Apr, 2019, 12:25:08 AM
    Author     : Rp
--%>
<%
    if(session.getAttribute("unm")==null)
          {
              response.sendRedirect("index.jsp");
          }
 %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">    
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blog system</title>
    </head>
    <body style="background-image:url('images/home.jpg');">
        <nav>       
      <div class='nav-wrapper'>
      <a href='home.jsp' class='brand-logo center '>BlogHub</a>
      <ul id='nav-mobile' class='left hide-on-med-and-down'>
        <li> 
          <a class='navbar-brand ' href='home.jsp'>
          <i class='material-icons' style='font-size:50px;'>home</i> 
          </a>
          </li>
      </ul>
      <ul id='nav-mobile' class='right hide-on-med-and-down'>
                <li>
                    <a class='navbar-brand' href='logout.jsp' style="font-size:30px;">
                        Logout
                    </a>
                </li>
      </ul>
    </div>
 </nav>
      </br></br></br></br></br></br>
      <ul class="collection with-header center " style="margin: auto;width: 50%;">
          <li class="collection-header green"><h4>Welcome To BlogHub</h4></li>
        <li class="collection-item"><div>Add New Blog<a href="addBlog.jsp" class="secondary-content"><i class="material-icons">send</i></a></div></li>
         <li class="collection-item"><div>Show All My Blogs<a href="allmyblog.jsp" class="secondary-content"><i class="material-icons">send</i></a></div></li>
        <li class="collection-item"><div>Show All Blogs<a href="allBlog.jsp" class="secondary-content"><i class="material-icons">send</i></a></div></li>
      </ul>
      
    </body>
</html>