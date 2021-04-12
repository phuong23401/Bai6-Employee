import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    private static Scanner scanner = new Scanner(System.in);
    private static List<NhanVien> nhanVienList = new ArrayList<>();

    static {
        NhanVien nhanVien1 = new NhanVienFulltime(1, "AAAAA", 18, 1, "a", 50000, 20000, 2000000);
        NhanVien nhanVien2 = new NhanVienFulltime(2, "BBBBB", 20, 2, "b", 50000, 50000, 2500000);
        NhanVien nhanVien3 = new NhanVienFulltime(3, "CCCCC", 19, 3, "c", 100000, 0, 2500000);
        NhanVien nhanVien4 = new NhanVienParttime(4, "DDDDD", 19, 4, "d", 30);
        NhanVien nhanVien5 = new NhanVienParttime(5, "EEEEE", 16, 5, "e", 25);
        NhanVien nhanVien6 = new NhanVienParttime(6, "FFFFF", 18, 6, "f", 40);
    }

    public static void show() {
        for (NhanVien nhanVien : nhanVienList) {
            System.out.println(nhanVien.toString());
        }
    }

    public static int payRollFulltime(int id) {
        for (int i = 0; i < nhanVienList.size(); i++) {
            if (nhanVienList.get(i).getId() == id) {

            }
        }
    }

    public static int payRollParttime(int workingHours) {
        return workingHours * 100000;
    }

    public static void add() {
        int id = inputId();
        String name = inputName();
        int age = inputAge();
        int phoneNum = inputPhoneNum();
        String email = inputEmail();

        NhanVien nhanVien = new NhanVien(id, name, age, phoneNum, email);
        nhanVienList.add(nhanVien);
    }

    public static int mediumSalary() {
        int mediumSalary = 0;
        for (NhanVien nhanVien : nhanVienList) {

        }
    }

    public static int inputId() {
        System.out.print("Nhập id nhân viên: ");
        return scanner.nextInt();
    }

    public static String inputName() {
        System.out.print("Nhập tên nhân viên: ");
        return scanner.nextLine();
    }

    public static int inputAge() {
        System.out.print("Nhập tuổi nhân viên: ");
        return scanner.nextInt();
    }

    public static int inputPhoneNum() {
        System.out.print("Nhập số điện thoại nhân viên: ");
        return scanner.nextInt();
    }

    public static String inputEmail() {
        System.out.print("Nhập email nhân viên: ");
        return scanner.nextLine();
    }

    public static int inputPrizeMoney() {
        System.out.print("Nhập tiền thưởng: ");
        return scanner.nextInt();
    }

    public static int inputForeitMoney() {
        System.out.println("Nhập tiền phạt: ");
        return scanner.nextInt();
    }

    public static int inputBasicSalary() {
        System.out.println("Nhập lương cứng: ");
        return scanner.nextInt();
    }
}
