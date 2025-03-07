<%@ page import="java.sql.*, java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Select Database</title>
</head>
<body>
<center>
    <h2>Select a Database</h2>
    <form method="post" action="DBaction.jsp">
        <select name="database" id="database" required>
            <option value="">-- Select Database --</option>
            <%
                String user = request.getParameter("txtuser");
                String password = request.getParameter("txtpassword");
                session.setAttribute("username", user);
                session.setAttribute("password", password);
                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;
                String url = "jdbc:mysql://localhost:3306/";

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conn = DriverManager.getConnection(url, user, password);
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery("SHOW DATABASES");

                    while (rs.next()) {
                        String dbName = rs.getString(1);
                        out.println("<option value=\"" + dbName + "\">" + dbName + "</option>");
                    }
                } catch (SQLException e) {
                    out.println("<p>Error: Unable to connect to the database with the provided credentials.</p>");
                   
                } catch (ClassNotFoundException e) {
                    out.println("<p>Error: MySQL JDBC Driver not found.</p>");
                
                } 
            %>
        </select>
        <input type="submit" value="Select Database">
    </form>
</center>
</body>
</html>
