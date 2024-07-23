package repository.student_repo;

import model.Student;

import java.util.List;

public interface IStudentRepository {
    void add(Student student);
    void delete(int idStudent);
    boolean isEmpty(int idStudent);
    void update(int idStudent, Student student);
    List<Student> searchName(String nameStudent);
    List<Student> sortName();
}
