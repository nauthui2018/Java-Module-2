package homework.atm;

public class User {
    private String userName = "Nguyen Van A";
    private double soduTk = 1200000;

    public User() {
    }

    public User(String userName, double soduTk) {
        this.userName = userName;
        this.soduTk = soduTk;
    }

    public String getUserName() {
        return userName;
    }

    public double getSoduTk() {
        return soduTk;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSoduTk(double soduTk) {
        this.soduTk = soduTk;
    }
}
