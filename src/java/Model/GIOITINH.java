/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nguye
 */
public class GIOITINH {
    private int IdGioiTinh;
    private String TenGioiTinh;

    public GIOITINH(int IdGioiTinh, String TenGioiTinh) {
        this.IdGioiTinh = IdGioiTinh;
        this.TenGioiTinh = TenGioiTinh;
    }

    public GIOITINH() {
    }

    public int getIdGioiTinh() {
        return IdGioiTinh;
    }

    public void setIdGioiTinh(int IdGioiTinh) {
        this.IdGioiTinh = IdGioiTinh;
    }

    public String getTenGioiTinh() {
        return TenGioiTinh;
    }

    public void setTenGioiTinh(String TenGioiTinh) {
        this.TenGioiTinh = TenGioiTinh;
    }
    
}
