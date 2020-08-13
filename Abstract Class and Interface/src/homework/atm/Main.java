package homework.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        User user = new User("Nguyen Van A", 1200000);
        Scanner scanner = new Scanner(System.in);
        String luaChon;
        int soLanNhap = 0;
        System.out.println("Ngan hang ABC kinh chao Quy khach " + user.getUserName());
        System.out.println("Menu: \n" +
                "Nhan phim A de kiem tra tai khoan \n" +
                "Nhan phim D de nap tien \n" +
                "Nhan phim W de rut tien \n" +
                "Nhan phim H de xem lich su 3 lan rut tien \n" +
                "Nhan phim X de thoat \n" +
                "=========================================== \n" +
                "Nhap lua chon cua ban: ");
        luaChon = scanner.nextLine();
        if (luaChon.equals("X")) {
            atm.exit();
        }
        while (!luaChon.equals("X")) {
            switch (luaChon) {
                case "A":
                    atm.kiemTraTK();
                    break;
                case "D":
                    atm.napTien();
                    break;
                case "W":
                    atm.rutTien();
                    break;
                case "H":
                    atm.kiemtraLichSuGiaoDich();
                    break;
                case "X":
                    atm.exit();
                    break;
                default:
                    soLanNhap += 1;
                    System.out.println("Ban nhap sai chuc nang \n" +
                            "Bam nut theo menu de tiep tuc giao dich \n" +
                            "===========================================");
            }
            if (soLanNhap > 2) {
                break;
            }
            System.out.println("Menu: \n" +
                    "Nhan phim A de kiem tra tai khoan \n" +
                    "Nhan phim D de nap tien \n" +
                    "Nhan phim W de rut tien \n" +
                    "Nhan phim H de xem lich su 3 lan rut tien \n" +
                    "Nhan phim X de thoat \n" +
                    "=========================================== \n" +
                    "Nhap lua chon cua ban: ");
            luaChon = scanner.nextLine();
        }
        if (soLanNhap > 2) {
            System.out.println("Ban da nhap sai 3 lan");
        }
    }
}
