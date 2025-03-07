<%@page import="dao.BookDAO"%>
<%@include file="header.jsp"%>
<jsp:useBean class="model.Book" id="B">  
    <jsp:setProperty name="B" property="*"></jsp:setProperty>
</jsp:useBean>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Record Insertion</title>
<!--    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background: #f5f5f5;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .insert-message-container {
            background-color: #e8f5e9;
            padding: 20px 40px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 400px;
        }
        .insert-message-container h1 {
            color: #2e7d32;
            font-size: 24px;
            margin: 0;
            text-transform: uppercase;
            letter-spacing: 2px;
        }
        .insert-message-container p {
            font-size: 18px;
            color: #4caf50;
            margin-top: 10px;
        }
    </style>-->
</head>
<body>
<center>
    <div class="insert-message-container">
        <% 
            BookDAO bd = new BookDAO();
            try {
                if(bd.insertBook(B) > 0) { %>
                    <h1>Success!</h1>
                  <font color=green size=6>Record Inserted</font>
                <% } else { %>
                    <h1>Error!</h1>
                    <font color=red size=6>Failed to insert record.</font>
                <% }
            } catch(Exception e) {
                e.printStackTrace();
                %>
                <h1>Error!</h1>
                <p><%= e.getMessage() %></p>
            <% } %>
    </div>
</center>
</body>
</html>

