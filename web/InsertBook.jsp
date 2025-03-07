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
    <title>Insert Book</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: #f0f0f0;
            margin: 0px;
            padding: 0px;
        }
        .container1 {
            max-width: 400px;
            max-height: 400px;
            margin: auto;
            margin-top: 20px;
            background: #fff;
            padding: 25px;
            border-radius: 10px;
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
        }
        th {
/*            background-color: #4CAF50;*/
            color: black;
            font-weight: bold;
            text-align: right;
            width: 30%;
        }
        td {
            background-color: #f9f9f9;
            text-align: left;
            width: 70%;
        }
        input[type="text"] {
            width: 100%;
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
    </style>
</head>
<body>
      <div class="message-container" id="successMessage">
<!--            <h2>Record inserted successfully!</h2>-->
        </div>
    <div class="container1">
       
        <h1>Insert Book Data</h1>
        <form method="post" action="FinalInsertBook.jsp">
            <table>
                <tr>
                    <th>Book Id:</th>
                    <td><input type="text" name="bid" id="BID" value="<%=BookDAO.autoIncrement()%>" readonly></td>
                </tr>
                <tr>
                    <th>Book Name:</th>
                    <td><input type="text" name="bname" id="BNAME" required></td>
                </tr>
                <tr>
                    <th>Author Name:</th>
                    <td><input type="text" name="authname" id="AUTHNAME" required></td>
                </tr>
                <tr>
                    <th>Price:</th>
                    <td><input type="text" name="bprice" id="BPRICE" required></td>
                </tr>
                <tr>
                    <th>Publisher:</th>
                    <td><input type="text" name="bpub" id="BPUB" required></td>
                </tr>
            </table>
            <div class="btn-container">
                <input type="submit" value="Submit">
                <input type="reset" value="Reset">
            </div>
        </form>
       
    </div>

    <script>
        for(int i=0;i<=20;i++){
        document.querySelector("form").addEventListener("submit", function(event) {
            event.preventDefault();
            // Simulate form submission to the server
            document.getElementById("successMessage").classList.add("show");
        });
    }
    </script>
</body>
</html>
