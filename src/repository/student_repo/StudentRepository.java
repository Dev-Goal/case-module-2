package repository.student_repo;


import model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    private final static List<Student> listStudent;
    static {
        listStudent = new ArrayList<>() ;
        Student student1 = new Student(1, "Phúc", "hvphuc.20it7@vku.udn.vn", "0935641901",
                LocalDate.parse("2002-08-28"),  "C0524I1");
        Student student2 = new Student(2, "Tấn", "lvtan.20it1@vku.udn.vn", "0398769600",
                LocalDate.parse("2002-01-14"),  "C0524I1");
        listStudent.add(student1);
        listStudent.add(student2);
    }

    @Override
    public List<Student> findStudent() {
        return listStudent;
    }

    @Override
    public void add(Student student) {
        listStudent.add(student);
    }

    @Override
    public void delete(int idStudent) {
        for (Student student : listStudent) {
            if (student.getIdStudent() == idStudent) {
                listStudent.remove(student);
            }
        }
    }

    @Override
    public boolean isEmpty(int idStudent) {
        for (Student student : listStudent) {
            if (student.getIdStudent() == idStudent) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(int idStudent, Student student) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getIdStudent() == idStudent) {
                listStudent.set(i, student);
                return;
            }
        }
    }

    @Override
    public Student search(int idStudent) {
        for (Student student : listStudent) {
            if (student.getIdStudent() == idStudent) {
                return student;
            }
        }
        return null;
    }
}