package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.BookDAO;

public final class LoginDB_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("    <TITLE>My Index Page</TITLE>\n");
      out.write("</HEAD>\n");
      out.write("<BODY>\n");
      out.write("<center>\n");
      out.write("    <form method=post action=\"DatabaseList.jsp\">\n");
      out.write("<table border=1>\n");
      out.write("<tr>\n");
      out.write("<th>User Name</th>\n");
      out.write("<td><input type=text name=txtuser></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th>Password</th>\n");
      out.write("<td><input type=password name=txtpassword></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td>\n");
      out.write("<input type=submit value=Login>\n");
      out.write("<input type=reset value=Reset>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
 
   String user=null,pass=null;
   user=request.getParameter("txtuser");
   pass=request.getParameter("txtpassword");
   if(user!=null && pass!=null)
   {
        BookDAO bd=new BookDAO();
        if(bd.checkLogin(user, pass))
        {  
              session.setAttribute("username", user);
              session.setAttribute("password", pass);
              response.sendRedirect("header.jsp");
        }      
        else
              out.println("<font color=red size=5> invalid user id or password</font>");   
      
               
   }

      out.write("\n");
      out.write("</center>\n");
      out.write("</BODY>\n");
      out.write("</HTML>");
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
