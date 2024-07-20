package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeacherList {
    public static void main(String[] args) {
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher(11, "Cong"));
        list.add(new Teacher(28, "Phuc"));
        list.add(new Teacher(39, "Hao"));
        list.add(new Teacher(47, "Chuyen"));
//        Collections.sort(list, new Comparator<Teacher>() {
//            @Override
//            public int compare(Teacher o1, Teacher o2) {
//                if (o1.getId() > o2.getId()) {
//                    return 1;
//                } else if (o1.getId() < o2.getId()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });



    }
}


