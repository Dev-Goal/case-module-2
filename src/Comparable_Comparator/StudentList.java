package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(28,"Phuc", "c05", 7.5));
        list.add(new Student(14,"Tan", "c05", 8.5));
        list.add(new Student(2,"Sam", "c05", 9.5));
        list.add(new Student(19,"Nhan", "c05", 9.5));
        list.add(new Student(56,"Anh", "c05", 9.5));
        list.add(new Student(27,"Luong", "c05", 9.5));

        Collections.sort(list);
        System.out.println(list);
    }
}
