/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.kt1;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class SINHVIEN extends NGUOI implements TAIKHOAN {
    private String maSV;
    private String nganhNghe;
    private String tenTaiKhoan;
    private String matKhauTaiKhoan;

    public SINHVIEN(String hoTen, String ngaySinh, String gioiTinh, String cccd, String maSV, String nganhNghe) {
        super(hoTen, ngaySinh, gioiTinh, cccd);
        this.maSV = maSV;
        this.nganhNghe = nganhNghe;
        nhapTaiKhoan();
    }

    @Override
    public void nhapTaiKhoan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten tai khoan: ");
        this.tenTaiKhoan = scanner.nextLine();
        System.out.print("Nhap mat khau tai khoan: ");
        this.matKhauTaiKhoan = scanner.nextLine();
    }

    @Override
    public String getTenTaiKhoan() {
        return this.tenTaiKhoan;
    }

    @Override
    public String getMatKhauTaiKhoan() {
        return this.matKhauTaiKhoan;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getNganhNghe() {
        return nganhNghe;
    }
}

