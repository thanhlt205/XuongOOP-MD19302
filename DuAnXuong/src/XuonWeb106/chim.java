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
public class chim extends DongVat {
    private String loaiChim, tienghot;
   Scanner sc = new Scanner(System.in);

    public String getLoaiChim() {
        return loaiChim;
    }

    public void setLoaiChim(String loaiChim) {
        this.loaiChim = loaiChim;
    }

    public String getTienghot() {
        return tienghot;
    }

    public void setTienghot(String tienghot) {
        this.tienghot = tienghot;
    }

    public chim() {
    }

    public chim(String loaiChim, String tienghot) {
        this.loaiChim = loaiChim;
        this.tienghot = tienghot;
    }

    public chim(String loaiChim, String tienghot, String maDV, String tenDV, String noisong, int cangNang, int tuoi) {
        super(maDV, tenDV, noisong, cangNang, tuoi);
        this.loaiChim = loaiChim;
        this.tienghot = tienghot;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        System.out.println("Moi ban nhap vao loai chim ");
        loaiChim = sc.nextLine();
        System.out.println("Moi ban nhap vao tieng hot ");
        tienghot = sc.nextLine();
    }  
}
