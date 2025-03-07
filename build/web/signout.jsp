<%-- 
    Document   : signout
    Created on : Jul 11, 2024, 7:48:24 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <% 
          session.invalidate();
          session=null;
        response.sendRedirect("login.jsp");
      %>
    </body>
</html>
