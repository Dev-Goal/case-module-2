package service.student_service;

import model.Student;
import repository.student_repo.IStudentRepository;
import repository.student_repo.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService{
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public List<Student> findStudent() {
        return iStudentRepository.findStudent();
    }

    @Override
    public void add(Student student) {
        iStudentRepository.add(student);
    }

    @Override
    public void delete(int idStudent) {
        iStudentRepository.delete(idStudent);
    }

    @Override
    public boolean isEmpty(int idStudent) {
        return iStudentRepository.isEmpty(idStudent);
    }

    @Override
    public void update(int idStudent, Student student) {
        iStudentRepository.update(idStudent, student);
    }

    @Override
    public Student search(int idStudent) {
        return iStudentRepository.search(idStudent);
    }
}
