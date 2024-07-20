package model;

import java.time.LocalDate;

public class Instructor extends Person{
    private int idInstructor;
    private String grade;

    public Instructor(int idInstructor, String name, String email, String phone, LocalDate localDate, String grade) {
        super(name, email, phone, localDate);
        this.idInstructor = idInstructor;
        this.grade = grade;
    }

    public int getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(int idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Giảng viên [ Mã giảng viên: " + idInstructor + super.toString()
                + ", Trình độ: " + grade;
    }
}
