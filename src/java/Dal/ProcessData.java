/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dal;

import Model.DETAILSCART;
import Model.GIOHANG;
import Model.NGUOIDUNG;
import Model.SANPHAM;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class ProcessData {

    private Connection c;
    private Statement st;

    public ProcessData() {
        try {
            c = SQLServerConnecttion.getconnection();
            st = c.createStatement();
        } catch (SQLException e) {
        }
    }

    //////lay danh sach nguoi dung
    public List<NGUOIDUNG> GETALLUSER() {
        List<NGUOIDUNG> dsuser = new ArrayList();
        String sqlgetalluser = "select * from NGUOIDUNG";
        try {

            ResultSet rs = st.executeQuery(sqlgetalluser);
            while (rs.next()) {
                int id = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String firstname = rs.getString(4);
                String lastname = rs.getString(5);
                String address = rs.getString(6);
                String email = rs.getString(7);
                String sdt = rs.getString(8);
                String avatar = rs.getString(9);
                NGUOIDUNG aa = new NGUOIDUNG(id, username, password, firstname, lastname, address, email, sdt, avatar);
                dsuser.add(aa);
            }
        } catch (Exception e) {
        }
        return dsuser;
    }
    //tim kiem nguoi dung

    public NGUOIDUNG SEARCHUSER(String name, String pass) {
        String sqlfinduser = "select * from NGUOIDUNG where Username='" + name + "' and PasswordID='" + pass + "'";
        try {
            ResultSet rs = st.executeQuery(sqlfinduser);
            if (rs.next()) {
                int id = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String firstname = rs.getString(4);
                String lastname = rs.getString(5);
                String address = rs.getString(6);
                String email = rs.getString(7);
                String sdt = rs.getString(8);
                String avatar = rs.getString(9);
                NGUOIDUNG aa = new NGUOIDUNG(id, username, password, firstname, lastname, address, email, sdt, avatar);
                return aa;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    // them nguoi dung
    public int INSERT(NGUOIDUNG a) {
        int k = 0;
        try {
            String sqlinsert = "insert into NGUOIDUNG(Username,PasswordID,Firstname,Lastname,AddressID,Email,Phone,Avatar)"
                    + "values('" + a.getUsername() + "','" + a.getPassword() + "','" + a.getFirstname() + "','" + a.getLastname() + "','" + a.getAddress() + "','" + a.getEmail() + "','" + a.getPhone() + "','" + a.getAvatar() + "')";
            k = st.executeUpdate(sqlinsert);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return k;
    }

    public int INSERTPRODUCT(SANPHAM a) {
        int k = 0;
        try {
            String sqlinsert = "insert into SANPHAM(ProductID,Productname,Soluong,Dongia,Mota,Nhasanxuat,Hinhanh,CategoryID,Gioitinh)"
                    + "values('" + a.getProductID() + "',N'" + a.getProductname() + "','" + a.getSoluong() + "','"
                    + a.getDongia() + "',N'" + a.getMota() + "',N'" + a.getNhasx() + "','" + a.getHinhanh() + "','" + a.getCategoryid() + "','" + a.getGioitinhid() + "')";
            k = st.executeUpdate(sqlinsert);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return k;
    }
    // lay danh sach san pham qua categoryid

    public List<SANPHAM> GETALLPRODUCT(int idcategory, int idgender) {
        List<SANPHAM> dssp = new ArrayList();
        String sqlgetalluser = "select * from SANPHAM where CategoryID = '" + idcategory + "' and Gioitinh='" + idgender + "'";
        try {

            ResultSet rs = st.executeQuery(sqlgetalluser);
            while (rs.next()) {
                String id = rs.getString(1);
                String namesp = rs.getString(2);
                int soluong = rs.getInt(3);
                float dongia = rs.getFloat(4);
                String mota = rs.getString(5);
                String nhasx = rs.getString(6);
                String image = rs.getString(7);
                int idloai = rs.getInt(8);
                int idgioitinh = rs.getInt(9);
                SANPHAM aa = new SANPHAM(id, namesp, soluong, dongia, mota, nhasx, image, idloai, idgioitinh);
                dssp.add(aa);
            }
        } catch (SQLException e) {
        }
        return dssp;
    }

    public SANPHAM GETONEPRODUCT(String productid) {

        String sqlgetalluser = "select * from SANPHAM where ProductID = '" + productid + "'";
        try {

            ResultSet rs = st.executeQuery(sqlgetalluser);
            while (rs.next()) {
                String id = rs.getString(1);
                String namesp = rs.getString(2);
                int soluong = rs.getInt(3);
                float dongia = rs.getFloat(4);
                String mota = rs.getString(5);
                String nhasx = rs.getString(6);
                String image = rs.getString(7);
                int idloai = rs.getInt(8);
                int idgioitinh = rs.getInt(9);
                SANPHAM aa = new SANPHAM(id, namesp, soluong, dongia, mota, nhasx, image, idloai, idgioitinh);
                return aa;
            }
        } catch (SQLException e) {
        }
        return null;
    }
//them gio hang

    public int INSERTCART(GIOHANG a) {
        int k = 0;
        try {
            String sqlinsert = "insert into GIOHANG(ProductID,UserID,Soluongmua)"
                    + "values('" + a.getProductID() + "','" + a.getUserid() + "','" + a.getSoluongmua() + "')";
            k = st.executeUpdate(sqlinsert);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return k;
    }

    //delete cart
    public int DELETECART(int idproduct) {
        int k = 0;
        try {
            String sqlinsert = " delete from GIOHANG where IDBill = " + idproduct;
            k = st.executeUpdate(sqlinsert);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return k;
    }
    //update cart
    public int UPDATECART(int idbill,int soluong){
        int k=0;
        String sqlupdate ="update GIOHANG set Soluongmua = "+soluong+" where IDBill ="+idbill;
        try{
            k = st.executeUpdate(sqlupdate);
        }catch(SQLException e){
        System.out.println(e);
        }
        return k;
    }

    // get cart
    public List<DETAILSCART> GETCART(int iduser) {
        List<DETAILSCART> dsbill = new ArrayList<DETAILSCART>();
        String sqlgetalluser = "select IDBill,s.Hinhanh,s.Productname,s.dongia,s.Soluong,g.Soluongmua "
                + "from GIOHANG as g join SANPHAM as s on g.ProductID = s.ProductID "
                + "where g.UserID=" + iduser;
        try {
            ResultSet rs = st.executeQuery(sqlgetalluser);
            while (rs.next()) {
                int idbill = rs.getInt("IDBill");
                String hinhanh = rs.getString("Hinhanh");
                String productname = rs.getString("Productname");
                float dongia = rs.getFloat("dongia");
                int soluongcon = rs.getInt("Soluong");
                int soluongmua = rs.getInt("Soluongmua");

                DETAILSCART aa = new DETAILSCART(idbill, hinhanh, productname, dongia, soluongcon, soluongmua);

                dsbill.add(aa);
            }
        } catch (SQLException e) {
        }
        return dsbill;
    }

    public DETAILSCART GETONECART(Integer idbill_i) {

        String sqlgetalluser = "select IDBill,s.Hinhanh,s.Productname,s.dongia,s.Soluong,g.Soluongmua "
                + "from GIOHANG as g join SANPHAM as s on g.ProductID = s.ProductID "
                + "where IDBill = " + idbill_i;
        try {

            ResultSet rs = st.executeQuery(sqlgetalluser);
            rs.next();
            int idbill = rs.getInt("IDBill");
            String hinhanh = rs.getString("Hinhanh");
            String productname = rs.getString("Productname");
            float dongia = rs.getFloat("dongia");
            int soluongcon = rs.getInt("Soluong");
            int soluongmua = rs.getInt("Soluongmua");

            DETAILSCART aa = new DETAILSCART(idbill, hinhanh, productname, dongia, soluongcon, soluongmua);
            return aa;

        } catch (SQLException e) {
        }
        return null;
    }

    public SANPHAM GETPRODUCTBYIDBILL(Integer idbill) {
        String sql = "select s.* "
                + "from GIOHANG as g join SANPHAM as s on g.ProductID =s.ProductID "
                + "where IDBill =" + idbill;
        try {

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String namesp = rs.getString(2);
                int soluong = rs.getInt(3);
                float dongia = rs.getFloat(4);
                String mota = rs.getString(5);
                String nhasx = rs.getString(6);
                String image = rs.getString(7);
                int idloai = rs.getInt(8);
                int idgioitinh = rs.getInt(9);
                SANPHAM aa = new SANPHAM(id, namesp, soluong, dongia, mota, nhasx, image, idloai, idgioitinh);
                return aa;
            }
        } catch (SQLException e) {
        }
        return null;
    }

}
