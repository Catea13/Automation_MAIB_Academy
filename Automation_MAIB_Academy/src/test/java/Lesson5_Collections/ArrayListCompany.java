package Lesson5_Collections;

import com.beust.ah.A;

import java.util.ArrayList;

public class ArrayListCompany {
    public static void main(String[] args) {
        ArrayList<String> company = new ArrayList();
        company.add("MAIB");
        company.add("Allied Testing");
        company.add("EST Computer");
        company.add("Endava");
        System.out.println(company);
        System.out.println(company.get(0));
        System.out.println(company.set(1, "Coherent Solutions"));
        System.out.println(company);
        company.remove(3);
        company.add(1,"Amdaris");
        System.out.println(company);
        for (String i : company) {
            System.out.println(i);
        }
    }
}