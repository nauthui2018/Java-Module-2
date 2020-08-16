package homework.atm;

import java.util.Scanner;

public class BankSystem {
    private String name = "ATM001";
    private Account account = new Account();
    Scanner scanner = new Scanner(System.in);

    public BankSystem() {
    }

    public BankSystem(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public BankSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkingAccountBalance() {
        System.out.println("So du tai khoan khach hang la: " + account.getAccountBalance() + "Vnd");
        System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                "===========================================");
    }

    public void deposit() {
        System.out.println("Vui long nhap so tien");
        double depositMoney = scanner.nextDouble();
        double accountBalance = account.getAccountBalance();
        account.setAccountBalance(accountBalance + depositMoney);
        account.setNewTransaction("Nap tien: " + depositMoney + "VND");
        account.transactionTimes += 1;
        this.updateTransactionHistory();
        System.out.println("Giao dich thanh cong. Ban vua nap " + depositMoney + "VND thanh cong");
        System.out.println("So du tai khoan là: " + accountBalance + "VND");
        System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                "===========================================");
    }

    public void withdraw() {
        System.out.println("Vui long nhap so tien");
        double withdrawMoney = scanner.nextDouble();
        double accountBalance = account.getAccountBalance();
        if (withdrawMoney > accountBalance) {
            System.out.println("Giao dich khong thanh cong.");
            System.out.println("So du tai khoan khach hang la: " + accountBalance + "VND");
            System.out.println("Ban khong the rut so tien hon so du tai khoan");
            System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                    "===========================================");
        } else {
            account.setAccountBalance(accountBalance-withdrawMoney);
            account.setNewTransaction("Rut tien: " + withdrawMoney + "VND");
            account.transactionTimes += 1;
            this.updateTransactionHistory();
            System.out.println("Giao dich thanh cong. Ban vua rut " + withdrawMoney + "VND thanh cong");
            System.out.println("So du tai khoan là: " + accountBalance + "VND");
            System.out.println("Bam nut theo menu de tiep tuc giao dich \n" +
                    "===========================================");
        }
    }

    public void exitBankingSystem() {
        System.out.println("Cam on ban da su dung dich vu ATM");
        System.exit(0);
    }

    public void updateTransactionHistory() {
        String[] array = account.getTransactionHistory();
        for (int i = array.length-1; i>0; i--) {
            array[i] = array[i-1];
        }
        array[0] = account.getNewTransaction();
    }

    public void checkingTransactionHistory() {
        String[] array = account.getTransactionHistory();
        for (int i = 0; i< array.length; i++) {
            if (array[i] != null) {
                System.out.println(i + 1 + ". " + array[i]);
            }
        }
        if (account.transactionTimes < 1) {
            System.out.println("Ban chua thuc hien giao dich nao");
        }
    }
}
