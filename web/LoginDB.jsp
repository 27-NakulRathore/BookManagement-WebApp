<%@page import="dao.BookDAO"%>
<%@page session="true"%>
<HTML>
<HEAD>
    <TITLE>My Index Page</TITLE>
</HEAD>
<BODY>
<center>
    <form method=post action="DatabaseList.jsp">
<table border=1>
<tr>
<th>User Name</th>
<td><input type=text name=txtuser></td>
</tr>
<tr>
<th>Password</th>
<td><input type=password name=txtpassword></td>
</tr>
<tr>
<td></td>
<td>
<input type=submit value=Login>
<input type=reset value=Reset>
</td>
</tr>
</table>
</form>
<% 
   String user=null,pass=null;
   user=request.getParameter("txtuser");
   pass=request.getParameter("txtpassword");
   if(user!=null && pass!=null)
   {
        BookDAO bd=new BookDAO();
        if(bd.checkLogin(user, pass))
        {  
              session.setAttribute("username", user);
              session.setAttribute("password", pass);
              response.sendRedirect("header.jsp");
        }      
        else
              out.println("<font color=red size=5> invalid user id or password</font>");   
      
               
   }
%>
</center>
</BODY>
</HTML>