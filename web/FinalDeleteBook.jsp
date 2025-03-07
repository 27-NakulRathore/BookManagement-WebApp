<%@page import="dao.BookDAO"%>
<%@include file="header.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Page</title>
    </head>
    <body>
        <center>
           <% 
             String name;
             name=session.getAttribute("bkname").toString();
             BookDAO sd=new BookDAO();
             if(sd.deletebyName(name)>0)
                 out.println("<font color=red size=6>Record Deleted</font>");
           %>   
         </center>  
    </body>
</html>
