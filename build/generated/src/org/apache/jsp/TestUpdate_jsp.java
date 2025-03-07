package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class TestUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<center>\n");
      out.write("    <h2>Update Book Details</h2>\n");
      out.write("    <form action=\"TestUpdate.jsp\" method=\"post\">\n");
      out.write("        Book ID: <input type=\"text\" name=\"bid\" required><br><br>\n");
      out.write("        <input type=\"submit\" value=\"Fetch Book Details\">\n");
      out.write("    </form>\n");
      out.write("    ");

        if (request.getParameter("bid") != null) {
            int bid = Integer.parseInt(request.getParameter("bid"));
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "root");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM book WHERE bid=" + bid);
                
                if (rs.next()) {
    
      out.write("\n");
      out.write("                    <form action=\"TestFinalUpdate.jsp\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"bid\" value=\"");
      out.print( rs.getInt("bid") );
      out.write("\">\n");
      out.write("                        Book Name: <input type=\"text\" name=\"bname\" value=\"");
      out.print( rs.getString("bname") );
      out.write("\" required><br><br>\n");
      out.write("                        Author Name: <input type=\"text\" name=\"baname\" value=\"");
      out.print( rs.getString("aname") );
      out.write("\" required><br><br>\n");
      out.write("                        Book Price: <input type=\"text\" name=\"bprice\" value=\"");
      out.print( rs.getInt("price") );
      out.write("\" required><br><br>\n");
      out.write("                        Publisher: <input type=\"text\" name=\"bpub\" value=\"");
      out.print( rs.getString("publisher") );
      out.write("\" required><br><br>\n");
      out.write("                        <input type=\"submit\" value=\"Update Book\">\n");
      out.write("                    </form>\n");
      out.write("    ");

                } else {
                    out.println("No book found with ID: " + bid);
                }
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
      out.write("\n");
      out.write("</center>\n");
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
