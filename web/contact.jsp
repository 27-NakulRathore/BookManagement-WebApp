<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    <style>
        body {
            background: #f3f4f6; /* Light Gray Background */
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        
        /* Custom Button Style */
        .custom-button {
            display: inline-block;
            background: linear-gradient(to right, #4a90e2, #9013fe);
            color: #fff;
            padding: 15px 30px;
            border-radius: 50px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);
            text-transform: uppercase;
            font-weight: bold;
            letter-spacing: 1px;
            transition: background 0.3s ease, transform 0.3s ease;
        }

        .custom-button:hover {
            background: linear-gradient(to right, #9013fe, #4a90e2);
            transform: translateY(-5px);
        }
    </style>
</head>
<body>

<!------------- Contact Section ------------>
<div id="contact" class="w-full px-[12%] py-10 scroll-mt-20 bg-no-repeat bg-center bg-cover" style="background-image: url('images/contact-bg.jpg');">
    <h4 class="mb-2 text-lg text-center text-gray-700">Connect with Us</h4>
    <h2 class="text-5xl font-bold text-center text-black">Get in Touch</h2>


    <!-- Form -->
    <form action="sendMail.jsp" method="post" class="max-w-2xl mx-auto">
        <div class="grid grid-cols-1 md:grid-cols-2 gap-6 mt-10 mb-8">
            <input type="text" name="name" placeholder="Enter your name" required
                   class="flex-1 p-3 outline-none border border-gray-400 rounded-md bg-white focus:ring-2 focus:ring-indigo-400">
            
            <input type="email" name="email" placeholder="Enter your email" required
                   class="flex-1 p-3 outline-none border border-gray-400 rounded-md bg-white focus:ring-2 focus:ring-indigo-400">
        </div>

        <textarea name="message" rows="6" placeholder="Enter your message" required
                  class="w-full p-4 outline-none border border-gray-400 rounded-md bg-white mb-6 focus:ring-2 focus:ring-indigo-400"></textarea>

        <button type="submit" class="custom-button">
            Submit Now
        </button>
    </form>
</div>

<footer class="text-center p-5 bg-gray-800 text-white">
    © 2024 Book Management System | Designed by Nakul Rathore
</footer>

</body>
</html>
