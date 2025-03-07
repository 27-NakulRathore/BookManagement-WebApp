package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.BookDAO;

public final class insertBookTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Book Management System</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            background: #f0f0f0;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            background: linear-gradient(to right, #4a90e2, #9013fe);\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 20px 0;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        header .container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        header h1 {\n");
      out.write("            margin: 0;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("        nav ul {\n");
      out.write("            list-style: none;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("        }\n");
      out.write("        nav ul li {\n");
      out.write("            margin-left: 20px;\n");
      out.write("        }\n");
      out.write("        nav ul li a {\n");
      out.write("            color: #fff;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-weight: bold;\n");
      out.write("            padding: 8px 16px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            transition: background 0.3s ease;\n");
      out.write("        }\n");
      out.write("        nav ul li a:hover {\n");
      out.write("            background: rgba(255, 255, 255, 0.2);\n");
      out.write("        }\n");
      out.write("        .main {\n");
      out.write("            padding: 40px 0;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .main .button {\n");
      out.write("            display: inline-block;\n");
      out.write("            background: #4a90e2;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 15px 30px;\n");
      out.write("            margin: 15px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size: 20px;\n");
      out.write("            border-radius: 50px;\n");
      out.write("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\n");
      out.write("            transition: background 0.3s ease, transform 0.3s ease;\n");
      out.write("        }\n");
      out.write("        .main .button:hover {\n");
      out.write("            background: #9013fe;\n");
      out.write("            transform: translateY(-5px);\n");
      out.write("        }\n");
      out.write("        .main .button:active {\n");
      out.write("            background: #7a10cc;\n");
      out.write("            transform: translateY(2px);\n");
      out.write("        }\n");
      out.write("        .footer {\n");
      out.write("            background: #333;\n");
      out.write("            color: #fff;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px 0;\n");
      out.write("            margin-top: 40px;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("        .footer p {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        .signout {\n");
      out.write("            display: block;\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 20px 0;\n");
      out.write("            font-size: 18px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #4a90e2;\n");
      out.write("            font-weight: bold;\n");
      out.write("            transition: color 0.3s ease;\n");
      out.write("        }\n");
      out.write("        .signout:hover {\n");
      out.write("            color: #9013fe;\n");
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
      out.write("            <a href=\"InsertBook.jsp\" class=\"button\">Insert Book</a>\n");
      out.write("            <a href=\"SearchBook.jsp\" class=\"button\">Search Book</a>\n");
      out.write("            <a href=\"DeleteBook.jsp\" class=\"button\">Delete Book</a>\n");
      out.write("            <a href=\"SearchAll.jsp\" class=\"button\">Search All</a>\n");
      out.write("            <a href=\"UpdateBook.jsp\" class=\"button\">Update Book</a>\n");
      out.write("            <a href=\"#about\" class=\"button\">About Us</a>\n");
      out.write("            <a href=\"#contact\" class=\"button\">Contact Us</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <a href=\"signout.jsp\" class=\"signout\">Sign Out</a>\n");
      out.write("    \n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <p>Book Management System &copy; 2024</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
      model.Book B = null;
      synchronized (_jspx_page_context) {
        B = (model.Book) _jspx_page_context.getAttribute("B", PageContext.PAGE_SCOPE);
        if (B == null){
          B = new model.Book();
          _jspx_page_context.setAttribute("B", B, PageContext.PAGE_SCOPE);
          out.write("  \n");
          out.write("    ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("B"), request);
          out.write('\n');
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Insert Book</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Arial', sans-serif;\n");
      out.write("            background: #f0f0f0;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 800px;\n");
      out.write("            margin: auto;\n");
      out.write("            background: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #333;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        td {\n");
      out.write("            background-color: #f9f9f9;\n");
      out.write("        }\n");
      out.write("        .message-container {\n");
      out.write("            background-color: #e8f5e9;\n");
      out.write("            padding: 15px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("        .message-container.show {\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("        .message-container h2 {\n");
      out.write("            color: #2e7d32;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        .btn-container {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        .btn-container input[type=\"submit\"], \n");
      out.write("        .btn-container input[type=\"reset\"] {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            margin: 5px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        .btn-container input[type=\"reset\"] {\n");
      out.write("            background-color: #f44336;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Insert Book Data</h1>\n");
      out.write("        <form method=\"post\" action=\"FinalInsertBook.jsp\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Book Id</th>\n");
      out.write("                    <td><input type=\"text\" name=\"bid\" id=\"BID\" value=\"");
      out.print(BookDAO.autoIncrement());
      out.write("\" readonly></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Book Name</th>\n");
      out.write("                    <td><input type=\"text\" name=\"bname\" id=\"BNAME\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Author Name</th>\n");
      out.write("                    <td><input type=\"text\" name=\"authname\" id=\"AUTHNAME\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <td><input type=\"text\" name=\"bprice\" id=\"BPRICE\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Publisher</th>\n");
      out.write("                    <td><input type=\"text\" name=\"bpub\" id=\"BPUB\" required></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <div class=\"btn-container\">\n");
      out.write("                <input type=\"submit\" value=\"Submit\">\n");
      out.write("                <input type=\"reset\" value=\"Reset\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <div class=\"message-container\" id=\"successMessage\">\n");
      out.write("            <h2>Record inserted successfully!</h2>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        document.querySelector(\"form\").addEventListener(\"submit\", function(event) {\n");
      out.write("            event.preventDefault();\n");
      out.write("            // Simulate form submission to the server\n");
      out.write("            // You can use AJAX here for actual server-side communication\n");
      out.write("            // For this example, we'll just show the success message\n");
      out.write("            document.getElementById(\"successMessage\").classList.add(\"show\");\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
