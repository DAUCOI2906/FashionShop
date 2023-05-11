package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Rimba Fashion Store</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/shoes_clothes.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/mystyles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/details.css\">\n");
      out.write("        <link rel=\"icon\" href=\"imgs/logo.png\">\n");
      out.write("        <style>\n");
      out.write("            .cart-column{\n");
      out.write("                border-bottom: none;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            td,th {\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"about-us.jsp\">About us</a></li>\n");
      out.write("                    <li><a href=\"location.jsp\">Location</a></li>\n");
      out.write("                    <li><a href=\"contact.jsp\">Contact us</a></li>\n");
      out.write("                    <li><a href=\"login\">Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <img src='imgs/logo.png'height='200'>\n");
      out.write("            <h1 class=\"band-name band-name-large\">RIMBA <strong>FASHION</strong> STORE</h1>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section class=\"container content-section\" id=\"content-section\">\n");
      out.write("            <h2 class=\"section-header\">CART</h2>\n");
      out.write("            <div class=\"cart-row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><span class=\"cart-item cart-header cart-column\">ITEM</span></th>\n");
      out.write("                        <th><span class=\"cart-item cart-header cart-column\">DESCRIPTION</span></th>\n");
      out.write("                        <th><span class=\"cart-price cart-header cart-column\">PRICE</span></th>\n");
      out.write("                        <th><span class=\"cart-quantity cart-header cart-column\">QUANTITY</span></th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div class=\"cart-item cart-column\">\n");
      out.write("                                <img class=\"cart-item-image\" src=\"./imgs/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.getHinhanh()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" width=\"100\" height=\"100\" alt=\"khonglayduoc\">\n");
      out.write("                                <span class=\"cart-item-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.getProductname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        <td> \n");
      out.write("                            <span class=\"cart-price cart-column\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.getMota()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </td>\n");
      out.write("                        <td><span class=\"cart-price cart-column\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.getDongia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></td>\n");
      out.write("                        <td>\n");
      out.write("                            <div class=\"cart-quantity cart-column\">\n");
      out.write("                                <input class=\"cart-quantity-input\" type=\"number\" id=\"numSoluong\" value=\"1\"  min=\"1\" max=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.getSoluong()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <script>\n");
      out.write("                                    let myNumber = document.querySelector('#numSoluong');\n");
      out.write("                                    \n");
      out.write("                                    const dongia =");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.getDongia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("                                    myNumber.addEventListener('input', (event) => {\n");
      out.write("                                        const newValue = event.target.value;\n");
      out.write("                                        myNumber.setAttribute('value', newValue);\n");
      out.write("                                        \n");
      out.write("                                        document.querySelector(\"a[href*='cartsp']\").href = \"cartsp?cid=");
      out.print(request.getParameter("cid"));
      out.write("&iduser=");
      out.print(request.getParameter("iduser"));
      out.write("&soluong=\" + myNumber.value;;\n");
      out.write("                                        document.querySelector('#txtTongtien').setAttribute('value', myNumber.value*dongia);\n");
      out.write("                                    });\n");
      out.write("\n");
      out.write("                                </script>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <div class=\"cart-total\">\n");
      out.write("                <strong class=\"cart-total-title\">Total</strong>\n");
      out.write("                <input class=\"cart-total-price\" style=\"border:none;\" name=\"txtTongtien\" id=\"txtTongtien\" readonly=\"\"style=\"font-weight: 700;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.getDongia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\"  />\n");
      out.write("            </div>\n");
      out.write("            <a href=\"cartsp?cid=");
      out.print(request.getParameter("cid"));
      out.write("&iduser=");
      out.print(request.getParameter("iduser"));
      out.write("&soluong=1\">\n");
      out.write("                <input class=\"btn btn-primary btn-purchase\" id=\"Submit1\" type=\"submit\" value=\"ADD TO CART\" />\n");
      out.write("\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <footer class=\"main-footer\">\n");
      out.write("            <div class=\"container main-footer-container\">\n");
      out.write("                <h3 class=\"band-name text-center\">Fashion Store</h3>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
