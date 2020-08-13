package homework.atm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ATM extends User {
    private String name = "ATM001";
    Scanner scanner = new Scanner(System.in);

    public ATM() {
    }

    public ATM(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void kiemTraTK() {
        System.out.println("So du tai khoan khach hang la: " + super.getSoduTk() + "Vnd");
        System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                "===========================================");
    }

    public void napTien() {
        System.out.println("Vui long nhap so tien");
        double soTienNap = scanner.nextDouble();
        super.setSoduTk(super.getSoduTk() + soTienNap);
        giaoDichMoiNhat = "Nap tien: " + soTienNap + "VND";
        soLanGiaoDich += 1;
        this.capNhatLichSuGiaoDich();
        System.out.println("Giao dich thanh cong. Ban vua nap " + soTienNap + "VND thanh cong");
        System.out.println("So du tai khoan là: " + super.getSoduTk() + "VND");
        System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                "===========================================");
    }

    public void rutTien() {
        System.out.println("Vui long nhap so tien");
        double soTienRut = scanner.nextDouble();
        if (soTienRut > super.getSoduTk()) {
            System.out.println("Giao dich khong thanh cong.");
            System.out.println("So du tai khoan khach hang la: " + super.getSoduTk() + "VND");
            System.out.println("Ban khong the rut so tien hon so du tai khoan");
            System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                    "===========================================");
        } else {
            super.setSoduTk(super.getSoduTk()-soTienRut);
            giaoDichMoiNhat = "Rut tien: " + soTienRut + "VND";
            soLanGiaoDich += 1;
            this.capNhatLichSuGiaoDich();
            System.out.println("Giao dich thanh cong. Ban vua rua " + soTienRut + "VND thanh cong");
            System.out.println("So du tai khoan là: " + super.getSoduTk() + "VND");
            System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                    "===========================================");
        }
    }

    public void exit() {
        System.out.println("Cam on ban da su dung dich vu ATM");
    }

    private String giaoDichMoiNhat;
    public static int soLanGiaoDich = 0;
    private String[] giaoDichGanNhat = new String[3];
    public void capNhatLichSuGiaoDich() {
        for (int i=giaoDichGanNhat.length-1; i>0; i--) {
            giaoDichGanNhat[i] = giaoDichGanNhat[i-1];
        }
        giaoDichGanNhat[0] = giaoDichMoiNhat;
    }

    public void kiemtraLichSuGiaoDich() {
        for (int i=0; i<giaoDichGanNhat.length; i++) {
            if (giaoDichGanNhat[i] == null) continue;
            System.out.println(i+1 + ". " + giaoDichGanNhat[i]);
        }
        if (soLanGiaoDich < 1) {
            System.out.println("Ban chua thuc hien giao dich nao");
        }
    }
}
