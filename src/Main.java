import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        int id;

        while (true) {
            System.out.println("-----Menu-----");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm mới nhân viên");
            System.out.println("3. Tính lương nhân viên fulltime");
            System.out.println("4. Tính lương nhân viên parttime");
            System.out.println("5. Hiển thị danh sách nhân viên fulltime có lương thấp hơn mức lương trung bình");
            System.out.println("6. Tính lương tất cả nhân viên parttime");
            System.out.println("0. Thoát");
            System.out.println("Mời chọn chức năng: ");

            switch (choose) {
                case 1:
                    Manager.show();
                    break;
                case 2:
                    Manager.add();
                    break;
                case 3:
                    id = Manager.inputId();
                    Manager.payRollFulltime(id);
            }
        }
    }
}
