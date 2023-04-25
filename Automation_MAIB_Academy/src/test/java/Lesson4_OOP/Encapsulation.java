package Lesson4_OOP;

/**
 * private variables can only be accessed within the same class (an outside class has no access to it). How
 * However, it is possible to access them if we provide public get and set methods.
 **/
public class Encapsulation {
    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation();
        System.out.println(encapsulation.b);

    }

    private int b = 5;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


}

//Inner class
class Test1 {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        System.out.println(encapsulation.getB());
        encapsulation.setB(8);//change value
        System.out.println(encapsulation.getB());
    }
}


