package core.Lesson3_Methods;

public class Search {
    public static void main(String[] args) {
        Search search = new Search();
        int[] arr = {1, 2, 36, 6, 9};
        search.search(2, arr);
        maximElement(arr);
        minimumElement(arr);

    }

    public void search(int nr, int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == nr) {
                System.out.println(i);
            } else {
                System.out.println(" nr does not exist");
            }
    }

    public static void maximElement(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++)
             max = Math.max(max, arr[i]);
            System.out.println("Maximum element" + " " + max);

        }
    public static void minimumElement(int[] arr) {
        int min=arr[0];
        for (int i = 0; i < arr.length; i++)
            min= Math.min(min, arr[i]);
        System.out.println("Minimum element" + " " + min);

    }
    }
