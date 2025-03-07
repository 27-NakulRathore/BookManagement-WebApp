<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Management System</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f0f0f0;
            display: flex;
            flex-direction: column;
            min-height: 100vh; /* Full height layout */
        }
        header {
            background: linear-gradient(to right, #4a90e2, #9013fe);
            color: #fff;
            padding: 20px 0;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        header .container {
            display: flex;
            justify-content: space-between; /* Space between left and right content */
            align-items: center; 
            padding: 0 40px;
        }
        header h1 {
            margin: 0;
            font-size: 24px;
        }
        nav ul {
            display: flex;
            list-style: none;
            padding: 0;
        }
        nav ul li {
            margin-left: 20px;
        }
        nav ul li a {
            color: #fff;
            text-decoration: none;
            font-weight: bold;
            padding: 8px 16px;
            border-radius: 4px;
            transition: background 0.3s ease;
        }
        nav ul li a:hover {
            background: rgba(255, 255, 255, 0.2);
        }
        .main {
            flex: 1;
            padding: 40px 0;
            text-align: center;
        }
        .main .button {
            display: inline-block;
            background: #4a90e2;
            color: #fff;
            padding: 15px 30px;
            margin: 15px;
            text-decoration: none;
            font-size: 20px;
            border-radius: 50px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            transition: background 0.3s ease, transform 0.3s ease;
        }
        .main .button:hover {
            background: #9013fe;
            transform: translateY(-5px);
        }
        .main .button:active {
            background: #7a10cc;
            transform: translateY(2px);
        }
        .signout {
            display: block;
            text-align: center;
            margin: 20px 0;
            font-size: 18px;
            text-decoration: none;
            color: #4a90e2;
            font-weight: bold;
            transition: color 0.3s ease;
        }
        .signout:hover {
            color: #9013fe;
        }
        footer {
            background: #333;
            color: #fff;
            text-align: center;
            padding: 20px 0;
            font-size: 14px;
        }
    </style>
</head>
<body>
    <header>
        <div class="container">
            <h1>Book Management System</h1>
            <nav>
                <ul>
                    <li><a href="header.jsp">Home</a></li>
                    <li><a href="about.jsp">About Us</a></li>
                    <li><a href="contact.jsp">Contact Us</a></li>
                </ul>
            </nav>
        </div>
    </header>

    <div class="main">
        <a href="InsertBook.jsp" class="button">Insert Book</a>
        <a href="SearchBook.jsp" class="button">Search Book</a>
        <a href="DeleteBook.jsp" class="button">Delete Book</a>
        <a href="SearchAll.jsp" class="button">Search All</a>
        <a href="UpdateBook.jsp" class="button">Update Book</a>
    </div>

    <a href="signout.jsp" class="signout">Sign Out</a>

    <footer>
        <p>Book Management System &copy; 2024</p>
    </footer>
</body>
</html>
