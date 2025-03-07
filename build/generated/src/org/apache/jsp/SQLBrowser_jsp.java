package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import dao.MyConnection;

public final class SQLBrowser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <font color=\"green\" size=\"8\">S</font>    \n");
      out.write("        <font color=\"blue\" size=\"8\">Q</font>    \n");
      out.write("        <font color=\"red\" size=\"8\">L</font>    \n");
      out.write("        <font color=\"black\" size=\"8\">B</font>    \n");
      out.write("        <font color=\"green\" size=\"8\">r</font>    \n");
      out.write("        <font color=\"blue\" size=\"8\">o</font>  \n");
      out.write("        <font color=\"blue\" size=\"8\">w</font>\n");
      out.write("        <font color=\"red\" size=\"8\">s</font>    \n");
      out.write("        <font color=\"blue\" size=\"8\">e</font>    \n");
      out.write("        <font color=\"black\" size=\"8\">r</font>    \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <form>\n");
      out.write("            <textarea rows=\"10\" cols=\"100\" name=\"txtsql\"></textarea> \n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Execute\">\n");
      out.write("        </form>   \n");
      out.write("\n");
      out.write("        ");

            String sql = null;
            sql = request.getParameter("txtsql");
            if (sql != null) {
                Connection con = null;
                PreparedStatement ps = null;
                ResultSet rs = null;
                ResultSetMetaData rsmd = null;
                con = MyConnection.MygetConnection();
                ps = con.prepareStatement(sql);
                if (sql.toUpperCase().startsWith("SELECT")) {
                    rs = ps.executeQuery();
                    rsmd = rs.getMetaData();
                    out.println("<table border=1>");
                    out.println("<tr>");
                    for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                        out.println("<th>" + rsmd.getColumnName(i) + "</th>");
                    }
                    out.println("</tr>");

                    while (rs.next()) {
                        out.println("<tr>");
                        for (int i = 1; i <= rsmd.getColumnCount(); i++) {

                            out.println("<td>" + rs.getString(i) + "</td>");

                        }
                        out.println("</tr>");
                    }
                    out.println("</table>");
                } else {
                    int n;
                    n = ps.executeUpdate();
                    out.println("<font color=black size=6>Query OK, " +n+ " row affected</font>");
                }

            }
        
      out.write("\n");
      out.write("    </center>\n");
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
