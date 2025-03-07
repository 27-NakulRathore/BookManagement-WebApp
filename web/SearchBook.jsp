<%@page import="dao.BookDAO"%>
<%@page import="model.Book"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Search Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .search-container {
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
            margin-bottom: 20px;
        }
        form table {
            width: 100%;
            border-collapse: collapse;
        }
        form th, form td {
            padding: 12px;
            text-align: left;
        }
        form th {
            background-color: #4CAF50;
            color: white;
            font-weight: bold;
        }
        form input[type="text"] {
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            width: 100%;
            box-sizing: border-box;
        }
        form input[type="submit"], form input[type="reset"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
            margin-right: 10px;
            transition: background-color 0.3s ease;
        }
        form input[type="submit"]:hover, form input[type="reset"]:hover {
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
            background-color: #cc6600;
            color: black;
            font-weight: bold;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        .no-record {
            color: red;
            text-align: center;
            font-size: 18px;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="search-container">
        <h1>Book Search Page</h1>
        <form method="post">
            <table>
                <tr>
                    <th>Enter Book ID for Search</th>
                    <td><input type="text" name="txtbid" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Search">
                        <input type="reset" value="Reset">
                    </td>
                </tr>
            </table>
        </form>

        <% 
            String str = request.getParameter("txtbid");
            if (str != null) {
                int n = Integer.parseInt(str);
                BookDAO bd = new BookDAO();
                Book B = bd.searchById(n);
                if (B != null) {
        %>
            <table>
                <tr>
                    <th>Book Id</th>
                    <th>Book Name</th>
                    <th>Author Name</th>
                    <th>Price</th>
                    <th>Publisher</th>
                </tr>
                <tr>
                    <td><%= B.getbid() %></td>
                    <td><%= B.getbname() %></td>
                    <td><%= B.getAuthname() %></td>
                    <td><%= B.getbprice() %></td>
                    <td><%= B.getbpub() %></td>
                </tr>
            </table>
        <% 
                } else {
        %>
            <div class="no-record">Record not found</div>
        <% 
                }
            }
        %>
    </div>
</body>
</html>
