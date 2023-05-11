/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Truyen
 */
public class DETAILSCART {
//    IDBill,s.Hinhanh,s.Productname,s.dongia,s.Soluong
    private int idbill;
    private String hinhanh;
    private String productname;
    private float dongia;
    private int soluongcon;
    private int soluongmua;

    public DETAILSCART(int idbill, String hinhanh, String productname, float dongia, int soluongcon,int soluongmua) {
        this.idbill = idbill;
        this.hinhanh = hinhanh;
        this.productname = productname;
        this.dongia = dongia;
        this.soluongcon = soluongcon;
        this.soluongmua = soluongmua;
    }

    public DETAILSCART() {
    }

    public int getIdbill() {
        return idbill;
    }

    public void setIdbill(int idbill) {
        this.idbill = idbill;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public int getSoluongcon() {
        return soluongcon;
    }

    public void setSoluongcon(int soluongcon) {
        this.soluongcon = soluongcon;
    }

    public int getSoluongmua() {
        return soluongmua;
    }

    public void setSoluongmua(int soluongmua) {
        this.soluongmua = soluongmua;
    }
    
    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
    
}
