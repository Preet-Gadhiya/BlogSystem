<%-- 
    Document   : index
    Created on : 17 Mar, 2019, 12:55:17 PM
    Author     : Rp
--%>

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
      <a href='#' class='brand-logo center '>MyBlogger</a>
      <ul id='nav-mobile' class='left hide-on-med-and-down'>
        <li> 
          <a class='navbar-brand ' href='index.jsp'>
          <i class='material-icons' style='font-size:50px;'>home</i> 
          </a>
          </li>
      </ul>
    </div>
 </nav>
      </br></br></br></br></br></br>
      <ul class="collection with-header center " style="margin: auto;width: 50%;">
          <li class="collection-header green"><h4>Welcome To MyBlogger</h4></li>
        <li class="collection-item"><div>Add New Blog<a href="addBlog.jsp" class="secondary-content"><i class="material-icons">send</i></a></div></li>
        <li class="collection-item"><div>Show All Blogs<a href="allBlog.jsp" class="secondary-content"><i class="material-icons">send</i></a></div></li>
      </ul> 
    
    </body>
</html>