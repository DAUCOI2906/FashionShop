/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nguye
 */
public class SANPHAM {

    private String ProductID, Productname;
    private int soluong;
    private float dongia;
    private String mota;
    private String Nhasx;
    private String hinhanh;
    private int Categoryid;
    private int Gioitinhid;

    public SANPHAM(String ProductID, String Productname, int soluong, float dongia, String mota, String Nhasx, String hinhanh, int Categoryid, int Gioitinhid) {
        this.ProductID = ProductID;
        this.Productname = Productname;
        this.soluong = soluong;
        this.dongia = dongia;
        this.mota = mota;
        this.Nhasx = Nhasx;
        this.hinhanh = hinhanh;
        this.Categoryid = Categoryid;
        this.Gioitinhid = Gioitinhid;
    }

    public SANPHAM() {
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductname() {
        return Productname;
    }

    public void setProductname(String Productname) {
        this.Productname = Productname;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getNhasx() {
        return Nhasx;
    }

    public void setNhasx(String Nhasx) {
        this.Nhasx = Nhasx;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public int getCategoryid() {
        return Categoryid;
    }

    public void setCategoryid(int Categoryid) {
        this.Categoryid = Categoryid;
    }

    public int getGioitinhid() {
        return Gioitinhid;
    }

    public void setGioitinhid(int Gioitinhid) {
        this.Gioitinhid = Gioitinhid;
    }
    
}
