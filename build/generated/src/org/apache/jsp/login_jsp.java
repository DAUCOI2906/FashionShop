package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.7/css/all.css\">\n");
      out.write("        <link href=\"https://fonts.google.com/specimen/Source+Sans+Pro\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/85434d7cc7.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/jquery-3.5.1.js\"></script>\n");
      out.write("        <script src=\"js/home.js\"></script>\n");
      out.write("        <title>Login Account</title>\n");
      out.write("        <link href='css/bootstrap.css' rel='stylesheet'>\n");
      out.write("        <link href='css/home.css' rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Chilanka&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            .thongbao{\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .hien{\n");
      out.write("                display: block;\n");
      out.write("                text-align: center;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color:red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header class=\"container-fluid\">\n");
      out.write("            <div id=\"home\">\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"about-us.jsp\">About us</a></li>\n");
      out.write("                        <li><a href=\"location.jsp\">Location</a></li>\n");
      out.write("                        <li><a href=\"contact.jsp\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"login\">Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <img src=\"imgs/logo.png\" height=\"200\">\n");
      out.write("                    <h1>RIMBA <strong>FASHION</strong> STORE</h1>\n");
      out.write("                    <h2>Rimba fashion store is an online shop, that sells fashion clothes and shoes in Rwanda.<br>\n");
      out.write("                        Shop with us both clothes and shoes.</h2>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <div class=\"modallogin js-login\">\n");
      out.write("            <div class=\"modallogin_item js-item-close\">\n");
      out.write("                <div class=\"btclose js-close\">\n");
      out.write("                    <a href=\"index.jsp\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\"\n");
      out.write("                             stroke=\"currentColor\" class=\"w-6 h-6\">\n");
      out.write("                        <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M6 18L18 6M6 6l12 12\" />\n");
      out.write("                        </svg>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"modallogin_head\">\n");
      out.write("                    <h1>Sing up Account</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modallogin_content\">\n");
      out.write("                    <form action=\"login\">\n");
      out.write("\n");
      out.write("                        <label for=\"username\">User name</label>\n");
      out.write("                        <input type=\"text\" placeholder=\"username\" id=\"username\" name=\"username\" required=\"\">\n");
      out.write("                        <label for=\"pass\">Pass word</label>\n");
      out.write("                        <input type=\"password\" id=\"pass\" name=\"password\" required=\"\">\n");
      out.write("                        <input type=\"submit\" value=\"Login\" id=\"dangnhap\">\n");
      out.write("                    </form>\n");
      out.write("                    <h3 class=\"thongbao\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.tbao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                    <p>If you don't have an account, click to <a href=\"signup.jsp\">sign up</a>.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

            String username = "John"; // khởi tạo giá trị biến username
        
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            const btnsub = document.querySelector('#dangnhap');\n");
      out.write("            const tb= document.querySelector('.thongbao');\n");
      out.write("            function hienthi ()\n");
      out.write("            {\n");
      out.write("                tb.classList.add('hien');\n");
      out.write("            }\n");
      out.write("            btnsub.addEventListener('click',hienthi);\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
