import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // BAI 1: Tao mang so luong cua 5 cuon sach
        int[] soLuong = new int[5];

        System.out.println("===== BAI 1: MANG SO LUONG SACH =====");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
        }

        int tong = 0;
        int lonNhat = soLuong[0];

        System.out.println("\nDanh sach so luong sach:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Sach thu " + (i + 1) + ": " + soLuong[i]);

            tong = tong + soLuong[i];

            if (soLuong[i] > lonNhat) {
                lonNhat = soLuong[i];
            }
        }

        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + lonNhat);

        sc.nextLine();

        // BAI 2: ArrayList luu ma sach
        ArrayList<String> dsMaSach = new ArrayList<>();

        // BAI 3: ArrayList luu thong tin sach
        // Moi phan tu gom: Ma sach#Ten sach#Gia sach#So luong
        ArrayList<String> danhSachSach = new ArrayList<>();

        int chon;

        // BAI 4: Menu chinh
        do {
            System.out.println("\n========== MENU THU VIEN ==========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {

                case 1:
                    // Them sach
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();

                    if (dsMaSach.contains(ma)) {
                        System.out.println("Ma sach da ton tai!");
                        break;
                    }

                    System.out.print("Nhap ten sach: ");
                    String ten = sc.nextLine();

                    System.out.print("Nhap gia sach: ");
                    double gia = sc.nextDouble();

                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    sc.nextLine();

                    if (gia <= 0 || sl < 0) {
                        System.out.println("Gia hoac so luong khong hop le!");
                        break;
                    }

                    dsMaSach.add(ma);

                    String sach = ma + "#" + ten + "#" + gia + "#" + sl;
                    danhSachSach.add(sach);

                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    // Hien thi sach
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach dang rong!");
                    } else {
                        System.out.println("\n===== DANH SACH SACH =====");

                        for (int i = 0; i < danhSachSach.size(); i++) {
                            String[] thongTin = danhSachSach.get(i).split("#");

                            System.out.println("\nSach thu " + (i + 1));
                            System.out.println("Ma sach: " + thongTin[0]);
                            System.out.println("Ten sach: " + thongTin[1]);
                            System.out.println("Gia sach: " + thongTin[2]);
                            System.out.println("So luong: " + thongTin[3]);
                        }
                    }
                    break;

                case 3:
                    // Tim sach theo ma
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();

                    int viTriTim = dsMaSach.indexOf(maTim);

                    if (viTriTim != -1) {
                        String[] thongTin = danhSachSach.get(viTriTim).split("#");

                        System.out.println("\nDa tim thay sach!");
                        System.out.println("Ma sach: " + thongTin[0]);
                        System.out.println("Ten sach: " + thongTin[1]);
                        System.out.println("Gia sach: " + thongTin[2]);
                        System.out.println("So luong: " + thongTin[3]);
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    // Xoa sach
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    int viTriXoa = dsMaSach.indexOf(maXoa);

                    if (viTriXoa != -1) {
                        dsMaSach.remove(viTriXoa);
                        danhSachSach.remove(viTriXoa);

                        System.out.println("Xoa sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach can xoa!");
                    }
                    break;

                case 5:
                    // Sua sach
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();

                    int viTriSua = dsMaSach.indexOf(maSua);

                    if (viTriSua != -1) {
                        System.out.print("Nhap ten sach moi: ");
                        String tenMoi = sc.nextLine();

                        System.out.print("Nhap gia sach moi: ");
                        double giaMoi = sc.nextDouble();

                        System.out.print("Nhap so luong moi: ");
                        int slMoi = sc.nextInt();
                        sc.nextLine();

                        if (giaMoi <= 0 || slMoi < 0) {
                            System.out.println("Gia hoac so luong khong hop le!");
                            break;
                        }

                        String sachMoi = maSua + "#" + tenMoi + "#"
                                + giaMoi + "#" + slMoi;

                        danhSachSach.set(viTriSua, sachMoi);

                        System.out.println("Sua sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach can sua!");
                    }
                    break;

                case 6:
                    // Tinh tong so luong sach
                    int tongSoLuong = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] thongTin = danhSachSach.get(i).split("#");

                        int soLuongSach = Integer.parseInt(thongTin[3]);

                        tongSoLuong = tongSoLuong + soLuongSach;
                    }

                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    break;

                case 7:
                    // Tinh tong gia tri sach
                    double tongGiaTri = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] thongTin = danhSachSach.get(i).split("#");

                        double giaSach = Double.parseDouble(thongTin[2]);
                        int soLuongSach = Integer.parseInt(thongTin[3]);

                        tongGiaTri = tongGiaTri + giaSach * soLuongSach;
                    }

                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 8:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 8);

        sc.close();
    }
}