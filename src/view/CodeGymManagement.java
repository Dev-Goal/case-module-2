package view;

import controller.instructor_controller.InstructorController;
import controller.student_controller.StudentController;

import java.util.Scanner;

public class CodeGymManagement {
    public static void main(String[] args) {

        StudentController studentController = new StudentController();
        InstructorController instructorController = new InstructorController();
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("""
                    Quản lý CodeGym:\s
                    1. Quản lý học viên\s
                    2. Quản lý giảng viên\s
                    3. Dừng chương trình""");
            System.out.print("Lựa chọn của bạn là: ");
            number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    studentController.displayStudentFunctional();
                    break;
                case 2:
                    instructorController.displayInstructorFunctional();
                    break;
                case 3:
                    System.out.print("Bạn có chắc chắn muốn thoát: ");
                    String message = scanner.nextLine();
                    if (message.equalsIgnoreCase("Có") || message.equalsIgnoreCase("Co")) {
                        System.exit(0);
                    }
            }
        }while (true);
    }
}
