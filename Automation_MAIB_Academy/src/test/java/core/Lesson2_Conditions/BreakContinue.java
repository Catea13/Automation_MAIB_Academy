package core.Lesson2_Conditions;

public class BreakContinue {
    public static void main(String[] args) {
        /**The break statement can also be used to jump out of a loop.**/
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        /**The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next
         *
         */
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
               continue;
            }
            System.out.println(i);
        }


         }
}
