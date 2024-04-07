/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuonWeb106;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ClassQuanLy {

    ArrayList<DongVat> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void Nhap() {
        System.out.printf("Số lượng động vật bạn cần nhập là: ");
        int soLuong = sc.nextInt();
        for (int i = 1; i <= soLuong; i++) {
            System.out.println("Mời nhập thông tin động vật số " + i);
            System.out.println("1-Brid  2-Fish     3-Dog     4-Cat  5-Chicken");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    chim chim = new chim();
                    chim.nhap();
                    ds.add(chim);
                    break;

                case 2:
                    ca ca = new ca();
                    ca.nhap();
                    ds.add(ca);
                    break;
                case 3:
                    cho dg = new cho();
                    dg.nhap();
                    ds.add(dg);
                    break;

                case 4:
                    meo gs = new meo();
                    gs.nhap();
                    ds.add(gs);
                    break;
                case 5:
                    ga gc = new ga();
                    gc.nhap();
                    ds.add(gc);
                    break;
                default:
                    System.out.println("Sai Thông Tin...");
            }
        }
    }

    public void Xuat() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã", "Tên", "Nơi sống", "Cân nặng", "Tuổi");
        for (DongVat dv : ds) {
            dv.xuat();
            System.out.println();
        }
    }

    public void Sua() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào mã động vật muốn sửa: ");
        String ma = sc.nextLine();
        sc.nextLine();

        for (DongVat item : ds) {
            if (item.getMaDV().equalsIgnoreCase(ma)) {
                item.nhap();
                return;
            }
        }
        System.out.println("Không tìm thấy động vật có mã " + ma + " để sửa.");
    }

    public void Xoa() {
        System.out.println("Mời bạn nhập mã động vật muốn x ");
        String ma = new Scanner(System.in).nextLine();
        for (DongVat dv : ds) {
            if (dv.getMaDV().equalsIgnoreCase(ma)) {
                ds.remove(dv);
                break;
            }
        }
    }

    public void Timkiem() {
        System.out.print("Mời bạn nhập mã động vật bạn muốn tìm kiếm: ");
        String ma = sc.next();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã", "Tên", "Nơi sống", "Cân nặng", "Tuổi");
        for (DongVat item : ds) {
            if (item.getMaDV().equalsIgnoreCase(ma)) {
                item.xuat();
                return;
            }
        }
        System.out.println("Không tìm thấy động vật có mã " + ma);
    }

    public void XepTheoCanNang() {
//        Comparator<DongVat> comp = new Comparator<DongVat>() {
//            @Override
//            public int compare(DongVat o1, DongVat o2) {
//                return Double.compare(o1.getCangNang(), o2.getCangNang());
//            }
//        };
//        Collections.sort(ds, comp);
        Collections.sort(ds, Comparator.comparingDouble(DongVat::getCangNang));
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã", "Tên", "Nơi sống", "Cân nặng", "Tuổi");
        for (DongVat dv : ds) {
                dv.xuat();
        }
    }
    
    public void XepTheoTuoi() {
        Collections.sort(ds, Comparator.comparingInt(DongVat::getTuoi));
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã", "Tên", "Nơi sống", "Cân nặng", "Tuổi");
        for (DongVat dv : ds) {
                dv.xuat();
        }
    }
    
    public void XepTheoMa() {
        Collections.sort(ds, Comparator.comparing(DongVat::getMaDV));
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã", "Tên", "Nơi sống", "Cân nặng", "Tuổi");
        for (DongVat dv : ds) {
                dv.xuat();
        }
    }
    
    public void XepTheoTen() {
        Collections.sort(ds, Comparator.comparing(DongVat::getTenDV));
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã", "Tên", "Nơi sống", "Cân nặng", "Tuổi");
        for (DongVat dv : ds) {
                dv.xuat();
        }
    }
    
    public void TimKhoangCan(){
        
        System.out.print("Moi nhập cân nặn tối thiểu: ");        
        int min = new Scanner(System.in).nextInt();
        System.out.print("Mời nhập cân nặng tối đa: ");
        int max = new Scanner(System.in).nextInt();
        
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã", "Tên", "Nơi sống", "Cân nặng", "Tuổi");
        for (DongVat dv : ds) {
            if (dv.getCangNang()>= min && dv.getCangNang()<= max) {
            dv.xuat();
        }
        }
    }
}
