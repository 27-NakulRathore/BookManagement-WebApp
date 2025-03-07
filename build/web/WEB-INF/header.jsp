<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f8f8;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }
        .container {
            width: 80%;
            margin: auto;
            overflow: hidden;
            flex: 1;
        }
        header {
            background: #333;
            color: #fff;
            padding-top: 30px;
            min-height: 70px;
            border-bottom: #77b300 3px solid;
            text-align: center;
        }
        header a {
            color: #fff;
            text-decoration: none;
            text-transform: uppercase;
            font-size: 16px;
            margin: 0 20px;
        }
        header ul {
            padding: 0;
            list-style: none;
            display: inline-block;
        }
        header li {
            display: inline;
            padding: 0 20px;
        }
        .main {
            padding: 20px;
            text-align: center;
        }
        .button {
            display: inline-block;
            background: #333;
            color: #fff;
            padding: 10px 20px;
            margin: 10px;
            text-decoration: none;
            font-size: 18px;
            border-radius: 5px;
            transition: background 0.3s ease;
        }
        .button:hover {
            background: #77b300;
        }
            #about {
        position: relative;
        z-index: 1;
        padding: 50px;
        background: #f4f4f4;
        text-align: center;
        margin-top: 20px;
        }

        .footer {
            background: #333;
            color: #fff;
            text-align: center;
            padding: 10px 0;
            margin-top: auto;
        }
        .footer nav a {
            color: #fff;
            text-decoration: none;
            margin: 0 15px;
        }
    </style>
</head>
<body>
<header>
    <div class="container">
        <h1>Book Management System</h1>
        <nav>
            <ul>
                <li><a href="#home">Home</a></li>
                <li><a href="#about">About Us</a></li>
                <li><a href="#contact">Contact Us</a></li>
            </ul>
        </nav>
    </div>
</header>
<div class="container">
    <div class="main">
        <a href="InsertBook.html" class="button">Insert Book</a>
        <a href="SearchBook.html" class="button">Search Book</a>
        <a href="DeleteBook.html" class="button">Delete Book</a>
        <a href="SearchAll.java" class="button">Search All</a>
        <a href="SearchUpdatePage.html" class="button">Update Book</a>
    </div>
</div>
<div id="about">
    <h2>About This Project</h2>
    <p>This is a simple Book Management Website built using JSP, Servlets, and MySQL.</p>
    <p>Developed by: Nakul Rathore</p>
    <p>Technologies Used: HTML, CSS, JSP, Servlets, MySQL</p>
    <p>GitHub: <a href="https://github.com/yourusername" target="_blank">Your GitHub</a></p>
    <p>Email: nakulr950@example.com</p>
</div>
<script>
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function (e) {
            e.preventDefault();
            document.querySelector(this.getAttribute('href')).scrollIntoView({
                behavior: 'smooth'
            });
        });
    });
</script>
<footer class="footer">
    <nav>
        <a href="#about">About Us</a>
        <a href="#contact">Contact Us</a>
    </nav>
    <p>Book Management System &copy; 2024 | Developed by Your Name</p>
</footer>
</body>
</html>
