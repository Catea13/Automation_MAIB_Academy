package Lesson5_Collections;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String>array=new ArrayList<>();
        array.add("5");
        array.add("3");
        for (int i=0;i< array.size();i++)
            System.out.println(array);
        array.remove(0);
        array.clear();
        }
        }


