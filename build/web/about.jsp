<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About Us - Book Management System</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        /* Navbar Common Styling */
        header {
            background: linear-gradient(to right, #4a90e2, #9013fe);
            color: #fff;
            padding: 20px 0;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        header .container {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 0 40px;
        }

        header h1 {
            margin: 0;
            font-size: 24px;
        }

        nav ul {
            list-style: none;
            margin: 0;
            padding: 0;
            display: flex;
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

        .about-section {
            text-align: center;
            margin: 40px auto;
            width: 80%;
            max-width: 900px;
            padding: 40px;
            background: #fff;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
        }

        .about-section h2 {
            cursor: pointer;
            background: #4a90e2;
            padding: 20px;
            color: #fff;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            transition: background 0.3s ease, transform 0.3s ease;
        }

        .about-section h2:hover {
            background: #9013fe;
            transform: translateY(-5px);
        }

        .about-content {
            display: none;
            padding: 20px;
            margin-top: 20px;
            background: rgba(255, 255, 255, 0.9);
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            backdrop-filter: blur(10px);
            transition: all 0.5s ease;
            text-align: left;
        }

        .about-content p {
            color: #333;
            font-size: 18px;
            line-height: 1.8;
        }

        ul {
            list-style: none;
            padding-left: 0;
        }

        ul li {
            margin-bottom: 10px;
            padding-left: 20px;
            position: relative;
        }

        ul li::before {
            content: '✔️';
            position: absolute;
            left: 0;
            color: #4a90e2;
            font-weight: bold;
        }

        footer {
            background: #333;
            color: #fff;
            text-align: center;
            padding: 10px 0;
            margin-top: 40px;
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

<div class="about-section">
    <h2 onclick="toggleAbout()">About This Project 🔥 ⬇️</h2>
    <div id="about-content" class="about-content">
        <p>📚 This project is a <span style="color: #77b300;">Book Management System</span> using **JSP**, **Servlets**, and **MySQL**.</p>
        <p>I created this project to improve my **Java Web Development** skills.</p>
        <ul>
            <li>✅ Insert Book</li>
            <li>✅ Search Book</li>
            <li>✅ Delete Book</li>
            <li>✅ Update Book</li>
            <li>✅ View All Books</li>
            <li>✅ User Authentication</li>
        </ul>
        <p><strong>Developer:</strong> Nakul Rathore</p>
        <p>GitHub: <a href="https://github.com/27-NakulRathore" target="_blank">My GitHub</a></p>
        <p>Email: <a href="mailto:nakulr@gmail.com">nakulr@gmail.com</a></p>
    </div>
</div>

<footer>
    <p>Book Management System &copy; 2024</p>
</footer>

<script>
    let isOpen = false;

    function toggleAbout() {
        const content = document.getElementById("about-content");
        const heading = document.querySelector(".about-section h2");

        if (!isOpen) {
            content.style.display = "block";
            content.style.opacity = "0";
            setTimeout(() => {
                content.style.opacity = "1";
                heading.innerHTML = "About This Project 🔥 🔼";
            }, 100);
        } else {
            content.style.opacity = "0";
            heading.innerHTML = "About This Project 🔥 ⬇️";
            setTimeout(() => {
                content.style.display = "none";
            }, 300);
        }
        isOpen = !isOpen;
    }
</script>

</body>
</html>
