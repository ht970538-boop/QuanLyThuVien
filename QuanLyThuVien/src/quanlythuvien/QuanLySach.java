package quanlythuvien;

import java.util.Scanner;

public class QuanLySach 
{
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXB;
    private int soLuong;
    private double donGia;

    Scanner sc = new Scanner(System.in);
    public void nhapSach() {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        namXB = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
    }
    public void xuatSach() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXB);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
    }
    public double tinhThanhTien() 
    {
        return donGia * soLuong;
    }
    public double tinhPhiVanChuyen() 
    {
        return tinhThanhTien() * 5 / 100;
    }
    public double tinhTongTienNhap() 
    {
        return tinhThanhTien() + tinhPhiVanChuyen();
    }
}