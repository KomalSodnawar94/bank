package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

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

    boolean flag = true;
    try {
        Cookie cookie = null;
        Cookie[] cookies = null;

        cookies = request.getCookies();
        if (cookies != null) {

            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                
                if (cookie.getValue().toString().equals("invalid")) {
                    flag = false;
                }
            }
        }

    } catch (Exception e) {

    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"bootstrap-3.3.7-dist/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"font-awesome-4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <section><div class=\"welcome\"><marquee><b> WELCOME TO HDFC BANK</b></marquee></div></section>\n");
      out.write("          <form id=\"main\" action=\"login1\" method=\"post\">\n");
      out.write("             \n");
      out.write("            <center><h1> Login</h1></center>\n");
      out.write("                        <div>\n");
      out.write("\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label id=\"loginlabel\" style=\"font-family: cursive;\"><h4>AccountId &nbsp</h4></label>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"AccountId\" placeholder=\"Enter AccountId\" title=\"AccountId\" style=\"width:200px;padding:10px;border-radius:5px;\">\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label id=\"loginlabel\"><h4>Password &nbsp</h4></label>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" name=\"Password\" placeholder=\"********\" title=\"Password\" style=\"width:200px;padding:10px;border-radius:5px;\">\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        &nbsp;\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        &nbsp;\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" id=\"loginbtn\" value=\"Login\" name=\"login\" class=\"btn btn-success\" style=\"width: 50%;padding: 10px;border-radius:5px;\">\n");
      out.write("                        \n");
      out.write("                        <center><a href=\"NewAccount\" ><h4>Create a New Account</h4></a></center>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("          <script src=\"../../NewBank/web/src/bose.slider.js\" type=\"text/javascript\"></script>\n");
      out.write("          <script src=\"../../NewBank/web/src/bose.slider.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
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
