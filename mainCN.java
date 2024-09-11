package huynhtrivy_23681901;

import java.util.Scanner;

public class mainCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng công nhân
        System.out.println("Nhap so luong cong nhan:");
        int soLuongCongNhan = sc.nextInt();
        sc.nextLine(); // Đọc dòng còn lại sau khi nhập số lượng

        // Tạo danh sách công nhân
        DanhSachCongNhan ds = new DanhSachCongNhan();

        // Nhập thông tin từng công nhân
        for (int i = 0; i < soLuongCongNhan; i++) {
            System.out.println("Nhap ma CN:");
            String mCN = sc.nextLine();
            System.out.println("Nhap ho:");
            String mHo = sc.nextLine();
            System.out.println("Nhap ten:");
            String mTen = sc.nextLine();
            System.out.println("Nhap So SP:");
            int mSoSP = sc.nextInt();
            sc.nextLine(); // Đọc dòng còn lại sau khi nhập số sản phẩm

            // Tạo công nhân mới và thêm vào danh sách
            CongNhan cn = new CongNhan(mCN, mHo, mTen, mSoSP);
            ds.themCongNhan(cn);
        }

        // Hiển thị danh sách công nhân
        System.out.println("Danh sach cong nhan:");
        ds.hienThiDanhSach();
        System.out.println("So luong cong nhan: " + ds.soLuongCongNhan());

        // Sắp xếp danh sách công nhân theo số sản phẩm giảm dần và hiển thị
        System.out.println("Danh sach cong nhan sap xep theo so san pham giam dan:");
        ds.sapXepTheoSoSPGiamDan();
        ds.hienThiDanhSach();

        sc.close();
    }
}

