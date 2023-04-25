package Lesson4_OOP;

public class Constructor {
    public static void main(String[] args) {
        Constructor student = new Constructor("Ecaterina","Informatica");
        Constructor student1=new Constructor("Tatiana","Contabilitate");
        Constructor student2=new Constructor();
        Constructor student3=new Constructor("Test");
        System.out.println(student.name+student.grupa);
        System.out.println(student1.grupa);
        System.out.println(student2.name);
        System.out.println(student3.grupa);

    }
        String name;
        String grupa;

/**Constructor with 2 parameters**/
    public Constructor(String name, String grupa) {
            this.name = name;
            this.grupa = grupa;
        }
/**Empty constructor**/
    public Constructor() {
        }
        /**Constructor with 1 parameter**/
    public Constructor(String name) {
            this.name = name;
        }
    }
