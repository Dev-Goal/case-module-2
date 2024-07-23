package service.student_service;

import model.Student;

import java.util.List;

public interface IStudentService {
    void add(Student student);
    void delete(int idStudent);
    boolean isEmpty(int idStudent);
    void update(int idStudent, Student student);
    List<Student> searchName(String nameStudent);
    List<Student> sortByName();

}
