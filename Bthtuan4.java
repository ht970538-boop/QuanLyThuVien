
import java.util.Scanner;

public class Tuan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maSach, tenSach;
        int namXB, soLuong, loaiSach;
        double donGia;

        // Nhap thong tin sach
        System.out.println("===== QUAN LY SACH =====");

        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        namXB = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        // BAI 1: KIEM TRA THONG TIN SACH
        System.out.println("\n===== BAI 1: KIEM TRA SACH =====");

        boolean hopLe = true;

        if (donGia <= 0) {
            System.out.println("Gia sach khong hop le!");
            hopLe = false;
        } else {
            System.out.println("Gia sach hop le.");
        }

        if (soLuong < 0) {
            System.out.println("So luong khong hop le!");
            hopLe = false;
        } else {
            System.out.println("So luong hop le.");
        }

        if (namXB < 1 || namXB > 2026) {
            System.out.println("Nam xuat ban khong hop le!");
            hopLe = false;
        } else {
            System.out.println("Nam xuat ban hop le.");
        }

        if (hopLe) {
            System.out.println("Thong tin sach hop le.");
        } else {
            System.out.println("Thong tin sach khong hop le.");
        }

        // BAI 2: PHAN LOAI GIA SACH
        System.out.println("\n===== BAI 2: PHAN LOAI GIA =====");

        if (donGia <= 0) {
            System.out.println("Gia sach khong hop le.");
        } else if (donGia < 50000) {
            System.out.println("Sach gia thap.");
        } else if (donGia < 100000) {
            System.out.println("Sach gia trung binh.");
        } else if (donGia <= 200000) {
            System.out.println("Sach gia cao.");
        } else {
            System.out.println("Sach gia dac biet.");
        }

        // BAI 3: PHAN LOAI TON KHO
        System.out.println("\n===== BAI 3: PHAN LOAI TON KHO =====");

        if (soLuong < 0) {
            System.out.println("So luong khong hop le.");
        } else if (soLuong == 0) {
            System.out.println("Het sach.");
        } else if (soLuong <= 5) {
            System.out.println("Sach sap het.");
        } else if (soLuong <= 20) {
            System.out.println("Con it sach.");
        } else {
            System.out.println("Con nhieu sach.");
        }

        // BAI 4: CHON LOAI SACH BANG SWITCH
        System.out.println("\n===== BAI 4: CHON LOAI SACH =====");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");

        System.out.print("Nhap loai sach: ");
        loaiSach = Integer.parseInt(sc.nextLine());

        switch (loaiSach) {
            case 1:
                System.out.println("Loai sach: Sach giao khoa.");
                break;
            case 2:
                System.out.println("Loai sach: Sach tham khao.");
                break;
            case 3:
                System.out.println("Loai sach: Sach chuyen nganh.");
                break;
            case 4:
                System.out.println("Loai sach: Sach khac.");
                break;
            default:
                System.out.println("Loai sach khong hop le.");
        }

        // XUAT THONG TIN SACH
        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Nam xuat ban: " + namXB);
        System.out.println("So luong: " + soLuong);
        System.out.printf("Don gia: %.0f VND%n", donGia);

        sc.close();
    }
}
