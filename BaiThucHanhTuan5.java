import java.util.Scanner;

public class Main {

    // Tao lop Sach
    static class Sach {
        String maSach;
        String tenSach;
        double giaSach;
        int soLuong;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        // Nhap so luong sach
        do {
            System.out.print("Nhap so luong sach: ");
            n = sc.nextInt();
            sc.nextLine();

            if (n <= 0) {
                System.out.println("So luong sach phai lon hon 0!");
            }

        } while (n <= 0);

        Sach[] dsSach = new Sach[n];

        // BAI 1: Nhap n sach bang vong lap FOR
        System.out.println("\n===== NHAP THONG TIN SACH =====");

        for (int i = 0; i < n; i++) {

            dsSach[i] = new Sach();

            System.out.println("\nNhap sach thu " + (i + 1));

            System.out.print("Ma sach: ");
            dsSach[i].maSach = sc.nextLine();

            System.out.print("Ten sach: ");
            dsSach[i].tenSach = sc.nextLine();

            System.out.print("Gia sach: ");
            dsSach[i].giaSach = sc.nextDouble();

            System.out.print("So luong: ");
            dsSach[i].soLuong = sc.nextInt();
            sc.nextLine();
        }

        int chon;

        // BAI 3: Menu su dung DO-WHILE
        do {
            System.out.println("\n========== MENU THU VIEN ==========");
            System.out.println("1. Hien thi danh sach sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {

                case 1:
                    // Hien thi danh sach sach
                    System.out.println("\n===== DANH SACH SACH =====");

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nSach thu " + (i + 1));
                        System.out.println("Ma sach: " + dsSach[i].maSach);
                        System.out.println("Ten sach: " + dsSach[i].tenSach);
                        System.out.println("Gia sach: " + dsSach[i].giaSach);
                        System.out.println("So luong: " + dsSach[i].soLuong);
                    }
                    break;

                case 2:
                    // BAI 2: Tinh tong so luong va tong gia tri sach
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;

                    for (int i = 0; i < n; i++) {
                        tongSoLuong = tongSoLuong + dsSach[i].soLuong;

                        tongGiaTri = tongGiaTri
                                + dsSach[i].giaSach * dsSach[i].soLuong;
                    }

                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 3:
                    // BAI 4: Tim sach theo ma
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();

                    boolean timThay = false;

                    for (int i = 0; i < n; i++) {

                        if (dsSach[i].maSach.equalsIgnoreCase(maTim)) {

                            System.out.println("\nDa tim thay sach!");
                            System.out.println("Ma sach: " + dsSach[i].maSach);
                            System.out.println("Ten sach: " + dsSach[i].tenSach);
                            System.out.println("Gia sach: " + dsSach[i].giaSach);
                            System.out.println("So luong: " + dsSach[i].soLuong);

                            timThay = true;
                            break;
                        }
                    }

                    if (timThay == false) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    System.out.println("Ban da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 4);

        sc.close();
    }
}