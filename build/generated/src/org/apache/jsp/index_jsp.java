package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.BookDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Login Page</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background: linear-gradient(to right, #6a11cb, #2575fc);\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            height: 100vh;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .login-container {\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("            width: 300px;\n");
      out.write("            text-align: center;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("        .login-container h2 {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            color: #333333;\n");
      out.write("        }\n");
      out.write("        .login-container input[type=\"text\"], \n");
      out.write("        .login-container input[type=\"password\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            border: 1px solid #cccccc;\n");
      out.write("            border-radius: 6px;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        .login-container input[type=\"submit\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #6a11cb;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 6px;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background-color 0.3s ease;\n");
      out.write("        }\n");
      out.write("        .login-container input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #2575fc;\n");
      out.write("        }\n");
      out.write("        .login-container .error {\n");
      out.write("            color: #ff3333;\n");
      out.write("            background-color: #ffe6e6;\n");
      out.write("            border: 1px solid #ff9999;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-top: 15px;\n");
      out.write("            border-radius: 6px;\n");
      out.write("            font-size: 14px;\n");
      out.write("            display: none; /* Initially hidden */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"login-container\">\n");
      out.write("        <h2>Login</h2>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"username\" placeholder=\"Enter Username\" required>\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Enter Password\" required>\n");
      out.write("            <input type=\"submit\" value=\"Login\">\n");
      out.write("        </form>\n");
      out.write("        <p>Don't have an account? <a href=\"signup.jsp\">Sign Up Here</a></p>\n");
      out.write("        ");
 
           String user = request.getParameter("username");
           String pass = request.getParameter("password");
           if(user != null && pass != null) {
                BookDAO bd = new BookDAO();
                if(bd.checkLogin(user, pass)) {  
                      session.setAttribute("username", user);
                      session.setAttribute("password", pass);
                      response.sendRedirect("header.jsp");
                } else {
        
      out.write("\n");
      out.write("        <div class=\"error\" style=\"display:block;\">\n");
      out.write("            Invalid user ID or password. Please try again.\n");
      out.write("        </div>\n");
      out.write("        ");
   
               }
           }
        
      out.write("\n");
      out.write("    </div>\n");
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
