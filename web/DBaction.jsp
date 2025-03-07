<%@ page import="java.sql.*, java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Database Operations</title>
</head>
<body>
    <h2>Perform Operations on Database</h2>
    <%
        String dbName = request.getParameter("database");
        session.setAttribute("database", dbName);
    %>
    <form method="post" action="">
        <input type="hidden" name="database" value="<%= dbName %>">
        <label for="sqlQuery">Enter SQL Query:</label><br>
        <textarea id="sqlQuery" name="sqlQuery" rows="4" cols="50" required></textarea><br><br>
        <input type="submit" value="Execute Query">
    </form>

    <%
        dbName = (String) session.getAttribute("database");
        String user = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        String sqlQuery = request.getParameter("sqlQuery");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/" + dbName;

        if (sqlQuery != null && !sqlQuery.trim().isEmpty()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);
                stmt = conn.createStatement();
                boolean hasResultSet = stmt.execute(sqlQuery);

                if (hasResultSet) {
                    rs = stmt.getResultSet();
                    ResultSetMetaData rsmd = rs.getMetaData();
                    int columnsNumber = rsmd.getColumnCount();
                    out.println("<table border='1'><tr>");
                    for (int i = 1; i <= columnsNumber; i++) {
                        out.println("<th>" + rsmd.getColumnName(i) + "</th>");
                    }
                    out.println("</tr>");

                    while (rs.next()) {
                        out.println("<tr>");
                        for (int i = 1; i <= columnsNumber; i++) {
                            out.println("<td>" + rs.getString(i) + "</td>");
                        }
                        out.println("</tr>");
                    }
                    out.println("</table>");
                } else {
                    int updateCount = stmt.getUpdateCount();
                    out.println("<p>Query executed successfully. Rows affected: " + updateCount + "</p>");
                }
            } catch (SQLException e) {
                out.println("<p>Error executing query: " + e.getMessage() + "</p>");
                
            } catch (ClassNotFoundException e) {
                out.println("<p>Error: MySQL JDBC Driver not found.</p>");
             
            } 
            
        }
    %>
</body>
</html>
