package StudentManager.view;

import StudentManager.manager.StudentManager;
import StudentManager.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuStudent {
    StudentManager studentManager = new StudentManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("===== Menu Student Manager =====\n1.Thêm mới học sinh\n2.Sửa học sinh\n3.Xóa học sinh\n4.Tìm kiếm sinh viên theo ID\n5.Hiển thị danh sách sinh viên theo tên gần đúng\n6.Học viên có điểm trung bình lớn nhất\n7.Hiển thị tất cả\n0.Thoát");
            System.out.println("nhập lựa chọn");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showMenuDelete();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    showAll();
                    break;
            }
        } while (choice != 0);

    }

    public void showMenuAdd() {
        System.out.println("====Thêm mới====");
        System.out.println("nhập tên:");
        String name = inputString.nextLine();
        System.out.println("nhập tuổi:");
        int age = inputInt.nextInt();
        System.out.println("nhập địa chỉ:");
        String address = inputString.nextLine();
        Student student = new Student(name, age, address);
        studentManager.add(student);
        System.out.println("====> thêm thành công");
    }

    public void showMenuEdit() {
        System.out.println("====menu Edit=====");
        System.out.println("Nhập id muôn sửa");
        int idEdit = inputInt.nextInt();
        System.out.println("nhập tên:");
        String name = inputString.nextLine();
        System.out.println("nhập tuổi:");
        int age = inputInt.nextInt();
        System.out.println("nhập địa chỉ:");
        String address = inputString.nextLine();
        Student editStudent = new Student(idEdit, name, age, address);
        studentManager.update(idEdit, editStudent);
        System.out.println("Sửa thành công");   
    }

    public void showMenuDelete() {
        System.out.println("====Xóa học sinh===");
        System.out.println("nhập id");
        int idDelete = inputInt.nextInt();
        studentManager.delete(idDelete);
        System.out.println("====> Xóa thành công");
    }

    public void showAll() {
        System.out.println("Danh sách sinh viên");
        ArrayList<Student> list = studentManager.findAll();
        for (Student student : list
        ) {
            System.out.println(student);
        }
    }
}
