package core.Lesson1_Data_Type;

public class Characters {
    /**
     * Char-used to stare a single character like 'A' or 'e'
     **/
    public static void main(String[] args) {
        char grade = 'A';
        System.out.println(grade);
        /**ASCII values, table-https://www.geeksforgeeks.org/ascii-table/**/
        char value1 = 55;
        char value2 = 79;
        System.out.println(value1);
        System.out.println(value2);
        /** String-used for text**/
        String job="QA Automation";
        System.out.println(job);
        System.out.println(job.length());
        System.out.println(job.toLowerCase());
        System.out.println(job.toUpperCase());
        System.out.println(job.indexOf("A"));
        System.out.println(job.concat("Middle"));
        System.out.println(job+" "+"Engineer");
    }
}