package controller.instructor_controller;

import model.Instructor;
import repository.instructor_repo.IInstructorRepository;
import repository.instructor_repo.InstructorRepository;
import service.instructor_service.IInstructorService;
import service.instructor_service.InstructorService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class InstructorController {
    private IInstructorService iInstructorService = new InstructorService();
    private IInstructorRepository iInstructorRepository = new InstructorRepository();
    private Scanner scanner = new Scanner(System.in);

    public void displayInstructorFunctional() {
        int number;
        do {
            System.out.println("Quản lý giảng viên: \n" +
                    "1. Thêm giảng viên \n" +
                    "2. Sửa giảng viên \n" +
                    "3. Xóa giảng viên \n" +
                    "4. Hiển thị danh sách giảng viên \n" +
                    "5. Quay về trang chủ");
            System.out.print("Lựa chọn của bạn là: ");
            number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    addInstructor();
                    break;
                case 2:
                    editInstructor();
                    break;
                case 3:
                    deleteInstructor();
                    break;
                case 4:
                    displayInstructor();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }while (true);
    }


    public void displayInstructor() {
        List<Instructor> instructors = iInstructorService.findInstructor();
        for (Instructor instructor : instructors) {
            if (instructor != null) {
                System.out.println(instructor);
            }
        }
    }

    private void addInstructor() {
        System.out.print("Nhập id giảng viên: ");
        int idInstructor = Integer.parseInt(scanner.nextLine());
        if (iInstructorService.isEmpty(idInstructor)) {
            System.out.println("Id đã tồn tại");
            return;
        }
        System.out.print("Nhập tên giảng viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        LocalDate birthday = LocalDate.parse(scanner.nextLine());
        System.out.print("Nhập cấp bậc: ");
        String grade = scanner.nextLine();
        Instructor instructor = new Instructor(idInstructor, name, email, phone, birthday, grade);
        iInstructorRepository.add(instructor);
    }

    private void deleteInstructor() {
        System.out.print("Nhập vào id giảng viên: ");
        int idInstructor = Integer.parseInt(scanner.nextLine());
        System.out.print("Bạn có chắc muốn xóa giảng viên này: ");
        String message = scanner.nextLine();
        if (message.equalsIgnoreCase("Có") || message.equalsIgnoreCase("Co")) {
            iInstructorService.delete(idInstructor);
            System.out.println("Xóa thành công");
        }
    }

    private void editInstructor() {
        System.out.print("Nhập id giảng viên cần sửa: ");
        int idInstructor = Integer.parseInt(scanner.nextLine());
        if (!iInstructorService.isEmpty(idInstructor)) {
            System.out.println("Id không tồn tại");
            return;
        }
        System.out.print("Nhập tên giảng viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email mới: ");
        String email = scanner.nextLine();
        System.out.print("Nhập số điện thoại mới: ");
        String phone = scanner.nextLine();
        System.out.print("Nhập ngày sinh mới: ");
        LocalDate birthday = LocalDate.parse(scanner.nextLine());
        System.out.print("Nhập cấp bậc mới: ");
        String grade = scanner.nextLine();
        Instructor instructor = new Instructor(idInstructor, name, email, phone, birthday, grade);
        System.out.print("Bạn có chắc muốn sửa giảng viên này: ");
        String message = scanner.nextLine();
        if (message.equalsIgnoreCase("Có") || message.equalsIgnoreCase("Co")) {
            iInstructorService.update(idInstructor, instructor);
            System.out.println("Chỉnh sửa thành công");
        }
    }
}
