package repository.instructor_repo;

import model.Instructor;
import model.Student;

import java.util.List;

public interface IInstructorRepository {
    List<Instructor> findInstructor();
    void add(Instructor instructor);
    void delete(int idInstructor);
    boolean isEmpty(int idInstructor);
    void update(int idInstructor, Instructor instructor);
    List<Instructor> searchName(String nameInstructor);
    List<Instructor> sortName();
}
