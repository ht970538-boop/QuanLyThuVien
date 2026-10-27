package quanlythuvien;

import java.util.Scanner;

public class QuanLyThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bai 1: Nhap thong tin sach
        String maSach, tenSach, tacGia;
        int namXB, soLuong;
        double donGia, thanhTien, phiVanChuyen, tongTienNhap;

        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        namXB = Integer.parseInt(sc.nextLine());

        while (namXB < 1500 || namXB > 2026) {
            System.out.print("Nam xuat ban khong hop le, nhap lai: ");
            namXB = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());

        // Hien thi thong tin sach
        System.out.println("\n--- THONG TIN SACH ---");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXB);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        // Bai 2: Tinh thanh tien
        thanhTien = donGia * soLuong;
        System.out.println("\nThanh tien: " + thanhTien);

        // Bai 3: Tinh phi van chuyen
        phiVanChuyen = thanhTien * 5 / 100;
        System.out.println("Phi van chuyen: " + phiVanChuyen);

        // Bai 4: Tinh tong tien nhap
        tongTienNhap = thanhTien + phiVanChuyen;
        System.out.println("Tong tien nhap: " + tongTienNhap);

        sc.close();
    }
}