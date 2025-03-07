<%@ page import="java.sql.*, java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- <%@page import="dao.MyConnection" %> --%>
<!DOCTYPE html>
<html>
<head>
    <title>Database List</title>
</head>
<body>
    
<center>
    <font color="green" size="7">Select Database</font>
    <br><br>
    <form method="post" action="DBaction.jsp">
        <select name="database" id="database">
            <option value="">-- Select Database --</option>
            <%
                String user=request.getParameter("txtuser");
                String password=request.getParameter("txtpass");
                String url="jdbc:mysql://localhost:3306/";
                
                Class.forName("con.mysql.cj.jdbc.Driver");
     
                Connection con = null;
                PreparedStatement ps = null;
                ResultSet rs = null;
                DatabaseMetaData dbmd=null;
                con= DriverManager.getConnection(url ,user, password);
               dbmd = con.getMetaData();
               rs=dbmd.getCatalogs();

                    while (rs.next()) {
                        String dbName = rs.getString(1);
                        out.println("< option value=" + dbName + ">" + dbName + "</option>");
                    }
                
            %>
        </select>
        <input type="submit" value="Submit">
    </form>
</center>
</body>
</html>
