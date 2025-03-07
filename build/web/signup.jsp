<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="dao.BookDAO"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sign Up</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #6a11cb, #2575fc);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .signup-container {
            width: 350px;
            padding: 30px;
            background-color: white;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
            border-radius: 12px;
            text-align: center;
        }
        input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 6px;
        }
        input[type="submit"] {
            background: #6a11cb;
            color: white;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background: #2575fc;
        }
        .success {
            color: green;
            font-weight: bold;
        }
        .error {
            color: red;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div class="signup-container">
    <h2>Sign Up</h2>
    <form method="post">
        <input type="text" name="username" placeholder="Enter Username" required>
        <input type="password" name="password" placeholder="Enter Password" required>
        <input type="submit" value="Sign Up">
    </form>

    <% 
        String uname = request.getParameter("username");
        String pwd = request.getParameter("password");
        if(uname != null && pwd != null) {
            BookDAO bd = new BookDAO();
            boolean status = bd.registerUser(uname, pwd);
            if(status) {
    %>
    <div class="success">User Registered Successfully! <a href="index.jsp">Login Here</a></div>
    <% 
            } else { 
    %>
    <div class="error">User Already Exists or Error in Registration!</div>
    <% 
            }
        }
    %>
</div>
</body>
</html>
