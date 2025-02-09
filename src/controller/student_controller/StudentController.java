package controller.student_controller;

import model.Student;
import repository.student_repo.IStudentRepository;
import repository.student_repo.StudentRepository;
import service.student_service.IStudentService;
import service.student_service.StudentService;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private final IStudentService iStudentService = new StudentService();
    private final IStudentRepository iStudentRepository = new StudentRepository();

    private final Scanner scanner = new Scanner(System.in);

    public void displayStudentFunctional() {
        int number;
        do {
            System.out.println("""
                    Quản lý học viên:\s
                    1. Thêm học viên\s
                    2. Sửa học viên\s
                    3. Xóa học viên\s
                    4. Tìm kiếm học viên\s
                    5. Hiển thị danh sách học viên\s
                    6. Quay về trang chủ""");
            System.out.print("Lựa chọn của bạn là: ");
            number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1 -> addStudent();
                case 2 -> editStudent();
                case 3 -> deleteStudent();
                case 4 -> searchStudent();
                case 5 -> displayStudent();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Không có lựa chọn này");
            }
        }while (true);
    }


    public void displayStudent() {
        List<Student> sortedStudents = iStudentService.sortByName();
        for (Student student : sortedStudents) {
            System.out.print(student);
        }
    }

    private void addStudent() {
        System.out.print("Nhập id học viên: ");
        int idStudent = Integer.parseInt(scanner.nextLine());
        if (iStudentService.isEmpty(idStudent)) {
            System.out.println("Id đã tồn tại");
            return;
        }
        System.out.print("Nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email:  ");
        String email = scanner.nextLine();
        System.out.print("Nhập số điện thoại:  ");
        String phone = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        LocalDate birth = LocalDate.parse(scanner.nextLine());
        System.out.print("Nhập class: ");
        String className = scanner.nextLine();
        Student student = new Student(idStudent, name, email, phone, birth, className);
        iStudentRepository.add(student);
    }

    private void deleteStudent() {
        System.out.print("Nhập id học viên muốn xóa: ");
        int idStudent = Integer.parseInt(scanner.nextLine());
        System.out.print("Bạn có chắc muốn xóa học viên này: ");
        String message = scanner.nextLine();
        if (message.equalsIgnoreCase("Có") || message.equalsIgnoreCase("Co")) {
            iStudentService.delete(idStudent);
            System.out.println("Xóa thành công");
        }
    }

    private void editStudent() {
        System.out.print("Nhập id học viên cần chỉnh sửa: ");
        int idStudent = Integer.parseInt(scanner.nextLine());
        if (!iStudentService.isEmpty(idStudent)) {
            System.out.println("Id không tồn tại");
            return;
        }
        System.out.print("Nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email mới: ");
        String email = scanner.nextLine();
        System.out.print("Nhập số điện thoại mới: ");
        String phone = scanner.nextLine();
        System.out.print("Nhập ngày sinh mới: ");
        LocalDate birth = LocalDate.parse(scanner.nextLine());
        System.out.print("Nhập class mới: ");
        String className = scanner.nextLine();
        Student student = new Student(idStudent, name, email, phone, birth, className);
        System.out.print("Bạn có chắc muốn sửa học viên này: ");
        String message = scanner.nextLine();
        if (message.equalsIgnoreCase("Có") || message.equalsIgnoreCase("Co")) {
            iStudentService.update(idStudent, student);
            System.out.println("Chỉnh sửa thành công");
        }
    }

    private void searchStudent() {
        System.out.print("Nhâp vào tên học sinh bạn muốn tìm: ");
        String nameStudent = scanner.nextLine();
        List<Student> student = iStudentService.searchName(nameStudent);
        System.out.print(student);
    }
}
