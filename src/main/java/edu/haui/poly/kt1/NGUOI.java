/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.kt1;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class NGUOI {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String cccd;

    public NGUOI(String hoTen, String ngaySinh, String gioiTinh, String cccd) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cccd = cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getCccd() {
        return cccd;
    }
}
