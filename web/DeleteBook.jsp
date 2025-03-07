<%@page import="dao.BookDAO"%>
<%@page import="model.Book"%>
<%@page session="true"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Delete Book</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
             
            }
            .delete-container {
                max-width: 400px;
                max-height: 200px;
                margin: 20px auto;
                background: #fff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
            h1 {
                text-align: center;
                color: #333;
                margin-bottom: 20px;
            }
            table {
                width: 100%;
                margin-bottom: 20px;
                border-collapse: collapse;
            }
            th, td {
                padding: 12px;
                text-align: left;
                border: 1px solid #ddd;
            }
            th {
                /*            background-color: #4CAF50;*/
                color:blueviolet;
                font-weight: bold;
            }
            td {
                background-color: #f9f9f9;
            }
            input[type="text"] {
                width: calc(100% - 22px);
                padding: 10px;
                border: 1px solid #ddd;
                border-radius: 5px;
                font-size: 16px;
                box-sizing: border-box;
            }
            .btn-container {
                text-align: center;
                margin-top: 20px;
            }
            .btn-container input[type="submit"],
            .btn-container input[type="reset"] {
                padding: 10px 20px;
                margin: 5px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                background-color: #4CAF50;
                color: white;
                font-size: 16px;
            }
            .btn-container input[type="reset"] {
                background-color: #f44336;
            }
            .message-container {
                background-color: #e8f5e9;
                padding: 15px;
                border-radius: 8px;
                text-align: center;
                margin-bottom: 20px;
                display: none;
            }
            .message-container.show {
                display: block;
            }
            .message-container h2 {
                color: #2e7d32;
                margin: 0;
            }
             .message-container h3 {
                color: red;
                margin: 0;
            }
        </style>
    </head>
    <body>
        <div class="message-container" id="messageContainer">
            <h2>Record Not Found!!!</h2>
        </div>
        <div class="delete-container">
            <h1>Delete Book</h1>



            <form method="post">
                <table>
                    <tr>
                        <th>Enter Book Name for Deletion</th>
                        <td><input type="text" name="txtname" required></td>
                    </tr>
                    <tr>
                        <td colspan="2" class="btn-container">
                            <input type="submit" value="Search">
                            <input type="reset" value="Reset">
                        </td>
                    </tr>
                </table>
            </form>

            <%
                String str = request.getParameter("txtname");
                if (str != null) {
                    BookDAO sd = new BookDAO();
                    Book B = sd.searchbyName(str);
                    if (B != null) {
            %>
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
                    <td><%= B.getbid()%></td>
                    <td><%= B.getbname()%></td>
                    <td><%= B.getAuthname()%></td>
                    <td><%= B.getbprice()%></td>
                    <td><%= B.getbpub()%></td>
                    <td>
                        <form method="post" action="FinalDeleteBook.jsp">
                            <%
                            session.setAttribute("bkname", B.getbname());
                            %>
                            <input type="hidden" name="bkname" value="<%= B.getbname()%>">
                            <input type="submit" value="Delete">
                        </form>
                    </td>
                </tr>
            </table>
            <script>
                document.getElementById("messageContainer").innerHTML = '<h2>Record found. You can now delete it.</h2>';
                document.getElementById("messageContainer").classList.add("show");
            </script>
            <%
            } else {
            %>
            <script>
                document.getElementById("messageContainer").innerHTML = '<h3>Record not found.</h3>';
                document.getElementById("messageContainer").classList.add("show");
            </script>
            <%
                    }
                }
            %>
        </div>
    </body>
</html>
