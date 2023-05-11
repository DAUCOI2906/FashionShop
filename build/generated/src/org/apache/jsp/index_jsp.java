package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.7/css/all.css\" >\n");
      out.write("        <link href=\"https://fonts.google.com/specimen/Source+Sans+Pro\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <script src=\"https://kit.fontawesome.com/85434d7cc7.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/jquery-3.5.1.js\"></script>\n");
      out.write("        <script src=\"js/home.js\"></script>\n");
      out.write("        <title> Fashion Store</title>\n");
      out.write("        <link href='css/bootstrap.css' rel='stylesheet'>\n");
      out.write("        <link href='css/home.css' rel='stylesheet'>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Chilanka&display=swap\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
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
      out.write("                    <h1>WELCOME <strong>FASHION</strong> STORE</h1>\n");
      out.write("                    <h1><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.tentk}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></h1>\n");
      out.write("                    <h2>Cửa hàng trực tuyến, bán quần áo thời trang và giày<br>\n");
      out.write("                        Mua sắm áo quần thời trang và giày cùng với chúng tôi</h2>\n");
      out.write("                    <button id=\"shop-btn\"><span style=\"font-size: larger;font-weight: 600;\">Shop now</span></button><br><br>\n");
      out.write("                    ");

                        Object rq = request.getAttribute("iduser");
                        int iduser_rq = (rq != null) ? Integer.parseInt(rq.toString()) : 0;
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <a href=\"shoes?cid=2&iduser=");
      out.print(iduser_rq);
      out.write("\">\n");
      out.write("                        <button class=\"button\"><span style=\"font-size: larger;font-weight: 600;\">Shoes</span></button>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"clothes?cid=1&iduser=");
      out.print(iduser_rq);
      out.write("\">\n");
      out.write("                        <button class=\"button\"><span style=\"font-size: larger;font-weight: 600;\">Clothes</span></button>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
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
