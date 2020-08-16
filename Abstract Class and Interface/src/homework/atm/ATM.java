package homework.atm;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account("Nguyen Van A", 1200000);
        BankSystem bankSystem = new BankSystem();
        Scanner scanner = new Scanner(System.in);
        String selection;
        int inputTime = 0;
        System.out.println("Ngan hang ABC kinh chao Quy khach " + account.getUserName());
        while (inputTime < 3) {
            System.out.println("Menu: \n" +
                    "Nhan phim A de kiem tra tai khoan \n" +
                    "Nhan phim D de nap tien \n" +
                    "Nhan phim W de rut tien \n" +
                    "Nhan phim H de xem lich su 3 lan rut tien \n" +
                    "Nhan phim X de thoat \n" +
                    "=========================================== \n" +
                    "Nhap lua chon cua ban: ");
            selection = scanner.next();
            switch (selection) {
                case "A":
                    bankSystem.checkingAccountBalance();
                    break;
                case "D":
                    bankSystem.deposit();
                    break;
                case "W":
                    bankSystem.withdraw();
                    break;
                case "H":
                    bankSystem.checkingTransactionHistory();
                    break;
                case "X":
                    bankSystem.exitBankingSystem();
                    break;
                default:
                    inputTime += 1;
                    System.out.println("Ban nhap sai chuc nang \n" +
                            "Bam nut theo menu de tiep tuc giao dich \n" +
                            "===========================================");
            }
        }
        if (inputTime > 2) {
            System.out.println("Ban da nhap sai 3 lan");
        }
    }
}
