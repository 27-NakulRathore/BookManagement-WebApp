<%@ page import="java.sql.*, java.io.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Book</title>
</head>
<body>
<center>
    <%
        String bidStr = request.getParameter("bid");
        String bname = request.getParameter("bname");
        String baname = request.getParameter("baname");
        String bpriceStr = request.getParameter("bprice");
        String bpub = request.getParameter("bpub");
        
        if (bidStr != null && !bidStr.isEmpty() &&
            bname != null && !bname.isEmpty() &&
            baname != null && !baname.isEmpty() &&
            bpriceStr != null && !bpriceStr.isEmpty() &&
            bpub != null && !bpub.isEmpty()) {
            try {
                int bid = Integer.parseInt(bidStr);
                int bprice = Integer.parseInt(bpriceStr);
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "root");
                String sql = "UPDATE book SET bname=?, aname=?, price=?, publisher=? WHERE bid=?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, bname);
                pstmt.setString(2, baname);
                pstmt.setInt(3, bprice);
                pstmt.setString(4, bpub);
                pstmt.setInt(5, bid);
                
                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    out.println("<font color=green size=6>Book Record Updated</font>");
                } else {
                    out.println("Failed to update book.");
                }
                
                pstmt.close();
                conn.close();
            } catch (NumberFormatException e) {
                out.println("Invalid input for book ID or price. Please enter valid integers.");
            } catch (Exception e) {
                e.printStackTrace();
                out.println("An error occurred while updating the book. Please try again.");
            }
        } else {
            out.println("All fields are required.");
        }
    %>
</center>
</body>
</html>
