    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XuonWeb106;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DongVat {

    private String maDV;
    private String tenDV;
    private String noisong;
    private int cangNang;
    private int tuoi;

    public DongVat() {
    }

    public DongVat(String maDV, String tenDV, String noisong, int cangNang, int tuoi) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.noisong = noisong;
        this.cangNang = cangNang;
        this.tuoi = tuoi;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public String getNoisong() {
        return noisong;
    }

    public void setNoisong(String noisong) {
        this.noisong = noisong;
    }

    public int getCangNang() {
        return cangNang;
    }

    public void setCangNang(int cangNang) {
        this.cangNang = cangNang;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao ma dong vat : ");
        maDV = sc.nextLine();
        System.out.println("Moi ban nhap vao ten dong vat : ");
        tenDV = sc.nextLine();
        System.out.println("Mời nhập nơi sống động vật: ");
        noisong = sc.nextLine();
        System.out.println("Moi ban nhap vao can nang dong vat : ");
        cangNang = new Scanner(System.in).nextInt();
        System.out.println("Moi ban nhap vao tuoi dong vat : ");
        tuoi = new Scanner(System.in).nextInt();
    }
    public void xuat () {
        System.out.printf("%-20s %-20s %-20s %-20d %-20d \n",getMaDV(), getTenDV(), getNoisong(), getCangNang(), getTuoi());
    }
}
