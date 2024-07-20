package service.instructor_service;

import model.Instructor;
import repository.instructor_repo.InstructorRepository;

import java.util.List;

public class InstructorService implements IInstructorService{
    private InstructorRepository instructorRepository = new InstructorRepository();

    @Override
    public List<Instructor> findInstructor() {
        return instructorRepository.findInstructor();
    }

    @Override
    public void add(Instructor instructor) {

    }

    @Override
    public void delete(int idInstructor) {
        instructorRepository.delete(idInstructor);
    }

    @Override
    public boolean isEmpty(int idInstructor) {
        return instructorRepository.isEmpty(idInstructor);
    }

    @Override
    public void update(int idInstructor, Instructor instructor) {
        instructorRepository.update(idInstructor, instructor);
    }

    @Override
    public Instructor search(int idInstructor) {
        return instructorRepository.search(idInstructor);
    }
}
