/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Dal.ProcessData;
import Dal.SQLServerConnecttion;
import Model.NGUOIDUNG;
import Model.SANPHAM;
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
@WebServlet(name = "addproduct", urlPatterns = {"/addproduct"})
public class AddProduct extends HttpServlet {

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

            String MASANPHAM = multi.getParameter("txtProductID");
            String TENSANPHAM = multi.getParameter("txtProductname");
            Float DONGIA = Float.parseFloat(multi.getParameter("txtDongia"));

            Integer SOLUONG = Integer.parseInt(multi.getParameter("txtSoluong"));

            Integer LOAISANPHAM = Integer.parseInt(multi.getParameter("selLoaisanpham"));
            Integer GIOITINH = Integer.parseInt(multi.getParameter("selGioitinh"));

            String MOTA = multi.getParameter("txtMota");
            String NHASX = multi.getParameter("txtNhasanxuat");
            String HINHANH = multi.getFilesystemName("file");
            
            
             ProcessData pd = new ProcessData();
             SANPHAM c= pd.GETONEPRODUCT(MASANPHAM);
             if(c==null){
                 try {

                    int k = 0;
                    SANPHAM a = new SANPHAM(MASANPHAM, TENSANPHAM, SOLUONG, DONGIA, MOTA, NHASX, HINHANH, LOAISANPHAM, GIOITINH);
                    k = pd.INSERTPRODUCT(a);
                    response.sendRedirect("index.jsp");
                    
                } catch (Exception e) {
                }
             }
             else{
                 String tb="SAN PHAM DA TON TAI";
                 request.setAttribute("anounce", tb);
                 request.getRequestDispatcher("pageTHEMSANPHAM.jsp").forward(request, response);
             }
            

        } catch (Exception ex) {
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
