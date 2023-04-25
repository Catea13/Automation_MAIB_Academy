package core.Lesson3_Methods;

public class SumaArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 36, 6, 9};
        suma(arr);
    }


    public static void suma(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
            System.out.println("Suma"+" "+sum);


        }

    }



