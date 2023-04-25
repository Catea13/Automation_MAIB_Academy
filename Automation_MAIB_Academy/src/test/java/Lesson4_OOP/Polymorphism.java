package Lesson4_OOP;

public class Polymorphism {
    /**Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.**/
    public static void main(String[] args) {
       suma(4,7);
       suma(5,9.0);
       suma(4.9,6.9);
       suma("QA","Automation");
    }
    public static void suma(int a,int b){
        int c=a+b;
        System.out.println(c);

    }
    public static void suma(double a,double b) {
        double c = a + b;

        System.out.println(c);
    }
    public static void suma(int a,double b){
        double c=a+b;
        System.out.println(c);
        }
        public static void suma(String a,String b){
        String c=a+b;
            System.out.println(c);
    }

    }
