package Lesson4_OOP;

import com.beust.ah.A;

public class AndroidDeveloper extends Abstraction {
    public static void main(String[] args) {
        AndroidDeveloper androidDeveloper=new AndroidDeveloper();
        androidDeveloper.writeCode();
    }
    @Override
    public void writeCode() {
        System.out.println("Write code in Kotlin language");
    }
}
