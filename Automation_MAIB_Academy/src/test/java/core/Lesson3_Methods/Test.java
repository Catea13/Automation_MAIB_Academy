package core.Lesson3_Methods;

public class Test {
    public static void main(String[] args) {
        suma(6.7, 3.9);
        Test Alexandr=new Test();
        Alexandr.salariu("1000000");

    }

    static void suma(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    static void suma(double a, double b) {
        double c = a + b;
        System.out.println(c);
    }

    static void suma(int a, double b) {
        double c = a + b;
        System.out.println(c);
    }

    void salariu(String salariuAngajatului) {
        System.out.println(salariuAngajatului);
    }

}

