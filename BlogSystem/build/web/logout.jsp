<%
            session.removeAttribute("unm");
            session.removeAttribute("uid");
            response.sendRedirect("index.jsp");
%>