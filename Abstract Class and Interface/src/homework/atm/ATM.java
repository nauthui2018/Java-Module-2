package homework.atm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ATM {
    private String name = "ATM001";
    private User user;
    Scanner scanner = new Scanner(System.in);

    public ATM() {
    }

    public ATM(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void kiemTraTK() {
        System.out.println("So du tai khoan khach hang la: " + user.getSoduTk() + "Vnd");
        System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                "===========================================");
    }

    public void napTien() {
        System.out.println("Vui long nhap so tien");
        double soTienNap = scanner.nextDouble();
        user.setSoduTk(user.getSoduTk() + soTienNap);
        user.setGiaoDichMoiNhat("Nap tien: " + soTienNap + "VND");
        user.soLanGiaoDich += 1;
        this.capNhatLichSuGiaoDich();
        System.out.println("Giao dich thanh cong. Ban vua nap " + soTienNap + "VND thanh cong");
        System.out.println("So du tai khoan là: " + user.getSoduTk() + "VND");
        System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                "===========================================");
    }

    public void rutTien() {
        System.out.println("Vui long nhap so tien");
        double soTienRut = scanner.nextDouble();
        if (soTienRut > user.getSoduTk()) {
            System.out.println("Giao dich khong thanh cong.");
            System.out.println("So du tai khoan khach hang la: " + user.getSoduTk() + "VND");
            System.out.println("Ban khong the rut so tien hon so du tai khoan");
            System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                    "===========================================");
        } else {
            user.setSoduTk(user.getSoduTk()-soTienRut);
            user.setGiaoDichMoiNhat("Rut tien: " + soTienRut + "VND");
            user.soLanGiaoDich += 1;
            this.capNhatLichSuGiaoDich();
            System.out.println("Giao dich thanh cong. Ban vua rua " + soTienRut + "VND thanh cong");
            System.out.println("So du tai khoan là: " + user.getSoduTk() + "VND");
            System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                    "===========================================");
        }
    }

    public void exit() {
        System.out.println("Cam on ban da su dung dich vu ATM");
        System.exit(0);
    }

    public void capNhatLichSuGiaoDich() {
        for (int i=user.getGiaoDichGanNhat().length-1; i>0; i--) {
            user.getGiaoDichGanNhat()[i] = user.getGiaoDichGanNhat()[i-1];
        }
        user.getGiaoDichGanNhat()[0] = user.getGiaoDichMoiNhat();
    }

    public void kiemtraLichSuGiaoDich() {
        for (int i=0; i<user.getGiaoDichGanNhat().length; i++) {
            if (user.getGiaoDichGanNhat()[i] == null) continue;
            System.out.println(i+1 + ". " + user.getGiaoDichGanNhat()[i]);
        }
        if (user.soLanGiaoDich < 1) {
            System.out.println("Ban chua thuc hien giao dich nao");
        }
    }
}
