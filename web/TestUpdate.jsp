<%@ page import="java.sql.*, java.io.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Book</title>
</head>
<body>
<center>
    <h2>Update Book Details</h2>
    <form action="TestUpdate.jsp" method="post">
        Book ID: <input type="text" name="bid" required><br><br>
        <input type="submit" value="Fetch Book Details">
    </form>
    <%
        if (request.getParameter("bid") != null) {
            int bid = Integer.parseInt(request.getParameter("bid"));
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "root");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM book WHERE bid=" + bid);
                
                if (rs.next()) {
    %>
                    <form action="TestFinalUpdate.jsp" method="post">
                        <input type="hidden" name="bid" value="<%= rs.getInt("bid") %>">
                        Book Name: <input type="text" name="bname" value="<%= rs.getString("bname") %>" required><br><br>
                        Author Name: <input type="text" name="baname" value="<%= rs.getString("aname") %>" required><br><br>
                        Book Price: <input type="text" name="bprice" value="<%= rs.getInt("price") %>" required><br><br>
                        Publisher: <input type="text" name="bpub" value="<%= rs.getString("publisher") %>" required><br><br>
                        <input type="submit" value="Update Book">
                    </form>
    <%
                } else {
                    out.println("No book found with ID: " + bid);
                }
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    %>
</center>
</body>
</html>
