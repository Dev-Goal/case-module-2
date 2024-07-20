package service.student_service;

import model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findStudent();
    void add(Student student);
    void delete(int idStudent);
    boolean isEmpty(int idStudent);
    void update(int idStudent, Student student);

}
