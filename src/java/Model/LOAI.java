/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nguye
 */
public class LOAI {
    private int Categoryid;
    private String Categoryname;

    public LOAI(int Categoryid, String Categoryname) {
        this.Categoryid = Categoryid;
        this.Categoryname = Categoryname;
    }

    public LOAI() {
    }

    public int getCategoryid() {
        return Categoryid;
    }

    public void setCategoryid(int Categoryid) {
        this.Categoryid = Categoryid;
    }

    public String getCategoryname() {
        return Categoryname;
    }

    public void setCategoryname(String Categoryname) {
        this.Categoryname = Categoryname;
    }
    
}
