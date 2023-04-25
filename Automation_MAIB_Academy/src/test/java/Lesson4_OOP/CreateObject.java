package Lesson4_OOP;
/**In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.

 To create an object of Main, specify the class name, followed by the object name, and use the keyword new:**/
public class CreateObject {
    int x = 5;

    public static void main(String[] args) {
        CreateObject myObj = new CreateObject();
        myObj.x=10;
        System.out.println(myObj.x);
    }
}

