package pract.comparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1,"Funsho Williams", 30);
        Student student2 = new Student(3,"Williams Gbogunde", 23);
        Student student3 = new Student(2, "Jide Sobe", 45);
        Student student4 = new Student(4, "Shola Fapson", 47);

        Comparator<Student> comparator = (Student st1, Student st2) -> {
            if(st1.getStudentScore()>st2.getStudentScore()){
                return 1;
            }else {
                return -1;
            }
        };

        ArrayList arrayList = new ArrayList();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);

        System.out.println("ArrayList prior to being sorted with Comparator: " + arrayList);

        Collections.sort(arrayList, comparator);
        System.out.println("Arraylist after being sorted: "+ arrayList);
    }
}
