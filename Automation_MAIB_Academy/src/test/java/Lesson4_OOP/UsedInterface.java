package Lesson4_OOP;

public class UsedInterface implements Interface {
    public static void main(String[] args) {
        UsedInterface usedInterface = new UsedInterface();
        usedInterface.matchOperations();

    }

    @Override
    public void matchOperations() {
        int suma = 17 + 34;
        System.out.println(suma);
    }
}


