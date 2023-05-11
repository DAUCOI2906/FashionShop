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
public class GIOHANG {
    private  int idbill;
    private int userid;
    private String ProductID;
    private int soluongmua;

    public GIOHANG(int idbill, int userid, String ProductID, int soluongmua) {
        this.idbill = idbill;
        this.userid = userid;
        this.ProductID = ProductID;
        this.soluongmua = soluongmua;
    }

    public GIOHANG() {
    }

    public int getIdbill() {
        return idbill;
    }

    public void setIdbill(int idbill) {
        this.idbill = idbill;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public int getSoluongmua() {
        return soluongmua;
    }

    public void setSoluongmua(int soluongmua) {
        this.soluongmua = soluongmua;
    }
    
}
