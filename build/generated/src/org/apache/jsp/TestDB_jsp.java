package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class TestDB_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Database List</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<center>\n");
      out.write("    <font color=\"green\" size=\"7\">Select Database</font>\n");
      out.write("    <br><br>\n");
      out.write("    <form method=\"post\" action=\"DBaction.jsp\">\n");
      out.write("        <select name=\"database\" id=\"database\">\n");
      out.write("            <option value=\"\">-- Select Database --</option>\n");
      out.write("            ");

                String user=request.getParameter("txtuser");
                String password=request.getParameter("txtpass");
                String url="jdbc:mysql://localhost:3306/";
                
                Class.forName("con.mysql.cj.jdbc.Driver");
     
                Connection con = null;
                PreparedStatement ps = null;
                ResultSet rs = null;
                DatabaseMetaData dbmd=null;
                con= DriverManager.getConnection(url ,user, password);
               dbmd = con.getMetaData();
               rs=dbmd.getCatalogs();

                    while (rs.next()) {
                        String dbName = rs.getString(1);
                        out.println("< option value=" + dbName + ">" + dbName + "</option>");
                    }
                
            
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\n");
      out.write("    </form>\n");
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
