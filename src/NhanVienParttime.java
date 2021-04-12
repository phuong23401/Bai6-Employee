public class NhanVienParttime extends NhanVien {
    private int workingHours;

    public NhanVienParttime() {
    }

    public NhanVienParttime(int id, String name, int age, int phoneNum, String email, int workingHours) {
        super(id, name, age, phoneNum, email);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
