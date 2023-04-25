package Lesson6_Exceptions;

public class WithException {
    public static void main(String[] args) {
        try {
            int[] array = {1, 6, 3};
            System.out.println(array[3]);
        } catch (Exception e) {
            System.out.println(e);

        }
        finally {
            System.out.println("Is wrong");
        }
    }
}