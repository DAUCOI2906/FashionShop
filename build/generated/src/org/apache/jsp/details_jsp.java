package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Rimba Fashion Store</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/shoes_clothes.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/mystyles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/details.css\">\n");
      out.write("    <link rel=\"icon\" href=\"imgs/logo.png\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header class=\"main-header\">\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"about-us.jsp\">About us</a></li>\n");
      out.write("                <li><a href=\"location.jsp\">Location</a></li>\n");
      out.write("                <li><a href=\"contact.jsp\">Contact us</a></li>\n");
      out.write("                <li><a href=\"login\">Login</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <img src='imgs/logo.png'height='200'>\n");
      out.write("        <h1 class=\"band-name band-name-large\">RIMBA <strong>FASHION</strong> STORE</h1>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section class=\"container content-section women\">\n");
      out.write("        <h2 class=\"section-header\">Chi tiết sản phẩm</h2>\n");
      out.write("        <span class=\"shop-item-title\">Winter Coat</span>\n");
      out.write("        <div class=\"container_product\">\n");
      out.write("            <div class=\"img_box\"><img class=\"shop-item-image\" src=\"imgs/wintercot.jpg\">\n");
      out.write("                <div class=\"shop-item-details\">\n");
      out.write("                    <button class=\"btn btn-primary shop-item-button\" type=\"button\">ADD TO CART</button>\n");
      out.write("                    <a href=\"#content-section\"><button class=\"btn btn-primary shop-item-button\">VIEW CART</button></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("                <div class=\"product_content\">\n");
      out.write("                    <div class=\"discription\">\n");
      out.write("                        <p class=\"label_info\">Mô tả sản phẩm:</p>\n");
      out.write("                        <p class=\"info_product\">Cửa hàng trực tuyến, bán quần áo thời trang và giày\n");
      out.write("                            Mua sắm áo quần thời trang và giày cùng với chúng tôi</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"discription\">\n");
      out.write("                        <p class=\"label_info\">Giá bán:</p>\n");
      out.write("                        <p class=\"info_product price\">30000</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"discription\">\n");
      out.write("                        <p class=\"label_info\">Số lượng còn</p>\n");
      out.write("                        <p class=\"info_product\">100</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"discription\">\n");
      out.write("                        <p class=\"label_info\">Nhà sản xuất</p>\n");
      out.write("                        <p class=\"info_product\">Việt Nam</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <footer class=\"main-footer\">\n");
      out.write("        <div class=\"container main-footer-container\">\n");
      out.write("            <h3 class=\"band-name text-center\">Rimba Fashion Store</h3>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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
