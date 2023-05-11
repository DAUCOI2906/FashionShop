/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Dal.ProcessData;
import Model.NGUOIDUNG;
import com.oreilly.servlet.MultipartRequest;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author nguye
 */
@WebServlet(name = "Signup", urlPatterns = {"/signup"})
public class Signup extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ServletContext context = request.getServletContext();
            String realpath = context.getRealPath("/imgs");
            MultipartRequest multi = new MultipartRequest(request, realpath);
            String username = multi.getParameter("username");
            String password = multi.getParameter("password");
            String firstname = multi.getParameter("firstname");
            String lastname = multi.getParameter("lastname");
            String address = multi.getParameter("address");
            String email = multi.getParameter("email");
            String phone = multi.getParameter("phone");
            String avatar = multi.getFilesystemName("avatar");
            
            try {
                int k = 0;
                ProcessData ds = new ProcessData();
                NGUOIDUNG c = ds.SEARCHUSER(username, password);//kiem tra ton tai hay chuw
                if (c == null)//chua ton tai
                {
                    NGUOIDUNG a = new NGUOIDUNG(1, username, password, firstname, lastname, address, email, phone, avatar);
                    k = ds.INSERT(a);
                    //khi them thanh cong quay laij danh sach
                    
                    // phan hoi va quay lai trang servlet để chạy file test,jsp để hiện bảng
                    response.sendRedirect("login.jsp");
                    
                } else {
                    // thong bao da ton tai tai trang insert
                    String s = "TAI KHOAN DA TON TAI";
                    request.setAttribute("annouce", s);
                    request.getRequestDispatcher("signup.jsp").forward(request, response);
                }

            } catch (NumberFormatException e) {
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
