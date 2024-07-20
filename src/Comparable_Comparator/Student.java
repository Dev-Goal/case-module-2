package Comparable_Comparator;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private String className;
    private double DTB;

    public Student(int id, String name, String className, double DTB) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.DTB = DTB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getDTB() {
        return DTB;
    }

    public void setDTB(double DTB) {
        this.DTB = DTB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", DTB=" + DTB +
                '}' + "\n";
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}
