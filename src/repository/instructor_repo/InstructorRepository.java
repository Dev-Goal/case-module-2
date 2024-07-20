package repository.instructor_repo;

import model.Instructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InstructorRepository implements IInstructorRepository{
    private final static List<Instructor> listInstructor;
    static {
        listInstructor = new ArrayList<>();
        Instructor instructor1 = new Instructor(1,"Công", "cong.nguyen@codegym.vn", "0935686868",
                LocalDate.parse("1989-01-01"), "Giáo sư Tiến sĩ");
        Instructor instructor2 = new Instructor(2,"Chuyên", "chuyen.le@codegym.vn", "0935686868",
                LocalDate.parse("2004-01-01"), "Phó Giáo sư Tiến sĩ");
        listInstructor.add(instructor1);
        listInstructor.add(instructor2);
    }

    @Override
    public List<Instructor> findInstructor() {
        return listInstructor;
    }

    @Override
    public void add(Instructor instructor) {
        listInstructor.add(instructor);
    }

    @Override
    public void delete(int idInstructor) {
        for (Instructor instructor : listInstructor) {
            if (instructor.getIdInstructor() == idInstructor) {
                listInstructor.remove(instructor);
            }
        }
    }

    @Override
    public boolean isEmpty(int idInstructor) {
        for (Instructor instructor : listInstructor) {
            if (instructor.getIdInstructor() == idInstructor) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(int idInstructor, Instructor instructor) {
        for (int i = 0; i < listInstructor.size(); i++) {
            if (listInstructor.get(i).getIdInstructor() == idInstructor) {
                listInstructor.set(i, instructor);
                return;
            }
        }
    }


}
