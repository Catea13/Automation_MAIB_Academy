package Lesson4_OOP;

public class UsedInterface2 implements Interface {
    public static void main(String[] args) {
        UsedInterface2 usedInterface2 = new UsedInterface2();
        usedInterface2.matchOperations();

    }

    @Override
    public void matchOperations() {
        double suma = 5.5 + 7.3;
        System.out.println(suma);
    }
}
