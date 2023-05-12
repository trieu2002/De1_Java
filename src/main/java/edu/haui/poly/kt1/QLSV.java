/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.kt1;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class QLSV {
    private ArrayList<SINHVIEN> list=new ArrayList<>();
    private ArrayList<SINHVIEN> list2=new ArrayList<>();
    Scanner s=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap n :");
        int n=s.nextInt();
        s.nextLine();
        
        for(int i=0;i<n;i++){
            
           
            System.out.println("Nhap ho ten :");
            String hoTen=s.nextLine();
            System.out.println("Nhap ngay sinh :");
            String ngaySinh=s.nextLine();
            System.out.println("Nhap gioi tinh :");
            String gioiTinh=s.nextLine();
            System.out.println("Nhap cccd :");
            String cccd=s.nextLine();
            System.out.println("Nhap ma sinh vien:");
            String masv=s.nextLine();
            System.out.println("Nhap nganh nghe :");
            String nganhNghe=s.nextLine();
            SINHVIEN sv=new SINHVIEN(hoTen,ngaySinh,gioiTinh,cccd,masv,nganhNghe);
            list.add(sv);
        }
    }
    public void xuat(){
        if (list.isEmpty()) {
            System.out.println("Danh sach sinh vien rong.");
            return;
        }
        System.out.println("Danh sach sinh vien:");
        for (SINHVIEN sv : list) {
            System.out.println("Ma sinh vien: " + sv.getMaSV());
            System.out.println("Ho ten: " + sv.getHoTen());
            System.out.println("Ngay sinh: " + sv.getNgaySinh());
            System.out.println("Gioi tinh: " + sv.getGioiTinh());
            System.out.println("CCCD: " + sv.getCccd());
            System.out.println("Nganh nghe: " + sv.getNganhNghe());
            System.out.println("Tai khoan: " + sv.getTenTaiKhoan());
            System.out.println("Mat khau: " + sv.getMatKhauTaiKhoan());
            System.out.println("--------------------------------");
        }
    }
    public void timKiem(){
        
        System.out.println("Nhap ma sinh vien :");
        String masv=s.nextLine();
        for (SINHVIEN sinhvien : list) {
            if(sinhvien.getMaSV().equals(masv)){
                list2.add(sinhvien);
            }
        }
    }
    public void xuatTimKIem(){
        for (SINHVIEN sv : list2) {
             System.out.println("Ma sinh vien: " + sv.getMaSV());
            System.out.println("Ho ten: " + sv.getHoTen());
            System.out.println("Ngay sinh: " + sv.getNgaySinh());
            System.out.println("Gioi tinh: " + sv.getGioiTinh());
            System.out.println("CCCD: " + sv.getCccd());
            System.out.println("Nganh nghe: " + sv.getNganhNghe());
            System.out.println("Tai khoan: " + sv.getTenTaiKhoan());
            System.out.println("Mat khau: " + sv.getMatKhauTaiKhoan());
            System.out.println("--------------------------------");
        }
    }
    public void menu(){
        
        while (true) {
            Scanner s=new Scanner(System.in);
            System.out.println("CHUONG TRINH QUAN LY SINH VIEN");
            System.out.println("------------------------------");
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Hien thi");
            System.out.println("3.Tim kiem");
            System.out.println("4.Thoat");
            System.out.println("Moi ban nhap lua chon ");
            int luachon=s.nextInt();
            s.nextLine();
            
            switch(luachon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timKiem();
                    xuatTimKIem();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
            
        }
    }

}
