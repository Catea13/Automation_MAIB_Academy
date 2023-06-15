package core.Lesson3_Methods;

public class Main {
    public static void main(String[] args) {
        int a = plusMethod(5, 7);
        double b = plusMethod(5.5, 7.6);
        System.out.println(a);
        System.out.println(b);
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }
}


