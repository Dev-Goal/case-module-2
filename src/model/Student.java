package model;

import java.time.LocalDate;

public class Student extends Person {
    private int idStudent;
    private String className;

    public Student(int idStudent, String name, String email, String phone, LocalDate localDate, String className) {
        super(name, email, phone, localDate);
        this.idStudent = idStudent;
        this.className = className;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Học viên [ Mã học viên: " + idStudent
                + super.toString()
                + ", Lớp học: " + className + "]";
    }
}
