<%@page import="model.Book"%>
<%@page import="dao.BookDAO"%>
<%@include file="header.jsp"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Books</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .searchall-container {
            max-width: 800px;
            margin: 10px auto;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
            margin-top: 6px;
            margin-bottom: 10px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            padding: 12px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
            font-weight: bold;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        td {
            background-color: #fff;
        }
        .no-data {
            text-align: center;
            color: #888;
            padding: 20px;
        }
    </style>
</head>
<body>
    <div class="searchall-container">
        <h1>All Books</h1>
        <% 
            BookDAO sd = new BookDAO();
            List<Book> mylist = sd.searchAll();
            if (mylist != null && !mylist.isEmpty()) {
        %>
            <table>
                <tr>
                    <th>Book Id</th>
                    <th>Book Name</th>
                    <th>Author Name</th>
                    <th>Price</th>
                    <th>Publisher</th>
                </tr>
                <% for (Book B : mylist) { %>  
                <tr>
                    <td><%= B.getbid() %></td>
                    <td><%= B.getbname() %></td>
                    <td><%= B.getAuthname() %></td>
                    <td><%= B.getbprice() %></td>
                    <td><%= B.getbpub() %></td>
                </tr>
                <% } %>
            </table>
        <% } else { %>
            <div class="no-data">No books found.</div>
        <% } %>
    </div>
</body>
</html>
