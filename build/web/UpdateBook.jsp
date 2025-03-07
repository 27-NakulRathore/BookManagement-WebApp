<%@ page import="java.sql.*, java.io.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Book</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .update-container {
            max-width: 800px;
            margin: 20px auto;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
            text-align: center;
            margin-bottom: 20px;
        }
        form {
            display: flex;
            flex-direction: column;
            gap: 10px;
        }
        label {
            font-size: 16px;
            margin-bottom: 5px;
        }
        input[type="text"] {
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 16px;
            width: 100%;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 12px;
            text-align: left;
        }
        th {
            background-color: #4CAF50;
            color: white;
            font-weight: bold;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        .no-data {
            text-align: center;
            color: #888;
            padding: 20px;
        }
    </style>
</head>
<body>
    <div class="update-container">
        <h1>Update Book Details</h1>
        <form action="UpdateBook.jsp" method="post">
            <label for="bid">Book ID:</label>
            <input type="text" id="bid" name="bid" required>
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
            <form action="FinalUpdate.jsp" method="post">
                <table>
                    <tr>
                        <th>Book Id</th>
                        <th>Book Name</th>
                        <th>Author</th>
                        <th>Price</th>
                        <th>Publisher</th>
                        <th>Action</th>
                    </tr>
                    <tr>
                        <td><input type="text" name="bid" value="<%= rs.getInt("bid") %>" readonly></td>
                        <td><input type="text" name="bname" value="<%= rs.getString("bname") %>" required></td>
                        <td><input type="text" name="baname" value="<%= rs.getString("aname") %>" required></td>
                        <td><input type="text" name="bprice" value="<%= rs.getInt("price") %>" required></td>
                        <td><input type="text" name="bpub" value="<%= rs.getString("publisher") %>" required></td>
                        <td><input type="submit" value="Update Book"></td>
                    </tr>
                </table>
            </form>
        <% 
                    } else {
                        out.println("<div class='no-data'>No book found with ID: " + bid + "</div>");
                    }
                    rs.close();
                    stmt.close();
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        %>
    </div>
</body>
</html>
