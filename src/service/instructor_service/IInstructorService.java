package service.instructor_service;

import model.Instructor;

import java.util.List;

public interface IInstructorService {
    List<Instructor> findInstructor();
    void add(Instructor instructor);
    void delete(int idInstructor);
    boolean isEmpty(int idInstructor);
    void update(int idInstructor, Instructor instructor);
    List<Instructor> searchName(String nameInstructor);
    List<Instructor> sortName();

}
