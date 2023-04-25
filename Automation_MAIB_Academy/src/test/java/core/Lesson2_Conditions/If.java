package core.Lesson2_Conditions;
/** usual logical conditions from mathematics:
 Less than: a < b
 Less than or equal to: a <= b
 Greater than: a > b
 Greater than or equal to: a >= b
 Equal to a == b
 Not Equal to: a != b
 Also can use these conditions to perform different actions for different decisions.

 Java has the following conditional statements:

 Use if to specify a block of code to be executed, if a specified condition is true
 Use else to specify a block of code to be executed, if the same condition is false
 Use else if to specify a new condition to test, if the first condition is false
 Use switch to specify many alternative blocks of code to be executed
 The if Statement
 Use the if statement to specify a block of Java code to be executed if a condition is true.
 Syntax condition if:
 /if (condition) {
 // block of code to be executed if the condition is true
 }
 **/
public class If {
    public static void main(String[] args) {
        if(15<17){
            System.out.println("15 is less than 17");
        }
        int a=0;
        if(a>1){
            System.out.println("Nr is positive");
        }
        else if(a<1){
            System.out.println("Nr is negative");
        }
        else{
            System.out.println("Is not nr");
        }
/** Short if-else**/
        String s = (a < 1) ? "Nr is negtive" : "Nr else positive";
        System.out.println(s);
    }

}

