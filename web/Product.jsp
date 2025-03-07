<%@page import= "java.sql.*"  %>
<%@page import="dao.MyConnection" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
       <font color="green" size="8">S</font>    
       <font color="blue" size="8">e</font>    
       <font color="red" size="8">a</font>    
       <font color="pink" size="8">r</font>    
       <font color="green" size="8">c</font>    
       <font color="blue" size="8">h</font>    
       <font color="red" size="8">P</font>    
       <font color="blue" size="8">a</font>    
       <font color="pink" size="8">g</font>    
       <font color="green" size="8">e</font>    
       <br>
       <br>
       <form>
         <textarea rows="3" cols="110" name="txtproduct"></textarea> 
         <br>
         <input type="submit" value="Search">
        </form>   
       <% 
           boolean flag=true;
           String prname=request.getParameter("txtproduct");
           if(prname!=null)
        {
         String sql=null;
         Connection con=null;
         PreparedStatement ps=null;
         ResultSet rs=null;
          con=MyConnection.MygetConnection();
          sql="select * from product where name like '"+prname+"%'";
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
       %>
       <table border="1">
           <tr><th>Id</th><th>Pr. Name</th><th>Type</th><th>Price</th></tr>
           <%
                while(rs.next()){
                    flag=false;
                    out.println("<tr>");
                    out.println("<td>"+rs.getInt(1)+"</td>");
                    out.println("<td>"+rs.getString(2)+"</td>");
                    out.println("<td>"+rs.getString(3)+"</td>");
                    out.println("<td>"+rs.getInt(4)+"</td>");
                    out.println("</tr>");
                }
                if(flag==true) 
             out.println("<font color=red size=5>Record Not Found</font>");  
           }
           %>
       </table>
        </center>
    </body>
</html>
