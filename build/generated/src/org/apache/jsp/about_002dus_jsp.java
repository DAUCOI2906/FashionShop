package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_002dus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href='css/bootstrap.css' rel='stylesheet'>\n");
      out.write("        <link href=\"css/home.css\" rel=\"stylesheet\">\n");
      out.write("        <link href='css/mystyles.css' rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.7/css/all.css\" >\n");
      out.write("        <link href=\"https://fonts.google.com/specimen/Source+Sans+Pro\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/85434d7cc7.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/jquery-3.5.1.js\"></script>\n");
      out.write("        <script src=\"js/home.js\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Chilanka&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"icon\" href=\"imgs/logo.png\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"about-us.jsp\">About us</a></li>\n");
      out.write("                        <li><a href=\"location.jsp\">Location</a></li>\n");
      out.write("                        <li><a href=\"contact.jsp\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"login\">Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("        <div id=\"about-us\" class='container'>\n");
      out.write("            <h2>About us</h2><br>\n");
      out.write("            <section id=\"owners\" class='row'>\n");
      out.write("                <div class='card col-mx-1'>\n");
      out.write("                    <img class='card-img-top'src='./imgs/avt/truyen.jpg'>\n");
      out.write("                    <div class='card-body'>\n");
      out.write("                        <h4>Nguyễn Đức Truyền</h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class='card col-mx-1'>\n");
      out.write("                    <img class='card-img-top'src='./imgs/avt/dung.png'>\n");
      out.write("                    <div class='card-body'>\n");
      out.write("                        <h4>Nguyễn Mạnh Dũng</h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class='card col-mx-1'>\n");
      out.write("                    <img class='card-img-top'src='./imgs/avt/nga.jpg'>\n");
      out.write("                    <div class='card-body'>\n");
      out.write("                        <h4>Nguyễn Thúy Nga</h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class='card col-mx-1'>\n");
      out.write("                    <img class='card-img-top'src='./imgs/avt/tram.jpg'>\n");
      out.write("                    <div class='card-body'>\n");
      out.write("                        <h4>Lê Thị Thùy Trâm</h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </section><br><br>\n");
      out.write("            <div id=\"about\">\n");
      out.write("                Chúng tôi là một nhóm gồm có 4 thành viên đều có trái tim đam mê thời trang và tận tâm để cung cấp cho bạn các xu hướng thời trang mới nhất từ ​​khắp nơi trên thế giới.\n");
      out.write("                <br>Nhóm của chúng tôi đã kinh doanh hơn 5 năm và tiếp tục trung thành với khách hàng. Nếu bạn chọn chúng tôi, chúng tôi sẽ không bao giờ làm bạn thất vọng.\n");
      out.write("                <br>Từ lúc bạn bước qua cánh cửa của chúng tôi, bạn sẽ được đón nhận bởi những nụ cười ấm áp và đội ngũ giàu kinh nghiệm của chúng tôi\n");
      out.write("                cá nhân sẽ hỗ trợ bạn trong việc thiết lập một tủ quần áo cổ điển nhưng thời trang.\n");
      out.write("            </div><br>\n");
      out.write("            \n");
      out.write("        </div><br><br>\n");
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
