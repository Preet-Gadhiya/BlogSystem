<%-- 
    Document   : AddResult
    Created on : 17 Mar, 2019, 2:54:06 PM
    Author     : Rp
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blog System</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">    
       <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>
    <body>
        <nav>
        <div class='nav-wrapper'>
      <a href='home.jsp' class='brand-logo center'>BlogHub</a>
      <ul id='nav-mobile' class='left hide-on-med-and-down'>
        <li> 
          <a class='navbar-brand' href='home.jsp'>
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
        <%  String msg=null;
            if(session.getAttribute("unm")==null)
            {
              response.sendRedirect("index.jsp");
            }
            else{
             msg=session.getAttribute("addResult").toString();
            session.removeAttribute("addResult");
            }
            if(msg != null && !msg.isEmpty())
        {%>
            
      <%=  "<h3>Blog Added Successfully</h3>"
          +"<br><a class='btn red lighten-2' href='addBlog.jsp'>Add Another</a><br>"%> 
  <%}%>
  <%= "<br/><a class='btn' href='home.jsp'>Home</a>"%>
    </body>
</html>
