public class NhanVien {
    private int id, age, phoneNum;
    private String name, email;

    public NhanVien() {
    }

    public NhanVien(int id, String name, int age, int phoneNum, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", name='" + name +
                ", age=" + age +
                ", phoneNum=" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
