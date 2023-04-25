package Lesson5_Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Test","Informatica",7.46));
        students.add(new Student("Test1","Informatica",8.46));
        students.add(new Student("Test2","Contabilitate",8.46));
        students.add(new Student("Test3","Finance si Banci",7.46));
        students.add(new Student("Test4","Calculatoare",5.46));
        students.add(new Student("Test5","Informatica",7.46));
        students.add(new Student("Test6","Informatica",7.46));
        students.sort(Comparator.comparing(Student::getAverage));
        System.out.println(students);
        Scanner studentName=new Scanner(System.in);
        System.out.println("Input Name:");
        String name=studentName.nextLine();
        for(Student student:students){
            if(student.getName().equals(name )){
                System.out.println(student);
            }
        }

    }
}
