package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pageTHEMSANPHAM_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-grid.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/shoes_clothes.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/checkout.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/mystyles.css\">\n");
      out.write("    <script src=\"js/clothes.js\" async></script>\n");
      out.write("    <link rel=\"icon\" href=\"imgs/logo.png\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header class=\"main-header\">\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("               <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"about-us.jsp\">About us</a></li>\n");
      out.write("                        <li><a href=\"location.jsp\">Location</a></li>\n");
      out.write("                        <li><a href=\"contact.jsp\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"login\">Login</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <img src='imgs/logo.png'height='200'>\n");
      out.write("        <h1 class=\"band-name band-name-large\"><strong>FASHION</strong> STORE</h1>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section class=\"container container_them content-section \">\n");
      out.write("        <form class=\"form_them\"  action=\"addproduct\" method=\"post\"  enctype = \"multipart/form-data\">\n");
      out.write("            <h3>THÊM SẢN PHẨM</h3>\n");
      out.write("            <label for=\"txtProductID\">Mã sản phẩm</label>\n");
      out.write("            <input type=\"text\" id=\"txtProductID\" name=\"txtProductID\" >\n");
      out.write("            <label for=\"txtProductname\">Tên sản phẩm</label>\n");
      out.write("            <input type=\"text\" id=\"txtProductname\" name=\"txtProductname\" >\n");
      out.write("            <label for=\"txtSoluong\">Số lượng</label>\n");
      out.write("            <input type=\"text\" id=\"txtSoluong\" name=\"txtSoluong\" >\n");
      out.write("            <label for=\"txtDongia\">Đơn giá</label>\n");
      out.write("            <input type=\"text\" id=\"txtDongia\" name=\"txtDongia\" >\n");
      out.write("\n");
      out.write("            <label for=\"txtMota\">Mô tả</label>\n");
      out.write("            <!-- <input type=\"text\" id=\"txtMota\" name=\"txtMota\" > -->\n");
      out.write("            <textarea name=\"txtMota\" id=\"txtMota\" cols=\"30\" rows=\"10\"></textarea>\n");
      out.write("            \n");
      out.write("            <label for=\"txtNhasanxuat\">Nhà sản xuất</label>\n");
      out.write("            <input type=\"text\" id=\"txtNhasanxuat\" name=\"txtNhasanxuat\" >\n");
      out.write("            <label for=\"txtHinhanh\">Hình ảnh</label>\n");
      out.write("            <input name=\"file\" id=\"file\" type=\"file\" style=\"padding-bottom:20px ;\" />\n");
      out.write("            <label for=\"txtLoaisanpham\">Loại sản phẩm</label>\n");
      out.write("            <select name=\"selLoaisanpham\" id=\"selLoaisanpham\" name=\"D1\"style=\"margin-bottom:20px ;\">\n");
      out.write("              <option value=\"1\">Áo quần</option>\n");
      out.write("              <option value=\"2\">Giày</option>\n");
      out.write("            </select>\n");
      out.write("            <label for=\"selGioitinh\">Giới tính</label>\n");
      out.write("            <select name=\"selGioitinh\" id=\"selGioitinh\" name=\"D1\"style=\"margin-bottom:20px ;\">\n");
      out.write("              <option value=\"1\">Nam</option>\n");
      out.write("              <option value=\"2\">Nữ</option>\n");
      out.write("            </select>\n");
      out.write("        <input class=\"checkout\" id=\"Submit\" type=\"submit\" value=\"Thêm sản phẩm\" />\n");
      out.write("        \n");
      out.write("      </form>\n");
      out.write("        <h1> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.anounce}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
