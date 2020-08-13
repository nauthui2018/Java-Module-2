package homework.atm;

public class User {
    private String userName = "Nguyen Van A";
    private double soduTk = 1200000;
    private String[] giaoDichGanNhat = new String[3];
    private String giaoDichMoiNhat;
    public static int soLanGiaoDich = 0;

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

    public String[] getGiaoDichGanNhat() {
        return giaoDichGanNhat;
    }

    public String getGiaoDichMoiNhat() {
        return giaoDichMoiNhat;
    }

    public static int getSoLanGiaoDich() {
        return soLanGiaoDich;
    }

    public void setGiaoDichGanNhat(String[] giaoDichGanNhat) {
        this.giaoDichGanNhat = giaoDichGanNhat;
    }

    public void setGiaoDichMoiNhat(String giaoDichMoiNhat) {
        this.giaoDichMoiNhat = giaoDichMoiNhat;
    }

    public static void setSoLanGiaoDich(int soLanGiaoDich) {
        User.soLanGiaoDich = soLanGiaoDich;
    }

}
