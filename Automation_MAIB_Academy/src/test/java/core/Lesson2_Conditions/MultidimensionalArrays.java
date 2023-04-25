package core.Lesson2_Conditions;

public class MultidimensionalArrays {
    /**
     * A multidimensional array is an array of arrays.
     * <p>
     * Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns
     **/
    public static void main(String[] args) {
        int[][] nr = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(nr[1][2]);
        //Change values
        nr[1][2] = 4;
        System.out.println(nr[1][2]);
        for (int i = 0; i < nr.length; i++) {
            for (int j = 0; j < nr[i].length; j++) {
                System.out.println(nr[i][j]);
            }
        }

    }
}
