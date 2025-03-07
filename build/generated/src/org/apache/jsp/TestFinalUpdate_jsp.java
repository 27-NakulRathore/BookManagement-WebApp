package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class TestFinalUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Update Book</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Update Book Details</h2>\n");
      out.write("    ");

        if (request.getParameter("bid") != null) {
            int bid = Integer.parseInt(request.getParameter("bid"));
            String bname = request.getParameter("bname");
            String baname = request.getParameter("baname");
            int bprice = Integer.parseInt(request.getParameter("bprice"));
            String bpub = request.getParameter("bpub");
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name", "your_username", "your_password");
                String sql = "UPDATE book SET bname=?, baname=?, bprice=?, bpub=? WHERE bid=?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, bname);
                pstmt.setString(2, baname);
                pstmt.setInt(3, bprice);
                pstmt.setString(4, bpub);
                pstmt.setInt(5, bid);
                
                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    out.println("Book updated successfully.");
                } else {
                    out.println("Failed to update book.");
                }
                
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            out.println("No book ID provided.");
        }
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
