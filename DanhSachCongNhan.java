package huynhtrivy_23681901;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachCongNhan {
    private ArrayList<CongNhan> danhSach;

    // Constructor
    public DanhSachCongNhan() {
        danhSach = new ArrayList<>();
    }

    // Add worker
    public void themCongNhan(CongNhan cn) {
        danhSach.add(cn);
    }

    // Display list
    public void hienThiDanhSach() {
        for (CongNhan cn : danhSach) {
            System.out.println(cn);
        }
    }

    // Count workers
    public int soLuongCongNhan() {
        return danhSach.size();
    }

    // Display workers with more than 200 products
    public void hienThiCongNhanTren200SP() {
        for (CongNhan cn : danhSach) {
            if (cn.getmSoSP() > 200) {
                System.out.println(cn);
            }
        }
    }

    // Sort workers by number of products in descending order
    public void sapXepTheoSoSPGiamDan() {
        Collections.sort(danhSach, new Comparator<CongNhan>() {
            @Override
            public int compare(CongNhan cn1, CongNhan cn2) {
                return cn2.getmSoSP() - cn1.getmSoSP();
            }
        });
    }
}
