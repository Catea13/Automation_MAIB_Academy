package core.Lesson2_Conditions;

import java.util.Arrays;

/**Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

 To declare an array, define the variable type with square brackets:**/
public class Array {
    public static void main(String[] args) {
        int[] array = {8, 14, 9, 0, 7};
        for (int i = 0; i < array.length; i++) {
            /**Print all numbers from array**/
            System.out.println("All elements" + " " + array[i]);

        }
        /**Print nr from index 3**/
        System.out.println("Index 3" + " " + array[3]);
        /**size**/
        System.out.println("Size" + " " + array.length);
        System.out.println("Last element" + " " + array[array.length - 1]);



        /**String array**/
        String[] company = {"MAIB", "Allied Testing", "EST Computer", "Endava"};
        for (String i : company) {
            System.out.println(i);
        }

        }
    }
