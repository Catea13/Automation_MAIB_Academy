package core.Lesson2_Conditions;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("I" + " " + i);
        }
        for (int j = 0; j < 10; j = j + 2) {
            System.out.println("J" + " " + j);

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("I" + " " + i);
            //Inner loop
            for (int j = 0; j < 10; j = j + 2) {
                System.out.println("J" + " " + j);
            }
        }
    }
}