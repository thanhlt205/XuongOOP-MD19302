/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuonWeb106;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        ClassQuanLy ql = new ClassQuanLy();
        Scanner nhap = new Scanner(System.in);
        int choice;

        do {
            System.out.println("""
                               ========================================
                               | 1.Nhập thêm thông tin.               |
                               | 2.Xuất thông tin.                    |
                               | 3.Sửa thông tin.                     |
                               | 4.Xóa động vật theo mã.              |
                               | 5.Tìm kiếm động vật theo mã.         |
                               | 6.Sắp xếp động vật theo mã.          |
                               | 7.Sắp xếp động vật theo tên.         |
                               | 8.Sắp xếp động vật theo tuổi.        |
                               | 9.Sắp xếp động vật theo cân nặng.    |
                               | 10.Tìm khoảng cân nặng.              |
                               | 0.Kết thúc trương trình.             |
                               ========================================""");
            System.out.print("Mời bạn chọn chức năng: ");
     
            choice = nhap.nextInt();
            switch (choice) {
                case 1:
                    ql.Nhap();
                    break;
                case 2:
                    ql.Xuat();
                    break;
                case 3:
                    ql.Sua();
                    break;
                case 4:
                    ql.Xoa();
                    break;
                case 5:
                    ql.Timkiem();
                    break;
                case 6:
                    ql.XepTheoMa();
                    break;
                case 7:
                    ql.XepTheoTen();
                    break;
                case 8:
                    ql.XepTheoTuoi();
                    break;
                case 9:
                    ql.XepTheoCanNang();
                    break;
                case 10:
                    ql.TimKhoangCan();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Mời chọn lại...");
            }
        } while (choice != 0);
    }
}

