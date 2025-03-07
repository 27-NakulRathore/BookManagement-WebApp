<%@page import="dao.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #6a11cb, #2575fc);
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .login-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 300px;
            text-align: center;
            position: relative;
        }
        .login-container h2 {
            margin-bottom: 20px;
            color: #333333;
        }
        .login-container input[type="text"], 
        .login-container input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #cccccc;
            border-radius: 6px;
            font-size: 16px;
        }
        .login-container input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #6a11cb;
            border: none;
            border-radius: 6px;
            color: white;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .login-container input[type="submit"]:hover {
            background-color: #2575fc;
        }
        .login-container .error {
            color: #ff3333;
            background-color: #ffe6e6;
            border: 1px solid #ff9999;
            padding: 10px;
            margin-top: 15px;
            border-radius: 6px;
            font-size: 14px;
            display: none; /* Initially hidden */
        }
    </style>
</head>
<body>

    <div class="login-container">
        <h2>Login</h2>
        <form method="post">
            <input type="text" name="username" placeholder="Enter Username" required>
            <input type="password" name="password" placeholder="Enter Password" required>
            <input type="submit" value="Login">
        </form>
        <% 
           String user = request.getParameter("username");
           String pass = request.getParameter("password");
           if(user != null && pass != null) {
                BookDAO bd = new BookDAO();
                if(bd.checkLogin(user, pass)) {  
                      session.setAttribute("username", user);
                      session.setAttribute("password", pass);
                      response.sendRedirect("header.jsp");
                } else {
        %>
        <div class="error" style="display:block;">
            Invalid user ID or password. Please try again.
        </div>
        <%   
               }
           }
        %>
    </div>

</body>
</html>
