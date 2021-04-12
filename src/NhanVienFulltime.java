public class NhanVienFulltime extends NhanVien {
    private int prizeMoney, forfeitMoney, basicSalary;

    public NhanVienFulltime() {
    }

    public NhanVienFulltime(int id, String name, int age, int phoneNum, String email, int prizeMoney, int forfeitMoney, int basicSalary) {
        super(id, name, age, phoneNum, email);
        this.prizeMoney = prizeMoney;
        this.forfeitMoney = forfeitMoney;
        this.basicSalary = basicSalary;
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(int prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public int getForfeitMoney() {
        return forfeitMoney;
    }

    public void setForfeitMoney(int forfeitMoney) {
        this.forfeitMoney = forfeitMoney;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
}
