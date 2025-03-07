<%@page import= "java.sql.*"%>
<%@page import= "dao.MyConnection" %>
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
        <font color="blue" size="8">Q</font>    
        <font color="red" size="8">L</font>    
        <font color="black" size="8">B</font>    
        <font color="green" size="8">r</font>    
        <font color="blue" size="8">o</font>  
        <font color="blue" size="8">w</font>
        <font color="red" size="8">s</font>    
        <font color="blue" size="8">e</font>    
        <font color="black" size="8">r</font>    
        <br>
        <br>
        <form>
            <textarea rows="10" cols="100" name="txtsql"></textarea> 
            <br>
            <input type="submit" value="Execute">
        </form>   

        <%
            String sql = null;
            sql = request.getParameter("txtsql");
            if (sql != null) {
                Connection con = null;
                PreparedStatement ps = null;
                ResultSet rs = null;
                ResultSetMetaData rsmd = null;
                con = MyConnection.MygetConnection();
                ps = con.prepareStatement(sql);
                if (sql.toUpperCase().startsWith("SELECT")) {
                    rs = ps.executeQuery();
                    rsmd = rs.getMetaData();
                    out.println("<table border=1>");
                    out.println("<tr>");
                    for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                        out.println("<th>" + rsmd.getColumnName(i) + "</th>");
                    }
                    out.println("</tr>");

                    while (rs.next()) {
                        out.println("<tr>");
                        for (int i = 1; i <= rsmd.getColumnCount(); i++) {

                            out.println("<td>" + rs.getString(i) + "</td>");

                        }
                        out.println("</tr>");
                    }
                    out.println("</table>");
                } else {
                    int n;
                    n = ps.executeUpdate();
                    out.println("<font color=black size=6>Query OK, " +n+ " row affected</font>");
                }

            }
        %>
    </center>
</body>
</html>
