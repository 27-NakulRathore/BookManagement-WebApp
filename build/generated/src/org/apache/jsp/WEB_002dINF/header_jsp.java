package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Book Management</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f8f8f8;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            width: 80%;\n");
      out.write("            margin: auto;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            background: #333;\n");
      out.write("            color: #fff;\n");
      out.write("            padding-top: 30px;\n");
      out.write("            min-height: 70px;\n");
      out.write("            border-bottom: #77b300 3px solid;\n");
      out.write("        }\n");
      out.write("        header a {\n");
      out.write("            color: #fff;\n");
      out.write("            text-decoration: none;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        header ul {\n");
      out.write("            padding: 0;\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("        header li {\n");
      out.write("            display: inline;\n");
      out.write("            padding: 0 20px 0 20px;\n");
      out.write("        }\n");
      out.write("        .main {\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        .button {\n");
      out.write("            display: inline-block;\n");
      out.write("            background: #333;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            margin: 10px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size: 18px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            transition: background 0.3s ease;\n");
      out.write("        }\n");
      out.write("        .button:hover {\n");
      out.write("            background: #77b300;\n");
      out.write("        }\n");
      out.write("        .footer {\n");
      out.write("            background: #333;\n");
      out.write("            color: #fff;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px 0;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Book Management System</h1>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#home\">Home</a></li>\n");
      out.write("                    <li><a href=\"#about\">About Us</a></li>\n");
      out.write("                    <li><a href=\"#contact\">Contact Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <a href=\"InsertBook.html\" class=\"button\">Insert Book</a>\n");
      out.write("            <a href=\"SearchBook.html\" class=\"button\">Search Book</a>\n");
      out.write("            <a href=\"DeleteBook.html\" class=\"button\">Delete Book</a>\n");
      out.write("            <a href=\"SearchAll.java\" class=\"button\">Search All</a>\n");
      out.write("            <a href=\"SearchUpdatePage.html\" class=\"button\">Update Book</a>\n");
      out.write("            <a href=\"#about\" class=\"button\">About Us</a>\n");
      out.write("            <a href=\"#contact\" class=\"button\">Contact Us</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      <footer class=\"footer\">\n");
      out.write("    <nav>\n");
      out.write("        <a href=\"#about\" style=\"color: #fff; text-decoration: none; margin-right: 20px;\">About Us</a>\n");
      out.write("        <a href=\"#contact\" style=\"color: #fff; text-decoration: none;\">Contact Us</a>\n");
      out.write("    </nav>\n");
      out.write("    <p>Book Management System &copy; 2024 | Developed by Your Name</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<div id=\"about\" style=\"padding: 50px; background: #f4f4f4; text-align: center;\">\n");
      out.write("    <h2>About This Project</h2>\n");
      out.write("    <p>This is a simple Book Management Website built using JSP, Servlets, and MySQL.</p>\n");
      out.write("    <p>Developed by: Your Name</p>\n");
      out.write("    <p>Technologies Used: HTML, CSS, JSP, Servlets, MySQL</p>\n");
      out.write("    <p>GitHub: <a href=\"https://github.com/yourusername\" target=\"_blank\">Your GitHub</a></p>\n");
      out.write("    <p>Email: yourname@example.com</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("    document.querySelectorAll('a[href^=\"#\"]').forEach(anchor => {\n");
      out.write("        anchor.addEventListener('click', function (e) {\n");
      out.write("            e.preventDefault();\n");
      out.write("            document.querySelector(this.getAttribute('href')).scrollIntoView({\n");
      out.write("                behavior: 'smooth'\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <p>Book Management System &copy; 2024</p>\n");
      out.write("    </footer>\n");
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
