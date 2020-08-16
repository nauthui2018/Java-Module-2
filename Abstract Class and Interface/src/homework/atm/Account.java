package homework.atm;

public class Account {
    private String userName = "Nguyen Van A";
    private double accountBalance = 1200000;
    private String[] transactionHistory = new String[3];
    private String newTransaction;
    public static int transactionTimes = 0;

    public Account() {
    }

    public Account(String userName, double accountBalance) {
        this.userName = userName;
        this.accountBalance = accountBalance;
    }

    public String getUserName() {
        return userName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String[] getTransactionHistory() {
        return transactionHistory;
    }

    public String getNewTransaction() {
        return newTransaction;
    }

    public static int getTransactionTimes() {
        return transactionTimes;
    }

    public void setTransactionHistory(String[] transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public void setNewTransaction(String newTransaction) {
        this.newTransaction = newTransaction;
    }

    public static void setTransactionTimes(int transactionTimes) {
        Account.transactionTimes = transactionTimes;
    }

}
